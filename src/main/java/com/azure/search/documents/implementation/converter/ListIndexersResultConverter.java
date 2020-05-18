package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.Indexer;
import com.azure.search.documents.models.ListIndexersResult;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ListIndexersResult} and
 * {@link ListIndexersResult}.
 */
public final class ListIndexersResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ListIndexersResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ListIndexersResult} to
     * {@link ListIndexersResult}.
     */
    public static ListIndexersResult map(com.azure.search.documents.implementation.models.ListIndexersResult obj) {
        if (obj == null) {
            return null;
        }
        ListIndexersResult listIndexersResult = new ListIndexersResult();

        if (obj.getIndexers() != null) {
            List<Indexer> _indexers =
                    obj.getIndexers().stream().map(IndexerConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listIndexersResult, "indexers", _indexers);
        }
        return listIndexersResult;
    }

    /**
     * Maps from {@link ListIndexersResult} to
     * {@link com.azure.search.documents.implementation.models.ListIndexersResult}.
     */
    public static com.azure.search.documents.implementation.models.ListIndexersResult map(ListIndexersResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ListIndexersResult listIndexersResult =
                new com.azure.search.documents.implementation.models.ListIndexersResult();

        if (obj.getIndexers() != null) {
            List<com.azure.search.documents.implementation.models.Indexer> _indexers =
                    obj.getIndexers().stream().map(IndexerConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listIndexersResult, "indexers", _indexers);
        }
        return listIndexersResult;
    }
}
