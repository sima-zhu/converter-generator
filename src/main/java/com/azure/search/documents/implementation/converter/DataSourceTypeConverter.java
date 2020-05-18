package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.DataSourceType;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.DataSourceType} and
 * {@link DataSourceType}.
 */
public final class DataSourceTypeConverter {
    private static final ClientLogger LOGGER = new ClientLogger(DataSourceTypeConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.DataSourceType} to {@link DataSourceType}.
     */
    public static DataSourceType map(com.azure.search.documents.implementation.models.DataSourceType obj) {
        if (obj == null) {
            return null;
        }
        DataSourceType dataSourceType = new DataSourceType();
        return dataSourceType;
    }

    /**
     * Maps from {@link DataSourceType} to {@link com.azure.search.documents.implementation.models.DataSourceType}.
     */
    public static com.azure.search.documents.implementation.models.DataSourceType map(DataSourceType obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.DataSourceType dataSourceType =
                new com.azure.search.documents.implementation.models.DataSourceType();
        return dataSourceType;
    }
}
