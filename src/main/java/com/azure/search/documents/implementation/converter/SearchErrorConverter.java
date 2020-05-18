package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.SearchError;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchError} and {@link SearchError}.
 */
public final class SearchErrorConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SearchErrorConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SearchError} to {@link SearchError}.
     */
    public static SearchError map(com.azure.search.documents.implementation.models.SearchError obj) {
        if (obj == null) {
            return null;
        }
        SearchError searchError = new SearchError();

        String _code = obj.getCode();
        PrivateFieldAccessHelper.set(searchError, "code", _code);

        if (obj.getDetails() != null) {
            List<SearchError> _details =
                    obj.getDetails().stream().map(SearchErrorConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchError, "details", _details);
        }

        String _message = obj.getMessage();
        PrivateFieldAccessHelper.set(searchError, "message", _message);
        return searchError;
    }

    /**
     * Maps from {@link SearchError} to {@link com.azure.search.documents.implementation.models.SearchError}.
     */
    public static com.azure.search.documents.implementation.models.SearchError map(SearchError obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SearchError searchError =
                new com.azure.search.documents.implementation.models.SearchError();

        String _code = obj.getCode();
        PrivateFieldAccessHelper.set(searchError, "code", _code);

        if (obj.getDetails() != null) {
            List<com.azure.search.documents.implementation.models.SearchError> _details =
                    obj.getDetails().stream().map(SearchErrorConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchError, "details", _details);
        }

        String _message = obj.getMessage();
        PrivateFieldAccessHelper.set(searchError, "message", _message);
        return searchError;
    }
}
