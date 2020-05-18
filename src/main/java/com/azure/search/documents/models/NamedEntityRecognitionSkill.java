// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

/**
 * Text analytics named entity recognition. This skill is deprecated in favor
 * of EntityRecognitionSkill.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Skills.Text.NamedEntityRecognitionSkill")
@Fluent
public final class NamedEntityRecognitionSkill extends Skill {
    /*
     * A list of named entity categories.
     */
    @JsonProperty(value = "categories")
    private List<String> categories;

    /*
     * A value indicating which language code to use. Default is en. Possible
     * values include: 'ar', 'cs', 'da', 'de', 'en', 'es', 'fi', 'fr', 'he',
     * 'hu', 'it', 'ko', 'pt-br', 'pt'
     */
    @JsonProperty(value = "defaultLanguageCode")
    private NamedEntityRecognitionSkillLanguage defaultLanguageCode;

    /*
     * A value between 0 and 1 to indicate the confidence of the results.
     */
    @JsonProperty(value = "minimumPrecision")
    private Double minimumPrecision;

    /**
     * Get the categories property: A list of named entity categories.
     *
     * @return the categories value.
     */
    public List<String> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: A list of named entity categories.
     *
     * @param categories the categories value to set.
     * @return the NamedEntityRecognitionSkill object itself.
     */
    public NamedEntityRecognitionSkill setCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the defaultLanguageCode property: A value indicating which language
     * code to use. Default is en. Possible values include: 'ar', 'cs', 'da',
     * 'de', 'en', 'es', 'fi', 'fr', 'he', 'hu', 'it', 'ko', 'pt-br', 'pt'.
     *
     * @return the defaultLanguageCode value.
     */
    public NamedEntityRecognitionSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language
     * code to use. Default is en. Possible values include: 'ar', 'cs', 'da',
     * 'de', 'en', 'es', 'fi', 'fr', 'he', 'hu', 'it', 'ko', 'pt-br', 'pt'.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the NamedEntityRecognitionSkill object itself.
     */
    public NamedEntityRecognitionSkill setDefaultLanguageCode(NamedEntityRecognitionSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the minimumPrecision property: A value between 0 and 1 to indicate
     * the confidence of the results.
     *
     * @return the minimumPrecision value.
     */
    public Double getMinimumPrecision() {
        return this.minimumPrecision;
    }

    /**
     * Set the minimumPrecision property: A value between 0 and 1 to indicate
     * the confidence of the results.
     *
     * @param minimumPrecision the minimumPrecision value to set.
     * @return the NamedEntityRecognitionSkill object itself.
     */
    public NamedEntityRecognitionSkill setMinimumPrecision(Double minimumPrecision) {
        this.minimumPrecision = minimumPrecision;
        return this;
    }
}
