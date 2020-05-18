package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.SuggestOptions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SuggestOptions} and
 * {@link SuggestOptions}.
 */
public final class SuggestOptionsConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SuggestOptionsConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SuggestOptions} to {@link SuggestOptions}.
     */
    public static SuggestOptions map(com.azure.search.documents.implementation.models.SuggestOptions obj) {
        if (obj == null) {
            return null;
        }
        SuggestOptions suggestOptions = new SuggestOptions();

        String _filter = obj.getFilter();
        suggestOptions.setFilter(_filter);

        Boolean _useFuzzyMatching = obj.useFuzzyMatching();
        suggestOptions.setUseFuzzyMatching(_useFuzzyMatching);

        Double _minimumCoverage = obj.getMinimumCoverage();
        suggestOptions.setMinimumCoverage(_minimumCoverage);

        if (obj.getSelect() != null) {
            List<String> _select = obj.getSelect().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestOptions, "select", _select);
        }

        Integer _top = obj.getTop();
        suggestOptions.setTop(_top);

        String _highlightPostTag = obj.getHighlightPostTag();
        suggestOptions.setHighlightPostTag(_highlightPostTag);

        if (obj.getOrderBy() != null) {
            List<String> _orderBy = obj.getOrderBy().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestOptions, "orderBy", _orderBy);
        }

        if (obj.getSearchFields() != null) {
            List<String> _searchFields = obj.getSearchFields().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestOptions, "searchFields", _searchFields);
        }

        String _highlightPreTag = obj.getHighlightPreTag();
        suggestOptions.setHighlightPreTag(_highlightPreTag);
        return suggestOptions;
    }

    /**
     * Maps from {@link SuggestOptions} to {@link com.azure.search.documents.implementation.models.SuggestOptions}.
     */
    public static com.azure.search.documents.implementation.models.SuggestOptions map(SuggestOptions obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SuggestOptions suggestOptions =
                new com.azure.search.documents.implementation.models.SuggestOptions();

        String _filter = obj.getFilter();
        suggestOptions.setFilter(_filter);

        Boolean _useFuzzyMatching = obj.useFuzzyMatching();
        suggestOptions.setUseFuzzyMatching(_useFuzzyMatching);

        Double _minimumCoverage = obj.getMinimumCoverage();
        suggestOptions.setMinimumCoverage(_minimumCoverage);

        if (obj.getSelect() != null) {
            List<String> _select = obj.getSelect().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestOptions, "select", _select);
        }

        Integer _top = obj.getTop();
        suggestOptions.setTop(_top);

        String _highlightPostTag = obj.getHighlightPostTag();
        suggestOptions.setHighlightPostTag(_highlightPostTag);

        if (obj.getOrderBy() != null) {
            List<String> _orderBy = obj.getOrderBy().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestOptions, "orderBy", _orderBy);
        }

        if (obj.getSearchFields() != null) {
            List<String> _searchFields = obj.getSearchFields().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestOptions, "searchFields", _searchFields);
        }

        String _highlightPreTag = obj.getHighlightPreTag();
        suggestOptions.setHighlightPreTag(_highlightPreTag);
        return suggestOptions;
    }
}
