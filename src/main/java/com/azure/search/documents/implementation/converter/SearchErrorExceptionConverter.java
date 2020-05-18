package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SearchErrorException;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchErrorException} and
 * {@link SearchErrorException}.
 */
public final class SearchErrorExceptionConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SearchErrorExceptionConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SearchErrorException} to
     * {@link SearchErrorException}.
     */
    public static SearchErrorException map(com.azure.search.documents.implementation.models.SearchErrorException obj) {
        if (obj == null) {
            return null;
        }
        SearchErrorException searchErrorException = new SearchErrorException();
        return searchErrorException;
    }

    /**
     * Maps from {@link SearchErrorException} to
     * {@link com.azure.search.documents.implementation.models.SearchErrorException}.
     */
    public static com.azure.search.documents.implementation.models.SearchErrorException map(SearchErrorException obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SearchErrorException searchErrorException =
                new com.azure.search.documents.implementation.models.SearchErrorException();
        return searchErrorException;
    }
}
