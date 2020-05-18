package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SplitSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SplitSkillLanguage} and
 * {@link SplitSkillLanguage}.
 */
public final class SplitSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SplitSkillLanguageConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SplitSkillLanguage} to
     * {@link SplitSkillLanguage}.
     */
    public static SplitSkillLanguage map(com.azure.search.documents.implementation.models.SplitSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        SplitSkillLanguage splitSkillLanguage = new SplitSkillLanguage();
        return splitSkillLanguage;
    }

    /**
     * Maps from {@link SplitSkillLanguage} to
     * {@link com.azure.search.documents.implementation.models.SplitSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.SplitSkillLanguage map(SplitSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SplitSkillLanguage splitSkillLanguage =
                new com.azure.search.documents.implementation.models.SplitSkillLanguage();
        return splitSkillLanguage;
    }
}
