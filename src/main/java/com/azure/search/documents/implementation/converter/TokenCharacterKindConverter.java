package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.TokenCharacterKind;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.TokenCharacterKind} and
 * {@link TokenCharacterKind}.
 */
public final class TokenCharacterKindConverter {
    private static final ClientLogger LOGGER = new ClientLogger(TokenCharacterKindConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.TokenCharacterKind}. to enum
     * {@link TokenCharacterKind}.
     */
    public static TokenCharacterKind map(com.azure.search.documents.implementation.models.TokenCharacterKind obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case LETTER:
                return TokenCharacterKind.LETTER;
            case DIGIT:
                return TokenCharacterKind.DIGIT;
            case WHITESPACE:
                return TokenCharacterKind.WHITESPACE;
            case PUNCTUATION:
                return TokenCharacterKind.PUNCTUATION;
            case SYMBOL:
                return TokenCharacterKind.SYMBOL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link TokenCharacterKind}. to enum
     * {@link com.azure.search.documents.implementation.models.TokenCharacterKind}.
     */
    public static com.azure.search.documents.implementation.models.TokenCharacterKind map(TokenCharacterKind obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case LETTER:
                return com.azure.search.documents.implementation.models.TokenCharacterKind.LETTER;
            case DIGIT:
                return com.azure.search.documents.implementation.models.TokenCharacterKind.DIGIT;
            case WHITESPACE:
                return com.azure.search.documents.implementation.models.TokenCharacterKind.WHITESPACE;
            case PUNCTUATION:
                return com.azure.search.documents.implementation.models.TokenCharacterKind.PUNCTUATION;
            case SYMBOL:
                return com.azure.search.documents.implementation.models.TokenCharacterKind.SYMBOL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
