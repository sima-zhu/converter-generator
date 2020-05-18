package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.ItemError;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ItemError} and {@link ItemError}.
 */
public final class ItemErrorConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ItemErrorConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ItemError} to {@link ItemError}.
     */
    public static ItemError map(com.azure.search.documents.implementation.models.ItemError obj) {
        if (obj == null) {
            return null;
        }
        ItemError itemError = new ItemError();

        String _errorMessage = obj.getErrorMessage();
        PrivateFieldAccessHelper.set(itemError, "errorMessage", _errorMessage);

        String _name = obj.getName();
        PrivateFieldAccessHelper.set(itemError, "name", _name);

        String _details = obj.getDetails();
        PrivateFieldAccessHelper.set(itemError, "details", _details);

        String _documentationLink = obj.getDocumentationLink();
        PrivateFieldAccessHelper.set(itemError, "documentationLink", _documentationLink);

        String _key = obj.getKey();
        PrivateFieldAccessHelper.set(itemError, "key", _key);

        int _statusCode = obj.getStatusCode();
        PrivateFieldAccessHelper.set(itemError, "statusCode", _statusCode);
        return itemError;
    }

    /**
     * Maps from {@link ItemError} to {@link com.azure.search.documents.implementation.models.ItemError}.
     */
    public static com.azure.search.documents.implementation.models.ItemError map(ItemError obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ItemError itemError =
                new com.azure.search.documents.implementation.models.ItemError();

        String _errorMessage = obj.getErrorMessage();
        PrivateFieldAccessHelper.set(itemError, "errorMessage", _errorMessage);

        String _name = obj.getName();
        PrivateFieldAccessHelper.set(itemError, "name", _name);

        String _details = obj.getDetails();
        PrivateFieldAccessHelper.set(itemError, "details", _details);

        String _documentationLink = obj.getDocumentationLink();
        PrivateFieldAccessHelper.set(itemError, "documentationLink", _documentationLink);

        String _key = obj.getKey();
        PrivateFieldAccessHelper.set(itemError, "key", _key);

        int _statusCode = obj.getStatusCode();
        PrivateFieldAccessHelper.set(itemError, "statusCode", _statusCode);
        return itemError;
    }
}
