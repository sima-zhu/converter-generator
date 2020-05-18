package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.IndexerExecutionInfo;
import com.azure.search.documents.models.IndexerExecutionResult;
import com.azure.search.documents.models.IndexerLimits;
import com.azure.search.documents.models.IndexerStatus;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.IndexerExecutionInfo} and
 * {@link IndexerExecutionInfo}.
 */
public final class IndexerExecutionInfoConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexerExecutionInfoConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.IndexerExecutionInfo} to
     * {@link IndexerExecutionInfo}.
     */
    public static IndexerExecutionInfo map(com.azure.search.documents.implementation.models.IndexerExecutionInfo obj) {
        if (obj == null) {
            return null;
        }
        IndexerExecutionInfo indexerExecutionInfo = new IndexerExecutionInfo();

        if (obj.getLastResult() != null) {
            IndexerExecutionResult _lastResult = IndexerExecutionResultConverter.map(obj.getLastResult());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "lastResult", _lastResult);
        }

        if (obj.getExecutionHistory() != null) {
            List<IndexerExecutionResult> _executionHistory =
                    obj.getExecutionHistory().stream().map(IndexerExecutionResultConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "executionHistory", _executionHistory);
        }

        if (obj.getLimits() != null) {
            IndexerLimits _limits = IndexerLimitsConverter.map(obj.getLimits());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "limits", _limits);
        }

        if (obj.getStatus() != null) {
            IndexerStatus _status = IndexerStatusConverter.map(obj.getStatus());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "status", _status);
        }
        return indexerExecutionInfo;
    }

    /**
     * Maps from {@link IndexerExecutionInfo} to
     * {@link com.azure.search.documents.implementation.models.IndexerExecutionInfo}.
     */
    public static com.azure.search.documents.implementation.models.IndexerExecutionInfo map(IndexerExecutionInfo obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.IndexerExecutionInfo indexerExecutionInfo =
                new com.azure.search.documents.implementation.models.IndexerExecutionInfo();

        if (obj.getLastResult() != null) {
            com.azure.search.documents.implementation.models.IndexerExecutionResult _lastResult =
                    IndexerExecutionResultConverter.map(obj.getLastResult());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "lastResult", _lastResult);
        }

        if (obj.getExecutionHistory() != null) {
            List<com.azure.search.documents.implementation.models.IndexerExecutionResult> _executionHistory =
                    obj.getExecutionHistory().stream().map(IndexerExecutionResultConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "executionHistory", _executionHistory);
        }

        if (obj.getLimits() != null) {
            com.azure.search.documents.implementation.models.IndexerLimits _limits =
                    IndexerLimitsConverter.map(obj.getLimits());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "limits", _limits);
        }

        if (obj.getStatus() != null) {
            com.azure.search.documents.implementation.models.IndexerStatus _status = IndexerStatusConverter.map(obj.getStatus());
            PrivateFieldAccessHelper.set(indexerExecutionInfo, "status", _status);
        }
        return indexerExecutionInfo;
    }
}
