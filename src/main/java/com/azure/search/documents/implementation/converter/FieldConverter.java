package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.AnalyzerName;
import com.azure.search.documents.models.DataType;
import com.azure.search.documents.models.Field;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Field} and {@link Field}.
 */
public final class FieldConverter {
    private static final ClientLogger LOGGER = new ClientLogger(FieldConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.Field} to {@link Field}.
     */
    public static Field map(com.azure.search.documents.implementation.models.Field obj) {
        if (obj == null) {
            return null;
        }
        Field field = new Field();

        Boolean _filterable = obj.isFilterable();
        field.setFilterable(_filterable);

        Boolean _hidden = obj.isHidden();
        field.setHidden(_hidden);

        Boolean _sortable = obj.isSortable();
        field.setSortable(_sortable);

        if (obj.getType() != null) {
            DataType _type = DataTypeConverter.map(obj.getType());
            field.setType(_type);
        }

        Boolean _retrievable = obj.getRetrievable();
        PrivateFieldAccessHelper.set(field, "retrievable", _retrievable);

        Boolean _searchable = obj.isSearchable();
        field.setSearchable(_searchable);

        if (obj.getAnalyzer() != null) {
            AnalyzerName _analyzer = AnalyzerNameConverter.map(obj.getAnalyzer());
            field.setAnalyzer(_analyzer);
        }

        if (obj.getSearchAnalyzer() != null) {
            AnalyzerName _searchAnalyzer = AnalyzerNameConverter.map(obj.getSearchAnalyzer());
            field.setSearchAnalyzer(_searchAnalyzer);
        }

        String _name = obj.getName();
        field.setName(_name);

        if (obj.getIndexAnalyzer() != null) {
            AnalyzerName _indexAnalyzer = AnalyzerNameConverter.map(obj.getIndexAnalyzer());
            field.setIndexAnalyzer(_indexAnalyzer);
        }

        Boolean _facetable = obj.isFacetable();
        field.setFacetable(_facetable);

        if (obj.getSynonymMaps() != null) {
            List<String> _synonymMaps = obj.getSynonymMaps().stream().collect(Collectors.toList());
            field.setSynonymMaps(_synonymMaps);
        }

        if (obj.getFields() != null) {
            List<Field> _fields = obj.getFields().stream().map(FieldConverter::map).collect(Collectors.toList());
            field.setFields(_fields);
        }

        Boolean _key = obj.isKey();
        field.setKey(_key);
        return field;
    }

    /**
     * Maps from {@link Field} to {@link com.azure.search.documents.implementation.models.Field}.
     */
    public static com.azure.search.documents.implementation.models.Field map(Field obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.Field field =
                new com.azure.search.documents.implementation.models.Field();

        Boolean _filterable = obj.isFilterable();
        field.setFilterable(_filterable);

        Boolean _hidden = obj.isHidden();
        field.setHidden(_hidden);

        Boolean _sortable = obj.isSortable();
        field.setSortable(_sortable);

        if (obj.getType() != null) {
            com.azure.search.documents.implementation.models.DataType _type = DataTypeConverter.map(obj.getType());
            field.setType(_type);
        }

        Boolean _retrievable = obj.getRetrievable();
        PrivateFieldAccessHelper.set(field, "retrievable", _retrievable);

        Boolean _searchable = obj.isSearchable();
        field.setSearchable(_searchable);

        if (obj.getAnalyzer() != null) {
            com.azure.search.documents.implementation.models.AnalyzerName _analyzer =
                    AnalyzerNameConverter.map(obj.getAnalyzer());
            field.setAnalyzer(_analyzer);
        }

        if (obj.getSearchAnalyzer() != null) {
            com.azure.search.documents.implementation.models.AnalyzerName _searchAnalyzer =
                    AnalyzerNameConverter.map(obj.getSearchAnalyzer());
            field.setSearchAnalyzer(_searchAnalyzer);
        }

        String _name = obj.getName();
        field.setName(_name);

        if (obj.getIndexAnalyzer() != null) {
            com.azure.search.documents.implementation.models.AnalyzerName _indexAnalyzer =
                    AnalyzerNameConverter.map(obj.getIndexAnalyzer());
            field.setIndexAnalyzer(_indexAnalyzer);
        }

        Boolean _facetable = obj.isFacetable();
        field.setFacetable(_facetable);

        if (obj.getSynonymMaps() != null) {
            List<String> _synonymMaps = obj.getSynonymMaps().stream().collect(Collectors.toList());
            field.setSynonymMaps(_synonymMaps);
        }

        if (obj.getFields() != null) {
            List<com.azure.search.documents.implementation.models.Field> _fields = obj.getFields().stream().map(FieldConverter::map).collect(Collectors.toList());
            field.setFields(_fields);
        }

        Boolean _key = obj.isKey();
        field.setKey(_key);
        return field;
    }
}
