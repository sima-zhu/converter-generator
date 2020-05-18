package com.azure.search.documents;

import com.azure.core.util.logging.ClientLogger;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MethodGeneratorUtils {
    static final String INTERNAL_MODEL_PATH = "com.azure.search.documents.implementation.models";
    static final String EXTERNAL_MODEL_PATH = "com.azure.search.documents.models";
    static final String CONVERTER_PATH = "com.azure.search.documents.implementation.converter";
    static final String OUTPUT_PATH = "C:\\workspace\\converter-generator\\src\\main\\java";
    static final boolean DEBUG = true;
    static final String INPUT_OBJ = "obj";
    static final String METHOD_NAME = "map";
    static final String LOGGER_NAME = "LOGGER";
    static final Set<Class> SKIP_FIELDS = Set.of(ClientLogger.class);

    static Set<Class> ALL_CLASSES = new HashSet<>();
//    static {
//        ALL_CLASSES.add(SearchDocument.class);
//    }
    static Map<Class, Class> CLASSES = new HashMap<>();

    static boolean isInterfaceOrAbstract(Class clazz) {
        return clazz.isInterface()
                || java.lang.reflect.Modifier.isAbstract(clazz.getModifiers());
    }

    static Set<Class> getAllSolidSubClasses(Class clazz) {
        Set<Class> subClasses = new HashSet<>();
        CLASSES.keySet().stream().forEach(c -> {
            if (isInterfaceOrAbstract(c)) {
                return;
            }
            if (clazz.isAssignableFrom(c)) {
                subClasses.add(c);
            }
        });
        CLASSES.values().stream().forEach(c -> {
            if (isInterfaceOrAbstract(c)) {
                return;
            }
            if (clazz.isAssignableFrom(c)) {
                subClasses.add(c);
            }
        });
        return subClasses;
    }

    static boolean isDirectSetType(Field field) {
        return SearchDocument.class.isAssignableFrom(field.getType()) ||
                (!isArray(field) && !isCollection(field) &&
                !isMap(field) &&
                !isInModels(field.getGenericType()));
    }

    static boolean isMap(Field field) {
        return Map.class.isAssignableFrom(field.getType());
    }

    static boolean isInModels(Type type) {
        return ALL_CLASSES.contains(type);
    }
    static boolean isArray(Field field) {
        return field.getType().isArray();
    }

    static boolean isCollection(Field field) {
        return !isArray(field) && Collection.class.isAssignableFrom(field.getType());
    }

    static boolean isStatic(Field field) {
        return java.lang.reflect.Modifier.isStatic(field.getModifiers());
    }

    static boolean isBoolean(Field field) {
        return Boolean.class == field.getGenericType() || boolean.class == field.getGenericType();
    }

    static boolean isSkip(Field field) {
        return SKIP_FIELDS.contains(field.getType());
    }

    private List<String> prefix = List.of("", "is", "get");

    static String getterName(String fieldName, Field field, Class clazz) {
        String suffix = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        if (!isBoolean(field)) {
            return "get" + suffix;
        }

        try {
            clazz.getMethod("is" + suffix);
            return "is" + suffix;
        } catch (NoSuchMethodException e) {
        }
        try {
            clazz.getMethod(fieldName);
            return fieldName;
        } catch (NoSuchMethodException e) {
        }

        return "get" + suffix;
    }

    static String setterName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    static String getTypeSimpleName(Type type) {
        String[] parts = type.getTypeName().split("[.]");
        return parts[parts.length - 1];
    }

    static void print(String msgFormat, Object ... args) {
        if (DEBUG) {
            System.out.println(String.format(msgFormat, args));
        }
    }
}
