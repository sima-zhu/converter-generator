package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.ItemWarning;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ItemWarning} and {@link ItemWarning}.
 */
public final class ItemWarningConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ItemWarningConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ItemWarning} to {@link ItemWarning}.
     */
    public static ItemWarning map(com.azure.search.documents.implementation.models.ItemWarning obj) {
        if (obj == null) {
            return null;
        }
        ItemWarning itemWarning = new ItemWarning();

        String _name = obj.getName();
        PrivateFieldAccessHelper.set(itemWarning, "name", _name);

        String _details = obj.getDetails();
        PrivateFieldAccessHelper.set(itemWarning, "details", _details);

        String _documentationLink = obj.getDocumentationLink();
        PrivateFieldAccessHelper.set(itemWarning, "documentationLink", _documentationLink);

        String _message = obj.getMessage();
        PrivateFieldAccessHelper.set(itemWarning, "message", _message);

        String _key = obj.getKey();
        PrivateFieldAccessHelper.set(itemWarning, "key", _key);
        return itemWarning;
    }

    /**
     * Maps from {@link ItemWarning} to {@link com.azure.search.documents.implementation.models.ItemWarning}.
     */
    public static com.azure.search.documents.implementation.models.ItemWarning map(ItemWarning obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ItemWarning itemWarning =
                new com.azure.search.documents.implementation.models.ItemWarning();

        String _name = obj.getName();
        PrivateFieldAccessHelper.set(itemWarning, "name", _name);

        String _details = obj.getDetails();
        PrivateFieldAccessHelper.set(itemWarning, "details", _details);

        String _documentationLink = obj.getDocumentationLink();
        PrivateFieldAccessHelper.set(itemWarning, "documentationLink", _documentationLink);

        String _message = obj.getMessage();
        PrivateFieldAccessHelper.set(itemWarning, "message", _message);

        String _key = obj.getKey();
        PrivateFieldAccessHelper.set(itemWarning, "key", _key);
        return itemWarning;
    }
}
