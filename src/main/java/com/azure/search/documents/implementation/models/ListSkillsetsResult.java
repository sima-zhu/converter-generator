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
 * Response from a list Skillset request. If successful, it includes the full
 * definitions of all skillsets.
 */
@Fluent
public final class ListSkillsetsResult {
    /*
     * The skillsets defined in the Search service.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<Skillset> skillsets;

    /**
     * Get the skillsets property: The skillsets defined in the Search service.
     *
     * @return the skillsets value.
     */
    public List<Skillset> getSkillsets() {
        return this.skillsets;
    }
}
