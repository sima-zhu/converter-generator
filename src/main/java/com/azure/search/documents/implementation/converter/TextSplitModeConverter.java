package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.TextSplitMode;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.TextSplitMode} and {@link TextSplitMode}.
 */
public final class TextSplitModeConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TextSplitModeConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.TextSplitMode}. to enum
     * {@link TextSplitMode}.
     */
    public static TextSplitMode map(com.azure.search.documents.implementation.models.TextSplitMode obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case PAGES:
                return TextSplitMode.PAGES;
            case SENTENCES:
                return TextSplitMode.SENTENCES;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link TextSplitMode}. to enum
     * {@link com.azure.search.documents.implementation.models.TextSplitMode}.
     */
    public static com.azure.search.documents.implementation.models.TextSplitMode map(TextSplitMode obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case PAGES:
                return com.azure.search.documents.implementation.models.TextSplitMode.PAGES;
            case SENTENCES:
                return com.azure.search.documents.implementation.models.TextSplitMode.SENTENCES;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
