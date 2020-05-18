package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.Suggester;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Suggester} and {@link Suggester}.
 */
public final class SuggesterConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SuggesterConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.Suggester} to {@link Suggester}.
     */
    public static Suggester map(com.azure.search.documents.implementation.models.Suggester obj) {
        if (obj == null) {
            return null;
        }
        Suggester suggester = new Suggester();

        if (obj.getSourceFields() != null) {
            List<String> _sourceFields = obj.getSourceFields().stream().collect(Collectors.toList());
            suggester.setSourceFields(_sourceFields);
        }

        String _name = obj.getName();
        suggester.setName(_name);

        String _searchMode = obj.getSearchMode();
        PrivateFieldAccessHelper.set(suggester, "searchMode", _searchMode);
        return suggester;
    }

    /**
     * Maps from {@link Suggester} to {@link com.azure.search.documents.implementation.models.Suggester}.
     */
    public static com.azure.search.documents.implementation.models.Suggester map(Suggester obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.Suggester suggester =
                new com.azure.search.documents.implementation.models.Suggester();

        if (obj.getSourceFields() != null) {
            List<String> _sourceFields = obj.getSourceFields().stream().collect(Collectors.toList());
            suggester.setSourceFields(_sourceFields);
        }

        String _name = obj.getName();
        suggester.setName(_name);

        String _searchMode = obj.getSearchMode();
        PrivateFieldAccessHelper.set(suggester, "searchMode", _searchMode);
        return suggester;
    }
}
