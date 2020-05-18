package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.ListSynonymMapsResult;
import com.azure.search.documents.models.SynonymMap;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ListSynonymMapsResult} and
 * {@link ListSynonymMapsResult}.
 */
public final class ListSynonymMapsResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ListSynonymMapsResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ListSynonymMapsResult} to
     * {@link ListSynonymMapsResult}.
     */
    public static ListSynonymMapsResult map(com.azure.search.documents.implementation.models.ListSynonymMapsResult obj) {
        if (obj == null) {
            return null;
        }
        ListSynonymMapsResult listSynonymMapsResult = new ListSynonymMapsResult();

        if (obj.getSynonymMaps() != null) {
            List<SynonymMap> _synonymMaps =
                    obj.getSynonymMaps().stream().map(SynonymMapConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listSynonymMapsResult, "synonymMaps", _synonymMaps);
        }
        return listSynonymMapsResult;
    }

    /**
     * Maps from {@link ListSynonymMapsResult} to
     * {@link com.azure.search.documents.implementation.models.ListSynonymMapsResult}.
     */
    public static com.azure.search.documents.implementation.models.ListSynonymMapsResult map(ListSynonymMapsResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ListSynonymMapsResult listSynonymMapsResult =
                new com.azure.search.documents.implementation.models.ListSynonymMapsResult();

        if (obj.getSynonymMaps() != null) {
            List<com.azure.search.documents.implementation.models.SynonymMap> _synonymMaps =
                    obj.getSynonymMaps().stream().map(SynonymMapConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listSynonymMapsResult, "synonymMaps", _synonymMaps);
        }
        return listSynonymMapsResult;
    }
}
