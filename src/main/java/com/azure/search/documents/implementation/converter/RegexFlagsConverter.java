package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.RegexFlags;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.RegexFlags} and {@link RegexFlags}.
 */
public final class RegexFlagsConverter {
    private static final ClientLogger LOGGER = new ClientLogger(RegexFlagsConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.RegexFlags} to {@link RegexFlags}.
     */
    public static RegexFlags map(com.azure.search.documents.implementation.models.RegexFlags obj) {
        if (obj == null) {
            return null;
        }
        RegexFlags regexFlags = new RegexFlags();
        return regexFlags;
    }

    /**
     * Maps from {@link RegexFlags} to {@link com.azure.search.documents.implementation.models.RegexFlags}.
     */
    public static com.azure.search.documents.implementation.models.RegexFlags map(RegexFlags obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.RegexFlags regexFlags = new com.azure.search.documents.implementation.models.RegexFlags();
        return regexFlags;
    }
}
