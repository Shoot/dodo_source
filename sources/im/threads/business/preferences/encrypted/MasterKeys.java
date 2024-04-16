package im.threads.business.preferences.encrypted;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import com.appsflyer.f;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
@Deprecated
/* loaded from: classes3.dex */
public final class MasterKeys {
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    static final int KEY_SIZE = 256;
    static final String MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    @NonNull
    public static final KeyGenParameterSpec AES256_GCM_SPEC = createAES256GCMKeyGenParameterSpec("_androidx_security_master_key_");
    private static final Object sLock = new Object();

    private MasterKeys() {
    }

    @NonNull
    private static KeyGenParameterSpec createAES256GCMKeyGenParameterSpec(@NonNull String str) {
        KeyGenParameterSpec.Builder blockModes;
        KeyGenParameterSpec.Builder encryptionPaddings;
        KeyGenParameterSpec.Builder keySize;
        KeyGenParameterSpec build;
        blockModes = f.a(str, 3).setBlockModes("GCM");
        encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
        keySize = encryptionPaddings.setKeySize(256);
        build = keySize.build();
        return build;
    }

    private static void generateKey(@NonNull KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", ANDROID_KEYSTORE);
            keyGenerator.init(keyGenParameterSpec);
            keyGenerator.generateKey();
        } catch (ProviderException e) {
            throw new GeneralSecurityException(e.getMessage(), e);
        }
    }

    @NonNull
    public static String getOrCreate(@NonNull KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        String keystoreAlias;
        String keystoreAlias2;
        validate(keyGenParameterSpec);
        synchronized (sLock) {
            try {
                keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                if (!keyExists(keystoreAlias)) {
                    generateKey(keyGenParameterSpec);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
        return keystoreAlias2;
    }

    private static boolean keyExists(@NonNull String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    static void validate(KeyGenParameterSpec keyGenParameterSpec) {
        int keySize;
        int keySize2;
        String[] blockModes;
        String[] blockModes2;
        int purposes;
        int purposes2;
        String[] encryptionPaddings;
        String[] encryptionPaddings2;
        boolean isUserAuthenticationRequired;
        int userAuthenticationValidityDurationSeconds;
        keySize = keyGenParameterSpec.getKeySize();
        if (keySize == 256) {
            blockModes = keyGenParameterSpec.getBlockModes();
            if (Arrays.equals(blockModes, new String[]{"GCM"})) {
                purposes = keyGenParameterSpec.getPurposes();
                if (purposes == 3) {
                    encryptionPaddings = keyGenParameterSpec.getEncryptionPaddings();
                    if (Arrays.equals(encryptionPaddings, new String[]{"NoPadding"})) {
                        isUserAuthenticationRequired = keyGenParameterSpec.isUserAuthenticationRequired();
                        if (isUserAuthenticationRequired) {
                            userAuthenticationValidityDurationSeconds = keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
                            if (userAuthenticationValidityDurationSeconds < 1) {
                                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                            }
                            return;
                        }
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("invalid padding mode, want NoPadding got ");
                    encryptionPaddings2 = keyGenParameterSpec.getEncryptionPaddings();
                    sb.append(Arrays.toString(encryptionPaddings2));
                    throw new IllegalArgumentException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                purposes2 = keyGenParameterSpec.getPurposes();
                sb2.append(purposes2);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("invalid block mode, want GCM got ");
            blockModes2 = keyGenParameterSpec.getBlockModes();
            sb3.append(Arrays.toString(blockModes2));
            throw new IllegalArgumentException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("invalid key size, want 256 bits got ");
        keySize2 = keyGenParameterSpec.getKeySize();
        sb4.append(keySize2);
        sb4.append(" bits");
        throw new IllegalArgumentException(sb4.toString());
    }
}
