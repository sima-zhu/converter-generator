package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.AccessCondition;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.AccessCondition} and
 * {@link AccessCondition}.
 */
public final class AccessConditionConverter {
    private static final ClientLogger LOGGER = new ClientLogger(AccessConditionConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.AccessCondition} to {@link AccessCondition}.
     */
    public static AccessCondition map(com.azure.search.documents.implementation.models.AccessCondition obj) {
        if (obj == null) {
            return null;
        }
        AccessCondition accessCondition = new AccessCondition();

        String _ifNoneMatch = obj.getIfNoneMatch();
        accessCondition.setIfNoneMatch(_ifNoneMatch);

        String _ifMatch = obj.getIfMatch();
        accessCondition.setIfMatch(_ifMatch);
        return accessCondition;
    }

    /**
     * Maps from {@link AccessCondition} to {@link com.azure.search.documents.implementation.models.AccessCondition}.
     */
    public static com.azure.search.documents.implementation.models.AccessCondition map(AccessCondition obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.AccessCondition accessCondition =
                new com.azure.search.documents.implementation.models.AccessCondition();

        String _ifNoneMatch = obj.getIfNoneMatch();
        accessCondition.setIfNoneMatch(_ifNoneMatch);

        String _ifMatch = obj.getIfMatch();
        accessCondition.setIfMatch(_ifMatch);
        return accessCondition;
    }
}
