package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.MicrosoftTokenizerLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage} and
 * {@link MicrosoftTokenizerLanguage}.
 */
public final class MicrosoftTokenizerLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(MicrosoftTokenizerLanguageConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage}. to enum
     * {@link MicrosoftTokenizerLanguage}.
     */
    public static MicrosoftTokenizerLanguage map(com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case BANGLA:
                return MicrosoftTokenizerLanguage.BANGLA;
            case BULGARIAN:
                return MicrosoftTokenizerLanguage.BULGARIAN;
            case CATALAN:
                return MicrosoftTokenizerLanguage.CATALAN;
            case CHINESE_SIMPLIFIED:
                return MicrosoftTokenizerLanguage.CHINESE_SIMPLIFIED;
            case CHINESE_TRADITIONAL:
                return MicrosoftTokenizerLanguage.CHINESE_TRADITIONAL;
            case CROATIAN:
                return MicrosoftTokenizerLanguage.CROATIAN;
            case CZECH:
                return MicrosoftTokenizerLanguage.CZECH;
            case DANISH:
                return MicrosoftTokenizerLanguage.DANISH;
            case DUTCH:
                return MicrosoftTokenizerLanguage.DUTCH;
            case ENGLISH:
                return MicrosoftTokenizerLanguage.ENGLISH;
            case FRENCH:
                return MicrosoftTokenizerLanguage.FRENCH;
            case GERMAN:
                return MicrosoftTokenizerLanguage.GERMAN;
            case GREEK:
                return MicrosoftTokenizerLanguage.GREEK;
            case GUJARATI:
                return MicrosoftTokenizerLanguage.GUJARATI;
            case HINDI:
                return MicrosoftTokenizerLanguage.HINDI;
            case ICELANDIC:
                return MicrosoftTokenizerLanguage.ICELANDIC;
            case INDONESIAN:
                return MicrosoftTokenizerLanguage.INDONESIAN;
            case ITALIAN:
                return MicrosoftTokenizerLanguage.ITALIAN;
            case JAPANESE:
                return MicrosoftTokenizerLanguage.JAPANESE;
            case KANNADA:
                return MicrosoftTokenizerLanguage.KANNADA;
            case KOREAN:
                return MicrosoftTokenizerLanguage.KOREAN;
            case MALAY:
                return MicrosoftTokenizerLanguage.MALAY;
            case MALAYALAM:
                return MicrosoftTokenizerLanguage.MALAYALAM;
            case MARATHI:
                return MicrosoftTokenizerLanguage.MARATHI;
            case NORWEGIAN_BOKMAAL:
                return MicrosoftTokenizerLanguage.NORWEGIAN_BOKMAAL;
            case POLISH:
                return MicrosoftTokenizerLanguage.POLISH;
            case PORTUGUESE:
                return MicrosoftTokenizerLanguage.PORTUGUESE;
            case PORTUGUESE_BRAZILIAN:
                return MicrosoftTokenizerLanguage.PORTUGUESE_BRAZILIAN;
            case PUNJABI:
                return MicrosoftTokenizerLanguage.PUNJABI;
            case ROMANIAN:
                return MicrosoftTokenizerLanguage.ROMANIAN;
            case RUSSIAN:
                return MicrosoftTokenizerLanguage.RUSSIAN;
            case SERBIAN_CYRILLIC:
                return MicrosoftTokenizerLanguage.SERBIAN_CYRILLIC;
            case SERBIAN_LATIN:
                return MicrosoftTokenizerLanguage.SERBIAN_LATIN;
            case SLOVENIAN:
                return MicrosoftTokenizerLanguage.SLOVENIAN;
            case SPANISH:
                return MicrosoftTokenizerLanguage.SPANISH;
            case SWEDISH:
                return MicrosoftTokenizerLanguage.SWEDISH;
            case TAMIL:
                return MicrosoftTokenizerLanguage.TAMIL;
            case TELUGU:
                return MicrosoftTokenizerLanguage.TELUGU;
            case THAI:
                return MicrosoftTokenizerLanguage.THAI;
            case UKRAINIAN:
                return MicrosoftTokenizerLanguage.UKRAINIAN;
            case URDU:
                return MicrosoftTokenizerLanguage.URDU;
            case VIETNAMESE:
                return MicrosoftTokenizerLanguage.VIETNAMESE;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link MicrosoftTokenizerLanguage}. to enum
     * {@link com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage}.
     */
    public static com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage map(MicrosoftTokenizerLanguage obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case BANGLA:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.BANGLA;
            case BULGARIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.BULGARIAN;
            case CATALAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.CATALAN;
            case CHINESE_SIMPLIFIED:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.CHINESE_SIMPLIFIED;
            case CHINESE_TRADITIONAL:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.CHINESE_TRADITIONAL;
            case CROATIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.CROATIAN;
            case CZECH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.CZECH;
            case DANISH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.DANISH;
            case DUTCH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.DUTCH;
            case ENGLISH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.ENGLISH;
            case FRENCH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.FRENCH;
            case GERMAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.GERMAN;
            case GREEK:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.GREEK;
            case GUJARATI:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.GUJARATI;
            case HINDI:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.HINDI;
            case ICELANDIC:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.ICELANDIC;
            case INDONESIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.INDONESIAN;
            case ITALIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.ITALIAN;
            case JAPANESE:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.JAPANESE;
            case KANNADA:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.KANNADA;
            case KOREAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.KOREAN;
            case MALAY:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.MALAY;
            case MALAYALAM:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.MALAYALAM;
            case MARATHI:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.MARATHI;
            case NORWEGIAN_BOKMAAL:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.NORWEGIAN_BOKMAAL;
            case POLISH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.POLISH;
            case PORTUGUESE:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.PORTUGUESE;
            case PORTUGUESE_BRAZILIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.PORTUGUESE_BRAZILIAN;
            case PUNJABI:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.PUNJABI;
            case ROMANIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.ROMANIAN;
            case RUSSIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.RUSSIAN;
            case SERBIAN_CYRILLIC:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.SERBIAN_CYRILLIC;
            case SERBIAN_LATIN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.SERBIAN_LATIN;
            case SLOVENIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.SLOVENIAN;
            case SPANISH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.SPANISH;
            case SWEDISH:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.SWEDISH;
            case TAMIL:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.TAMIL;
            case TELUGU:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.TELUGU;
            case THAI:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.THAI;
            case UKRAINIAN:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.UKRAINIAN;
            case URDU:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.URDU;
            case VIETNAMESE:
                return com.azure.search.documents.implementation.models.MicrosoftTokenizerLanguage.VIETNAMESE;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
