package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.models.HighWaterMarkChangeDetectionPolicy;
import com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy;
import com.azure.search.documents.models.DataChangeDetectionPolicy;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.DataChangeDetectionPolicy} and
 * {@link DataChangeDetectionPolicy}.
 */
public final class DataChangeDetectionPolicyConverter {
    private static final ClientLogger LOGGER = new ClientLogger(DataChangeDetectionPolicyConverter.class);

    /**
     * Maps abstract class from {@link com.azure.search.documents.implementation.models.DataChangeDetectionPolicy} to
     * {@link DataChangeDetectionPolicy}.Dedicate works to sub class converter.
     */
    public static DataChangeDetectionPolicy map(com.azure.search.documents.implementation.models.DataChangeDetectionPolicy obj) {
        if (obj instanceof HighWaterMarkChangeDetectionPolicy) {
            return HighWaterMarkChangeDetectionPolicyConverter.map((HighWaterMarkChangeDetectionPolicy) obj);
        }
        if (obj instanceof SqlIntegratedChangeTrackingPolicy) {
            return SqlIntegratedChangeTrackingPolicyConverter.map((SqlIntegratedChangeTrackingPolicy) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }

    /**
     * Maps abstract class from {@link DataChangeDetectionPolicy} to
     * {@link com.azure.search.documents.implementation.models.DataChangeDetectionPolicy}.Dedicate works to sub class
     * converter.
     */
    public static com.azure.search.documents.implementation.models.DataChangeDetectionPolicy map(DataChangeDetectionPolicy obj) {
        if (obj instanceof com.azure.search.documents.models.SqlIntegratedChangeTrackingPolicy) {
            return SqlIntegratedChangeTrackingPolicyConverter.map((com.azure.search.documents.models.SqlIntegratedChangeTrackingPolicy) obj);
        }
        if (obj instanceof com.azure.search.documents.models.HighWaterMarkChangeDetectionPolicy) {
            return HighWaterMarkChangeDetectionPolicyConverter.map((com.azure.search.documents.models.HighWaterMarkChangeDetectionPolicy) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }
}
