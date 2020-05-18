// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/**
 * Defines values for AnalyzerName.
 */
public final class AnalyzerName extends ExpandableStringEnum<AnalyzerName> {
    /**
     * Static value ar.microsoft for AnalyzerName.
     */
    public static final AnalyzerName AR_MICROSOFT = fromString("ar.microsoft");

    /**
     * Static value ar.lucene for AnalyzerName.
     */
    public static final AnalyzerName AR_LUCENE = fromString("ar.lucene");

    /**
     * Static value hy.lucene for AnalyzerName.
     */
    public static final AnalyzerName HY_LUCENE = fromString("hy.lucene");

    /**
     * Static value bn.microsoft for AnalyzerName.
     */
    public static final AnalyzerName BN_MICROSOFT = fromString("bn.microsoft");

    /**
     * Static value eu.lucene for AnalyzerName.
     */
    public static final AnalyzerName EU_LUCENE = fromString("eu.lucene");

    /**
     * Static value bg.microsoft for AnalyzerName.
     */
    public static final AnalyzerName BG_MICROSOFT = fromString("bg.microsoft");

    /**
     * Static value bg.lucene for AnalyzerName.
     */
    public static final AnalyzerName BG_LUCENE = fromString("bg.lucene");

    /**
     * Static value ca.microsoft for AnalyzerName.
     */
    public static final AnalyzerName CA_MICROSOFT = fromString("ca.microsoft");

    /**
     * Static value ca.lucene for AnalyzerName.
     */
    public static final AnalyzerName CA_LUCENE = fromString("ca.lucene");

    /**
     * Static value zh-Hans.microsoft for AnalyzerName.
     */
    public static final AnalyzerName ZH_HANS_MICROSOFT = fromString("zh-Hans.microsoft");

    /**
     * Static value zh-Hans.lucene for AnalyzerName.
     */
    public static final AnalyzerName ZH_HANS_LUCENE = fromString("zh-Hans.lucene");

    /**
     * Static value zh-Hant.microsoft for AnalyzerName.
     */
    public static final AnalyzerName ZH_HANT_MICROSOFT = fromString("zh-Hant.microsoft");

    /**
     * Static value zh-Hant.lucene for AnalyzerName.
     */
    public static final AnalyzerName ZH_HANT_LUCENE = fromString("zh-Hant.lucene");

    /**
     * Static value hr.microsoft for AnalyzerName.
     */
    public static final AnalyzerName HR_MICROSOFT = fromString("hr.microsoft");

    /**
     * Static value cs.microsoft for AnalyzerName.
     */
    public static final AnalyzerName CS_MICROSOFT = fromString("cs.microsoft");

    /**
     * Static value cs.lucene for AnalyzerName.
     */
    public static final AnalyzerName CS_LUCENE = fromString("cs.lucene");

    /**
     * Static value da.microsoft for AnalyzerName.
     */
    public static final AnalyzerName DA_MICROSOFT = fromString("da.microsoft");

    /**
     * Static value da.lucene for AnalyzerName.
     */
    public static final AnalyzerName DA_LUCENE = fromString("da.lucene");

    /**
     * Static value nl.microsoft for AnalyzerName.
     */
    public static final AnalyzerName NL_MICROSOFT = fromString("nl.microsoft");

    /**
     * Static value nl.lucene for AnalyzerName.
     */
    public static final AnalyzerName NL_LUCENE = fromString("nl.lucene");

    /**
     * Static value en.microsoft for AnalyzerName.
     */
    public static final AnalyzerName EN_MICROSOFT = fromString("en.microsoft");

    /**
     * Static value en.lucene for AnalyzerName.
     */
    public static final AnalyzerName EN_LUCENE = fromString("en.lucene");

    /**
     * Static value et.microsoft for AnalyzerName.
     */
    public static final AnalyzerName ET_MICROSOFT = fromString("et.microsoft");

    /**
     * Static value fi.microsoft for AnalyzerName.
     */
    public static final AnalyzerName FI_MICROSOFT = fromString("fi.microsoft");

    /**
     * Static value fi.lucene for AnalyzerName.
     */
    public static final AnalyzerName FI_LUCENE = fromString("fi.lucene");

    /**
     * Static value fr.microsoft for AnalyzerName.
     */
    public static final AnalyzerName FR_MICROSOFT = fromString("fr.microsoft");

    /**
     * Static value fr.lucene for AnalyzerName.
     */
    public static final AnalyzerName FR_LUCENE = fromString("fr.lucene");

    /**
     * Static value gl.lucene for AnalyzerName.
     */
    public static final AnalyzerName GL_LUCENE = fromString("gl.lucene");

    /**
     * Static value de.microsoft for AnalyzerName.
     */
    public static final AnalyzerName DE_MICROSOFT = fromString("de.microsoft");

    /**
     * Static value de.lucene for AnalyzerName.
     */
    public static final AnalyzerName DE_LUCENE = fromString("de.lucene");

    /**
     * Static value el.microsoft for AnalyzerName.
     */
    public static final AnalyzerName EL_MICROSOFT = fromString("el.microsoft");

