package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SearchMode;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchMode} and {@link SearchMode}.
 */
public final class SearchModeConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SearchModeConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.SearchMode}. to enum {@link SearchMode}.
     */
    public static SearchMode map(com.azure.search.documents.implementation.models.SearchMode obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case ANY:
                return SearchMode.ANY;
            case ALL:
                return SearchMode.ALL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link SearchMode}. to enum {@link com.azure.search.documents.implementation.models.SearchMode}.
     */
    public static com.azure.search.documents.implementation.models.SearchMode map(SearchMode obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case ANY:
                return com.azure.search.documents.implementation.models.SearchMode.ANY;
            case ALL:
                return com.azure.search.documents.implementation.models.SearchMode.ALL;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
