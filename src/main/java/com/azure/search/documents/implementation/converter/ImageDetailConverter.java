package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.ImageDetail;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ImageDetail} and {@link ImageDetail}.
 */
public final class ImageDetailConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ImageDetailConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.ImageDetail}. to enum {@link ImageDetail}.
     */
    public static ImageDetail map(com.azure.search.documents.implementation.models.ImageDetail obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case CELEBRITIES:
                return ImageDetail.CELEBRITIES;
            case LANDMARKS:
                return ImageDetail.LANDMARKS;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link ImageDetail}. to enum {@link com.azure.search.documents.implementation.models.ImageDetail}.
     */
    public static com.azure.search.documents.implementation.models.ImageDetail map(ImageDetail obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case CELEBRITIES:
                return com.azure.search.documents.implementation.models.ImageDetail.CELEBRITIES;
            case LANDMARKS:
                return com.azure.search.documents.implementation.models.ImageDetail.LANDMARKS;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
