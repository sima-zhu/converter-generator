package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.SuggestDocumentsResult;
import com.azure.search.documents.models.SuggestResult;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SuggestDocumentsResult} and
 * {@link SuggestDocumentsResult}.
 */
public final class SuggestDocumentsResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SuggestDocumentsResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SuggestDocumentsResult} to
     * {@link SuggestDocumentsResult}.
     */
    public static SuggestDocumentsResult map(com.azure.search.documents.implementation.models.SuggestDocumentsResult obj) {
        if (obj == null) {
            return null;
        }
        SuggestDocumentsResult suggestDocumentsResult = new SuggestDocumentsResult();

        Double _coverage = obj.getCoverage();
        PrivateFieldAccessHelper.set(suggestDocumentsResult, "coverage", _coverage);

        if (obj.getResults() != null) {
            List<SuggestResult> _results =
                    obj.getResults().stream().map(SuggestResultConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestDocumentsResult, "results", _results);
        }
        return suggestDocumentsResult;
    }

    /**
     * Maps from {@link SuggestDocumentsResult} to
     * {@link com.azure.search.documents.implementation.models.SuggestDocumentsResult}.
     */
    public static com.azure.search.documents.implementation.models.SuggestDocumentsResult map(SuggestDocumentsResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SuggestDocumentsResult suggestDocumentsResult =
                new com.azure.search.documents.implementation.models.SuggestDocumentsResult();

        Double _coverage = obj.getCoverage();
        PrivateFieldAccessHelper.set(suggestDocumentsResult, "coverage", _coverage);

        if (obj.getResults() != null) {
            List<com.azure.search.documents.implementation.models.SuggestResult> _results =
                    obj.getResults().stream().map(SuggestResultConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(suggestDocumentsResult, "results", _results);
        }
        return suggestDocumentsResult;
    }
}
