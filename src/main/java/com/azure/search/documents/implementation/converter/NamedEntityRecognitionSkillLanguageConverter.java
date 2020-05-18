package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.NamedEntityRecognitionSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage}
 * and {@link NamedEntityRecognitionSkillLanguage}.
 */
public final class NamedEntityRecognitionSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(NamedEntityRecognitionSkillLanguageConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage}. to
     * enum {@link NamedEntityRecognitionSkillLanguage}.
     */
    public static NamedEntityRecognitionSkillLanguage map(com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case AR:
                return NamedEntityRecognitionSkillLanguage.AR;
            case CS:
                return NamedEntityRecognitionSkillLanguage.CS;
            case DA:
                return NamedEntityRecognitionSkillLanguage.DA;
            case DE:
                return NamedEntityRecognitionSkillLanguage.DE;
            case EN:
                return NamedEntityRecognitionSkillLanguage.EN;
            case ES:
                return NamedEntityRecognitionSkillLanguage.ES;
            case FI:
                return NamedEntityRecognitionSkillLanguage.FI;
            case FR:
                return NamedEntityRecognitionSkillLanguage.FR;
            case HE:
                return NamedEntityRecognitionSkillLanguage.HE;
            case HU:
                return NamedEntityRecognitionSkillLanguage.HU;
            case IT:
                return NamedEntityRecognitionSkillLanguage.IT;
            case KO:
                return NamedEntityRecognitionSkillLanguage.KO;
            case PT_BR:
                return NamedEntityRecognitionSkillLanguage.PT_BR;
            case PT:
                return NamedEntityRecognitionSkillLanguage.PT;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link NamedEntityRecognitionSkillLanguage}. to enum
     * {@link com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage map(NamedEntityRecognitionSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case AR:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.AR;
            case CS:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.CS;
            case DA:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.DA;
            case DE:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.DE;
            case EN:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.EN;
            case ES:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.ES;
            case FI:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.FI;
            case FR:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.FR;
            case HE:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.HE;
            case HU:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.HU;
            case IT:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.IT;
            case KO:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.KO;
            case PT_BR:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.PT_BR;
            case PT:
                return com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage.PT;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
