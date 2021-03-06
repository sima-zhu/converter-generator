package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.FacetResult;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.FacetResult} and {@link FacetResult}.
 */
public final class FacetResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(FacetResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.FacetResult} to {@link FacetResult}.
     */
    public static FacetResult map(com.azure.search.documents.implementation.models.FacetResult obj) {
        if (obj == null) {
            return null;
        }
        FacetResult facetResult = new FacetResult();

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(facetResult, "count", _count);

        if (obj.getAdditionalProperties() != null) {
            Map<String, Object> _additionalProperties =
                    obj.getAdditionalProperties().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(),
                            e -> e.getValue()));
            PrivateFieldAccessHelper.set(facetResult, "additionalProperties", _additionalProperties);
        }
        return facetResult;
    }

    /**
     * Maps from {@link FacetResult} to {@link com.azure.search.documents.implementation.models.FacetResult}.
     */
    public static com.azure.search.documents.implementation.models.FacetResult map(FacetResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.FacetResult facetResult =
                new com.azure.search.documents.implementation.models.FacetResult();

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(facetResult, "count", _count);

        if (obj.getAdditionalProperties() != null) {
            Map<String, Object> _additionalProperties =
                    obj.getAdditionalProperties().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(),
                            e -> e.getValue()));
            PrivateFieldAccessHelper.set(facetResult, "additionalProperties", _additionalProperties);
        }
        return facetResult;
    }
}
