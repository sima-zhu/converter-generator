package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SnowballTokenFilterLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage} and
 * {@link SnowballTokenFilterLanguage}.
 */
public final class SnowballTokenFilterLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SnowballTokenFilterLanguageConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage}. to enum
     * {@link SnowballTokenFilterLanguage}.
     */
    public static SnowballTokenFilterLanguage map(com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case ARMENIAN:
                return SnowballTokenFilterLanguage.ARMENIAN;
            case BASQUE:
                return SnowballTokenFilterLanguage.BASQUE;
            case CATALAN:
                return SnowballTokenFilterLanguage.CATALAN;
            case DANISH:
                return SnowballTokenFilterLanguage.DANISH;
            case DUTCH:
                return SnowballTokenFilterLanguage.DUTCH;
            case ENGLISH:
                return SnowballTokenFilterLanguage.ENGLISH;
            case FINNISH:
                return SnowballTokenFilterLanguage.FINNISH;
            case FRENCH:
                return SnowballTokenFilterLanguage.FRENCH;
            case GERMAN:
                return SnowballTokenFilterLanguage.GERMAN;
            case GERMAN2:
                return SnowballTokenFilterLanguage.GERMAN2;
            case HUNGARIAN:
                return SnowballTokenFilterLanguage.HUNGARIAN;
            case ITALIAN:
                return SnowballTokenFilterLanguage.ITALIAN;
            case KP:
                return SnowballTokenFilterLanguage.KP;
            case LOVINS:
                return SnowballTokenFilterLanguage.LOVINS;
            case NORWEGIAN:
                return SnowballTokenFilterLanguage.NORWEGIAN;
            case PORTER:
                return SnowballTokenFilterLanguage.PORTER;
            case PORTUGUESE:
                return SnowballTokenFilterLanguage.PORTUGUESE;
            case ROMANIAN:
                return SnowballTokenFilterLanguage.ROMANIAN;
            case RUSSIAN:
                return SnowballTokenFilterLanguage.RUSSIAN;
            case SPANISH:
                return SnowballTokenFilterLanguage.SPANISH;
            case SWEDISH:
                return SnowballTokenFilterLanguage.SWEDISH;
            case TURKISH:
                return SnowballTokenFilterLanguage.TURKISH;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link SnowballTokenFilterLanguage}. to enum
     * {@link com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage}.
     */
    public static com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage map(SnowballTokenFilterLanguage obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case ARMENIAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.ARMENIAN;
            case BASQUE:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.BASQUE;
            case CATALAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.CATALAN;
            case DANISH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.DANISH;
            case DUTCH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.DUTCH;
            case ENGLISH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.ENGLISH;
            case FINNISH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.FINNISH;
            case FRENCH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.FRENCH;
            case GERMAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.GERMAN;
            case GERMAN2:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.GERMAN2;
            case HUNGARIAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.HUNGARIAN;
            case ITALIAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.ITALIAN;
            case KP:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.KP;
            case LOVINS:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.LOVINS;
            case NORWEGIAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.NORWEGIAN;
            case PORTER:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.PORTER;
            case PORTUGUESE:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.PORTUGUESE;
            case ROMANIAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.ROMANIAN;
            case RUSSIAN:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.RUSSIAN;
            case SPANISH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.SPANISH;
            case SWEDISH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.SWEDISH;
            case TURKISH:
                return com.azure.search.documents.implementation.models.SnowballTokenFilterLanguage.TURKISH;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
