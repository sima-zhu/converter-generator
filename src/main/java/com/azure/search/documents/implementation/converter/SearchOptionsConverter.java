package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.QueryType;
import com.azure.search.documents.models.ScoringParameter;
import com.azure.search.documents.models.SearchMode;
import com.azure.search.documents.models.SearchOptions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchOptions} and {@link SearchOptions}.
 */
public final class SearchOptionsConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SearchOptionsConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SearchOptions} to {@link SearchOptions}.
     */
    public static SearchOptions map(com.azure.search.documents.implementation.models.SearchOptions obj) {
        if (obj == null) {
            return null;
        }
        SearchOptions searchOptions = new SearchOptions();

        if (obj.getSelect() != null) {
            List<String> _select = obj.getSelect().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "select", _select);
        }

        if (obj.getScoringParameters() != null) {
            List<ScoringParameter> _scoringParameters =
                    obj.getScoringParameters().stream().map(ScoringParameterConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "scoringParameters", _scoringParameters);
        }

        String _scoringProfile = obj.getScoringProfile();
        searchOptions.setScoringProfile(_scoringProfile);

        if (obj.getSearchMode() != null) {
            SearchMode _searchMode = SearchModeConverter.map(obj.getSearchMode());
            searchOptions.setSearchMode(_searchMode);
        }

        if (obj.getOrderBy() != null) {
            List<String> _orderBy = obj.getOrderBy().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "orderBy", _orderBy);
        }

        Integer _skip = obj.getSkip();
        searchOptions.setSkip(_skip);

        String _highlightPreTag = obj.getHighlightPreTag();
        searchOptions.setHighlightPreTag(_highlightPreTag);

        if (obj.getFacets() != null) {
            List<String> _facets = obj.getFacets().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "facets", _facets);
        }

        if (obj.getQueryType() != null) {
            QueryType _queryType = QueryTypeConverter.map(obj.getQueryType());
            searchOptions.setQueryType(_queryType);
        }

        String _filter = obj.getFilter();
        searchOptions.setFilter(_filter);

        Double _minimumCoverage = obj.getMinimumCoverage();
        searchOptions.setMinimumCoverage(_minimumCoverage);

        Integer _top = obj.getTop();
        searchOptions.setTop(_top);

        if (obj.getHighlightFields() != null) {
            List<String> _highlightFields = obj.getHighlightFields().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "highlightFields", _highlightFields);
        }

        String _highlightPostTag = obj.getHighlightPostTag();
        searchOptions.setHighlightPostTag(_highlightPostTag);

        if (obj.getSearchFields() != null) {
            List<String> _searchFields = obj.getSearchFields().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "searchFields", _searchFields);
        }

        Boolean _includeTotalResultCount = obj.isIncludeTotalResultCount();
        searchOptions.setIncludeTotalResultCount(_includeTotalResultCount);
        return searchOptions;
    }

    /**
     * Maps from {@link SearchOptions} to {@link com.azure.search.documents.implementation.models.SearchOptions}.
     */
    public static com.azure.search.documents.implementation.models.SearchOptions map(SearchOptions obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SearchOptions searchOptions =
                new com.azure.search.documents.implementation.models.SearchOptions();

        if (obj.getSelect() != null) {
            List<String> _select = obj.getSelect().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "select", _select);
        }

        if (obj.getScoringParameters() != null) {
            List<com.azure.search.documents.implementation.models.ScoringParameter> _scoringParameters =
                    obj.getScoringParameters().stream().map(ScoringParameterConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "scoringParameters", _scoringParameters);
        }

        String _scoringProfile = obj.getScoringProfile();
        searchOptions.setScoringProfile(_scoringProfile);

        if (obj.getSearchMode() != null) {
            com.azure.search.documents.implementation.models.SearchMode _searchMode =
                    SearchModeConverter.map(obj.getSearchMode());
            searchOptions.setSearchMode(_searchMode);
        }

        if (obj.getOrderBy() != null) {
            List<String> _orderBy = obj.getOrderBy().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "orderBy", _orderBy);
        }

        Integer _skip = obj.getSkip();
        searchOptions.setSkip(_skip);

        String _highlightPreTag = obj.getHighlightPreTag();
        searchOptions.setHighlightPreTag(_highlightPreTag);

        if (obj.getFacets() != null) {
            List<String> _facets = obj.getFacets().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "facets", _facets);
        }

        if (obj.getQueryType() != null) {
            com.azure.search.documents.implementation.models.QueryType _queryType =
                    QueryTypeConverter.map(obj.getQueryType());
            searchOptions.setQueryType(_queryType);
        }

        String _filter = obj.getFilter();
        searchOptions.setFilter(_filter);

        Double _minimumCoverage = obj.getMinimumCoverage();
        searchOptions.setMinimumCoverage(_minimumCoverage);

        Integer _top = obj.getTop();
        searchOptions.setTop(_top);

        if (obj.getHighlightFields() != null) {
            List<String> _highlightFields = obj.getHighlightFields().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "highlightFields", _highlightFields);
        }

        String _highlightPostTag = obj.getHighlightPostTag();
        searchOptions.setHighlightPostTag(_highlightPostTag);

        if (obj.getSearchFields() != null) {
            List<String> _searchFields = obj.getSearchFields().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchOptions, "searchFields", _searchFields);
        }

        Boolean _includeTotalResultCount = obj.isIncludeTotalResultCount();
        searchOptions.setIncludeTotalResultCount(_includeTotalResultCount);
        return searchOptions;
    }
}
