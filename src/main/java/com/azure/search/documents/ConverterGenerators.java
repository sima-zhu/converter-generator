package com.azure.search.documents;

import com.azure.core.util.logging.ClientLogger;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.azure.search.documents.AbstractClassMethodGenerator.generateAbstractMapMethod;
import static com.azure.search.documents.EnumMethodGenerator.generateEnumMapMethod;
import static com.azure.search.documents.MethodGeneratorUtils.ALL_CLASSES;
import static com.azure.search.documents.MethodGeneratorUtils.CLASSES;
import static com.azure.search.documents.MethodGeneratorUtils.CONVERTER_PATH;
import static com.azure.search.documents.MethodGeneratorUtils.DEBUG;
import static com.azure.search.documents.MethodGeneratorUtils.EXTERNAL_MODEL_PATH;
import static com.azure.search.documents.MethodGeneratorUtils.INTERNAL_MODEL_PATH;
import static com.azure.search.documents.MethodGeneratorUtils.LOGGER_NAME;
import static com.azure.search.documents.MethodGeneratorUtils.OUTPUT_PATH;
import static com.azure.search.documents.MethodGeneratorUtils.isInterfaceOrAbstract;
import static com.azure.search.documents.MethodGeneratorUtils.print;
import static com.azure.search.documents.SolidClassMethodGenerator.generateMapMethod;

public class ConverterGenerators {

    ConverterGenerators() {
    }

    static Map<String, Class<?>> fetchAllClassesUnderPath(String path) {
        ClassPath classPath = null;
        try {
            classPath = ClassPath.from(ConverterGenerators.class.getClassLoader());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classPath.getTopLevelClasses(path).stream().map(ClassPath.ClassInfo::load)
                .collect(Collectors.toMap(Class::getSimpleName, Function.identity()));
    }
    private static Map<Class, Class> loadClasses() {
        Map<String, Class<?>> allInternalClasses = fetchAllClassesUnderPath(INTERNAL_MODEL_PATH);
        ALL_CLASSES.addAll(allInternalClasses.values());

        Map<String, Class<?>> allExternalClasses = fetchAllClassesUnderPath(EXTERNAL_MODEL_PATH);
        ALL_CLASSES.addAll(allExternalClasses.values());

        ImmutableSet.Builder<String> allClassNames = ImmutableSet.builder();
        allClassNames.addAll(allInternalClasses.keySet())
                .addAll(allExternalClasses.keySet());
        allClassNames.build().stream().forEach(name -> {
            Class internal = allInternalClasses.get(name);
            Class external = allExternalClasses.get(name);
            if (internal == null || external == null) {
                throw new RuntimeException(String.format(
                        "Model mismatches: (internal, external) -> (%s, %s)",
                        internal, external));
            }
            CLASSES.put(internal, external);
        });

        return CLASSES;
    }

    private void generate(Class internal, Class external) {
        print("\nGenerating for %s and %s", internal.getName(), external.getName());

        MethodSpec mapToMethod = generateMethod(internal, external);
        MethodSpec mapFromMethod = generateMethod(external, internal);
        String converterName = internal.getSimpleName() + "Converter";
        TypeSpec classConverterType = TypeSpec.classBuilder(converterName)
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addField(logger(converterName))
                .addMethod(mapToMethod)
                .addMethod(mapFromMethod)
                .addJavadoc("A ComplexField\n" + "CoordinateSystem\n" + "FieldBase\n" + "GeoPoint\n" + "package-info.java\n" + "RangeFacetResult\n" + "ScoringParameter\n" + "SearchableField\n" + "SimpleField\n" + "ValueFacetResult between {@link $T} and {@link $T}.", internal, external)
                .build();

        JavaFile javaFile = JavaFile.builder(CONVERTER_PATH, classConverterType)
                .build();

        try {
            File file = new File(OUTPUT_PATH);
            javaFile.writeTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    FieldSpec logger(String converterName) {
        return FieldSpec.builder(ClientLogger.class, LOGGER_NAME, Modifier.PRIVATE,
                Modifier.FINAL, Modifier.STATIC)
                .initializer("new $T($L.class)", ClientLogger.class, converterName)
                .build();
    }

    private MethodSpec generateMethod(Class fromClass, Class toClass) {
        if (isInterfaceOrAbstract(fromClass)) {
            return generateAbstractMapMethod(fromClass, toClass);
        } else if (fromClass.isEnum()) {
            return generateEnumMapMethod(fromClass, toClass);
        } else {
            return generateMapMethod(fromClass, toClass);
        }
    }

    public void execute() {
        loadClasses().entrySet()
                .stream()
                .forEach(e -> generate(e.getKey(), e.getValue()));
    }


}
