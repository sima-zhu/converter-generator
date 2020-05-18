package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.EntityRecognitionSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.EntityRecognitionSkillLanguage} and
 * {@link EntityRecognitionSkillLanguage}.
 */
public final class EntityRecognitionSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(EntityRecognitionSkillLanguageConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.EntityRecognitionSkillLanguage} to
     * {@link EntityRecognitionSkillLanguage}.
     */
    public static EntityRecognitionSkillLanguage map(com.azure.search.documents.implementation.models.EntityRecognitionSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        EntityRecognitionSkillLanguage entityRecognitionSkillLanguage = new EntityRecognitionSkillLanguage();
        return entityRecognitionSkillLanguage;
    }

    /**
     * Maps from {@link EntityRecognitionSkillLanguage} to
     * {@link com.azure.search.documents.implementation.models.EntityRecognitionSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.EntityRecognitionSkillLanguage map(EntityRecognitionSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.EntityRecognitionSkillLanguage entityRecognitionSkillLanguage = new com.azure.search.documents.implementation.models.EntityRecognitionSkillLanguage();
        return entityRecognitionSkillLanguage;
    }
}
