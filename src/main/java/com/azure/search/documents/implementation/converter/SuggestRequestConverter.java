package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SuggestRequest;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SuggestRequest} and
 * {@link SuggestRequest}.
 */
public final class SuggestRequestConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SuggestRequestConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SuggestRequest} to {@link SuggestRequest}.
     */
    public static SuggestRequest map(com.azure.search.documents.implementation.models.SuggestRequest obj) {
        if (obj == null) {
            return null;
        }
        SuggestRequest suggestRequest = new SuggestRequest();

        String _filter = obj.getFilter();
        suggestRequest.setFilter(_filter);

        Boolean _useFuzzyMatching = obj.useFuzzyMatching();
        suggestRequest.setUseFuzzyMatching(_useFuzzyMatching);

        Double _minimumCoverage = obj.getMinimumCoverage();
        suggestRequest.setMinimumCoverage(_minimumCoverage);

        String _searchText = obj.getSearchText();
        suggestRequest.setSearchText(_searchText);

        String _select = obj.getSelect();
        suggestRequest.setSelect(_select);

        Integer _top = obj.getTop();
        suggestRequest.setTop(_top);

        String _suggesterName = obj.getSuggesterName();
        suggestRequest.setSuggesterName(_suggesterName);

        String _highlightPostTag = obj.getHighlightPostTag();
        suggestRequest.setHighlightPostTag(_highlightPostTag);

        String _orderBy = obj.getOrderBy();
        suggestRequest.setOrderBy(_orderBy);

        String _searchFields = obj.getSearchFields();
        suggestRequest.setSearchFields(_searchFields);

        String _highlightPreTag = obj.getHighlightPreTag();
        suggestRequest.setHighlightPreTag(_highlightPreTag);
        return suggestRequest;
    }

    /**
     * Maps from {@link SuggestRequest} to {@link com.azure.search.documents.implementation.models.SuggestRequest}.
     */
    public static com.azure.search.documents.implementation.models.SuggestRequest map(SuggestRequest obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SuggestRequest suggestRequest =
                new com.azure.search.documents.implementation.models.SuggestRequest();

        String _filter = obj.getFilter();
        suggestRequest.setFilter(_filter);

        Boolean _useFuzzyMatching = obj.useFuzzyMatching();
        suggestRequest.setUseFuzzyMatching(_useFuzzyMatching);

        Double _minimumCoverage = obj.getMinimumCoverage();
        suggestRequest.setMinimumCoverage(_minimumCoverage);

        String _searchText = obj.getSearchText();
        suggestRequest.setSearchText(_searchText);

        String _select = obj.getSelect();
        suggestRequest.setSelect(_select);

        Integer _top = obj.getTop();
        suggestRequest.setTop(_top);

        String _suggesterName = obj.getSuggesterName();
        suggestRequest.setSuggesterName(_suggesterName);

        String _highlightPostTag = obj.getHighlightPostTag();
        suggestRequest.setHighlightPostTag(_highlightPostTag);

        String _orderBy = obj.getOrderBy();
        suggestRequest.setOrderBy(_orderBy);

        String _searchFields = obj.getSearchFields();
        suggestRequest.setSearchFields(_searchFields);

        String _highlightPreTag = obj.getHighlightPreTag();
        suggestRequest.setHighlightPreTag(_highlightPreTag);
        return suggestRequest;
    }
}
