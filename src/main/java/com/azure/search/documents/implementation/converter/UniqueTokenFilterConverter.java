package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.UniqueTokenFilter;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.UniqueTokenFilter} and
 * {@link UniqueTokenFilter}.
 */
public final class UniqueTokenFilterConverter {
    private static final ClientLogger LOGGER = new ClientLogger(UniqueTokenFilterConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.UniqueTokenFilter} to
     * {@link UniqueTokenFilter}.
     */
    public static UniqueTokenFilter map(com.azure.search.documents.implementation.models.UniqueTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        UniqueTokenFilter uniqueTokenFilter = new UniqueTokenFilter();

        String _name = obj.getName();
        uniqueTokenFilter.setName(_name);

        Boolean _onlyOnSamePosition = obj.isOnlyOnSamePosition();
        uniqueTokenFilter.setOnlyOnSamePosition(_onlyOnSamePosition);
        return uniqueTokenFilter;
    }

    /**
     * Maps from {@link UniqueTokenFilter} to
     * {@link com.azure.search.documents.implementation.models.UniqueTokenFilter}.
     */
    public static com.azure.search.documents.implementation.models.UniqueTokenFilter map(UniqueTokenFilter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.UniqueTokenFilter uniqueTokenFilter =
                new com.azure.search.documents.implementation.models.UniqueTokenFilter();

        String _name = obj.getName();
        uniqueTokenFilter.setName(_name);

        Boolean _onlyOnSamePosition = obj.isOnlyOnSamePosition();
        uniqueTokenFilter.setOnlyOnSamePosition(_onlyOnSamePosition);
        return uniqueTokenFilter;
    }
}
