package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.TextTranslationSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.TextTranslationSkillLanguage} and
 * {@link TextTranslationSkillLanguage}.
 */
public final class TextTranslationSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TextTranslationSkillLanguageConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.TextTranslationSkillLanguage} to
     * {@link TextTranslationSkillLanguage}.
     */
    public static TextTranslationSkillLanguage map(com.azure.search.documents.implementation.models.TextTranslationSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        TextTranslationSkillLanguage textTranslationSkillLanguage = new TextTranslationSkillLanguage();
        return textTranslationSkillLanguage;
    }

    /**
     * Maps from {@link TextTranslationSkillLanguage} to
     * {@link com.azure.search.documents.implementation.models.TextTranslationSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.TextTranslationSkillLanguage map(TextTranslationSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.TextTranslationSkillLanguage textTranslationSkillLanguage =
                new com.azure.search.documents.implementation.models.TextTranslationSkillLanguage();
        return textTranslationSkillLanguage;
    }
}
