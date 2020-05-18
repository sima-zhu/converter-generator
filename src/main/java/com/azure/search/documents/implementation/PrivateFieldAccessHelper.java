package com.azure.search.documents.implementation;

import com.azure.core.util.logging.ClientLogger;

import java.lang.reflect.Field;

public class PrivateFieldAccessHelper {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateFieldAccessHelper.class);

    public static <T> void set(T obj, String fieldName, Object value) {
        try {
            Field f1 = obj.getClass().getDeclaredField(fieldName);
            f1.setAccessible(true);
            f1.set(obj, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw LOGGER.logExceptionAsError(new RuntimeException(e));
        }
    }

    public static <T, I> I get(T obj, String fieldName, Class<I> outputClass) {
        try {
            Field f1 = obj.getClass().getDeclaredField(fieldName);
            f1.setAccessible(true);
            return (I) f1.get(obj);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw LOGGER.logExceptionAsError(new RuntimeException(e));
        }
    }
}
