package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.CharFilterName;
import com.azure.search.documents.models.CustomAnalyzer;
import com.azure.search.documents.models.TokenFilterName;
import com.azure.search.documents.models.TokenizerName;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.CustomAnalyzer} and
 * {@link CustomAnalyzer}.
 */
public final class CustomAnalyzerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(CustomAnalyzerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.CustomAnalyzer} to {@link CustomAnalyzer}.
     */
    public static CustomAnalyzer map(com.azure.search.documents.implementation.models.CustomAnalyzer obj) {
        if (obj == null) {
            return null;
        }
        CustomAnalyzer customAnalyzer = new CustomAnalyzer();

        String _name = obj.getName();
        customAnalyzer.setName(_name);

        if (obj.getCharFilters() != null) {
            List<CharFilterName> _charFilters =
                    obj.getCharFilters().stream().map(CharFilterNameConverter::map).collect(Collectors.toList());
            customAnalyzer.setCharFilters(_charFilters);
        }

        if (obj.getTokenFilters() != null) {
            List<TokenFilterName> _tokenFilters =
                    obj.getTokenFilters().stream().map(TokenFilterNameConverter::map).collect(Collectors.toList());
            customAnalyzer.setTokenFilters(_tokenFilters);
        }

        if (obj.getTokenizer() != null) {
            TokenizerName _tokenizer = TokenizerNameConverter.map(obj.getTokenizer());
            customAnalyzer.setTokenizer(_tokenizer);
        }
        return customAnalyzer;
    }

    /**
     * Maps from {@link CustomAnalyzer} to {@link com.azure.search.documents.implementation.models.CustomAnalyzer}.
     */
    public static com.azure.search.documents.implementation.models.CustomAnalyzer map(CustomAnalyzer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.CustomAnalyzer customAnalyzer =
                new com.azure.search.documents.implementation.models.CustomAnalyzer();

        String _name = obj.getName();
        customAnalyzer.setName(_name);

        if (obj.getCharFilters() != null) {
            List<com.azure.search.documents.implementation.models.CharFilterName> _charFilters =
                    obj.getCharFilters().stream().map(CharFilterNameConverter::map).collect(Collectors.toList());
            customAnalyzer.setCharFilters(_charFilters);
        }

        if (obj.getTokenFilters() != null) {
            List<com.azure.search.documents.implementation.models.TokenFilterName> _tokenFilters =
                    obj.getTokenFilters().stream().map(TokenFilterNameConverter::map).collect(Collectors.toList());
            customAnalyzer.setTokenFilters(_tokenFilters);
        }

        if (obj.getTokenizer() != null) {
            com.azure.search.documents.implementation.models.TokenizerName _tokenizer = TokenizerNameConverter.map(obj.getTokenizer());
            customAnalyzer.setTokenizer(_tokenizer);
        }
        return customAnalyzer;
    }
}
