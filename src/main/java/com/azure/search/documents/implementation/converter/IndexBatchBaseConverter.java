package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.IndexAction;
import com.azure.search.documents.models.IndexBatchBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexBatchBase} and
 * {@link IndexBatchBase}.
 */
public final class IndexBatchBaseConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexBatchBaseConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.IndexBatchBase} to {@link IndexBatchBase}.
     */
    public static IndexBatchBase map(com.azure.search.documents.implementation.models.IndexBatchBase obj) {
        if (obj == null) {
            return null;
        }
        IndexBatchBase indexBatchBase = new IndexBatchBase();

        if (obj.getActions() != null) {
            List<IndexAction<T>> _actions = obj.getActions().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(indexBatchBase, "actions", _actions);
        }
        return indexBatchBase;
    }

    /**
     * Maps from {@link IndexBatchBase} to {@link com.azure.search.documents.implementation.models.IndexBatchBase}.
     */
    public static com.azure.search.documents.implementation.models.IndexBatchBase map(IndexBatchBase obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.IndexBatchBase indexBatchBase =
                new com.azure.search.documents.implementation.models.IndexBatchBase();

        if (obj.getActions() != null) {
            List<com.azure.search.documents.implementation.models.IndexAction<T>> _actions =
                    obj.getActions().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(indexBatchBase, "actions", _actions);
        }
        return indexBatchBase;
    }
}
