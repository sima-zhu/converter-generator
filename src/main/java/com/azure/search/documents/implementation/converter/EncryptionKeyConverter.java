package com.azure.search.documents.implementation.converter;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.AzureActiveDirectoryApplicationCredentials;
import com.azure.search.documents.models.EncryptionKey;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.EncryptionKey} and {@link EncryptionKey}.
 */
public final class EncryptionKeyConverter {
    private static final ClientLogger LOGGER = new ClientLogger(EncryptionKeyConverter.class);

    /**
     * Maps from {@link com.azure.search.documents.implementation.models.EncryptionKey} to {@link EncryptionKey}.
     */
    public static EncryptionKey map(com.azure.search.documents.implementation.models.EncryptionKey obj) {
        if (obj == null) {
            return null;
        }
        EncryptionKey encryptionKey = new EncryptionKey();

        String _keyVaultUri = obj.getKeyVaultUri();
        encryptionKey.setKeyVaultUri(_keyVaultUri);

        if (obj.getAccessCredentials() != null) {
            AzureActiveDirectoryApplicationCredentials _accessCredentials =
                    AzureActiveDirectoryApplicationCredentialsConverter.map(obj.getAccessCredentials());
            encryptionKey.setAccessCredentials(_accessCredentials);
        }

        String _keyVaultKeyName = obj.getKeyVaultKeyName();
        encryptionKey.setKeyVaultKeyName(_keyVaultKeyName);

        String _keyVaultKeyVersion = obj.getKeyVaultKeyVersion();
        encryptionKey.setKeyVaultKeyVersion(_keyVaultKeyVersion);
        return encryptionKey;
    }

    /**
     * Maps from {@link EncryptionKey} to {@link com.azure.search.documents.implementation.models.EncryptionKey}.
     */
    public static com.azure.search.documents.implementation.models.EncryptionKey map(EncryptionKey obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.EncryptionKey encryptionKey =
                new com.azure.search.documents.implementation.models.EncryptionKey();

        String _keyVaultUri = obj.getKeyVaultUri();
        encryptionKey.setKeyVaultUri(_keyVaultUri);

        if (obj.getAccessCredentials() != null) {
            com.azure.search.documents.implementation.models.AzureActiveDirectoryApplicationCredentials _accessCredentials = AzureActiveDirectoryApplicationCredentialsConverter.map(obj.getAccessCredentials());
            encryptionKey.setAccessCredentials(_accessCredentials);
        }

        String _keyVaultKeyName = obj.getKeyVaultKeyName();
        encryptionKey.setKeyVaultKeyName(_keyVaultKeyName);

        String _keyVaultKeyVersion = obj.getKeyVaultKeyVersion();
        encryptionKey.setKeyVaultKeyVersion(_keyVaultKeyVersion);
        return encryptionKey;
    }
}
