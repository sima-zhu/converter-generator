package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.KeyPhraseExtractionSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.KeyPhraseExtractionSkillLanguage} and
 * {@link KeyPhraseExtractionSkillLanguage}.
 */
public final class KeyPhraseExtractionSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(KeyPhraseExtractionSkillLanguageConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.KeyPhraseExtractionSkillLanguage} to
     * {@link KeyPhraseExtractionSkillLanguage}.
     */
    public static KeyPhraseExtractionSkillLanguage map(com.azure.search.documents.implementation.models.KeyPhraseExtractionSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        KeyPhraseExtractionSkillLanguage keyPhraseExtractionSkillLanguage = new KeyPhraseExtractionSkillLanguage();
        return keyPhraseExtractionSkillLanguage;
    }

    /**
     * Maps from {@link KeyPhraseExtractionSkillLanguage} to
     * {@link com.azure.search.documents.implementation.models.KeyPhraseExtractionSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.KeyPhraseExtractionSkillLanguage map(KeyPhraseExtractionSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.KeyPhraseExtractionSkillLanguage keyPhraseExtractionSkillLanguage = new com.azure.search.documents.implementation.models.KeyPhraseExtractionSkillLanguage();
        return keyPhraseExtractionSkillLanguage;
    }
}
