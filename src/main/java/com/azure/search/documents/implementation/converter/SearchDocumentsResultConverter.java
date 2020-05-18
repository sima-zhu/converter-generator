package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.FacetResult;
import com.azure.search.documents.models.SearchDocumentsResult;
import com.azure.search.documents.models.SearchRequest;
import com.azure.search.documents.models.SearchResult;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchDocumentsResult} and
 * {@link SearchDocumentsResult}.
 */
public final class SearchDocumentsResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SearchDocumentsResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SearchDocumentsResult} to
     * {@link SearchDocumentsResult}.
     */
    public static SearchDocumentsResult map(com.azure.search.documents.implementation.models.SearchDocumentsResult obj) {
        if (obj == null) {
            return null;
        }
        SearchDocumentsResult searchDocumentsResult = new SearchDocumentsResult();

        Double _coverage = obj.getCoverage();
        PrivateFieldAccessHelper.set(searchDocumentsResult, "coverage", _coverage);

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(searchDocumentsResult, "count", _count);

        if (obj.getResults() != null) {
            List<SearchResult> _results =
                    obj.getResults().stream().map(SearchResultConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchDocumentsResult, "results", _results);
        }

        if (obj.getNextPageParameters() != null) {
            SearchRequest _nextPageParameters = SearchRequestConverter.map(obj.getNextPageParameters());
            PrivateFieldAccessHelper.set(searchDocumentsResult, "nextPageParameters", _nextPageParameters);
        }

        if (obj.getFacets() != null) {
            Map<String, List<FacetResult>> _facets =
                    obj.getFacets().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
            PrivateFieldAccessHelper.set(searchDocumentsResult, "facets", _facets);
        }

        String _nextLink = obj.getNextLink();
        PrivateFieldAccessHelper.set(searchDocumentsResult, "nextLink", _nextLink);
        return searchDocumentsResult;
    }

    /**
     * Maps from {@link SearchDocumentsResult} to
     * {@link com.azure.search.documents.implementation.models.SearchDocumentsResult}.
     */
    public static com.azure.search.documents.implementation.models.SearchDocumentsResult map(SearchDocumentsResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SearchDocumentsResult searchDocumentsResult =
                new com.azure.search.documents.implementation.models.SearchDocumentsResult();

        Double _coverage = obj.getCoverage();
        PrivateFieldAccessHelper.set(searchDocumentsResult, "coverage", _coverage);

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(searchDocumentsResult, "count", _count);

        if (obj.getResults() != null) {
            List<com.azure.search.documents.implementation.models.SearchResult> _results =
                    obj.getResults().stream().map(SearchResultConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(searchDocumentsResult, "results", _results);
        }

        if (obj.getNextPageParameters() != null) {
            com.azure.search.documents.implementation.models.SearchRequest _nextPageParameters =
                    SearchRequestConverter.map(obj.getNextPageParameters());
            PrivateFieldAccessHelper.set(searchDocumentsResult, "nextPageParameters", _nextPageParameters);
        }

        if (obj.getFacets() != null) {
            Map<String, List<com.azure.search.documents.implementation.models.FacetResult>> _facets =
                    obj.getFacets().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
            PrivateFieldAccessHelper.set(searchDocumentsResult, "facets", _facets);
        }

        String _nextLink = obj.getNextLink();
        PrivateFieldAccessHelper.set(searchDocumentsResult, "nextLink", _nextLink);
        return searchDocumentsResult;
    }
}
