package com.azure.search.documents;

import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.MethodSpec;

import javax.lang.model.element.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.azure.search.documents.MethodGeneratorUtils.CONVERTER_PATH;
import static com.azure.search.documents.MethodGeneratorUtils.INPUT_OBJ;
import static com.azure.search.documents.MethodGeneratorUtils.METHOD_NAME;
import static com.azure.search.documents.MethodGeneratorUtils.getTypeSimpleName;
import static com.azure.search.documents.MethodGeneratorUtils.getterName;
import static com.azure.search.documents.MethodGeneratorUtils.isArray;
import static com.azure.search.documents.MethodGeneratorUtils.isCollection;
import static com.azure.search.documents.MethodGeneratorUtils.isDirectSetType;
import static com.azure.search.documents.MethodGeneratorUtils.isInModels;
import static com.azure.search.documents.MethodGeneratorUtils.isMap;
import static com.azure.search.documents.MethodGeneratorUtils.isSkip;
import static com.azure.search.documents.MethodGeneratorUtils.isStatic;
import static com.azure.search.documents.MethodGeneratorUtils.setterName;
import static java.util.stream.Collectors.toMap;

public class SolidClassMethodGenerator {
    static MethodSpec generateMapMethod(Class fromClass, Class toClass) {
        MethodSpec.Builder m = MethodSpec.methodBuilder(METHOD_NAME)
                .addJavadoc("Maps from {@link $T} to {@link $T}.", fromClass, toClass)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(toClass)
                .addParameter(fromClass, INPUT_OBJ);
        m.addCode(CodeBlock.builder()
                .beginControlFlow("if ($N == null)", INPUT_OBJ)
                .addStatement("return null")
                .endControlFlow()
                .build());
        enrichFields(fromClass, toClass, m);
        return m.build();
    }

    private static String getOutputParameterName(Class toClass) {
        String simpleName = toClass.getSimpleName();
        return simpleName.substring(0, 1).toLowerCase() + simpleName.substring(1);
    }

    private static void enrichFields(Class fromClass, Class toClass, MethodSpec.Builder m) {
        String outputName = getOutputParameterName(toClass);
        m.addStatement("$T $L = new $T()", toClass, outputName, toClass);
        enrichCurrentClassFields(fromClass, toClass, m, outputName);
        m.addStatement("return $N", outputName);
    }

    private static void enrichCurrentClassFields(Class fromClass, Class toClass, MethodSpec.Builder m,
            String outputName) {
        // Recursively call for super class.
        if (isInModels(fromClass.getGenericSuperclass())) {
            enrichCurrentClassFields(fromClass.getSuperclass(), toClass.getSuperclass(), m, outputName);
        }
        Map<String, Field> fromFields = getNameToFieldsMap(fromClass);
        Map<String, Field> toFields = getNameToFieldsMap(toClass);
        fromFields.forEach((fieldName, field) ->
            enrichSingleField(fromClass, toClass, m, outputName, fieldName, field, toFields.get(fieldName)));
    }

    private static Map<String, Field> getNameToFieldsMap(Class clazz) {
        return Arrays.asList(clazz.getDeclaredFields()).stream()
                .collect(toMap(Field::getName, Function.identity()));
    }

