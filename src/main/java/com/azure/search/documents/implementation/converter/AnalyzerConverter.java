package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.models.CustomAnalyzer;
import com.azure.search.documents.implementation.models.PatternAnalyzer;
import com.azure.search.documents.implementation.models.StandardAnalyzer;
import com.azure.search.documents.implementation.models.StopAnalyzer;
import com.azure.search.documents.models.Analyzer;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Analyzer} and {@link Analyzer}.
 */
public final class AnalyzerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(AnalyzerConverter.class);

    /**
     * Maps abstract class from {@link com.azure.search.documents.implementation.models.Analyzer} to {@link Analyzer}
     * .Dedicate works to sub class converter.
     */
    public static Analyzer map(com.azure.search.documents.implementation.models.Analyzer obj) {
        if (obj instanceof StandardAnalyzer) {
            return StandardAnalyzerConverter.map((StandardAnalyzer) obj);
        }
        if (obj instanceof StopAnalyzer) {
            return StopAnalyzerConverter.map((StopAnalyzer) obj);
        }
        if (obj instanceof CustomAnalyzer) {
            return CustomAnalyzerConverter.map((CustomAnalyzer) obj);
        }
        if (obj instanceof PatternAnalyzer) {
            return PatternAnalyzerConverter.map((PatternAnalyzer) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }

    /**
     * Maps abstract class from {@link Analyzer} to {@link com.azure.search.documents.implementation.models.Analyzer}
     * .Dedicate works to sub class converter.
     */
    public static com.azure.search.documents.implementation.models.Analyzer map(Analyzer obj) {
        if (obj instanceof com.azure.search.documents.models.StandardAnalyzer) {
            return StandardAnalyzerConverter.map((com.azure.search.documents.models.StandardAnalyzer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.StopAnalyzer) {
            return StopAnalyzerConverter.map((com.azure.search.documents.models.StopAnalyzer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.CustomAnalyzer) {
            return CustomAnalyzerConverter.map((com.azure.search.documents.models.CustomAnalyzer) obj);
        }
        if (obj instanceof com.azure.search.documents.models.PatternAnalyzer) {
            return PatternAnalyzerConverter.map((com.azure.search.documents.models.PatternAnalyzer) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }
}
