package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.EdgeNGramTokenFilterSide;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.EdgeNGramTokenFilterSide} and
 * {@link EdgeNGramTokenFilterSide}.
 */
public final class EdgeNGramTokenFilterSideConverter {
    private static final ClientLogger LOGGER = new ClientLogger(EdgeNGramTokenFilterSideConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.EdgeNGramTokenFilterSide}. to enum
     * {@link EdgeNGramTokenFilterSide}.
     */
    public static EdgeNGramTokenFilterSide map(com.azure.search.documents.implementation.models.EdgeNGramTokenFilterSide obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case FRONT:
                return EdgeNGramTokenFilterSide.FRONT;
            case BACK:
                return EdgeNGramTokenFilterSide.BACK;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link EdgeNGramTokenFilterSide}. to enum
     * {@link com.azure.search.documents.implementation.models.EdgeNGramTokenFilterSide}.
     */
    public static com.azure.search.documents.implementation.models.EdgeNGramTokenFilterSide map(EdgeNGramTokenFilterSide obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case FRONT:
                return com.azure.search.documents.implementation.models.EdgeNGramTokenFilterSide.FRONT;
            case BACK:
                return com.azure.search.documents.implementation.models.EdgeNGramTokenFilterSide.BACK;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
