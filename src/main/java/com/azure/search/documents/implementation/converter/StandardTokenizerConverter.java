package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.StandardTokenizer;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.StandardTokenizer} and
 * {@link StandardTokenizer}.
 */
public final class StandardTokenizerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(StandardTokenizerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.StandardTokenizer} to
     * {@link StandardTokenizer}.
     */
    public static StandardTokenizer map(com.azure.search.documents.implementation.models.StandardTokenizer obj) {
        if (obj == null) {
            return null;
        }
        StandardTokenizer standardTokenizer = new StandardTokenizer();

        String _name = obj.getName();
        standardTokenizer.setName(_name);

        Integer _maxTokenLength = obj.getMaxTokenLength();
        standardTokenizer.setMaxTokenLength(_maxTokenLength);
        return standardTokenizer;
    }

    /**
     * Maps from {@link StandardTokenizer} to
     * {@link com.azure.search.documents.implementation.models.StandardTokenizer}.
     */
    public static com.azure.search.documents.implementation.models.StandardTokenizer map(StandardTokenizer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.StandardTokenizer standardTokenizer =
                new com.azure.search.documents.implementation.models.StandardTokenizer();

        String _name = obj.getName();
        standardTokenizer.setName(_name);

        Integer _maxTokenLength = obj.getMaxTokenLength();
        standardTokenizer.setMaxTokenLength(_maxTokenLength);
        return standardTokenizer;
    }
}
