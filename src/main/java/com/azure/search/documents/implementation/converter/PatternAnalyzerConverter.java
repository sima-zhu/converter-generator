package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.PatternAnalyzer;
import com.azure.search.documents.models.RegexFlags;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.PatternAnalyzer} and
 * {@link PatternAnalyzer}.
 */
public final class PatternAnalyzerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(PatternAnalyzerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.PatternAnalyzer} to {@link PatternAnalyzer}.
     */
    public static PatternAnalyzer map(com.azure.search.documents.implementation.models.PatternAnalyzer obj) {
        if (obj == null) {
            return null;
        }
        PatternAnalyzer patternAnalyzer = new PatternAnalyzer();

        String _name = obj.getName();
        patternAnalyzer.setName(_name);

        Boolean _lowerCaseTerms = obj.isLowerCaseTerms();
        patternAnalyzer.setLowerCaseTerms(_lowerCaseTerms);

        String _pattern = obj.getPattern();
        patternAnalyzer.setPattern(_pattern);

        if (obj.getFlags() != null) {
            List<RegexFlags> _flags =
                    obj.getFlags().stream().map(RegexFlagsConverter::map).collect(Collectors.toList());
            patternAnalyzer.setFlags(_flags);
        }

        if (obj.getStopwords() != null) {
            List<String> _stopwords = obj.getStopwords().stream().collect(Collectors.toList());
            patternAnalyzer.setStopwords(_stopwords);
        }
        return patternAnalyzer;
    }

    /**
     * Maps from {@link PatternAnalyzer} to {@link com.azure.search.documents.implementation.models.PatternAnalyzer}.
     */
    public static com.azure.search.documents.implementation.models.PatternAnalyzer map(PatternAnalyzer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.PatternAnalyzer patternAnalyzer =
                new com.azure.search.documents.implementation.models.PatternAnalyzer();

        String _name = obj.getName();
        patternAnalyzer.setName(_name);

        Boolean _lowerCaseTerms = obj.isLowerCaseTerms();
        patternAnalyzer.setLowerCaseTerms(_lowerCaseTerms);

        String _pattern = obj.getPattern();
        patternAnalyzer.setPattern(_pattern);

        if (obj.getFlags() != null) {
            List<com.azure.search.documents.implementation.models.RegexFlags> _flags =
                    obj.getFlags().stream().map(RegexFlagsConverter::map).collect(Collectors.toList());
            patternAnalyzer.setFlags(_flags);
        }

        if (obj.getStopwords() != null) {
            List<String> _stopwords = obj.getStopwords().stream().collect(Collectors.toList());
            patternAnalyzer.setStopwords(_stopwords);
        }
        return patternAnalyzer;
    }
}
