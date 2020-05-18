// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A skill to split a string into chunks of text.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Skills.Text.SplitSkill")
@Fluent
public final class SplitSkill extends Skill {
    /*
     * A value indicating which language code to use. Default is en. Possible
     * values include: 'da', 'de', 'en', 'es', 'fi', 'fr', 'it', 'ko', 'pt'
     */
    @JsonProperty(value = "defaultLanguageCode")
    private SplitSkillLanguage defaultLanguageCode;

    /*
     * A value indicating which split mode to perform. Possible values include:
     * 'pages', 'sentences'
     */
    @JsonProperty(value = "textSplitMode")
    private TextSplitMode textSplitMode;

    /*
     * The desired maximum page length. Default is 10000.
     */
    @JsonProperty(value = "maximumPageLength")
    private Integer maximumPageLength;

    /**
     * Get the defaultLanguageCode property: A value indicating which language
     * code to use. Default is en. Possible values include: 'da', 'de', 'en',
     * 'es', 'fi', 'fr', 'it', 'ko', 'pt'.
     *
     * @return the defaultLanguageCode value.
     */
    public SplitSkillLanguage getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * Set the defaultLanguageCode property: A value indicating which language
     * code to use. Default is en. Possible values include: 'da', 'de', 'en',
     * 'es', 'fi', 'fr', 'it', 'ko', 'pt'.
     *
     * @param defaultLanguageCode the defaultLanguageCode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setDefaultLanguageCode(SplitSkillLanguage defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
        return this;
    }

    /**
     * Get the textSplitMode property: A value indicating which split mode to
     * perform. Possible values include: 'pages', 'sentences'.
     *
     * @return the textSplitMode value.
     */
    public TextSplitMode getTextSplitMode() {
        return this.textSplitMode;
    }

    /**
     * Set the textSplitMode property: A value indicating which split mode to
     * perform. Possible values include: 'pages', 'sentences'.
     *
     * @param textSplitMode the textSplitMode value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setTextSplitMode(TextSplitMode textSplitMode) {
        this.textSplitMode = textSplitMode;
        return this;
    }

    /**
     * Get the maximumPageLength property: The desired maximum page length.
     * Default is 10000.
     *
     * @return the maximumPageLength value.
     */
    public Integer getMaximumPageLength() {
        return this.maximumPageLength;
    }

    /**
     * Set the maximumPageLength property: The desired maximum page length.
     * Default is 10000.
     *
     * @param maximumPageLength the maximumPageLength value to set.
     * @return the SplitSkill object itself.
     */
    public SplitSkill setMaximumPageLength(Integer maximumPageLength) {
        this.maximumPageLength = maximumPageLength;
        return this;
    }
}