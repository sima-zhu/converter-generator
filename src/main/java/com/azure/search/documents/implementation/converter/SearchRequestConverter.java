package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.QueryType;
import com.azure.search.documents.models.ScoringParameter;
import com.azure.search.documents.models.SearchMode;
import com.azure.search.documents.models.SearchRequest;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchRequest} and {@link SearchRequest}.
 */
public final class SearchRequestConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SearchRequestConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SearchRequest} to {@link SearchRequest}.
     */
    public static SearchRequest map(com.azure.search.documents.implementation.models.SearchRequest obj) {
        if (obj == null) {
            return null;
        }
        SearchRequest searchRequest = new SearchRequest();

        String _select = obj.getSelect();
        searchRequest.setSelect(_select);

        if (obj.getScoringParameters() != null) {
            List<ScoringParameter> _scoringParameters =
                    obj.getScoringParameters().stream().map(ScoringParameterConverter::map).collect(Collectors.toList());
            searchRequest.setScoringParameters(_scoringParameters);
        }

        String _scoringProfile = obj.getScoringProfile();
        searchRequest.setScoringProfile(_scoringProfile);

        if (obj.getSearchMode() != null) {
            SearchMode _searchMode = SearchModeConverter.map(obj.getSearchMode());
            searchRequest.setSearchMode(_searchMode);
        }

        String _orderBy = obj.getOrderBy();
        searchRequest.setOrderBy(_orderBy);

        Integer _skip = obj.getSkip();
        searchRequest.setSkip(_skip);

        String _highlightPreTag = obj.getHighlightPreTag();
        searchRequest.setHighlightPreTag(_highlightPreTag);

        if (obj.getFacets() != null) {
            List<String> _facets = obj.getFacets().stream().collect(Collectors.toList());
            searchRequest.setFacets(_facets);
        }

        if (obj.getQueryType() != null) {
            QueryType _queryType = QueryTypeConverter.map(obj.getQueryType());
            searchRequest.setQueryType(_queryType);
        }

        String _filter = obj.getFilter();
        searchRequest.setFilter(_filter);

        Double _minimumCoverage = obj.getMinimumCoverage();
        searchRequest.setMinimumCoverage(_minimumCoverage);

        String _searchText = obj.getSearchText();
        searchRequest.setSearchText(_searchText);

        Integer _top = obj.getTop();
        searchRequest.setTop(_top);

        String _highlightFields = obj.getHighlightFields();
        searchRequest.setHighlightFields(_highlightFields);

        String _highlightPostTag = obj.getHighlightPostTag();
        searchRequest.setHighlightPostTag(_highlightPostTag);

        String _searchFields = obj.getSearchFields();
        searchRequest.setSearchFields(_searchFields);

        Boolean _includeTotalResultCount = obj.isIncludeTotalResultCount();
        searchRequest.setIncludeTotalResultCount(_includeTotalResultCount);
        return searchRequest;
    }

    /**
     * Maps from {@link SearchRequest} to {@link com.azure.search.documents.implementation.models.SearchRequest}.
     */
    public static com.azure.search.documents.implementation.models.SearchRequest map(SearchRequest obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SearchRequest searchRequest =
                new com.azure.search.documents.implementation.models.SearchRequest();

        String _select = obj.getSelect();
        searchRequest.setSelect(_select);

        if (obj.getScoringParameters() != null) {
            List<com.azure.search.documents.implementation.models.ScoringParameter> _scoringParameters =
                    obj.getScoringParameters().stream().map(ScoringParameterConverter::map).collect(Collectors.toList());
            searchRequest.setScoringParameters(_scoringParameters);
        }

        String _scoringProfile = obj.getScoringProfile();
        searchRequest.setScoringProfile(_scoringProfile);

        if (obj.getSearchMode() != null) {
            com.azure.search.documents.implementation.models.SearchMode _searchMode =
                    SearchModeConverter.map(obj.getSearchMode());
            searchRequest.setSearchMode(_searchMode);
        }

        String _orderBy = obj.getOrderBy();
        searchRequest.setOrderBy(_orderBy);

        Integer _skip = obj.getSkip();
        searchRequest.setSkip(_skip);

        String _highlightPreTag = obj.getHighlightPreTag();
        searchRequest.setHighlightPreTag(_highlightPreTag);

        if (obj.getFacets() != null) {
            List<String> _facets = obj.getFacets().stream().collect(Collectors.toList());
            searchRequest.setFacets(_facets);
        }

        if (obj.getQueryType() != null) {
            com.azure.search.documents.implementation.models.QueryType _queryType =
                    QueryTypeConverter.map(obj.getQueryType());
            searchRequest.setQueryType(_queryType);
        }

        String _filter = obj.getFilter();
        searchRequest.setFilter(_filter);

        Double _minimumCoverage = obj.getMinimumCoverage();
        searchRequest.setMinimumCoverage(_minimumCoverage);

        String _searchText = obj.getSearchText();
        searchRequest.setSearchText(_searchText);

        Integer _top = obj.getTop();
        searchRequest.setTop(_top);

        String _highlightFields = obj.getHighlightFields();
        searchRequest.setHighlightFields(_highlightFields);

        String _highlightPostTag = obj.getHighlightPostTag();
        searchRequest.setHighlightPostTag(_highlightPostTag);

        String _searchFields = obj.getSearchFields();
        searchRequest.setSearchFields(_searchFields);

        Boolean _includeTotalResultCount = obj.isIncludeTotalResultCount();
        searchRequest.setIncludeTotalResultCount(_includeTotalResultCount);
        return searchRequest;
    }
}
