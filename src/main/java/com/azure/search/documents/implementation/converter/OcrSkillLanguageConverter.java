package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.OcrSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.OcrSkillLanguage} and
 * {@link OcrSkillLanguage}.
 */
public final class OcrSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(OcrSkillLanguageConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.OcrSkillLanguage} to {@link OcrSkillLanguage}.
     */
    public static OcrSkillLanguage map(com.azure.search.documents.implementation.models.OcrSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        OcrSkillLanguage ocrSkillLanguage = new OcrSkillLanguage();
        return ocrSkillLanguage;
    }

    /**
     * Maps from {@link OcrSkillLanguage} to {@link com.azure.search.documents.implementation.models.OcrSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.OcrSkillLanguage map(OcrSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.OcrSkillLanguage ocrSkillLanguage =
                new com.azure.search.documents.implementation.models.OcrSkillLanguage();
        return ocrSkillLanguage;
    }
}
