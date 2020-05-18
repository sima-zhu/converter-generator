package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.ListSkillsetsResult;
import com.azure.search.documents.models.Skillset;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ListSkillsetsResult} and
 * {@link ListSkillsetsResult}.
 */
public final class ListSkillsetsResultConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ListSkillsetsResultConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ListSkillsetsResult} to
     * {@link ListSkillsetsResult}.
     */
    public static ListSkillsetsResult map(com.azure.search.documents.implementation.models.ListSkillsetsResult obj) {
        if (obj == null) {
            return null;
        }
        ListSkillsetsResult listSkillsetsResult = new ListSkillsetsResult();

        if (obj.getSkillsets() != null) {
            List<Skillset> _skillsets =
                    obj.getSkillsets().stream().map(SkillsetConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listSkillsetsResult, "skillsets", _skillsets);
        }
        return listSkillsetsResult;
    }

    /**
     * Maps from {@link ListSkillsetsResult} to
     * {@link com.azure.search.documents.implementation.models.ListSkillsetsResult}.
     */
    public static com.azure.search.documents.implementation.models.ListSkillsetsResult map(ListSkillsetsResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ListSkillsetsResult listSkillsetsResult =
                new com.azure.search.documents.implementation.models.ListSkillsetsResult();

        if (obj.getSkillsets() != null) {
            List<com.azure.search.documents.implementation.models.Skillset> _skillsets =
                    obj.getSkillsets().stream().map(SkillsetConverter::map).collect(Collectors.toList());
            PrivateFieldAccessHelper.set(listSkillsetsResult, "skillsets", _skillsets);
        }
        return listSkillsetsResult;
    }
}
