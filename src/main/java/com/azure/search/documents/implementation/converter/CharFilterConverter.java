package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.models.MappingCharFilter;
import com.azure.search.documents.implementation.models.PatternReplaceCharFilter;
import com.azure.search.documents.models.CharFilter;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.CharFilter} and {@link CharFilter}.
 */
public final class CharFilterConverter {
    private static final ClientLogger LOGGER = new ClientLogger(CharFilterConverter.class);

    /**
     * Maps abstract class from {@link com.azure.search.documents.implementation.models.CharFilter} to
     * {@link CharFilter}.Dedicate works to sub class converter.
     */
    public static CharFilter map(com.azure.search.documents.implementation.models.CharFilter obj) {
        if (obj instanceof MappingCharFilter) {
            return MappingCharFilterConverter.map((MappingCharFilter) obj);
        }
        if (obj instanceof PatternReplaceCharFilter) {
            return PatternReplaceCharFilterConverter.map((PatternReplaceCharFilter) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }

    /**
     * Maps abstract class from {@link CharFilter} to
     * {@link com.azure.search.documents.implementation.models.CharFilter}.Dedicate works to sub class converter.
     */
    public static com.azure.search.documents.implementation.models.CharFilter map(CharFilter obj) {
        if (obj instanceof com.azure.search.documents.models.PatternReplaceCharFilter) {
            return PatternReplaceCharFilterConverter.map((com.azure.search.documents.models.PatternReplaceCharFilter) obj);
        }
        if (obj instanceof com.azure.search.documents.models.MappingCharFilter) {
            return MappingCharFilterConverter.map((com.azure.search.documents.models.MappingCharFilter) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }
}
