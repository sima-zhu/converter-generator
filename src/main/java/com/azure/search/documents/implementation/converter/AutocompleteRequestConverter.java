package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.AutocompleteMode;
import com.azure.search.documents.models.AutocompleteRequest;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.AutocompleteRequest} and
 * {@link AutocompleteRequest}.
 */
public final class AutocompleteRequestConverter {
    private static final ClientLogger LOGGER = new ClientLogger(AutocompleteRequestConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.AutocompleteRequest} to
     * {@link AutocompleteRequest}.
     */
    public static AutocompleteRequest map(com.azure.search.documents.implementation.models.AutocompleteRequest obj) {
        if (obj == null) {
            return null;
        }
        AutocompleteRequest autocompleteRequest = new AutocompleteRequest();

        String _filter = obj.getFilter();
        autocompleteRequest.setFilter(_filter);

        String _searchText = obj.getSearchText();
        autocompleteRequest.setSearchText(_searchText);

        Boolean _useFuzzyMatching = obj.useFuzzyMatching();
        autocompleteRequest.setUseFuzzyMatching(_useFuzzyMatching);

        Double _minimumCoverage = obj.getMinimumCoverage();
        autocompleteRequest.setMinimumCoverage(_minimumCoverage);

        if (obj.getAutocompleteMode() != null) {
            AutocompleteMode _autocompleteMode = AutocompleteModeConverter.map(obj.getAutocompleteMode());
            autocompleteRequest.setAutocompleteMode(_autocompleteMode);
        }

        Integer _top = obj.getTop();
        autocompleteRequest.setTop(_top);

        String _suggesterName = obj.getSuggesterName();
        autocompleteRequest.setSuggesterName(_suggesterName);

        String _highlightPostTag = obj.getHighlightPostTag();
        autocompleteRequest.setHighlightPostTag(_highlightPostTag);

        String _searchFields = obj.getSearchFields();
        autocompleteRequest.setSearchFields(_searchFields);

        String _highlightPreTag = obj.getHighlightPreTag();
        autocompleteRequest.setHighlightPreTag(_highlightPreTag);
        return autocompleteRequest;
    }

    /**
     * Maps from {@link AutocompleteRequest} to
     * {@link com.azure.search.documents.implementation.models.AutocompleteRequest}.
     */
    public static com.azure.search.documents.implementation.models.AutocompleteRequest map(AutocompleteRequest obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.AutocompleteRequest autocompleteRequest =
                new com.azure.search.documents.implementation.models.AutocompleteRequest();

        String _filter = obj.getFilter();
        autocompleteRequest.setFilter(_filter);

        String _searchText = obj.getSearchText();
        autocompleteRequest.setSearchText(_searchText);

        Boolean _useFuzzyMatching = obj.useFuzzyMatching();
        autocompleteRequest.setUseFuzzyMatching(_useFuzzyMatching);

        Double _minimumCoverage = obj.getMinimumCoverage();
        autocompleteRequest.setMinimumCoverage(_minimumCoverage);

        if (obj.getAutocompleteMode() != null) {
            com.azure.search.documents.implementation.models.AutocompleteMode _autocompleteMode =
                    AutocompleteModeConverter.map(obj.getAutocompleteMode());
            autocompleteRequest.setAutocompleteMode(_autocompleteMode);
        }

        Integer _top = obj.getTop();
        autocompleteRequest.setTop(_top);

        String _suggesterName = obj.getSuggesterName();
        autocompleteRequest.setSuggesterName(_suggesterName);

        String _highlightPostTag = obj.getHighlightPostTag();
        autocompleteRequest.setHighlightPostTag(_highlightPostTag);

        String _searchFields = obj.getSearchFields();
        autocompleteRequest.setSearchFields(_searchFields);

        String _highlightPreTag = obj.getHighlightPreTag();
        autocompleteRequest.setHighlightPreTag(_highlightPreTag);
        return autocompleteRequest;
    }
}
