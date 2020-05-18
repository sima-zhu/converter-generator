package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.TokenizerName;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.TokenizerName} and {@link TokenizerName}.
 */
public final class TokenizerNameConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TokenizerNameConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.TokenizerName} to {@link TokenizerName}.
     */
    public static TokenizerName map(com.azure.search.documents.implementation.models.TokenizerName obj) {
        if (obj == null) {
            return null;
        }
        TokenizerName tokenizerName = new TokenizerName();
        return tokenizerName;
    }

    /**
     * Maps from {@link TokenizerName} to {@link com.azure.search.documents.implementation.models.TokenizerName}.
     */
    public static com.azure.search.documents.implementation.models.TokenizerName map(TokenizerName obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.TokenizerName tokenizerName =
                new com.azure.search.documents.implementation.models.TokenizerName();
        return tokenizerName;
    }
}
