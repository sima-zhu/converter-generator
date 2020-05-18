package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.VisualFeature;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.VisualFeature} and {@link VisualFeature}.
 */
public final class VisualFeatureConverter {
    private static final ClientLogger LOGGER = new ClientLogger(VisualFeatureConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.VisualFeature}. to enum
     * {@link VisualFeature}.
     */
    public static VisualFeature map(com.azure.search.documents.implementation.models.VisualFeature obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case ADULT:
                return VisualFeature.ADULT;
            case BRANDS:
                return VisualFeature.BRANDS;
            case CATEGORIES:
                return VisualFeature.CATEGORIES;
            case DESCRIPTION:
                return VisualFeature.DESCRIPTION;
            case FACES:
                return VisualFeature.FACES;
            case OBJECTS:
                return VisualFeature.OBJECTS;
            case TAGS:
                return VisualFeature.TAGS;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }

    /**
     * Maps from enum {@link VisualFeature}. to enum
     * {@link com.azure.search.documents.implementation.models.VisualFeature}.
     */
    public static com.azure.search.documents.implementation.models.VisualFeature map(VisualFeature obj) {
        if (obj == null) {
            return null;
        }
        switch (obj) {
            case ADULT:
                return com.azure.search.documents.implementation.models.VisualFeature.ADULT;
            case BRANDS:
                return com.azure.search.documents.implementation.models.VisualFeature.BRANDS;
            case CATEGORIES:
                return com.azure.search.documents.implementation.models.VisualFeature.CATEGORIES;
            case DESCRIPTION:
                return com.azure.search.documents.implementation.models.VisualFeature.DESCRIPTION;
            case FACES:
                return com.azure.search.documents.implementation.models.VisualFeature.FACES;
            case OBJECTS:
                return com.azure.search.documents.implementation.models.VisualFeature.OBJECTS;
            case TAGS:
                return com.azure.search.documents.implementation.models.VisualFeature.TAGS;
            default:
                throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
        }
    }
}
