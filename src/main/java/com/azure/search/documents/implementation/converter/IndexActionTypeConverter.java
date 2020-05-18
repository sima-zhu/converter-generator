package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.IndexActionType;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexActionType} and
 * {@link IndexActionType}.
 */
public final class IndexActionTypeConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexActionTypeConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.IndexActionType}. to enum
     * {@link IndexActionType}.
     */
    public static IndexActionType map(com.azure.search.documents.implementation.models.IndexActionType obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case UPLOAD:
                return IndexActionType.UPLOAD;
            case MERGE:
                return IndexActionType.MERGE;
            case MERGE_OR_UPLOAD:
                return IndexActionType.MERGE_OR_UPLOAD;
            case DELETE:
                return IndexActionType.DELETE;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link IndexActionType}. to enum
     * {@link com.azure.search.documents.implementation.models.IndexActionType}.
     */
    public static com.azure.search.documents.implementation.models.IndexActionType map(IndexActionType obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case UPLOAD:
                return com.azure.search.documents.implementation.models.IndexActionType.UPLOAD;
            case MERGE:
                return com.azure.search.documents.implementation.models.IndexActionType.MERGE;
            case MERGE_OR_UPLOAD:
                return com.azure.search.documents.implementation.models.IndexActionType.MERGE_OR_UPLOAD;
            case DELETE:
                return com.azure.search.documents.implementation.models.IndexActionType.DELETE;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
