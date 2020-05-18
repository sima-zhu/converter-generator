package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.TextExtractionAlgorithm;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.TextExtractionAlgorithm} and
 * {@link TextExtractionAlgorithm}.
 */
public final class TextExtractionAlgorithmConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TextExtractionAlgorithmConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.TextExtractionAlgorithm}. to enum
     * {@link TextExtractionAlgorithm}.
     */
    public static TextExtractionAlgorithm map(com.azure.search.documents.implementation.models.TextExtractionAlgorithm obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case PRINTED:
                return TextExtractionAlgorithm.PRINTED;
            case HANDWRITTEN:
                return TextExtractionAlgorithm.HANDWRITTEN;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link TextExtractionAlgorithm}. to enum
     * {@link com.azure.search.documents.implementation.models.TextExtractionAlgorithm}.
     */
    public static com.azure.search.documents.implementation.models.TextExtractionAlgorithm map(TextExtractionAlgorithm obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case PRINTED:
                return com.azure.search.documents.implementation.models.TextExtractionAlgorithm.PRINTED;
            case HANDWRITTEN:
                return com.azure.search.documents.implementation.models.TextExtractionAlgorithm.HANDWRITTEN;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
