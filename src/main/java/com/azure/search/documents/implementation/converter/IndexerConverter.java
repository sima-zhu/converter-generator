package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.FieldMapping;
import com.azure.search.documents.models.Indexer;
import com.azure.search.documents.models.IndexingParameters;
import com.azure.search.documents.models.IndexingSchedule;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Indexer} and {@link Indexer}.
 */
public final class IndexerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.Indexer} to {@link Indexer}.
     */
    public static Indexer map(com.azure.search.documents.implementation.models.Indexer obj) {
        if (obj == null) {
            return null;
        }
        Indexer indexer = new Indexer();

        if (obj.getSchedule() != null) {
            IndexingSchedule _schedule = IndexingScheduleConverter.map(obj.getSchedule());
            indexer.setSchedule(_schedule);
        }

        String _skillsetName = obj.getSkillsetName();
        indexer.setSkillsetName(_skillsetName);

        String _name = obj.getName();
        indexer.setName(_name);

        String _description = obj.getDescription();
        indexer.setDescription(_description);

        String _eTag = obj.getETag();
        indexer.setETag(_eTag);

        String _targetIndexName = obj.getTargetIndexName();
        indexer.setTargetIndexName(_targetIndexName);

        if (obj.getFieldMappings() != null) {
            List<FieldMapping> _fieldMappings =
                    obj.getFieldMappings().stream().map(FieldMappingConverter::map).collect(Collectors.toList());
            indexer.setFieldMappings(_fieldMappings);
        }

        Boolean _isDisabled = obj.isDisabled();
        indexer.setIsDisabled(_isDisabled);

        if (obj.getParameters() != null) {
            IndexingParameters _parameters = IndexingParametersConverter.map(obj.getParameters());
            indexer.setParameters(_parameters);
        }

        String _dataSourceName = obj.getDataSourceName();
        indexer.setDataSourceName(_dataSourceName);

        if (obj.getOutputFieldMappings() != null) {
            List<FieldMapping> _outputFieldMappings =
                    obj.getOutputFieldMappings().stream().map(FieldMappingConverter::map).collect(Collectors.toList());
            indexer.setOutputFieldMappings(_outputFieldMappings);
        }
        return indexer;
    }

    /**
     * Maps from {@link Indexer} to {@link com.azure.search.documents.implementation.models.Indexer}.
     */
    public static com.azure.search.documents.implementation.models.Indexer map(Indexer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.Indexer indexer =
                new com.azure.search.documents.implementation.models.Indexer();

        if (obj.getSchedule() != null) {
            com.azure.search.documents.implementation.models.IndexingSchedule _schedule =
                    IndexingScheduleConverter.map(obj.getSchedule());
            indexer.setSchedule(_schedule);
        }

        String _skillsetName = obj.getSkillsetName();
        indexer.setSkillsetName(_skillsetName);

        String _name = obj.getName();
        indexer.setName(_name);

        String _description = obj.getDescription();
        indexer.setDescription(_description);

        String _eTag = obj.getETag();
        indexer.setETag(_eTag);

        String _targetIndexName = obj.getTargetIndexName();
        indexer.setTargetIndexName(_targetIndexName);

        if (obj.getFieldMappings() != null) {
            List<com.azure.search.documents.implementation.models.FieldMapping> _fieldMappings =
                    obj.getFieldMappings().stream().map(FieldMappingConverter::map).collect(Collectors.toList());
            indexer.setFieldMappings(_fieldMappings);
        }

        Boolean _isDisabled = obj.isDisabled();
        indexer.setIsDisabled(_isDisabled);

        if (obj.getParameters() != null) {
            com.azure.search.documents.implementation.models.IndexingParameters _parameters =
                    IndexingParametersConverter.map(obj.getParameters());
            indexer.setParameters(_parameters);
        }

        String _dataSourceName = obj.getDataSourceName();
        indexer.setDataSourceName(_dataSourceName);

        if (obj.getOutputFieldMappings() != null) {
            List<com.azure.search.documents.implementation.models.FieldMapping> _outputFieldMappings = obj.getOutputFieldMappings().stream().map(FieldMappingConverter::map).collect(Collectors.toList());
            indexer.setOutputFieldMappings(_outputFieldMappings);
        }
        return indexer;
    }
}
