package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.TokenFilterName;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.TokenFilterName} and
 * {@link TokenFilterName}.
 */
public final class TokenFilterNameConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TokenFilterNameConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.TokenFilterName} to {@link TokenFilterName}.
     */
    public static TokenFilterName map(com.azure.search.documents.implementation.models.TokenFilterName obj) {
        if (obj == null) {
            return null;
        }
        TokenFilterName tokenFilterName = new TokenFilterName();
        return tokenFilterName;
    }

    /**
     * Maps from {@link TokenFilterName} to {@link com.azure.search.documents.implementation.models.TokenFilterName}.
     */
    public static com.azure.search.documents.implementation.models.TokenFilterName map(TokenFilterName obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.TokenFilterName tokenFilterName =
                new com.azure.search.documents.implementation.models.TokenFilterName();
        return tokenFilterName;
    }
}
