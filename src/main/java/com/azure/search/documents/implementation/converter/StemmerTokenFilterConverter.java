package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.StemmerTokenFilter;
import com.azure.search.documents.models.StemmerTokenFilterLanguage;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.StemmerTokenFilter} and
 * {@link StemmerTokenFilter}.
 */
public final class StemmerTokenFilterConverter {
    private static final ClientLogger LOGGER = new ClientLogger(StemmerTokenFilterConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.StemmerTokenFilter} to
     * {@link StemmerTokenFilter}.
     */
    public static StemmerTokenFilter map(com.azure.search.documents.implementation.models.StemmerTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        StemmerTokenFilter stemmerTokenFilter = new StemmerTokenFilter();

        String _name = obj.getName();
        stemmerTokenFilter.setName(_name);

        if (obj.getLanguage() != null) {
            StemmerTokenFilterLanguage _language = StemmerTokenFilterLanguageConverter.map(obj.getLanguage());
            stemmerTokenFilter.setLanguage(_language);
        }
        return stemmerTokenFilter;
    }

    /**
     * Maps from {@link StemmerTokenFilter} to
     * {@link com.azure.search.documents.implementation.models.StemmerTokenFilter}.
     */
    public static com.azure.search.documents.implementation.models.StemmerTokenFilter map(StemmerTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.StemmerTokenFilter stemmerTokenFilter =
                new com.azure.search.documents.implementation.models.StemmerTokenFilter();

        String _name = obj.getName();
        stemmerTokenFilter.setName(_name);

        if (obj.getLanguage() != null) {
            com.azure.search.documents.implementation.models.StemmerTokenFilterLanguage _language =
                    StemmerTokenFilterLanguageConverter.map(obj.getLanguage());
            stemmerTokenFilter.setLanguage(_language);
        }
        return stemmerTokenFilter;
    }
}
