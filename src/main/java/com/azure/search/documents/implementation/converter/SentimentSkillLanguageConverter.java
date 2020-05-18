package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SentimentSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SentimentSkillLanguage} and
 * {@link SentimentSkillLanguage}.
 */
public final class SentimentSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SentimentSkillLanguageConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SentimentSkillLanguage} to
     * {@link SentimentSkillLanguage}.
     */
    public static SentimentSkillLanguage map(com.azure.search.documents.implementation.models.SentimentSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        SentimentSkillLanguage sentimentSkillLanguage = new SentimentSkillLanguage();
        return sentimentSkillLanguage;
    }

    /**
     * Maps from {@link SentimentSkillLanguage} to
     * {@link com.azure.search.documents.implementation.models.SentimentSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.SentimentSkillLanguage map(SentimentSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SentimentSkillLanguage sentimentSkillLanguage =
                new com.azure.search.documents.implementation.models.SentimentSkillLanguage();
        return sentimentSkillLanguage;
    }
}