    /**
     * Static value el.lucene for AnalyzerName.
     */
    public static final AnalyzerName EL_LUCENE = fromString("el.lucene");

    /**
     * Static value gu.microsoft for AnalyzerName.
     */
    public static final AnalyzerName GU_MICROSOFT = fromString("gu.microsoft");

    /**
     * Static value he.microsoft for AnalyzerName.
     */
    public static final AnalyzerName HE_MICROSOFT = fromString("he.microsoft");

    /**
     * Static value hi.microsoft for AnalyzerName.
     */
    public static final AnalyzerName HI_MICROSOFT = fromString("hi.microsoft");

    /**
     * Static value hi.lucene for AnalyzerName.
     */
    public static final AnalyzerName HI_LUCENE = fromString("hi.lucene");

    /**
     * Static value hu.microsoft for AnalyzerName.
     */
    public static final AnalyzerName HU_MICROSOFT = fromString("hu.microsoft");

    /**
     * Static value hu.lucene for AnalyzerName.
     */
    public static final AnalyzerName HU_LUCENE = fromString("hu.lucene");

    /**
     * Static value is.microsoft for AnalyzerName.
     */
    public static final AnalyzerName IS_MICROSOFT = fromString("is.microsoft");

    /**
     * Static value id.microsoft for AnalyzerName.
     */
    public static final AnalyzerName ID_MICROSOFT = fromString("id.microsoft");

    /**
     * Static value id.lucene for AnalyzerName.
     */
    public static final AnalyzerName ID_LUCENE = fromString("id.lucene");

    /**
     * Static value ga.lucene for AnalyzerName.
     */
    public static final AnalyzerName GA_LUCENE = fromString("ga.lucene");

    /**
     * Static value it.microsoft for AnalyzerName.
     */
    public static final AnalyzerName IT_MICROSOFT = fromString("it.microsoft");

    /**
     * Static value it.lucene for AnalyzerName.
     */
    public static final AnalyzerName IT_LUCENE = fromString("it.lucene");

    /**
     * Static value ja.microsoft for AnalyzerName.
     */
    public static final AnalyzerName JA_MICROSOFT = fromString("ja.microsoft");

    /**
     * Static value ja.lucene for AnalyzerName.
     */
    public static final AnalyzerName JA_LUCENE = fromString("ja.lucene");

    /**
     * Static value kn.microsoft for AnalyzerName.
     */
    public static final AnalyzerName KN_MICROSOFT = fromString("kn.microsoft");

    /**
     * Static value ko.microsoft for AnalyzerName.
     */
    public static final AnalyzerName KO_MICROSOFT = fromString("ko.microsoft");

    /**
     * Static value ko.lucene for AnalyzerName.
     */
    public static final AnalyzerName KO_LUCENE = fromString("ko.lucene");

    /**
     * Static value lv.microsoft for AnalyzerName.
     */
    public static final AnalyzerName LV_MICROSOFT = fromString("lv.microsoft");

    /**
     * Static value lv.lucene for AnalyzerName.
     */
    public static final AnalyzerName LV_LUCENE = fromString("lv.lucene");

    /**
     * Static value lt.microsoft for AnalyzerName.
     */
    public static final AnalyzerName LT_MICROSOFT = fromString("lt.microsoft");

    /**
     * Static value ml.microsoft for AnalyzerName.
     */
    public static final AnalyzerName ML_MICROSOFT = fromString("ml.microsoft");

    /**
     * Static value ms.microsoft for AnalyzerName.
     */
    public static final AnalyzerName MS_MICROSOFT = fromString("ms.microsoft");

    /**
     * Static value mr.microsoft for AnalyzerName.
     */
    public static final AnalyzerName MR_MICROSOFT = fromString("mr.microsoft");

    /**
     * Static value nb.microsoft for AnalyzerName.
     */
    public static final AnalyzerName NB_MICROSOFT = fromString("nb.microsoft");

    /**
     * Static value no.lucene for AnalyzerName.
     */
    public static final AnalyzerName NO_LUCENE = fromString("no.lucene");

    /**
     * Static value fa.lucene for AnalyzerName.
     */
    public static final AnalyzerName FA_LUCENE = fromString("fa.lucene");

    /**
     * Static value pl.microsoft for AnalyzerName.
     */
    public static final AnalyzerName PL_MICROSOFT = fromString("pl.microsoft");

    /**
     * Static value pl.lucene for AnalyzerName.
     */
    public static final AnalyzerName PL_LUCENE = fromString("pl.lucene");

    /**
     * Static value pt-BR.microsoft for AnalyzerName.
     */
    public static final AnalyzerName PT_BR_MICROSOFT = fromString("pt-BR.microsoft");

    /**
     * Static value pt-BR.lucene for AnalyzerName.
     */
    public static final AnalyzerName PT_BR_LUCENE = fromString("pt-BR.lucene");

    /**
     * Static value pt-PT.microsoft for AnalyzerName.
     */
    public static final AnalyzerName PT_PT_MICROSOFT = fromString("pt-PT.microsoft");

