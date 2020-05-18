package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.CoordinateSystem;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.CoordinateSystem} and
 * {@link CoordinateSystem}.
 */
public final class CoordinateSystemConverter {
    private static final ClientLogger LOGGER = new ClientLogger(CoordinateSystemConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.CoordinateSystem} to {@link CoordinateSystem}.
     */
    public static CoordinateSystem map(com.azure.search.documents.implementation.models.CoordinateSystem obj) {
        if (obj == null) {
            return null;
        }
        CoordinateSystem coordinateSystem = new CoordinateSystem();

        String _type = obj.getType();
        coordinateSystem.setType(_type);

        if (obj.getProperties() != null) {
            Map<String, String> _properties =
                    obj.getProperties().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(),
                            e -> e.getValue()));
            coordinateSystem.setProperties(_properties);
        }
        return coordinateSystem;
    }

    /**
     * Maps from {@link CoordinateSystem} to {@link com.azure.search.documents.implementation.models.CoordinateSystem}.
     */
    public static com.azure.search.documents.implementation.models.CoordinateSystem map(CoordinateSystem obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.CoordinateSystem coordinateSystem =
                new com.azure.search.documents.implementation.models.CoordinateSystem();

        String _type = obj.getType();
        coordinateSystem.setType(_type);

        if (obj.getProperties() != null) {
            Map<String, String> _properties =
                    obj.getProperties().entrySet().stream().collect(Collectors.toMap(e -> e.getKey(),
                            e -> e.getValue()));
            coordinateSystem.setProperties(_properties);
        }
        return coordinateSystem;
    }
}
