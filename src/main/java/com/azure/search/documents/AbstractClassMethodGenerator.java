package com.azure.search.documents;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.MethodSpec;

import javax.lang.model.element.Modifier;
import java.util.Set;

import static com.azure.search.documents.MethodGeneratorUtils.CONVERTER_PATH;
import static com.azure.search.documents.MethodGeneratorUtils.INPUT_OBJ;
import static com.azure.search.documents.MethodGeneratorUtils.LOGGER_NAME;
import static com.azure.search.documents.MethodGeneratorUtils.METHOD_NAME;
import static com.azure.search.documents.MethodGeneratorUtils.getAllSolidSubClasses;

public class AbstractClassMethodGenerator {
    static MethodSpec generateAbstractMapMethod(Class fromClass, Class toClass) {
        Set<Class> subClasses = getAllSolidSubClasses(fromClass);
        if (subClasses.isEmpty()) {
            throw new RuntimeException("No sub class found for %s." + fromClass);
        }
        MethodSpec.Builder m = MethodSpec.methodBuilder(METHOD_NAME)
                .addJavadoc("Maps abstract class from {@link $T}", fromClass)
                .addJavadoc(" to {@link $T}.", toClass)
                .addJavadoc(" Dedicate works to sub class converter.")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(toClass)
                .addParameter(fromClass, INPUT_OBJ);

        subClasses.forEach(subClass -> generateDedicateCode(subClass, m));

        m.addStatement("throw $N.logExceptionAsError(new $T($S))",
                LOGGER_NAME, RuntimeException.class,
                "Should not be there!");

        return m.build();
    }

    private static void generateDedicateCode(Class subClass, MethodSpec.Builder m) {
        ClassName subClassConverter = ClassName.get(CONVERTER_PATH, subClass.getSimpleName() + "Converter");
        m.addCode(CodeBlock.builder()
                .beginControlFlow("if ($N instanceof $T)", INPUT_OBJ, subClass)
                .addStatement("return $T.$L(($T) $N)", subClassConverter, METHOD_NAME,
                        subClass,
                        INPUT_OBJ)
                .endControlFlow()
                .build());
    }
}
