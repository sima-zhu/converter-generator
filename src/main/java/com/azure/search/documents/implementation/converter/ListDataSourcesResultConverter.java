package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.DataSource;
import com.azure.search.documents.models.ListDataSourcesResult;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ListDataSourcesResult} and
 * {@link ListDataSourcesResult}.
 */
public final class ListDataSourcesResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ListDataSourcesResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ListDataSourcesResult} to
     * {@link ListDataSourcesResult}.
     */
    public static ListDataSourcesResult map(com.azure.search.documents.implementation.models.ListDataSourcesResult obj) {
        if (obj == null) {
            return null;
        }
        ListDataSourcesResult listDataSourcesResult = new ListDataSourcesResult();

        if (obj.getDataSources() != null) {
            List<DataSource> _dataSources =
                    obj.getDataSources().stream().map(DataSourceConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listDataSourcesResult, "dataSources", _dataSources);
        }
        return listDataSourcesResult;
    }

    /**
     * Maps from {@link ListDataSourcesResult} to
     * {@link com.azure.search.documents.implementation.models.ListDataSourcesResult}.
     */
    public static com.azure.search.documents.implementation.models.ListDataSourcesResult map(ListDataSourcesResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ListDataSourcesResult listDataSourcesResult =
                new com.azure.search.documents.implementation.models.ListDataSourcesResult();

        if (obj.getDataSources() != null) {
            List<com.azure.search.documents.implementation.models.DataSource> _dataSources =
                    obj.getDataSources().stream().map(DataSourceConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listDataSourcesResult, "dataSources", _dataSources);
        }
        return listDataSourcesResult;
    }
}
