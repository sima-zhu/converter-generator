package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.CjkBigramTokenFilterScripts;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts} and
 * {@link CjkBigramTokenFilterScripts}.
 */
public final class CjkBigramTokenFilterScriptsConverter {
    private static final ClientLogger LOGGER = new ClientLogger(CjkBigramTokenFilterScriptsConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts}. to enum
     * {@link CjkBigramTokenFilterScripts}.
     */
    public static CjkBigramTokenFilterScripts map(com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case HAN:
                return CjkBigramTokenFilterScripts.HAN;
            case HIRAGANA:
                return CjkBigramTokenFilterScripts.HIRAGANA;
            case KATAKANA:
                return CjkBigramTokenFilterScripts.KATAKANA;
            case HANGUL:
                return CjkBigramTokenFilterScripts.HANGUL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link CjkBigramTokenFilterScripts}. to enum
     * {@link com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts}.
     */
    public static com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts map(CjkBigramTokenFilterScripts obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case HAN:
                return com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts.HAN;
            case HIRAGANA:
                return com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts.HIRAGANA;
            case KATAKANA:
                return com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts.KATAKANA;
            case HANGUL:
                return com.azure.search.documents.implementation.models.CjkBigramTokenFilterScripts.HANGUL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
