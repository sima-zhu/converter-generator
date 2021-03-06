package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.WordDelimiterTokenFilter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.WordDelimiterTokenFilter} and
 * {@link WordDelimiterTokenFilter}.
 */
public final class WordDelimiterTokenFilterConverter {
    private static final ClientLogger LOGGER = new ClientLogger(WordDelimiterTokenFilterConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.WordDelimiterTokenFilter} to
     * {@link WordDelimiterTokenFilter}.
     */
    public static WordDelimiterTokenFilter map(com.azure.search.documents.implementation.models.WordDelimiterTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        WordDelimiterTokenFilter wordDelimiterTokenFilter = new WordDelimiterTokenFilter();

        String _name = obj.getName();
        wordDelimiterTokenFilter.setName(_name);

        Boolean _catenateNumbers = obj.isCatenateNumbers();
        wordDelimiterTokenFilter.setCatenateNumbers(_catenateNumbers);

        if (obj.getProtectedWords() != null) {
            List<String> _protectedWords = obj.getProtectedWords().stream().collect(Collectors.toList());
            wordDelimiterTokenFilter.setProtectedWords(_protectedWords);
        }

        Boolean _generateNumberParts = obj.generateNumberParts();
        wordDelimiterTokenFilter.setGenerateNumberParts(_generateNumberParts);

        Boolean _stemEnglishPossessive = obj.isStemEnglishPossessive();
        wordDelimiterTokenFilter.setStemEnglishPossessive(_stemEnglishPossessive);

        Boolean _splitOnCaseChange = obj.isSplitOnCaseChange();
        wordDelimiterTokenFilter.setSplitOnCaseChange(_splitOnCaseChange);

        Boolean _generateWordParts = obj.generateWordParts();
        wordDelimiterTokenFilter.setGenerateWordParts(_generateWordParts);

        Boolean _splitOnNumerics = obj.isSplitOnNumerics();
        wordDelimiterTokenFilter.setSplitOnNumerics(_splitOnNumerics);

        Boolean _preserveOriginal = obj.isPreserveOriginal();
        wordDelimiterTokenFilter.setPreserveOriginal(_preserveOriginal);

        Boolean _catenateAll = obj.isCatenateAll();
        wordDelimiterTokenFilter.setCatenateAll(_catenateAll);

        Boolean _catenateWords = obj.isCatenateWords();
        wordDelimiterTokenFilter.setCatenateWords(_catenateWords);
        return wordDelimiterTokenFilter;
    }

    /**
     * Maps from {@link WordDelimiterTokenFilter} to
     * {@link com.azure.search.documents.implementation.models.WordDelimiterTokenFilter}.
     */
    public static com.azure.search.documents.implementation.models.WordDelimiterTokenFilter map(WordDelimiterTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.WordDelimiterTokenFilter wordDelimiterTokenFilter =
                new com.azure.search.documents.implementation.models.WordDelimiterTokenFilter();

        String _name = obj.getName();
        wordDelimiterTokenFilter.setName(_name);

        Boolean _catenateNumbers = obj.isCatenateNumbers();
        wordDelimiterTokenFilter.setCatenateNumbers(_catenateNumbers);

        if (obj.getProtectedWords() != null) {
            List<String> _protectedWords = obj.getProtectedWords().stream().collect(Collectors.toList());
            wordDelimiterTokenFilter.setProtectedWords(_protectedWords);
        }

        Boolean _generateNumberParts = obj.generateNumberParts();
        wordDelimiterTokenFilter.setGenerateNumberParts(_generateNumberParts);

        Boolean _stemEnglishPossessive = obj.isStemEnglishPossessive();
        wordDelimiterTokenFilter.setStemEnglishPossessive(_stemEnglishPossessive);

        Boolean _splitOnCaseChange = obj.isSplitOnCaseChange();
        wordDelimiterTokenFilter.setSplitOnCaseChange(_splitOnCaseChange);

        Boolean _generateWordParts = obj.generateWordParts();
        wordDelimiterTokenFilter.setGenerateWordParts(_generateWordParts);

        Boolean _splitOnNumerics = obj.isSplitOnNumerics();
        wordDelimiterTokenFilter.setSplitOnNumerics(_splitOnNumerics);

        Boolean _preserveOriginal = obj.isPreserveOriginal();
        wordDelimiterTokenFilter.setPreserveOriginal(_preserveOriginal);

        Boolean _catenateAll = obj.isCatenateAll();
        wordDelimiterTokenFilter.setCatenateAll(_catenateAll);

        Boolean _catenateWords = obj.isCatenateWords();
        wordDelimiterTokenFilter.setCatenateWords(_catenateWords);
        return wordDelimiterTokenFilter;
    }
}
