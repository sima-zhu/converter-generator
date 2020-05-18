package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.CharFilterName;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.CharFilterName} and
 * {@link CharFilterName}.
 */
public final class CharFilterNameConverter {
    private static final ClientLogger LOGGER = new ClientLogger(CharFilterNameConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.CharFilterName} to {@link CharFilterName}.
     */
    public static CharFilterName map(com.azure.search.documents.implementation.models.CharFilterName obj) {
        if (obj == null) {
            return null;
        }
        CharFilterName charFilterName = new CharFilterName();
        return charFilterName;
    }

    /**
     * Maps from {@link CharFilterName} to {@link com.azure.search.documents.implementation.models.CharFilterName}.
     */
    public static com.azure.search.documents.implementation.models.CharFilterName map(CharFilterName obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.CharFilterName charFilterName =
                new com.azure.search.documents.implementation.models.CharFilterName();
        return charFilterName;
    }
}
