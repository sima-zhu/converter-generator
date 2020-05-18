package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.PathHierarchyTokenizer;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.PathHierarchyTokenizer} and
 * {@link PathHierarchyTokenizer}.
 */
public final class PathHierarchyTokenizerConverter {
    private static final ClientLogger LOGGER = new ClientLogger(PathHierarchyTokenizerConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.PathHierarchyTokenizer} to
     * {@link PathHierarchyTokenizer}.
     */
    public static PathHierarchyTokenizer map(com.azure.search.documents.implementation.models.PathHierarchyTokenizer obj) {
        if (obj == null) {
            return null;
        }
        PathHierarchyTokenizer pathHierarchyTokenizer = new PathHierarchyTokenizer();

        String _name = obj.getName();
        pathHierarchyTokenizer.setName(_name);

        String _delimiter = obj.getDelimiter();
        pathHierarchyTokenizer.setDelimiter(_delimiter);

        Boolean _reverseTokenOrder = obj.isReverseTokenOrder();
        pathHierarchyTokenizer.setReverseTokenOrder(_reverseTokenOrder);

        Integer _numberOfTokensToSkip = obj.getNumberOfTokensToSkip();
        pathHierarchyTokenizer.setNumberOfTokensToSkip(_numberOfTokensToSkip);

        String _replacement = obj.getReplacement();
        pathHierarchyTokenizer.setReplacement(_replacement);

        Integer _bufferSize = obj.getBufferSize();
        pathHierarchyTokenizer.setBufferSize(_bufferSize);
        return pathHierarchyTokenizer;
    }

    /**
     * Maps from {@link PathHierarchyTokenizer} to
     * {@link com.azure.search.documents.implementation.models.PathHierarchyTokenizer}.
     */
    public static com.azure.search.documents.implementation.models.PathHierarchyTokenizer map(PathHierarchyTokenizer obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.PathHierarchyTokenizer pathHierarchyTokenizer =
                new com.azure.search.documents.implementation.models.PathHierarchyTokenizer();

        String _name = obj.getName();
        pathHierarchyTokenizer.setName(_name);

        String _delimiter = obj.getDelimiter();
        pathHierarchyTokenizer.setDelimiter(_delimiter);

        Boolean _reverseTokenOrder = obj.isReverseTokenOrder();
        pathHierarchyTokenizer.setReverseTokenOrder(_reverseTokenOrder);

        Integer _numberOfTokensToSkip = obj.getNumberOfTokensToSkip();
        pathHierarchyTokenizer.setNumberOfTokensToSkip(_numberOfTokensToSkip);

        String _replacement = obj.getReplacement();
        pathHierarchyTokenizer.setReplacement(_replacement);

        Integer _bufferSize = obj.getBufferSize();
        pathHierarchyTokenizer.setBufferSize(_bufferSize);
        return pathHierarchyTokenizer;
    }
}
