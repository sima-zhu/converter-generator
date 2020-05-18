package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.InputFieldMappingEntry;
import com.azure.search.documents.models.NamedEntityRecognitionSkill;
import com.azure.search.documents.models.NamedEntityRecognitionSkillLanguage;
import com.azure.search.documents.models.OutputFieldMappingEntry;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill} and
 * {@link NamedEntityRecognitionSkill}.
 */
public final class NamedEntityRecognitionSkillConverter {
    private static final ClientLogger LOGGER = new ClientLogger(NamedEntityRecognitionSkillConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill} to
     * {@link NamedEntityRecognitionSkill}.
     */
    public static NamedEntityRecognitionSkill map(com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill obj) {
        if (obj == null) {
            return null;
        }
        NamedEntityRecognitionSkill namedEntityRecognitionSkill = new NamedEntityRecognitionSkill();

        if (obj.getOutputs() != null) {
            List<OutputFieldMappingEntry> _outputs =
                    obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());
            namedEntityRecognitionSkill.setOutputs(_outputs);
        }

        if (obj.getInputs() != null) {
            List<InputFieldMappingEntry> _inputs =
                    obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            namedEntityRecognitionSkill.setInputs(_inputs);
        }

        String _name = obj.getName();
        namedEntityRecognitionSkill.setName(_name);

        String _context = obj.getContext();
        namedEntityRecognitionSkill.setContext(_context);

        String _description = obj.getDescription();
        namedEntityRecognitionSkill.setDescription(_description);

        if (obj.getDefaultLanguageCode() != null) {
            NamedEntityRecognitionSkillLanguage _defaultLanguageCode =
                    NamedEntityRecognitionSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            namedEntityRecognitionSkill.setDefaultLanguageCode(_defaultLanguageCode);
        }

        if (obj.getCategories() != null) {
            List<String> _categories = obj.getCategories().stream().collect(Collectors.toList());
            namedEntityRecognitionSkill.setCategories(_categories);
        }

        Double _minimumPrecision = obj.getMinimumPrecision();
        namedEntityRecognitionSkill.setMinimumPrecision(_minimumPrecision);
        return namedEntityRecognitionSkill;
    }

    /**
     * Maps from {@link NamedEntityRecognitionSkill} to
     * {@link com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill}.
     */
    public static com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill map(NamedEntityRecognitionSkill obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill namedEntityRecognitionSkill =
                new com.azure.search.documents.implementation.models.NamedEntityRecognitionSkill();

        if (obj.getOutputs() != null) {
            List<com.azure.search.documents.implementation.models.OutputFieldMappingEntry> _outputs =
                    obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());
            namedEntityRecognitionSkill.setOutputs(_outputs);
        }

        if (obj.getInputs() != null) {
            List<com.azure.search.documents.implementation.models.InputFieldMappingEntry> _inputs =
                    obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            namedEntityRecognitionSkill.setInputs(_inputs);
        }

        String _name = obj.getName();
        namedEntityRecognitionSkill.setName(_name);

        String _context = obj.getContext();
        namedEntityRecognitionSkill.setContext(_context);

        String _description = obj.getDescription();
        namedEntityRecognitionSkill.setDescription(_description);

        if (obj.getDefaultLanguageCode() != null) {
            com.azure.search.documents.implementation.models.NamedEntityRecognitionSkillLanguage _defaultLanguageCode = NamedEntityRecognitionSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            namedEntityRecognitionSkill.setDefaultLanguageCode(_defaultLanguageCode);
        }

        if (obj.getCategories() != null) {
            List<String> _categories = obj.getCategories().stream().collect(Collectors.toList());
            namedEntityRecognitionSkill.setCategories(_categories);
        }

        Double _minimumPrecision = obj.getMinimumPrecision();
        namedEntityRecognitionSkill.setMinimumPrecision(_minimumPrecision);
        return namedEntityRecognitionSkill;
    }
}
