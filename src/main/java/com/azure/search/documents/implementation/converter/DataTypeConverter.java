package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.DataType;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.DataType} and {@link DataType}.
 */
public final class DataTypeConverter {
    private static final ClientLogger LOGGER = new ClientLogger(DataTypeConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.DataType} to {@link DataType}.
     */
    public static DataType map(com.azure.search.documents.implementation.models.DataType obj) {
        if (obj == null) {
            return null;
        }
        DataType dataType = new DataType();
        return dataType;
    }

    /**
     * Maps from {@link DataType} to {@link com.azure.search.documents.implementation.models.DataType}.
     */
    public static com.azure.search.documents.implementation.models.DataType map(DataType obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.DataType dataType = new com.azure.search.documents.implementation.models.DataType();
        return dataType;
    }
}
