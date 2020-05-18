package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.IndexerExecutionStatus;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexerExecutionStatus} and
 * {@link IndexerExecutionStatus}.
 */
public final class IndexerExecutionStatusConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexerExecutionStatusConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.IndexerExecutionStatus}. to enum
     * {@link IndexerExecutionStatus}.
     */
    public static IndexerExecutionStatus map(com.azure.search.documents.implementation.models.IndexerExecutionStatus obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case TRANSIENT_FAILURE:
                return IndexerExecutionStatus.TRANSIENT_FAILURE;
            case SUCCESS:
                return IndexerExecutionStatus.SUCCESS;
            case IN_PROGRESS:
                return IndexerExecutionStatus.IN_PROGRESS;
            case RESET:
                return IndexerExecutionStatus.RESET;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link IndexerExecutionStatus}. to enum
     * {@link com.azure.search.documents.implementation.models.IndexerExecutionStatus}.
     */
    public static com.azure.search.documents.implementation.models.IndexerExecutionStatus map(IndexerExecutionStatus obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case TRANSIENT_FAILURE:
                return com.azure.search.documents.implementation.models.IndexerExecutionStatus.TRANSIENT_FAILURE;
            case SUCCESS:
                return com.azure.search.documents.implementation.models.IndexerExecutionStatus.SUCCESS;
            case IN_PROGRESS:
                return com.azure.search.documents.implementation.models.IndexerExecutionStatus.IN_PROGRESS;
            case RESET:
                return com.azure.search.documents.implementation.models.IndexerExecutionStatus.RESET;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
