package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.ImageAnalysisSkillLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ImageAnalysisSkillLanguage} and
 * {@link ImageAnalysisSkillLanguage}.
 */
public final class ImageAnalysisSkillLanguageConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ImageAnalysisSkillLanguageConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ImageAnalysisSkillLanguage} to
     * {@link ImageAnalysisSkillLanguage}.
     */
    public static ImageAnalysisSkillLanguage map(com.azure.search.documents.implementation.models.ImageAnalysisSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        ImageAnalysisSkillLanguage imageAnalysisSkillLanguage = new ImageAnalysisSkillLanguage();
        return imageAnalysisSkillLanguage;
    }

    /**
     * Maps from {@link ImageAnalysisSkillLanguage} to
     * {@link com.azure.search.documents.implementation.models.ImageAnalysisSkillLanguage}.
     */
    public static com.azure.search.documents.implementation.models.ImageAnalysisSkillLanguage map(ImageAnalysisSkillLanguage obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ImageAnalysisSkillLanguage imageAnalysisSkillLanguage =
                new com.azure.search.documents.implementation.models.ImageAnalysisSkillLanguage();
        return imageAnalysisSkillLanguage;
    }
}
