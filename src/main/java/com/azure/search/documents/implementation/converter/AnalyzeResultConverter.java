package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.AnalyzeResult;
import com.azure.search.documents.models.TokenInfo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.AnalyzeResult} and {@link AnalyzeResult}.
 */
public final class AnalyzeResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(AnalyzeResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.AnalyzeResult} to {@link AnalyzeResult}.
     */
    public static AnalyzeResult map(com.azure.search.documents.implementation.models.AnalyzeResult obj) {
        if (obj == null) {
            return null;
        }
        AnalyzeResult analyzeResult = new AnalyzeResult();

        if (obj.getTokens() != null) {
            List<TokenInfo> _tokens =
                    obj.getTokens().stream().map(TokenInfoConverter::map).collect(Collectors.toList());
            analyzeResult.setTokens(_tokens);
        }
        return analyzeResult;
    }

    /**
     * Maps from {@link AnalyzeResult} to {@link com.azure.search.documents.implementation.models.AnalyzeResult}.
     */
    public static com.azure.search.documents.implementation.models.AnalyzeResult map(AnalyzeResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.AnalyzeResult analyzeResult =
                new com.azure.search.documents.implementation.models.AnalyzeResult();

        if (obj.getTokens() != null) {
            List<com.azure.search.documents.implementation.models.TokenInfo> _tokens =
                    obj.getTokens().stream().map(TokenInfoConverter::map).collect(Collectors.toList());
            analyzeResult.setTokens(_tokens);
        }
        return analyzeResult;
    }
}
