package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.DataChangeDetectionPolicy;
import com.azure.search.documents.models.DataContainer;
import com.azure.search.documents.models.DataDeletionDetectionPolicy;
import com.azure.search.documents.models.DataSource;
import com.azure.search.documents.models.DataSourceCredentials;
import com.azure.search.documents.models.DataSourceType;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.DataSource} and {@link DataSource}.
 */
public final class DataSourceConverter {
    private static final ClientLogger LOGGER = new ClientLogger(DataSourceConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.DataSource} to {@link DataSource}.
     */
    public static DataSource map(com.azure.search.documents.implementation.models.DataSource obj) {
        if (obj == null) {
            return null;
        }
        DataSource dataSource = new DataSource();

        if (obj.getContainer() != null) {
            DataContainer _container = DataContainerConverter.map(obj.getContainer());
            dataSource.setContainer(_container);
        }

        if (obj.getDataChangeDetectionPolicy() != null) {
            DataChangeDetectionPolicy _dataChangeDetectionPolicy =
                    DataChangeDetectionPolicyConverter.map(obj.getDataChangeDetectionPolicy());
            dataSource.setDataChangeDetectionPolicy(_dataChangeDetectionPolicy);
        }

        if (obj.getCredentials() != null) {
            DataSourceCredentials _credentials = DataSourceCredentialsConverter.map(obj.getCredentials());
            dataSource.setCredentials(_credentials);
        }

        String _name = obj.getName();
        dataSource.setName(_name);

        String _description = obj.getDescription();
        dataSource.setDescription(_description);

        if (obj.getDataDeletionDetectionPolicy() != null) {
            DataDeletionDetectionPolicy _dataDeletionDetectionPolicy =
                    DataDeletionDetectionPolicyConverter.map(obj.getDataDeletionDetectionPolicy());
            dataSource.setDataDeletionDetectionPolicy(_dataDeletionDetectionPolicy);
        }

        String _eTag = obj.getETag();
        dataSource.setETag(_eTag);

        if (obj.getType() != null) {
            DataSourceType _type = DataSourceTypeConverter.map(obj.getType());
            dataSource.setType(_type);
        }
        return dataSource;
    }

    /**
     * Maps from {@link DataSource} to {@link com.azure.search.documents.implementation.models.DataSource}.
     */
    public static com.azure.search.documents.implementation.models.DataSource map(DataSource obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.DataSource dataSource =
                new com.azure.search.documents.implementation.models.DataSource();

        if (obj.getContainer() != null) {
            com.azure.search.documents.implementation.models.DataContainer _container =
                    DataContainerConverter.map(obj.getContainer());
            dataSource.setContainer(_container);
        }

        if (obj.getDataChangeDetectionPolicy() != null) {
            com.azure.search.documents.implementation.models.DataChangeDetectionPolicy _dataChangeDetectionPolicy =
                    DataChangeDetectionPolicyConverter.map(obj.getDataChangeDetectionPolicy());
            dataSource.setDataChangeDetectionPolicy(_dataChangeDetectionPolicy);
        }

        if (obj.getCredentials() != null) {
            com.azure.search.documents.implementation.models.DataSourceCredentials _credentials =
                    DataSourceCredentialsConverter.map(obj.getCredentials());
            dataSource.setCredentials(_credentials);
        }

        String _name = obj.getName();
        dataSource.setName(_name);

        String _description = obj.getDescription();
        dataSource.setDescription(_description);

        if (obj.getDataDeletionDetectionPolicy() != null) {
            com.azure.search.documents.implementation.models.DataDeletionDetectionPolicy _dataDeletionDetectionPolicy = DataDeletionDetectionPolicyConverter.map(obj.getDataDeletionDetectionPolicy());
            dataSource.setDataDeletionDetectionPolicy(_dataDeletionDetectionPolicy);
        }

        String _eTag = obj.getETag();
        dataSource.setETag(_eTag);

        if (obj.getType() != null) {
            com.azure.search.documents.implementation.models.DataSourceType _type = DataSourceTypeConverter.map(obj.getType());
            dataSource.setType(_type);
        }
        return dataSource;
    }
}
