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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

/**
 * Tokenizer that uses regex pattern matching to construct distinct tokens.
 * This tokenizer is implemented using Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.PatternTokenizer")
@Fluent
public final class PatternTokenizer extends Tokenizer {
    /*
     * A regular expression pattern to match token separators. Default is an
     * expression that matches one or more whitespace characters.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /*
     * Regular expression flags.
     */
    @JsonProperty(value = "flags")
    private List<RegexFlags> flags;

    /*
     * The zero-based ordinal of the matching group in the regular expression
     * pattern to extract into tokens. Use -1 if you want to use the entire
     * pattern to split the input into tokens, irrespective of matching groups.
     * Default is -1.
     */
    @JsonProperty(value = "group")
    private Integer group;

    /**
     * Get the pattern property: A regular expression pattern to match token
     * separators. Default is an expression that matches one or more whitespace
     * characters.
     *
     * @return the pattern value.
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: A regular expression pattern to match token
     * separators. Default is an expression that matches one or more whitespace
     * characters.
     *
     * @param pattern the pattern value to set.
     * @return the PatternTokenizer object itself.
     */
    public PatternTokenizer setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the flags property: Regular expression flags.
     *
     * @return the flags value.
     */
    public List<RegexFlags> getFlags() {
        return this.flags;
    }

    /**
     * Set the flags property: Regular expression flags.
     *
     * @param flags the flags value to set.
     * @return the PatternTokenizer object itself.
     */
    public PatternTokenizer setFlags(List<RegexFlags> flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the group property: The zero-based ordinal of the matching group in
     * the regular expression pattern to extract into tokens. Use -1 if you
     * want to use the entire pattern to split the input into tokens,
     * irrespective of matching groups. Default is -1.
     *
     * @return the group value.
     */
    public Integer getGroup() {
        return this.group;
    }

    /**
     * Set the group property: The zero-based ordinal of the matching group in
     * the regular expression pattern to extract into tokens. Use -1 if you
     * want to use the entire pattern to split the input into tokens,
     * irrespective of matching groups. Default is -1.
     *
     * @param group the group value to set.
     * @return the PatternTokenizer object itself.
     */
    public PatternTokenizer setGroup(Integer group) {
        this.group = group;
        return this;
    }
}