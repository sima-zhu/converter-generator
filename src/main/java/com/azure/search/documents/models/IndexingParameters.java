// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Represents parameters for indexer execution.
 */
@Fluent
public final class IndexingParameters {
    /*
     * The number of items that are read from the data source and indexed as a
     * single batch in order to improve performance. The default depends on the
     * data source type.
     */
    @JsonProperty(value = "batchSize")
    private Integer batchSize;

    /*
     * The maximum number of items that can fail indexing for indexer execution
     * to still be considered successful. -1 means no limit. Default is 0.
     */
    @JsonProperty(value = "maxFailedItems")
    private Integer maxFailedItems;

    /*
     * The maximum number of items in a single batch that can fail indexing for
     * the batch to still be considered successful. -1 means no limit. Default
     * is 0.
     */
    @JsonProperty(value = "maxFailedItemsPerBatch")
    private Integer maxFailedItemsPerBatch;

    /*
     * A dictionary of indexer-specific configuration properties. Each name is
     * the name of a specific property. Each value must be of a primitive type.
     */
    @JsonProperty(value = "configuration")
    private Map<String, Object> configuration;

    /**
     * Get the batchSize property: The number of items that are read from the
     * data source and indexed as a single batch in order to improve
     * performance. The default depends on the data source type.
     *
     * @return the batchSize value.
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: The number of items that are read from the
     * data source and indexed as a single batch in order to improve
     * performance. The default depends on the data source type.
     *
     * @param batchSize the batchSize value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the maxFailedItems property: The maximum number of items that can
     * fail indexing for indexer execution to still be considered successful.
     * -1 means no limit. Default is 0.
     *
     * @return the maxFailedItems value.
     */
    public Integer getMaxFailedItems() {
        return this.maxFailedItems;
    }

    /**
     * Set the maxFailedItems property: The maximum number of items that can
     * fail indexing for indexer execution to still be considered successful.
     * -1 means no limit. Default is 0.
     *
     * @param maxFailedItems the maxFailedItems value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setMaxFailedItems(Integer maxFailedItems) {
        this.maxFailedItems = maxFailedItems;
        return this;
    }

    /**
     * Get the maxFailedItemsPerBatch property: The maximum number of items in
     * a single batch that can fail indexing for the batch to still be
     * considered successful. -1 means no limit. Default is 0.
     *
     * @return the maxFailedItemsPerBatch value.
     */
    public Integer getMaxFailedItemsPerBatch() {
        return this.maxFailedItemsPerBatch;
    }

    /**
     * Set the maxFailedItemsPerBatch property: The maximum number of items in
     * a single batch that can fail indexing for the batch to still be
     * considered successful. -1 means no limit. Default is 0.
     *
     * @param maxFailedItemsPerBatch the maxFailedItemsPerBatch value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setMaxFailedItemsPerBatch(Integer maxFailedItemsPerBatch) {
        this.maxFailedItemsPerBatch = maxFailedItemsPerBatch;
        return this;
    }

    /**
     * Get the configuration property: A dictionary of indexer-specific
     * configuration properties. Each name is the name of a specific property.
     * Each value must be of a primitive type.
     *
     * @return the configuration value.
     */
    public Map<String, Object> getConfiguration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: A dictionary of indexer-specific
     * configuration properties. Each name is the name of a specific property.
     * Each value must be of a primitive type.
     *
     * @param configuration the configuration value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setConfiguration(Map<String, Object> configuration) {
        this.configuration = configuration;
        return this;
    }
}