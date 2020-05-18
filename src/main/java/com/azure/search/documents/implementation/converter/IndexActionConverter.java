package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.IndexAction;
import com.azure.search.documents.models.IndexActionType;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexAction} and {@link IndexAction}.
 */
public final class IndexActionConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexActionConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.IndexAction} to {@link IndexAction}.
     */
    public static IndexAction map(com.azure.search.documents.implementation.models.IndexAction obj) {
        if (obj == null) {
            return null;
        }
        IndexAction indexAction = new IndexAction();

        if (obj.getActionType() != null) {
            IndexActionType _actionType = IndexActionTypeConverter.map(obj.getActionType());
            indexAction.setActionType(_actionType);
        }

        Object _document = obj.getDocument();
        indexAction.setDocument(_document);

        if (obj.getProperties() != null) {
            Map<String, Object> _properties =
                    obj.getProperties().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(),
                            e -> e.getValue()));
            PrivateFieldAccessHelper.set(indexAction, "properties", _properties);
        }
        return indexAction;
    }

    /**
     * Maps from {@link IndexAction} to {@link com.azure.search.documents.implementation.models.IndexAction}.
     */
    public static com.azure.search.documents.implementation.models.IndexAction map(IndexAction obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.IndexAction indexAction =
                new com.azure.search.documents.implementation.models.IndexAction();

        if (obj.getActionType() != null) {
            com.azure.search.documents.implementation.models.IndexActionType _actionType =
                    IndexActionTypeConverter.map(obj.getActionType());
            indexAction.setActionType(_actionType);
        }

        Object _document = obj.getDocument();
        indexAction.setDocument(_document);

        if (obj.getProperties() != null) {
            Map<String, Object> _properties =
                    obj.getProperties().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
            PrivateFieldAccessHelper.set(indexAction, "properties", _properties);
        }
        return indexAction;
    }
}
