// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package backup;

import com.azure.search.documents.models.DataType;
import com.azure.search.documents.models.Field;
import com.azure.search.documents.models.Index;

/**
 * A helper Field model to build a simple {@link Field}.
 */
public class SimpleField extends FieldBase {
    private boolean key;
    private boolean facetable;
    private boolean sortable;
    private boolean filterable;
    private boolean hidden;

    /**
     * Initializes a new instance of the {@link SimpleField} class.
     *
     * @param name The name of the field, which must be unique within the index or parent field.
     * @param dataType The {@link DataType} of the {@link Field}.
     * @param collection boolean field to indicate whether the dataType is collection.
     * @throws NullPointerException when {@code name} is null.
     */
    public SimpleField(String name, DataType dataType, boolean collection) {
        super(name, collection ? DataType.collection(dataType) : dataType);
    }

    /**
     * Gets whether the field is the key field.
     *
     * @return An {@link Index} must have exactly one key field of type {@code DataType.EDM_STRING}.
     */
    public boolean isKey() {
        return key;
    }

    /**
     * Sets whether the field is the key field. The default is false.
     *
     * @param key boolean to indicate whether the field is key field or not.
     * @return The SimpleField object itself.
     */
    public SimpleField setKey(boolean key) {
        this.key = key;
        return this;
    }

    /**
     * Gets a value indicating whether to enable the field can be referenced in {@code $orderby} expressions.
     * By default Azure Cognitive Search sorts results by score, but in many experiences users may want to sort by
     * fields in the documents.
     *
     * @return The boolean to indicate whether the field is sortable or not.
     */
    public boolean isSortable() {
        return sortable;
    }

    /**
     * Sets a value indicating whether to enable the field can be referenced in {@code $orderby} expressions.
     * The default is false.
     * By default Azure Cognitive Search sorts results by score, but in many experiences users may want to sort by
     * fields in the documents.
     *
     * @param sortable The boolean to indicate whether the field is sortable or not.
     * @return The SimpleField object itself.
     */
    public SimpleField setSortable(boolean sortable) {
        this.sortable = sortable;
        return this;
    }

    /**
     * Gets or sets a value indicating whether the field can be referenced in {@code $filter} queries.
     *
     * @return The boolean to indicate whether the field is filterable or not.
     */
    public boolean isFilterable() {
        return filterable;
    }

    /**
     * Gets or sets a value indicating whether the field can be referenced in {@code $filter} queries. The default is false.
     * @param filterable The boolean to indicate whether the field is filterable or not.
     * @return The SimpleField object itself.
     */
    public SimpleField setFilterable(boolean filterable) {
        this.filterable = filterable;
        return this;
    }

    /**
     * Gets whether the field is returned in search results.
     *
     * @return The boolean to indicate whether the field is hidden or not.
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets whether the field is returned in search results. The default is false.
     * A key field where {@code key} is true must have this property set to false.
     *
     * @param hidden The boolean to indicate whether the field is hidden or not.
     * @return The SimpleField object itself.
     */
    public SimpleField setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    /**
     * Gets a value indicating whether the field can be retrieved in facet queries.
     * Facets are used in presentation of search results that include hit counts by categories.
     * For example, in a search for digital cameras, facets might include branch, megapixels, price, etc.
     *
     * @return The boolean to indicate whether the field is facetable or not.
     */
    public boolean isFacetable() {
        return facetable;
    }

    /**
     * Sets a value indicating whether the field can be retrieved in facet queries. The default is false.
     * Facets are used in presentation of search results that include hit counts by categories.
     * For example, in a search for digital cameras, facets might include branch, megapixels, price, etc.
     *
     * @param facetable The boolean to indicate whether the field is facetable or not.
     * @return The SimpleField object itself.
     */
    public SimpleField setFacetable(boolean facetable) {
        this.facetable = facetable;
        return this;
    }

    /**
     * Convert SimpleField to {@link Field}.
     *
     * @return The {@link Field} object.
     */
    public Field build() {
        return new Field().setName(super.getName())
            .setType(super.getDataType())
            .setKey(key)
            .setSearchable(false)
            .setSortable(sortable)
            .setFilterable(filterable)
            .setHidden(hidden)
            .setFacetable(facetable)
            .setHidden(hidden);
    }
}
