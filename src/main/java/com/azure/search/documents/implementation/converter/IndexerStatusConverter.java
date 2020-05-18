package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.IndexerStatus;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexerStatus} and {@link IndexerStatus}.
 */
public final class IndexerStatusConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexerStatusConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.IndexerStatus}. to enum
     * {@link IndexerStatus}.
     */
    public static IndexerStatus map(com.azure.search.documents.implementation.models.IndexerStatus obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case UNKNOWN:
                return IndexerStatus.UNKNOWN;
            case ERROR:
                return IndexerStatus.ERROR;
            case RUNNING:
                return IndexerStatus.RUNNING;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link IndexerStatus}. to enum
     * {@link com.azure.search.documents.implementation.models.IndexerStatus}.
     */
    public static com.azure.search.documents.implementation.models.IndexerStatus map(IndexerStatus obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case UNKNOWN:
                return com.azure.search.documents.implementation.models.IndexerStatus.UNKNOWN;
            case ERROR:
                return com.azure.search.documents.implementation.models.IndexerStatus.ERROR;
            case RUNNING:
                return com.azure.search.documents.implementation.models.IndexerStatus.RUNNING;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
