package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.QueryType;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.QueryType} and {@link QueryType}.
 */
public final class QueryTypeConverter {
    private static final ClientLogger LOGGER = new ClientLogger(QueryTypeConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.QueryType}. to enum {@link QueryType}.
     */
    public static QueryType map(com.azure.search.documents.implementation.models.QueryType obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case SIMPLE:
                return QueryType.SIMPLE;
            case FULL:
                return QueryType.FULL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link QueryType}. to enum {@link com.azure.search.documents.implementation.models.QueryType}.
     */
    public static com.azure.search.documents.implementation.models.QueryType map(QueryType obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case SIMPLE:
                return com.azure.search.documents.implementation.models.QueryType.SIMPLE;
            case FULL:
                return com.azure.search.documents.implementation.models.QueryType.FULL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
