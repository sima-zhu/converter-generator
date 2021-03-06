package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.InputFieldMappingEntry;
import com.azure.search.documents.models.OutputFieldMappingEntry;
import com.azure.search.documents.models.SplitSkill;
import com.azure.search.documents.models.SplitSkillLanguage;
import com.azure.search.documents.models.TextSplitMode;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SplitSkill} and {@link SplitSkill}.
 */
public final class SplitSkillConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SplitSkillConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SplitSkill} to {@link SplitSkill}.
     */
    public static SplitSkill map(com.azure.search.documents.implementation.models.SplitSkill obj) {
        if (obj == null) {
            return null;
        }
        SplitSkill splitSkill = new SplitSkill();

        if (obj.getOutputs() != null) {
            List<OutputFieldMappingEntry> _outputs =
                    obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());
            splitSkill.setOutputs(_outputs);
        }

        if (obj.getInputs() != null) {
            List<InputFieldMappingEntry> _inputs =
                    obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            splitSkill.setInputs(_inputs);
        }

        String _name = obj.getName();
        splitSkill.setName(_name);

        String _context = obj.getContext();
        splitSkill.setContext(_context);

        String _description = obj.getDescription();
        splitSkill.setDescription(_description);

        Integer _maximumPageLength = obj.getMaximumPageLength();
        splitSkill.setMaximumPageLength(_maximumPageLength);

        if (obj.getTextSplitMode() != null) {
            TextSplitMode _textSplitMode = TextSplitModeConverter.map(obj.getTextSplitMode());
            splitSkill.setTextSplitMode(_textSplitMode);
        }

        if (obj.getDefaultLanguageCode() != null) {
            SplitSkillLanguage _defaultLanguageCode = SplitSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            splitSkill.setDefaultLanguageCode(_defaultLanguageCode);
        }
        return splitSkill;
    }

    /**
     * Maps from {@link SplitSkill} to {@link com.azure.search.documents.implementation.models.SplitSkill}.
     */
    public static com.azure.search.documents.implementation.models.SplitSkill map(SplitSkill obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SplitSkill splitSkill =
                new com.azure.search.documents.implementation.models.SplitSkill();

        if (obj.getOutputs() != null) {
            List<com.azure.search.documents.implementation.models.OutputFieldMappingEntry> _outputs =
                    obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());
            splitSkill.setOutputs(_outputs);
        }

        if (obj.getInputs() != null) {
            List<com.azure.search.documents.implementation.models.InputFieldMappingEntry> _inputs =
                    obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            splitSkill.setInputs(_inputs);
        }

        String _name = obj.getName();
        splitSkill.setName(_name);

        String _context = obj.getContext();
        splitSkill.setContext(_context);

        String _description = obj.getDescription();
        splitSkill.setDescription(_description);

        Integer _maximumPageLength = obj.getMaximumPageLength();
        splitSkill.setMaximumPageLength(_maximumPageLength);

        if (obj.getTextSplitMode() != null) {
            com.azure.search.documents.implementation.models.TextSplitMode _textSplitMode =
                    TextSplitModeConverter.map(obj.getTextSplitMode());
            splitSkill.setTextSplitMode(_textSplitMode);
        }

        if (obj.getDefaultLanguageCode() != null) {
            com.azure.search.documents.implementation.models.SplitSkillLanguage _defaultLanguageCode = SplitSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            splitSkill.setDefaultLanguageCode(_defaultLanguageCode);
        }
        return splitSkill;
    }
}
