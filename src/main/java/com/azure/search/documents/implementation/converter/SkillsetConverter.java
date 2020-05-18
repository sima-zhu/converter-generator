package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.CognitiveServicesAccount;
import com.azure.search.documents.models.Skill;
import com.azure.search.documents.models.Skillset;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Skillset} and {@link Skillset}.
 */
public final class SkillsetConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SkillsetConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.Skillset} to {@link Skillset}.
     */
    public static Skillset map(com.azure.search.documents.implementation.models.Skillset obj) {
        if (obj == null) {
            return null;
        }
        Skillset skillset = new Skillset();

        if (obj.getSkills() != null) {
            List<Skill> _skills = obj.getSkills().stream().map(SkillConverter::map).collect(Collectors.toList());
            skillset.setSkills(_skills);
        }

        String _name = obj.getName();
        skillset.setName(_name);

        if (obj.getCognitiveServicesAccount() != null) {
            CognitiveServicesAccount _cognitiveServicesAccount =
                    CognitiveServicesAccountConverter.map(obj.getCognitiveServicesAccount());
            skillset.setCognitiveServicesAccount(_cognitiveServicesAccount);
        }

        String _description = obj.getDescription();
        skillset.setDescription(_description);

        String _eTag = obj.getETag();
        skillset.setETag(_eTag);
        return skillset;
    }

    /**
     * Maps from {@link Skillset} to {@link com.azure.search.documents.implementation.models.Skillset}.
     */
    public static com.azure.search.documents.implementation.models.Skillset map(Skillset obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.Skillset skillset =
                new com.azure.search.documents.implementation.models.Skillset();

        if (obj.getSkills() != null) {
            List<com.azure.search.documents.implementation.models.Skill> _skills =
                    obj.getSkills().stream().map(SkillConverter::map).collect(Collectors.toList());
            skillset.setSkills(_skills);
        }

        String _name = obj.getName();
        skillset.setName(_name);

        if (obj.getCognitiveServicesAccount() != null) {
            com.azure.search.documents.implementation.models.CognitiveServicesAccount _cognitiveServicesAccount =
                    CognitiveServicesAccountConverter.map(obj.getCognitiveServicesAccount());
            skillset.setCognitiveServicesAccount(_cognitiveServicesAccount);
        }

        String _description = obj.getDescription();
        skillset.setDescription(_description);

        String _eTag = obj.getETag();
        skillset.setETag(_eTag);
        return skillset;
    }
}
