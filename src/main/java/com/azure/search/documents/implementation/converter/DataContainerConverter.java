package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.DataContainer;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.DataContainer} and {@link DataContainer}.
 */
public final class DataContainerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(DataContainerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.DataContainer} to {@link DataContainer}.
     */
    public static DataContainer map(com.azure.search.documents.implementation.models.DataContainer obj) {
        if (obj == null) {
            return null;
        }
        DataContainer dataContainer = new DataContainer();

        String _query = obj.getQuery();
        dataContainer.setQuery(_query);

        String _name = obj.getName();
        dataContainer.setName(_name);
        return dataContainer;
    }

    /**
     * Maps from {@link DataContainer} to {@link com.azure.search.documents.implementation.models.DataContainer}.
     */
    public static com.azure.search.documents.implementation.models.DataContainer map(DataContainer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.DataContainer dataContainer =
                new com.azure.search.documents.implementation.models.DataContainer();

        String _query = obj.getQuery();
        dataContainer.setQuery(_query);

        String _name = obj.getName();
        dataContainer.setName(_name);
        return dataContainer;
    }
}
