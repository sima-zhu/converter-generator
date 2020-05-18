package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.AnalyzerName;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.AnalyzerName} and {@link AnalyzerName}.
 */
public final class AnalyzerNameConverter {
    private static final ClientLogger LOGGER = new ClientLogger(AnalyzerNameConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.AnalyzerName} to {@link AnalyzerName}.
     */
    public static AnalyzerName map(com.azure.search.documents.implementation.models.AnalyzerName obj) {
        if (obj == null) {
            return null;
        }
        AnalyzerName analyzerName = new AnalyzerName();
        return analyzerName;
    }

    /**
     * Maps from {@link AnalyzerName} to {@link com.azure.search.documents.implementation.models.AnalyzerName}.
     */
    public static com.azure.search.documents.implementation.models.AnalyzerName map(AnalyzerName obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.AnalyzerName analyzerName =
                new com.azure.search.documents.implementation.models.AnalyzerName();
        return analyzerName;
    }
}
