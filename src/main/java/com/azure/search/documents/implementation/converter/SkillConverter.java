package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.models.ConditionalSkill;
import com.azure.search.documents.implementation.models.EntityRecognitionSkill;
import com.azure.search.documents.implementation.models.ImageAnalysisSkill;
import com.azure.search.documents.implementation.models.KeyPhraseExtractionSkill;
import com.azure.search.documents.implementation.models.LanguageDetectionSkill;
import com.azure.search.documents.implementation.models.MergeSkill;
import com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill;
import com.azure.search.documents.implementation.models.OcrSkill;
import com.azure.search.documents.implementation.models.SentimentSkill;
import com.azure.search.documents.implementation.models.ShaperSkill;
import com.azure.search.documents.implementation.models.SplitSkill;
import com.azure.search.documents.implementation.models.TextTranslationSkill;
import com.azure.search.documents.implementation.models.WebApiSkill;
import com.azure.search.documents.models.Skill;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Skill} and {@link Skill}.
 */
public final class SkillConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SkillConverter.class);

    /**
     * Maps abstract class from {@link com.azure.search.documents.implementation.models.Skill} to {@link Skill}
     * .Dedicate works to sub class converter.
     */
    public static Skill map(com.azure.search.documents.implementation.models.Skill obj) {
        if (obj instanceof EntityRecognitionSkill) {
            return EntityRecognitionSkillConverter.map((EntityRecognitionSkill) obj);
        }
        if (obj instanceof SplitSkill) {
            return SplitSkillConverter.map((SplitSkill) obj);
        }
        if (obj instanceof NamedEntityRecognitionSkill) {
            return NamedEntityRecognitionSkillConverter.map((NamedEntityRecognitionSkill) obj);
        }
        if (obj instanceof WebApiSkill) {
            return WebApiSkillConverter.map((WebApiSkill) obj);
        }
        if (obj instanceof SentimentSkill) {
            return SentimentSkillConverter.map((SentimentSkill) obj);
        }
        if (obj instanceof LanguageDetectionSkill) {
            return LanguageDetectionSkillConverter.map((LanguageDetectionSkill) obj);
        }
        if (obj instanceof TextTranslationSkill) {
            return TextTranslationSkillConverter.map((TextTranslationSkill) obj);
        }
        if (obj instanceof KeyPhraseExtractionSkill) {
            return KeyPhraseExtractionSkillConverter.map((KeyPhraseExtractionSkill) obj);
        }
        if (obj instanceof ImageAnalysisSkill) {
            return ImageAnalysisSkillConverter.map((ImageAnalysisSkill) obj);
        }
        if (obj instanceof MergeSkill) {
            return MergeSkillConverter.map((MergeSkill) obj);
        }
        if (obj instanceof OcrSkill) {
            return OcrSkillConverter.map((OcrSkill) obj);
        }
        if (obj instanceof ConditionalSkill) {
            return ConditionalSkillConverter.map((ConditionalSkill) obj);
        }
        if (obj instanceof ShaperSkill) {
            return ShaperSkillConverter.map((ShaperSkill) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }

    /**
     * Maps abstract class from {@link Skill} to {@link com.azure.search.documents.implementation.models.Skill}
     * .Dedicate works to sub class converter.
     */
    public static com.azure.search.documents.implementation.models.Skill map(Skill obj) {
        if (obj instanceof com.azure.search.documents.models.ShaperSkill) {
            return ShaperSkillConverter.map((com.azure.search.documents.models.ShaperSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.SentimentSkill) {
            return SentimentSkillConverter.map((com.azure.search.documents.models.SentimentSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.SplitSkill) {
            return SplitSkillConverter.map((com.azure.search.documents.models.SplitSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.LanguageDetectionSkill) {
            return LanguageDetectionSkillConverter.map((com.azure.search.documents.models.LanguageDetectionSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.MergeSkill) {
            return MergeSkillConverter.map((com.azure.search.documents.models.MergeSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.ConditionalSkill) {
            return ConditionalSkillConverter.map((com.azure.search.documents.models.ConditionalSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.KeyPhraseExtractionSkill) {
            return KeyPhraseExtractionSkillConverter.map((com.azure.search.documents.models.KeyPhraseExtractionSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.OcrSkill) {
            return OcrSkillConverter.map((com.azure.search.documents.models.OcrSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.EntityRecognitionSkill) {
            return EntityRecognitionSkillConverter.map((com.azure.search.documents.models.EntityRecognitionSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.TextTranslationSkill) {
            return TextTranslationSkillConverter.map((com.azure.search.documents.models.TextTranslationSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.WebApiSkill) {
            return WebApiSkillConverter.map((com.azure.search.documents.models.WebApiSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.ImageAnalysisSkill) {
            return ImageAnalysisSkillConverter.map((com.azure.search.documents.models.ImageAnalysisSkill) obj);
        }
        if (obj instanceof com.azure.search.documents.models.NamedEntityRecognitionSkill) {
            return NamedEntityRecognitionSkillConverter.map((com.azure.search.documents.models.NamedEntityRecognitionSkill) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }
}
