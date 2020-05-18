package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.ValueFacetResult;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ValueFacetResult} and
 * {@link ValueFacetResult}.
 */
public final class ValueFacetResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ValueFacetResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ValueFacetResult} to {@link ValueFacetResult}.
     */
    public static ValueFacetResult map(com.azure.search.documents.implementation.models.ValueFacetResult obj) {
        if (obj == null) {
            return null;
        }
        ValueFacetResult valueFacetResult = new ValueFacetResult();

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(valueFacetResult, "count", _count);

        Object _value = obj.getValue();
        PrivateFieldAccessHelper.set(valueFacetResult, "value", _value);
        return valueFacetResult;
    }

    /**
     * Maps from {@link ValueFacetResult} to {@link com.azure.search.documents.implementation.models.ValueFacetResult}.
     */
    public static com.azure.search.documents.implementation.models.ValueFacetResult map(ValueFacetResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ValueFacetResult valueFacetResult =
                new com.azure.search.documents.implementation.models.ValueFacetResult();

        Long _count = obj.getCount();
        PrivateFieldAccessHelper.set(valueFacetResult, "count", _count);

        Object _value = obj.getValue();
        PrivateFieldAccessHelper.set(valueFacetResult, "value", _value);
        return valueFacetResult;
    }
}
