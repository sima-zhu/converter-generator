package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.models.CognitiveServicesAccountKey;
import com.azure.search.documents.implementation.models.DefaultCognitiveServicesAccount;
import com.azure.search.documents.models.CognitiveServicesAccount;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.CognitiveServicesAccount} and
 * {@link CognitiveServicesAccount}.
 */
public final class CognitiveServicesAccountConverter {
    private static final ClientLogger LOGGER = new ClientLogger(CognitiveServicesAccountConverter.class);

    /**
     * Maps abstract class from {@link com.azure.search.documents.implementation.models.CognitiveServicesAccount} to
     * {@link CognitiveServicesAccount}.Dedicate works to sub class converter.
     */
    public static CognitiveServicesAccount map(com.azure.search.documents.implementation.models.CognitiveServicesAccount obj) {
        if (obj instanceof DefaultCognitiveServicesAccount) {
            return DefaultCognitiveServicesAccountConverter.map((DefaultCognitiveServicesAccount) obj);
        }
        if (obj instanceof CognitiveServicesAccountKey) {
            return CognitiveServicesAccountKeyConverter.map((CognitiveServicesAccountKey) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }

    /**
     * Maps abstract class from {@link CognitiveServicesAccount} to
     * {@link com.azure.search.documents.implementation.models.CognitiveServicesAccount}.Dedicate works to sub class
     * converter.
     */
    public static com.azure.search.documents.implementation.models.CognitiveServicesAccount map(CognitiveServicesAccount obj) {
        if (obj instanceof com.azure.search.documents.models.CognitiveServicesAccountKey) {
            return CognitiveServicesAccountKeyConverter.map((com.azure.search.documents.models.CognitiveServicesAccountKey) obj);
        }
        if (obj instanceof com.azure.search.documents.models.DefaultCognitiveServicesAccount) {
            return DefaultCognitiveServicesAccountConverter.map((com.azure.search.documents.models.DefaultCognitiveServicesAccount) obj);
        }
        throw LOGGER.logExceptionAsError(new RuntimeException("Should not be there!"));
    }
}
