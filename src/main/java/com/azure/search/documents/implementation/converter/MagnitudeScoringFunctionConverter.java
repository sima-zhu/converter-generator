package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.MagnitudeScoringFunction;
import com.azure.search.documents.models.MagnitudeScoringParameters;
import com.azure.search.documents.models.ScoringFunctionInterpolation;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.MagnitudeScoringFunction} and
 * {@link MagnitudeScoringFunction}.
 */
public final class MagnitudeScoringFunctionConverter {
    private static final ClientLogger LOGGER = new ClientLogger(MagnitudeScoringFunctionConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.MagnitudeScoringFunction} to
     * {@link MagnitudeScoringFunction}.
     */
    public static MagnitudeScoringFunction map(com.azure.search.documents.implementation.models.MagnitudeScoringFunction obj) {
        if (obj == null) {
            return null;
        }
        MagnitudeScoringFunction magnitudeScoringFunction = new MagnitudeScoringFunction();

        if (obj.getInterpolation() != null) {
            ScoringFunctionInterpolation _interpolation =
                    ScoringFunctionInterpolationConverter.map(obj.getInterpolation());
            magnitudeScoringFunction.setInterpolation(_interpolation);
        }

        String _fieldName = obj.getFieldName();
        magnitudeScoringFunction.setFieldName(_fieldName);

        double _boost = obj.getBoost();
        magnitudeScoringFunction.setBoost(_boost);

        if (obj.getParameters() != null) {
            MagnitudeScoringParameters _parameters = MagnitudeScoringParametersConverter.map(obj.getParameters());
            magnitudeScoringFunction.setParameters(_parameters);
        }
        return magnitudeScoringFunction;
    }

    /**
     * Maps from {@link MagnitudeScoringFunction} to
     * {@link com.azure.search.documents.implementation.models.MagnitudeScoringFunction}.
     */
    public static com.azure.search.documents.implementation.models.MagnitudeScoringFunction map(MagnitudeScoringFunction obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.MagnitudeScoringFunction magnitudeScoringFunction =
                new com.azure.search.documents.implementation.models.MagnitudeScoringFunction();

        if (obj.getInterpolation() != null) {
            com.azure.search.documents.implementation.models.ScoringFunctionInterpolation _interpolation =
                    ScoringFunctionInterpolationConverter.map(obj.getInterpolation());
            magnitudeScoringFunction.setInterpolation(_interpolation);
        }

        String _fieldName = obj.getFieldName();
        magnitudeScoringFunction.setFieldName(_fieldName);

        double _boost = obj.getBoost();
        magnitudeScoringFunction.setBoost(_boost);

        if (obj.getParameters() != null) {
            com.azure.search.documents.implementation.models.MagnitudeScoringParameters _parameters = MagnitudeScoringParametersConverter.map(obj.getParameters());
            magnitudeScoringFunction.setParameters(_parameters);
        }
        return magnitudeScoringFunction;
    }
}
