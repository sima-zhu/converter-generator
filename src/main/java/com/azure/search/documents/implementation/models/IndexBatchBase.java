// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Contains a batch of document write actions to send to the index.
 */
@Fluent
public class IndexBatchBase<T> {
    /*
     * The actions in the batch.
     */
    @JsonProperty(value = "value", required = true)
    private List<IndexAction<T>> actions;

    /**
     * Get the actions property: The actions in the batch.
     *
     * @return the actions value.
     */
    public List<IndexAction<T>> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions in the batch.
     *
     * @param actions the actions value to set.
     * @return the IndexBatchBase object itself.
     */
    protected IndexBatchBase<T> setActions(List<IndexAction<T>> actions) {
        this.actions = actions;
        return this;
    }
}
