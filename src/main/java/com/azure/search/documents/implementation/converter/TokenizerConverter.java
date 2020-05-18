package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.models.ClassicTokenizer;
import com.azure.search.documents.implementation.models.EdgeNGramTokenizer;
import com.azure.search.documents.implementation.models.KeywordTokenizer;
import com.azure.search.documents.implementation.models.KeywordTokenizerV2;
import com.azure.search.documents.implementation.models.MicrosoftLanguageStemmingTokenizer;
import com.azure.search.documents.implementation.models.MicrosoftLanguageTokenizer;
import com.azure.search.documents.implementation.models.NGramTokenizer;
import com.azure.search.documents.implementation.models.PathHierarchyTokenizer;
import com.azure.search.documents.implementation.models.PathHierarchyTokenizerV2;
import com.azure.search.documents.implementation.models.PatternTokenizer;
import com.azure.search.documents.implementation.models.StandardTokenizer;
import com.azure.search.documents.implementation.models.StandardTokenizerV2;
import com.azure.search.documents.implementation.models.UaxUrlEmailTokenizer;
import com.azure.search.documents.models.Tokenizer;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Tokenizer} and {@link Tokenizer}.
 */
public final class TokenizerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TokenizerConverter.class);

    /**
     * Maps abstract class from {@link com.azure.search.documents.implementation.models.Tokenizer} to {@link Tokenizer}
     * .Dedicate works to sub class converter.
     */
    public static Tokenizer map(com.azure.search.documents.implementation.models.Tokenizer obj) {
        if (obj instanceof PathHierarchyTokenizer) {
            return PathHierarchyTokenizerConverter.map((PathHierarchyTokenizer) obj);
        }
        if (obj instanceof EdgeNGramTokenizer) {
            return EdgeNGramTokenizerConverter.map((EdgeNGramTokenizer) obj);
        }
        if (obj instanceof StandardTokenizer) {
            return StandardTokenizerConverter.map((StandardTokenizer) obj);
        }
        if (obj instanceof PatternTokenizer) {
            return PatternTokenizerConverter.map((PatternTokenizer) obj);
        }
        if (obj instanceof NGramTokenizer) {
            return NGramTokenizerConverter.map((NGramTokenizer) obj);
        }
        if (obj instanceof KeywordTokenizerV2) {
            return KeywordTokenizerV2Converter.map((KeywordTokenizerV2) obj);
        }
        if (obj instanceof ClassicTokenizer) {
            return ClassicTokenizerConverter.map((ClassicTokenizer) obj);
        }
        if (obj instanceof MicrosoftLanguageTokenizer) {
            return MicrosoftLanguageTokenizerConverter.map((MicrosoftLanguageTokenizer) obj);
        }
        if (obj instanceof KeywordTokenizer) {
            return KeywordTokenizerConverter.map((KeywordTokenizer) obj);
        }
        if (obj instanceof StandardTokenizerV2) {
            return StandardTokenizerV2Converter.map((StandardTokenizerV2) obj);
        }
        if (obj instanceof PathHierarchyTokenizerV2) {
            return PathHierarchyTokenizerV2Converter.map((PathHierarchyTokenizerV2) obj);
        }
        if (obj instanceof MicrosoftLanguageStemmingTokenizer) {
            return MicrosoftLanguageStemmingTokenizerConverter.map((MicrosoftLanguageStemmingTokenizer) obj);
        }
        if (obj instanceof UaxUrlEmailTokenizer) {
            return UaxUrlEmailTokenizerConverter.map((UaxUrlEmailTokenizer) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }

    /**
     * Maps abstract class from {@link Tokenizer} to {@link com.azure.search.documents.implementation.models.Tokenizer}
     * .Dedicate works to sub class converter.
     */
    public static com.azure.search.documents.implementation.models.Tokenizer map(Tokenizer obj) {
        if (obj instanceof com.azure.search.documents.models.PathHierarchyTokenizerV2) {
            return PathHierarchyTokenizerV2Converter.map((com.azure.search.documents.models.PathHierarchyTokenizerV2) obj);
        }
        if (obj instanceof com.azure.search.documents.models.KeywordTokenizer) {
            return KeywordTokenizerConverter.map((com.azure.search.documents.models.KeywordTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.UaxUrlEmailTokenizer) {
            return UaxUrlEmailTokenizerConverter.map((com.azure.search.documents.models.UaxUrlEmailTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.KeywordTokenizerV2) {
            return KeywordTokenizerV2Converter.map((com.azure.search.documents.models.KeywordTokenizerV2) obj);
        }
        if (obj instanceof com.azure.search.documents.models.ClassicTokenizer) {
            return ClassicTokenizerConverter.map((com.azure.search.documents.models.ClassicTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.MicrosoftLanguageTokenizer) {
            return MicrosoftLanguageTokenizerConverter.map((com.azure.search.documents.models.MicrosoftLanguageTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.EdgeNGramTokenizer) {
            return EdgeNGramTokenizerConverter.map((com.azure.search.documents.models.EdgeNGramTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.NGramTokenizer) {
            return NGramTokenizerConverter.map((com.azure.search.documents.models.NGramTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.StandardTokenizerV2) {
            return StandardTokenizerV2Converter.map((com.azure.search.documents.models.StandardTokenizerV2) obj);
        }
        if (obj instanceof com.azure.search.documents.models.PathHierarchyTokenizer) {
            return PathHierarchyTokenizerConverter.map((com.azure.search.documents.models.PathHierarchyTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.StandardTokenizer) {
            return StandardTokenizerConverter.map((com.azure.search.documents.models.StandardTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.PatternTokenizer) {
            return PatternTokenizerConverter.map((com.azure.search.documents.models.PatternTokenizer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.MicrosoftLanguageStemmingTokenizer) {
            return MicrosoftLanguageStemmingTokenizerConverter.map((com.azure.search.documents.models.MicrosoftLanguageStemmingTokenizer) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }
}
