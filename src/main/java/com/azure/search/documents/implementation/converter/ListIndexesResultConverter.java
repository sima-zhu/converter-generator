package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.Index;
import com.azure.search.documents.models.ListIndexesResult;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ListIndexesResult} and
 * {@link ListIndexesResult}.
 */
public final class ListIndexesResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ListIndexesResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ListIndexesResult} to
     * {@link ListIndexesResult}.
     */
    public static ListIndexesResult map(com.azure.search.documents.implementation.models.ListIndexesResult obj) {
        if (obj == null) {
            return null;
        }
        ListIndexesResult listIndexesResult = new ListIndexesResult();

        if (obj.getIndexes() != null) {
            List<Index> _indexes = obj.getIndexes().stream().map(IndexConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listIndexesResult, "indexes", _indexes);
        }
        return listIndexesResult;
    }

    /**
     * Maps from {@link ListIndexesResult} to
     * {@link com.azure.search.documents.implementation.models.ListIndexesResult}.
     */
    public static com.azure.search.documents.implementation.models.ListIndexesResult map(ListIndexesResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ListIndexesResult listIndexesResult =
                new com.azure.search.documents.implementation.models.ListIndexesResult();

        if (obj.getIndexes() != null) {
            List<com.azure.search.documents.implementation.models.Index> _indexes =
                    obj.getIndexes().stream().map(IndexConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listIndexesResult, "indexes", _indexes);
        }
        return listIndexesResult;
    }
}
