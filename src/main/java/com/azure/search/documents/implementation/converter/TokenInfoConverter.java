package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.TokenInfo;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.TokenInfo} and {@link TokenInfo}.
 */
public final class TokenInfoConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TokenInfoConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.TokenInfo} to {@link TokenInfo}.
     */
    public static TokenInfo map(com.azure.search.documents.implementation.models.TokenInfo obj) {
        if (obj == null) {
            return null;
        }
        TokenInfo tokenInfo = new TokenInfo();

        int _endOffset = obj.getEndOffset();
        PrivateFieldAccessHelper.set(tokenInfo, "endOffset", _endOffset);

        int _startOffset = obj.getStartOffset();
        PrivateFieldAccessHelper.set(tokenInfo, "startOffset", _startOffset);

        int _position = obj.getPosition();
        PrivateFieldAccessHelper.set(tokenInfo, "position", _position);

        String _token = obj.getToken();
        PrivateFieldAccessHelper.set(tokenInfo, "token", _token);
        return tokenInfo;
    }

    /**
     * Maps from {@link TokenInfo} to {@link com.azure.search.documents.implementation.models.TokenInfo}.
     */
    public static com.azure.search.documents.implementation.models.TokenInfo map(TokenInfo obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.TokenInfo tokenInfo =
                new com.azure.search.documents.implementation.models.TokenInfo();

        int _endOffset = obj.getEndOffset();
        PrivateFieldAccessHelper.set(tokenInfo, "endOffset", _endOffset);

        int _startOffset = obj.getStartOffset();
        PrivateFieldAccessHelper.set(tokenInfo, "startOffset", _startOffset);

        int _position = obj.getPosition();
        PrivateFieldAccessHelper.set(tokenInfo, "position", _position);

        String _token = obj.getToken();
        PrivateFieldAccessHelper.set(tokenInfo, "token", _token);
        return tokenInfo;
    }
}
