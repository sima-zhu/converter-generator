package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.CorsOptions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.CorsOptions} and {@link CorsOptions}.
 */
public final class CorsOptionsConverter {
    private static final ClientLogger LOGGER = new ClientLogger(CorsOptionsConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.CorsOptions} to {@link CorsOptions}.
     */
    public static CorsOptions map(com.azure.search.documents.implementation.models.CorsOptions obj) {
        if (obj == null) {
            return null;
        }
        CorsOptions corsOptions = new CorsOptions();

        if (obj.getAllowedOrigins() != null) {
            List<String> _allowedOrigins = obj.getAllowedOrigins().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(corsOptions, "allowedOrigins", _allowedOrigins);
        }

        Long _maxAgeInSeconds = obj.getMaxAgeInSeconds();
        corsOptions.setMaxAgeInSeconds(_maxAgeInSeconds);
        return corsOptions;
    }

    /**
     * Maps from {@link CorsOptions} to {@link com.azure.search.documents.implementation.models.CorsOptions}.
     */
    public static com.azure.search.documents.implementation.models.CorsOptions map(CorsOptions obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.CorsOptions corsOptions =
                new com.azure.search.documents.implementation.models.CorsOptions();

        if (obj.getAllowedOrigins() != null) {
            List<String> _allowedOrigins = obj.getAllowedOrigins().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(corsOptions, "allowedOrigins", _allowedOrigins);
        }

        Long _maxAgeInSeconds = obj.getMaxAgeInSeconds();
        corsOptions.setMaxAgeInSeconds(_maxAgeInSeconds);
        return corsOptions;
    }
}
