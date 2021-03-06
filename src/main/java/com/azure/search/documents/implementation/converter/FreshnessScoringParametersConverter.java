package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.FreshnessScoringParameters;

import java.time.Duration;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.FreshnessScoringParameters} and
 * {@link FreshnessScoringParameters}.
 */
public final class FreshnessScoringParametersConverter {
    private static final ClientLogger LOGGER = new ClientLogger(FreshnessScoringParametersConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.FreshnessScoringParameters} to
     * {@link FreshnessScoringParameters}.
     */
    public static FreshnessScoringParameters map(com.azure.search.documents.implementation.models.FreshnessScoringParameters obj) {
        if (obj == null) {
            return null;
        }
        FreshnessScoringParameters freshnessScoringParameters = new FreshnessScoringParameters();

        Duration _boostingDuration = obj.getBoostingDuration();
        freshnessScoringParameters.setBoostingDuration(_boostingDuration);
        return freshnessScoringParameters;
    }

    /**
     * Maps from {@link FreshnessScoringParameters} to
     * {@link com.azure.search.documents.implementation.models.FreshnessScoringParameters}.
     */
    public static com.azure.search.documents.implementation.models.FreshnessScoringParameters map(FreshnessScoringParameters obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.FreshnessScoringParameters freshnessScoringParameters =
                new com.azure.search.documents.implementation.models.FreshnessScoringParameters();

        Duration _boostingDuration = obj.getBoostingDuration();
        freshnessScoringParameters.setBoostingDuration(_boostingDuration);
        return freshnessScoringParameters;
    }
}
