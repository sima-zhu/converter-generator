package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.StandardAnalyzer;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.StandardAnalyzer} and
 * {@link StandardAnalyzer}.
 */
public final class StandardAnalyzerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(StandardAnalyzerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.StandardAnalyzer} to {@link StandardAnalyzer}.
     */
    public static StandardAnalyzer map(com.azure.search.documents.implementation.models.StandardAnalyzer obj) {
        if (obj == null) {
            return null;
        }
        StandardAnalyzer standardAnalyzer = new StandardAnalyzer();

        String _name = obj.getName();
        standardAnalyzer.setName(_name);

        Integer _maxTokenLength = obj.getMaxTokenLength();
        standardAnalyzer.setMaxTokenLength(_maxTokenLength);

        if (obj.getStopwords() != null) {
            List<String> _stopwords = obj.getStopwords().stream().collect(Collectors.toList());
            standardAnalyzer.setStopwords(_stopwords);
        }
        return standardAnalyzer;
    }

    /**
     * Maps from {@link StandardAnalyzer} to {@link com.azure.search.documents.implementation.models.StandardAnalyzer}.
     */
    public static com.azure.search.documents.implementation.models.StandardAnalyzer map(StandardAnalyzer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.StandardAnalyzer standardAnalyzer =
                new com.azure.search.documents.implementation.models.StandardAnalyzer();

        String _name = obj.getName();
        standardAnalyzer.setName(_name);

        Integer _maxTokenLength = obj.getMaxTokenLength();
        standardAnalyzer.setMaxTokenLength(_maxTokenLength);

        if (obj.getStopwords() != null) {
            List<String> _stopwords = obj.getStopwords().stream().collect(Collectors.toList());
            standardAnalyzer.setStopwords(_stopwords);
        }
        return standardAnalyzer;
    }
}
