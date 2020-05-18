package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.RangeFacetResult;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.RangeFacetResult} and
 * {@link RangeFacetResult}.
 */
public final class RangeFacetResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(RangeFacetResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.RangeFacetResult} to {@link RangeFacetResult}.
     */
    public static RangeFacetResult map(com.azure.search.documents.implementation.models.RangeFacetResult obj) {
        if (obj == null) {
            return null;
        }
        RangeFacetResult rangeFacetResult = new RangeFacetResult();

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(rangeFacetResult, "count", _count);

        Object _from = obj.getFrom();
        PrivateFieldAccessHelper.set(rangeFacetResult, "from", _from);

        Object _to = obj.getTo();
        PrivateFieldAccessHelper.set(rangeFacetResult, "to", _to);
        return rangeFacetResult;
    }

    /**
     * Maps from {@link RangeFacetResult} to {@link com.azure.search.documents.implementation.models.RangeFacetResult}.
     */
    public static com.azure.search.documents.implementation.models.RangeFacetResult map(RangeFacetResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.RangeFacetResult rangeFacetResult =
                new com.azure.search.documents.implementation.models.RangeFacetResult();

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(rangeFacetResult, "count", _count);

        Object _from = obj.getFrom();
        PrivateFieldAccessHelper.set(rangeFacetResult, "from", _from);

        Object _to = obj.getTo();
        PrivateFieldAccessHelper.set(rangeFacetResult, "to", _to);
        return rangeFacetResult;
    }
}
