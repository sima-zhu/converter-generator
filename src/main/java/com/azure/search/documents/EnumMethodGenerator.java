package com.azure.search.documents;

import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.MethodSpec;

import javax.lang.model.element.Modifier;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static com.azure.search.documents.MethodGeneratorUtils.INPUT_OBJ;
import static com.azure.search.documents.MethodGeneratorUtils.LOGGER_NAME;
import static com.azure.search.documents.MethodGeneratorUtils.METHOD_NAME;

public class EnumMethodGenerator {
    static <T extends Enum<T>>MethodSpec generateEnumMapMethod(Class<T> fromClass, Class toClass) {
        MethodSpec.Builder m = MethodSpec.methodBuilder(METHOD_NAME)
                .addJavadoc("Maps from enum {@link $T}", fromClass)
                .addJavadoc(" to enum {@link $T}.", toClass)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(toClass)
                .addParameter(fromClass, INPUT_OBJ);
        try {
            Method method = fromClass.getDeclaredMethod("values");
            T[] values = (T[]) method.invoke(null);
            CodeBlock.Builder cb = CodeBlock.builder()
                    .beginControlFlow("if ($N == null)", INPUT_OBJ)
                    .addStatement("return null")
                    .endControlFlow();
            cb.add("switch ($N) {\n", INPUT_OBJ)
                    .indent();

            Arrays.asList(values).forEach(value -> cb.add("case $N:\n", value.name())
                    .indent()
                    .addStatement("return $T.$L", toClass, value.name())
                    .unindent()
            );
            cb.add("default: \n")
                    .indent()
                    .addStatement("throw $N.logExceptionAsError(new $T($S))",
                            LOGGER_NAME, RuntimeException.class,
                            "Should not be there!")
                    .unindent()
                    .unindent()
                    .add("}\n");
            m.addCode(cb.build());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return m.build();
    }
}
