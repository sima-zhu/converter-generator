package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SqlIntegratedChangeTrackingPolicy;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy} and
 * {@link SqlIntegratedChangeTrackingPolicy}.
 */
public final class SqlIntegratedChangeTrackingPolicyConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SqlIntegratedChangeTrackingPolicyConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy} to
     * {@link SqlIntegratedChangeTrackingPolicy}.
     */
    public static SqlIntegratedChangeTrackingPolicy map(com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy obj) {
        if (obj == null) {
            return null;
        }
        SqlIntegratedChangeTrackingPolicy sqlIntegratedChangeTrackingPolicy = new SqlIntegratedChangeTrackingPolicy();
        return sqlIntegratedChangeTrackingPolicy;
    }

    /**
     * Maps from {@link SqlIntegratedChangeTrackingPolicy} to
     * {@link com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy}.
     */
    public static com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy map(SqlIntegratedChangeTrackingPolicy obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy sqlIntegratedChangeTrackingPolicy = new com.azure.search.documents.implementation.models.SqlIntegratedChangeTrackingPolicy();
        return sqlIntegratedChangeTrackingPolicy;
    }
}
