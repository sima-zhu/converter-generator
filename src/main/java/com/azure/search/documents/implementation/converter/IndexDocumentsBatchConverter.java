package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.IndexDocumentsBatch;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexDocumentsBatch} and
 * {@link IndexDocumentsBatch}.
 */
public final class IndexDocumentsBatchConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexDocumentsBatchConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.IndexDocumentsBatch} to
     * {@link IndexDocumentsBatch}.
     */
    public static IndexDocumentsBatch map(com.azure.search.documents.implementation.models.IndexDocumentsBatch obj) {
        if (obj == null) {
            return null;
        }
        IndexDocumentsBatch indexDocumentsBatch = new IndexDocumentsBatch();
        return indexDocumentsBatch;
    }

    /**
     * Maps from {@link IndexDocumentsBatch} to
     * {@link com.azure.search.documents.implementation.models.IndexDocumentsBatch}.
     */
    public static com.azure.search.documents.implementation.models.IndexDocumentsBatch map(IndexDocumentsBatch obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.IndexDocumentsBatch indexDocumentsBatch =
                new com.azure.search.documents.implementation.models.IndexDocumentsBatch();
        return indexDocumentsBatch;
    }
}
