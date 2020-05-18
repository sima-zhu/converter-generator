package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.Analyzer;
import com.azure.search.documents.models.CharFilter;
import com.azure.search.documents.models.CorsOptions;
import com.azure.search.documents.models.EncryptionKey;
import com.azure.search.documents.models.Field;
import com.azure.search.documents.models.Index;
import com.azure.search.documents.models.ScoringProfile;
import com.azure.search.documents.models.Similarity;
import com.azure.search.documents.models.Suggester;
import com.azure.search.documents.models.TokenFilter;
import com.azure.search.documents.models.Tokenizer;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.Index} and {@link Index}.
 */
public final class IndexConverter {
    private static final ClientLogger LOGGER = new ClientLogger(IndexConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.Index} to {@link Index}.
     */
    public static Index map(com.azure.search.documents.implementation.models.Index obj) {
        if (obj == null) {
            return null;
        }
        Index index = new Index();

        if (obj.getTokenizers() != null) {
            List<Tokenizer> _tokenizers =
                    obj.getTokenizers().stream().map(TokenizerConverter::map).collect(Collectors.toList());
            index.setTokenizers(_tokenizers);
        }

        if (obj.getSuggesters() != null) {
            List<Suggester> _suggesters =
                    obj.getSuggesters().stream().map(SuggesterConverter::map).collect(Collectors.toList());
            index.setSuggesters(_suggesters);
        }

        if (obj.getCharFilters() != null) {
            List<CharFilter> _charFilters =
                    obj.getCharFilters().stream().map(CharFilterConverter::map).collect(Collectors.toList());
            index.setCharFilters(_charFilters);
        }

        if (obj.getTokenFilters() != null) {
            List<TokenFilter> _tokenFilters =
                    obj.getTokenFilters().stream().map(TokenFilterConverter::map).collect(Collectors.toList());
            index.setTokenFilters(_tokenFilters);
        }

        if (obj.getEncryptionKey() != null) {
            EncryptionKey _encryptionKey = EncryptionKeyConverter.map(obj.getEncryptionKey());
            index.setEncryptionKey(_encryptionKey);
        }

        String _defaultScoringProfile = obj.getDefaultScoringProfile();
        index.setDefaultScoringProfile(_defaultScoringProfile);

        if (obj.getAnalyzers() != null) {
            List<Analyzer> _analyzers =
                    obj.getAnalyzers().stream().map(AnalyzerConverter::map).collect(Collectors.toList());
            index.setAnalyzers(_analyzers);
        }

        if (obj.getSimilarity() != null) {
            Similarity _similarity = SimilarityConverter.map(obj.getSimilarity());
            index.setSimilarity(_similarity);
        }

        String _name = obj.getName();
        index.setName(_name);

        if (obj.getCorsOptions() != null) {
            CorsOptions _corsOptions = CorsOptionsConverter.map(obj.getCorsOptions());
            index.setCorsOptions(_corsOptions);
        }

        String _eTag = obj.getETag();
        index.setETag(_eTag);

        if (obj.getScoringProfiles() != null) {
            List<ScoringProfile> _scoringProfiles =
                    obj.getScoringProfiles().stream().map(ScoringProfileConverter::map).collect(Collectors.toList());
            index.setScoringProfiles(_scoringProfiles);
        }

        if (obj.getFields() != null) {
            List<Field> _fields = obj.getFields().stream().map(FieldConverter::map).collect(Collectors.toList());
            index.setFields(_fields);
        }
        return index;
    }

    /**
     * Maps from {@link Index} to {@link com.azure.search.documents.implementation.models.Index}.
     */
    public static com.azure.search.documents.implementation.models.Index map(Index obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.Index index =
                new com.azure.search.documents.implementation.models.Index();

        if (obj.getTokenizers() != null) {
            List<com.azure.search.documents.implementation.models.Tokenizer> _tokenizers =
                    obj.getTokenizers().stream().map(TokenizerConverter::map).collect(Collectors.toList());
            index.setTokenizers(_tokenizers);
        }

        if (obj.getSuggesters() != null) {
            List<com.azure.search.documents.implementation.models.Suggester> _suggesters =
                    obj.getSuggesters().stream().map(SuggesterConverter::map).collect(Collectors.toList());
            index.setSuggesters(_suggesters);
        }

        if (obj.getCharFilters() != null) {
            List<com.azure.search.documents.implementation.models.CharFilter> _charFilters =
                    obj.getCharFilters().stream().map(CharFilterConverter::map).collect(Collectors.toList());
            index.setCharFilters(_charFilters);
        }

        if (obj.getTokenFilters() != null) {
            List<com.azure.search.documents.implementation.models.TokenFilter> _tokenFilters =
                    obj.getTokenFilters().stream().map(TokenFilterConverter::map).collect(Collectors.toList());
            index.setTokenFilters(_tokenFilters);
        }

        if (obj.getEncryptionKey() != null) {
            com.azure.search.documents.implementation.models.EncryptionKey _encryptionKey =
                    EncryptionKeyConverter.map(obj.getEncryptionKey());
            index.setEncryptionKey(_encryptionKey);
        }

        String _defaultScoringProfile = obj.getDefaultScoringProfile();
        index.setDefaultScoringProfile(_defaultScoringProfile);

        if (obj.getAnalyzers() != null) {
            List<com.azure.search.documents.implementation.models.Analyzer> _analyzers =
                    obj.getAnalyzers().stream().map(AnalyzerConverter::map).collect(Collectors.toList());
            index.setAnalyzers(_analyzers);
        }

        if (obj.getSimilarity() != null) {
            com.azure.search.documents.implementation.models.Similarity _similarity =
                    SimilarityConverter.map(obj.getSimilarity());
            index.setSimilarity(_similarity);
        }

        String _name = obj.getName();
        index.setName(_name);

        if (obj.getCorsOptions() != null) {
            com.azure.search.documents.implementation.models.CorsOptions _corsOptions =
                    CorsOptionsConverter.map(obj.getCorsOptions());
            index.setCorsOptions(_corsOptions);
        }

        String _eTag = obj.getETag();
        index.setETag(_eTag);

        if (obj.getScoringProfiles() != null) {
            List<com.azure.search.documents.implementation.models.ScoringProfile> _scoringProfiles = obj.getScoringProfiles().stream().map(ScoringProfileConverter::map).collect(Collectors.toList());
            index.setScoringProfiles(_scoringProfiles);
        }

        if (obj.getFields() != null) {
            List<com.azure.search.documents.implementation.models.Field> _fields = obj.getFields().stream().map(FieldConverter::map).collect(Collectors.toList());
            index.setFields(_fields);
        }
        return index;
    }
}