    /**
     * Static value pt-PT.lucene for AnalyzerName.
     */
    public static final AnalyzerName PT_PT_LUCENE = fromString("pt-PT.lucene");

    /**
     * Static value pa.microsoft for AnalyzerName.
     */
    public static final AnalyzerName PA_MICROSOFT = fromString("pa.microsoft");

    /**
     * Static value ro.microsoft for AnalyzerName.
     */
    public static final AnalyzerName RO_MICROSOFT = fromString("ro.microsoft");

    /**
     * Static value ro.lucene for AnalyzerName.
     */
    public static final AnalyzerName RO_LUCENE = fromString("ro.lucene");

    /**
     * Static value ru.microsoft for AnalyzerName.
     */
    public static final AnalyzerName RU_MICROSOFT = fromString("ru.microsoft");

    /**
     * Static value ru.lucene for AnalyzerName.
     */
    public static final AnalyzerName RU_LUCENE = fromString("ru.lucene");

    /**
     * Static value sr-cyrillic.microsoft for AnalyzerName.
     */
    public static final AnalyzerName SR_CYRILLIC_MICROSOFT = fromString("sr-cyrillic.microsoft");

    /**
     * Static value sr-latin.microsoft for AnalyzerName.
     */
    public static final AnalyzerName SR_LATIN_MICROSOFT = fromString("sr-latin.microsoft");

    /**
     * Static value sk.microsoft for AnalyzerName.
     */
    public static final AnalyzerName SK_MICROSOFT = fromString("sk.microsoft");

    /**
     * Static value sl.microsoft for AnalyzerName.
     */
    public static final AnalyzerName SL_MICROSOFT = fromString("sl.microsoft");

    /**
     * Static value es.microsoft for AnalyzerName.
     */
    public static final AnalyzerName ES_MICROSOFT = fromString("es.microsoft");

    /**
     * Static value es.lucene for AnalyzerName.
     */
    public static final AnalyzerName ES_LUCENE = fromString("es.lucene");

    /**
     * Static value sv.microsoft for AnalyzerName.
     */
    public static final AnalyzerName SV_MICROSOFT = fromString("sv.microsoft");

    /**
     * Static value sv.lucene for AnalyzerName.
     */
    public static final AnalyzerName SV_LUCENE = fromString("sv.lucene");

    /**
     * Static value ta.microsoft for AnalyzerName.
     */
    public static final AnalyzerName TA_MICROSOFT = fromString("ta.microsoft");

    /**
     * Static value te.microsoft for AnalyzerName.
     */
    public static final AnalyzerName TE_MICROSOFT = fromString("te.microsoft");

    /**
     * Static value th.microsoft for AnalyzerName.
     */
    public static final AnalyzerName TH_MICROSOFT = fromString("th.microsoft");

    /**
     * Static value th.lucene for AnalyzerName.
     */
    public static final AnalyzerName TH_LUCENE = fromString("th.lucene");

    /**
     * Static value tr.microsoft for AnalyzerName.
     */
    public static final AnalyzerName TR_MICROSOFT = fromString("tr.microsoft");

    /**
     * Static value tr.lucene for AnalyzerName.
     */
    public static final AnalyzerName TR_LUCENE = fromString("tr.lucene");

    /**
     * Static value uk.microsoft for AnalyzerName.
     */
    public static final AnalyzerName UK_MICROSOFT = fromString("uk.microsoft");

    /**
     * Static value ur.microsoft for AnalyzerName.
     */
    public static final AnalyzerName UR_MICROSOFT = fromString("ur.microsoft");

    /**
     * Static value vi.microsoft for AnalyzerName.
     */
    public static final AnalyzerName VI_MICROSOFT = fromString("vi.microsoft");

    /**
     * Static value standard.lucene for AnalyzerName.
     */
    public static final AnalyzerName STANDARD_LUCENE = fromString("standard.lucene");

    /**
     * Static value standardasciifolding.lucene for AnalyzerName.
     */
    public static final AnalyzerName STANDARD_ASCII_FOLDING_LUCENE = fromString("standardasciifolding.lucene");

    /**
     * Static value keyword for AnalyzerName.
     */
    public static final AnalyzerName KEYWORD = fromString("keyword");

    /**
     * Static value pattern for AnalyzerName.
     */
    public static final AnalyzerName PATTERN = fromString("pattern");

    /**
     * Static value simple for AnalyzerName.
     */
    public static final AnalyzerName SIMPLE = fromString("simple");

    /**
     * Static value stop for AnalyzerName.
     */
    public static final AnalyzerName STOP = fromString("stop");

    /**
     * Static value whitespace for AnalyzerName.
     */
    public static final AnalyzerName WHITESPACE = fromString("whitespace");

    /**
     * Creates or finds a AnalyzerName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnalyzerName.
     */
    @JsonCreator
    public static AnalyzerName fromString(String name) {
        return fromString(name, AnalyzerName.class);
    }

    /**
     * @return known AnalyzerName values.
     */
    public static Collection<AnalyzerName> values() {
        return values(AnalyzerName.class);
    }
}