    private static void enrichSingleField(Class fromClass, Class toClass, MethodSpec.Builder m,
            String outputName,
            String fieldName,
            Field fromField,
            Field toField) {
        if (isStatic(fromField) || isSkip(fromField)) {
            return;
        }
        if (fieldName.equals("useFuzzyMatching")) {
            int a = 1 + 1;
        }

        String getterMethod = getterName(fieldName, fromField, fromClass);
        String setterMethod = setterName(fieldName);
        String localField = "_" + fieldName;
        boolean hasSetter = false;
        try {
            toClass.getMethod(setterMethod, toField.getType());
            hasSetter = true;
        } catch (NoSuchMethodException e) {
        }

        CodeBlock.Builder cb = CodeBlock.builder().add("\n");
        if (isDirectSetType(fromField)) {
            cb.addStatement("$T $N = $N.$L()", toField.getType(), localField, INPUT_OBJ, getterMethod);
            if (hasSetter) {
                cb.addStatement("$N.$L($N)", outputName, setterMethod, localField);
            } else {
                cb.addStatement("$T.set($N, $S, $N)",
                        PrivateFieldAccessHelper.class,
                        outputName,
                        fieldName,
                        localField);
            }
            m.addCode(cb.build());
            return;
        }

        cb.beginControlFlow("if ($L.$L() != null)", INPUT_OBJ, getterMethod);

        if (isInModels(fromField.getType())) {
            ClassName subConverter = ClassName.get(CONVERTER_PATH, fromField.getType().getSimpleName() + "Converter");
            cb.addStatement("$T $N = $T.$L($N.$L())",
                    toField.getType(),
                    localField,
                    subConverter,
                    METHOD_NAME,
                    INPUT_OBJ,
                    getterMethod);
        } else if (isArray(fromField)) {
            ParameterizedType pt = (ParameterizedType) fromField.getGenericType();
            Type childType = pt.getActualTypeArguments()[0];
            if (isInModels(childType)) {
                ClassName subConverter = ClassName.get(CONVERTER_PATH, childType.getTypeName() + "Converter");
                cb.addStatement("$T $N = $T.asList($L.$L()).stream().map($T::$L).collect($T.toList()).toArray()",
                        toField.getGenericType(),
                        localField,
                        Arrays.class,
                        INPUT_OBJ, getterMethod,
                        subConverter, METHOD_NAME,
                        Collectors.class);
            } else {
                cb.addStatement("$T $N = $T.asList($L.$L()).stream().collect($T.toList()).toArray()",
                        toField.getGenericType(),
                        localField,
                        Arrays.class,
                        INPUT_OBJ, getterMethod,
                        Collectors.class);
            }
        } else if (isCollection(fromField)) {
            ParameterizedType pt = (ParameterizedType) fromField.getGenericType();
            Type childType = pt.getActualTypeArguments()[0];
            if (isInModels(childType)) {
                ClassName subConverter = ClassName.get(CONVERTER_PATH, getTypeSimpleName(childType)+ "Converter");
                cb.addStatement("$T $N = $N.$L().stream().map($T::$L).collect($T.$L())",
                        toField.getGenericType(),
                        localField,
                        INPUT_OBJ, getterMethod,
                        subConverter, METHOD_NAME,
                        Collectors.class,
                        getCollectionToCollectionMethod(fromField));
            } else {
                cb.addStatement("$T $N = $L.$L().stream().collect($T.$L())",
                        toField.getGenericType(), localField,
                        INPUT_OBJ, getterMethod,
                        Collectors.class,
                        getCollectionToCollectionMethod(fromField));
            }
        } else if (isMap(fromField)) {
            ParameterizedType pt = (ParameterizedType) fromField.getGenericType();
            Type keyType = pt.getActualTypeArguments()[0];
            Type valueType = pt.getActualTypeArguments()[1];
            CodeBlock convertKey;
            CodeBlock convertValue;
            if (isInModels(keyType)) {
                ClassName keyConverter = ClassName.get(CONVERTER_PATH, keyType.getTypeName() + "Converter");
                convertKey = CodeBlock.builder()
                        .add("$T::L", keyConverter, METHOD_NAME)
                        .build();

            } else {
                convertKey = CodeBlock.builder()
                        .add("e -> e.getKey()")
                        .build();
            }
            if (isInModels(valueType)) {
                ClassName valueConverter = ClassName.get(CONVERTER_PATH, valueType.getTypeName() + "Converter");
                convertValue = CodeBlock.builder()
                        .add("$T::L", valueConverter, METHOD_NAME)
                        .build();
            } else {
                convertValue = CodeBlock.builder()
                        .add("e -> e.getValue()")
                        .build();
            }
            cb.add("$T $N = $N.$L().entrySet().stream().collect($T.toMap(\n",
                    toField.getGenericType(), localField,
                    INPUT_OBJ, getterMethod,
                    Collectors.class);
            cb.indent().indent().add(convertKey).add(", ").add(convertValue)
                    .add("));\n").unindent().unindent();
        } else {
            throw new RuntimeException(String.format("Miss: %s, %s", fromClass.getSimpleName(), fieldName));
        }
        if (hasSetter) {
            cb.addStatement("$N.$L($N)", outputName, setterMethod, localField);
        } else {
            cb.addStatement("$T.set($N, $S, $N)",
                    PrivateFieldAccessHelper.class,
                    outputName,
                    fieldName,
                    localField);
        }
        m.addCode(cb.endControlFlow().build());
    }


    private static String getCollectionToCollectionMethod(Field field) {
        if (List.class.isAssignableFrom(field.getType())) {
            return "toList";
        } else if (Set.class.isAssignableFrom(field.getType())) {
            return "toSet";
        } else {
            throw new RuntimeException(String.format(
                    "Miss collection type %s for field %s",
                    field.getType(), field.getName()));
        }
    }
}
