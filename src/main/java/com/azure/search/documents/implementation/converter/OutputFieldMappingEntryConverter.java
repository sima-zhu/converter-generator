package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.OutputFieldMappingEntry;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.OutputFieldMappingEntry} and
 * {@link OutputFieldMappingEntry}.
 */
public final class OutputFieldMappingEntryConverter {
    private static final ClientLogger LOGGER = new ClientLogger(OutputFieldMappingEntryConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.OutputFieldMappingEntry} to
     * {@link OutputFieldMappingEntry}.
     */
    public static OutputFieldMappingEntry map(com.azure.search.documents.implementation.models.OutputFieldMappingEntry obj) {
        if (obj == null) {
            return null;
        }
        OutputFieldMappingEntry outputFieldMappingEntry = new OutputFieldMappingEntry();

        String _targetName = obj.getTargetName();
        outputFieldMappingEntry.setTargetName(_targetName);

        String _name = obj.getName();
        outputFieldMappingEntry.setName(_name);
        return outputFieldMappingEntry;
    }

    /**
     * Maps from {@link OutputFieldMappingEntry} to
     * {@link com.azure.search.documents.implementation.models.OutputFieldMappingEntry}.
     */
    public static com.azure.search.documents.implementation.models.OutputFieldMappingEntry map(OutputFieldMappingEntry obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.OutputFieldMappingEntry outputFieldMappingEntry =
                new com.azure.search.documents.implementation.models.OutputFieldMappingEntry();

        String _targetName = obj.getTargetName();
        outputFieldMappingEntry.setTargetName(_targetName);

        String _name = obj.getName();
        outputFieldMappingEntry.setName(_name);
        return outputFieldMappingEntry;
    }
}
