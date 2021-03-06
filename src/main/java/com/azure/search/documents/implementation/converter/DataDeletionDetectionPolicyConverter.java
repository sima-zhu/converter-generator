package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.models.SoftDeleteColumnDeletionDetectionPolicy;
import com.azure.search.documents.models.DataDeletionDetectionPolicy;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.DataDeletionDetectionPolicy} and
 * {@link DataDeletionDetectionPolicy}.
 */
public final class DataDeletionDetectionPolicyConverter {
    private static final ClientLogger LOGGER = new ClientLogger(DataDeletionDetectionPolicyConverter.class);

    /**
     * Maps abstract class from {@link com.azure.search.documents.implementation.models.DataDeletionDetectionPolicy} to
     * {@link DataDeletionDetectionPolicy}.Dedicate works to sub class converter.
     */
    public static DataDeletionDetectionPolicy map(com.azure.search.documents.implementation.models.DataDeletionDetectionPolicy obj) {
        if (obj instanceof SoftDeleteColumnDeletionDetectionPolicy) {
            return SoftDeleteColumnDeletionDetectionPolicyConverter.map((SoftDeleteColumnDeletionDetectionPolicy) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }

    /**
     * Maps abstract class from {@link DataDeletionDetectionPolicy} to
     * {@link com.azure.search.documents.implementation.models.DataDeletionDetectionPolicy}.Dedicate works to sub class
     * converter.
     */
    public static com.azure.search.documents.implementation.models.DataDeletionDetectionPolicy map(DataDeletionDetectionPolicy obj) {
        if (obj instanceof com.azure.search.documents.models.SoftDeleteColumnDeletionDetectionPolicy) {
            return SoftDeleteColumnDeletionDetectionPolicyConverter.map((com.azure.search.documents.models.SoftDeleteColumnDeletionDetectionPolicy) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }
}
