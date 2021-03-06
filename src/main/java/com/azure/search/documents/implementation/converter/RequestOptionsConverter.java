package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.RequestOptions;

import java.util.UUID;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.RequestOptions} and
 * {@link RequestOptions}.
 */
public final class RequestOptionsConverter {
    private static final ClientLogger LOGGER = new ClientLogger(RequestOptionsConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.RequestOptions} to {@link RequestOptions}.
     */
    public static RequestOptions map(com.azure.search.documents.implementation.models.RequestOptions obj) {
        if (obj == null) {
            return null;
        }
        RequestOptions requestOptions = new RequestOptions();

        UUID _xMsClientRequestId = obj.getXMsClientRequestId();
        requestOptions.setXMsClientRequestId(_xMsClientRequestId);
        return requestOptions;
    }

    /**
     * Maps from {@link RequestOptions} to {@link com.azure.search.documents.implementation.models.RequestOptions}.
     */
    public static com.azure.search.documents.implementation.models.RequestOptions map(RequestOptions obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.RequestOptions requestOptions =
                new com.azure.search.documents.implementation.models.RequestOptions();

        UUID _xMsClientRequestId = obj.getXMsClientRequestId();
        requestOptions.setXMsClientRequestId(_xMsClientRequestId);
        return requestOptions;
    }
}
