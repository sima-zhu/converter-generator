package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.implementation.PrivateFieldAccessHelper;
import com.azure.search.documents.models.ScoringParameter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.ScoringParameter} and
 * {@link ScoringParameter}.
 */
public final class ScoringParameterConverter {
    private static final ClientLogger LOGGER = new ClientLogger(ScoringParameterConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.ScoringParameter} to {@link ScoringParameter}.
     */
    public static ScoringParameter map(com.azure.search.documents.implementation.models.ScoringParameter obj) {
        if (obj == null) {
            return null;
        }
        ScoringParameter scoringParameter = new ScoringParameter();

        if (obj.getValues() != null) {
            List<String> _values = obj.getValues().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(scoringParameter, "values", _values);
        }

        String _name = obj.getName();
        PrivateFieldAccessHelper.set(scoringParameter, "name", _name);
        return scoringParameter;
    }

    /**
     * Maps from {@link ScoringParameter} to {@link com.azure.search.documents.implementation.models.ScoringParameter}.
     */
    public static com.azure.search.documents.implementation.models.ScoringParameter map(ScoringParameter obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.ScoringParameter scoringParameter =
                new com.azure.search.documents.implementation.models.ScoringParameter();

        if (obj.getValues() != null) {
            List<String> _values = obj.getValues().stream().collect(Collectors.toList());
            PrivateFieldAccessHelper.set(scoringParameter, "values", _values);
        }

        String _name = obj.getName();
        PrivateFieldAccessHelper.set(scoringParameter, "name", _name);
        return scoringParameter;
    }
}
