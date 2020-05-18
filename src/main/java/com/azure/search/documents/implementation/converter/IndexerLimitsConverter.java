package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.IndexerLimits;

import java.time.Duration;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexerLimits} and {@link IndexerLimits}.
 */
public final class IndexerLimitsConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexerLimitsConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.IndexerLimits} to {@link IndexerLimits}.
     */
    public static IndexerLimits map(com.azure.search.documents.implementation.models.IndexerLimits obj) {
        if (obj == null) {
            return null;
        }
        IndexerLimits indexerLimits = new IndexerLimits();

        Duration _maxRunTime = obj.getMaxRunTime();
        PrivateFieldAccessHelper.set(indexerLimits, "maxRunTime", _maxRunTime);

        Double _maxDocumentContentCharactersToExtract = obj.getMaxDocumentContentCharactersToExtract();
        PrivateFieldAccessHelper.set(indexerLimits, "maxDocumentContentCharactersToExtract",
                _maxDocumentContentCharactersToExtract);

        Double _maxDocumentExtractionSize = obj.getMaxDocumentExtractionSize();
        PrivateFieldAccessHelper.set(indexerLimits, "maxDocumentExtractionSize", _maxDocumentExtractionSize);
        return indexerLimits;
    }

    /**
     * Maps from {@link IndexerLimits} to {@link com.azure.search.documents.implementation.models.IndexerLimits}.
     */
    public static com.azure.search.documents.implementation.models.IndexerLimits map(IndexerLimits obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.IndexerLimits indexerLimits =
                new com.azure.search.documents.implementation.models.IndexerLimits();

        Duration _maxRunTime = obj.getMaxRunTime();
        PrivateFieldAccessHelper.set(indexerLimits, "maxRunTime", _maxRunTime);

        Double _maxDocumentContentCharactersToExtract = obj.getMaxDocumentContentCharactersToExtract();
        PrivateFieldAccessHelper.set(indexerLimits, "maxDocumentContentCharactersToExtract",
                _maxDocumentContentCharactersToExtract);

        Double _maxDocumentExtractionSize = obj.getMaxDocumentExtractionSize();
        PrivateFieldAccessHelper.set(indexerLimits, "maxDocumentExtractionSize", _maxDocumentExtractionSize);
        return indexerLimits;
    }
}
