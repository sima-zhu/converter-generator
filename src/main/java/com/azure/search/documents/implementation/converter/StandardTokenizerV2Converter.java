package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.StandardTokenizerV2;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.StandardTokenizerV2} and
 * {@link StandardTokenizerV2}.
 */
public final class StandardTokenizerV2Converter {
    private static final ClientLogger LOGGER = new ClientLogger(StandardTokenizerV2Converter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.StandardTokenizerV2} to
     * {@link StandardTokenizerV2}.
     */
    public static StandardTokenizerV2 map(com.azure.search.documents.implementation.models.StandardTokenizerV2 obj) {
        if (obj == null) {
            return null;
        }
        StandardTokenizerV2 standardTokenizerV2 = new StandardTokenizerV2();

        String _name = obj.getName();
        standardTokenizerV2.setName(_name);

        Integer _maxTokenLength = obj.getMaxTokenLength();
        standardTokenizerV2.setMaxTokenLength(_maxTokenLength);
        return standardTokenizerV2;
    }

    /**
     * Maps from {@link StandardTokenizerV2} to
     * {@link com.azure.search.documents.implementation.models.StandardTokenizerV2}.
     */
    public static com.azure.search.documents.implementation.models.StandardTokenizerV2 map(StandardTokenizerV2 obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.StandardTokenizerV2 standardTokenizerV2 =
                new com.azure.search.documents.implementation.models.StandardTokenizerV2();

        String _name = obj.getName();
        standardTokenizerV2.setName(_name);

        Integer _maxTokenLength = obj.getMaxTokenLength();
        standardTokenizerV2.setMaxTokenLength(_maxTokenLength);
        return standardTokenizerV2;
    }
}
