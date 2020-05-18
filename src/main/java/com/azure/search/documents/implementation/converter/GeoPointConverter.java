package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.CoordinateSystem;
import com.azure.search.documents.models.GeoPoint;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.GeoPoint} and {@link GeoPoint}.
 */
public final class GeoPointConverter {
    private static final ClientLogger LOGGER = new ClientLogger(GeoPointConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.GeoPoint} to {@link GeoPoint}.
     */
    public static GeoPoint map(com.azure.search.documents.implementation.models.GeoPoint obj) {
        if (obj == null) {
            return null;
        }
        GeoPoint geoPoint = new GeoPoint();

        if (obj.getCoordinates() != null) {
            List<Double> _coordinates = obj.getCoordinates().stream().collect(Collectors.toList());
            geoPoint.setCoordinates(_coordinates);
        }

        if (obj.getCoordinateSystem() != null) {
            CoordinateSystem _coordinateSystem = CoordinateSystemConverter.map(obj.getCoordinateSystem());
            geoPoint.setCoordinateSystem(_coordinateSystem);
        }
        return geoPoint;
    }

    /**
     * Maps from {@link GeoPoint} to {@link com.azure.search.documents.implementation.models.GeoPoint}.
     */
    public static com.azure.search.documents.implementation.models.GeoPoint map(GeoPoint obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.GeoPoint geoPoint =
                new com.azure.search.documents.implementation.models.GeoPoint();

        if (obj.getCoordinates() != null) {
            List<Double> _coordinates = obj.getCoordinates().stream().collect(Collectors.toList());
            geoPoint.setCoordinates(_coordinates);
        }

        if (obj.getCoordinateSystem() != null) {
            com.azure.search.documents.implementation.models.CoordinateSystem _coordinateSystem = CoordinateSystemConverter.map(obj.getCoordinateSystem());
            geoPoint.setCoordinateSystem(_coordinateSystem);
        }
        return geoPoint;
    }
}
