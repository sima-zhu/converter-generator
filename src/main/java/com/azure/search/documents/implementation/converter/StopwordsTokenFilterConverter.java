package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.StopwordsList;
import com.azure.search.documents.models.StopwordsTokenFilter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.StopwordsTokenFilter} and
 * {@link StopwordsTokenFilter}.
 */
public final class StopwordsTokenFilterConverter {
    private static final ClientLogger LOGGER = new ClientLogger(StopwordsTokenFilterConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.StopwordsTokenFilter} to
     * {@link StopwordsTokenFilter}.
     */
    public static StopwordsTokenFilter map(com.azure.search.documents.implementation.models.StopwordsTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        StopwordsTokenFilter stopwordsTokenFilter = new StopwordsTokenFilter();

        String _name = obj.getName();
        stopwordsTokenFilter.setName(_name);

        Boolean _removeTrailingStopWords = obj.isRemoveTrailingStopWords();
        stopwordsTokenFilter.setRemoveTrailingStopWords(_removeTrailingStopWords);

        Boolean _ignoreCase = obj.isIgnoreCase();
        stopwordsTokenFilter.setIgnoreCase(_ignoreCase);

        if (obj.getStopwords() != null) {
            List<String> _stopwords = obj.getStopwords().stream().collect(Collectors.toList());
            stopwordsTokenFilter.setStopwords(_stopwords);
        }

        if (obj.getStopwordsList() != null) {
            StopwordsList _stopwordsList = StopwordsListConverter.map(obj.getStopwordsList());
            stopwordsTokenFilter.setStopwordsList(_stopwordsList);
        }
        return stopwordsTokenFilter;
    }

    /**
     * Maps from {@link StopwordsTokenFilter} to
     * {@link com.azure.search.documents.implementation.models.StopwordsTokenFilter}.
     */
    public static com.azure.search.documents.implementation.models.StopwordsTokenFilter map(StopwordsTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.StopwordsTokenFilter stopwordsTokenFilter =
                new com.azure.search.documents.implementation.models.StopwordsTokenFilter();

        String _name = obj.getName();
        stopwordsTokenFilter.setName(_name);

        Boolean _removeTrailingStopWords = obj.isRemoveTrailingStopWords();
        stopwordsTokenFilter.setRemoveTrailingStopWords(_removeTrailingStopWords);

        Boolean _ignoreCase = obj.isIgnoreCase();
        stopwordsTokenFilter.setIgnoreCase(_ignoreCase);

        if (obj.getStopwords() != null) {
            List<String> _stopwords = obj.getStopwords().stream().collect(Collectors.toList());
            stopwordsTokenFilter.setStopwords(_stopwords);
        }

        if (obj.getStopwordsList() != null) {
            com.azure.search.documents.implementation.models.StopwordsList _stopwordsList = StopwordsListConverter.map(obj.getStopwordsList());
            stopwordsTokenFilter.setStopwordsList(_stopwordsList);
        }
        return stopwordsTokenFilter;
    }
}
