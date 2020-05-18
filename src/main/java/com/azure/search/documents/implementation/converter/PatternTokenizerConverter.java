package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.PatternTokenizer;
import com.azure.search.documents.models.RegexFlags;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.PatternTokenizer} and
 * {@link PatternTokenizer}.
 */
public final class PatternTokenizerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(PatternTokenizerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.PatternTokenizer} to {@link PatternTokenizer}.
     */
    public static PatternTokenizer map(com.azure.search.documents.implementation.models.PatternTokenizer obj) {
        if (obj == null) {
            return null;
        }
        PatternTokenizer patternTokenizer = new PatternTokenizer();

        String _name = obj.getName();
        patternTokenizer.setName(_name);

        String _pattern = obj.getPattern();
        patternTokenizer.setPattern(_pattern);

        if (obj.getFlags() != null) {
            List<RegexFlags> _flags =
                    obj.getFlags().stream().map(RegexFlagsConverter::map).collect(Collectors.toList());
            patternTokenizer.setFlags(_flags);
        }

        Integer _group = obj.getGroup();
        patternTokenizer.setGroup(_group);
        return patternTokenizer;
    }

    /**
     * Maps from {@link PatternTokenizer} to {@link com.azure.search.documents.implementation.models.PatternTokenizer}.
     */
    public static com.azure.search.documents.implementation.models.PatternTokenizer map(PatternTokenizer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.PatternTokenizer patternTokenizer =
                new com.azure.search.documents.implementation.models.PatternTokenizer();

        String _name = obj.getName();
        patternTokenizer.setName(_name);

        String _pattern = obj.getPattern();
        patternTokenizer.setPattern(_pattern);

        if (obj.getFlags() != null) {
            List<com.azure.search.documents.implementation.models.RegexFlags> _flags =
                    obj.getFlags().stream().map(RegexFlagsConverter::map).collect(Collectors.toList());
            patternTokenizer.setFlags(_flags);
        }

        Integer _group = obj.getGroup();
        patternTokenizer.setGroup(_group);
        return patternTokenizer;
    }
}
