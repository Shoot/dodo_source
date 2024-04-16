package im.threads.business.preferences.encrypted;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import com.appsflyer.f;
import com.appsflyer.g;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* loaded from: classes3.dex */
public final class MasterKey {
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;
    private static final int DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS = 300;
    public static final String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    static final String KEYSTORE_PATH_URI = "android-keystore://";
    @NonNull
    private final String mKeyAlias;
    private final KeyGenParameterSpec mKeyGenParameterSpec;

    /* renamed from: im.threads.business.preferences.encrypted.MasterKey$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$im$threads$business$preferences$encrypted$MasterKey$KeyScheme;

        static {
            int[] iArr = new int[KeyScheme.values().length];
            $SwitchMap$im$threads$business$preferences$encrypted$MasterKey$KeyScheme = iArr;
            try {
                iArr[KeyScheme.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        static int getUserAuthenticationValidityDurationSeconds(KeyGenParameterSpec keyGenParameterSpec) {
            int userAuthenticationValidityDurationSeconds;
            userAuthenticationValidityDurationSeconds = keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds();
            return userAuthenticationValidityDurationSeconds;
        }

        static boolean isUserAuthenticationRequired(KeyGenParameterSpec keyGenParameterSpec) {
            boolean isUserAuthenticationRequired;
            isUserAuthenticationRequired = keyGenParameterSpec.isUserAuthenticationRequired();
            return isUserAuthenticationRequired;
        }
    }

    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean isStrongBoxBacked(KeyGenParameterSpec keyGenParameterSpec) {
            boolean isStrongBoxBacked;
            isStrongBoxBacked = keyGenParameterSpec.isStrongBoxBacked();
            return isStrongBoxBacked;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        boolean mAuthenticationRequired;
        final Context mContext;
        @NonNull
        final String mKeyAlias;
        KeyGenParameterSpec mKeyGenParameterSpec;
        KeyScheme mKeyScheme;
        boolean mRequestStrongBoxBacked;
        int mUserAuthenticationValidityDurationSeconds;

        /* loaded from: classes3.dex */
        static class Api23Impl {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public static class Api28Impl {
                private Api28Impl() {
                }

                static void setIsStrongBoxBacked(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes3.dex */
            public static class Api30Impl {
                private Api30Impl() {
                }

                static void setUserAuthenticationParameters(KeyGenParameterSpec.Builder builder, int i, int i2) {
                    builder.setUserAuthenticationParameters(i, i2);
                }
            }

            private Api23Impl() {
            }

            static MasterKey build(Builder builder) throws GeneralSecurityException, IOException {
                KeyGenParameterSpec.Builder blockModes;
                KeyGenParameterSpec.Builder encryptionPaddings;
                KeyGenParameterSpec.Builder keySize;
                KeyGenParameterSpec build;
                KeyScheme keyScheme = builder.mKeyScheme;
                if (keyScheme == null && builder.mKeyGenParameterSpec == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (keyScheme == KeyScheme.AES256_GCM) {
                    g.a();
                    blockModes = f.a(builder.mKeyAlias, 3).setBlockModes("GCM");
                    encryptionPaddings = blockModes.setEncryptionPaddings("NoPadding");
                    keySize = encryptionPaddings.setKeySize(256);
                    if (builder.mAuthenticationRequired) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT < 30) {
                            keySize.setUserAuthenticationValidityDurationSeconds(builder.mUserAuthenticationValidityDurationSeconds);
                        } else {
                            Api30Impl.setUserAuthenticationParameters(keySize, builder.mUserAuthenticationValidityDurationSeconds, 3);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && builder.mRequestStrongBoxBacked && builder.mContext.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        Api28Impl.setIsStrongBoxBacked(keySize);
                    }
                    build = keySize.build();
                    builder.mKeyGenParameterSpec = build;
                }
                KeyGenParameterSpec keyGenParameterSpec = builder.mKeyGenParameterSpec;
                if (keyGenParameterSpec != null) {
                    return new MasterKey(MasterKeys.getOrCreate(keyGenParameterSpec), builder.mKeyGenParameterSpec);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            static String getKeystoreAlias(KeyGenParameterSpec keyGenParameterSpec) {
                String keystoreAlias;
                keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                return keystoreAlias;
            }
        }

        public Builder(@NonNull Context context) {
            this(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS);
        }

        @NonNull
        public MasterKey build() throws GeneralSecurityException, IOException {
            if (Build.VERSION.SDK_INT >= 23) {
                return Api23Impl.build(this);
            }
            return new MasterKey(this.mKeyAlias, null);
        }

        @NonNull
        public Builder setKeyGenParameterSpec(@NonNull KeyGenParameterSpec keyGenParameterSpec) {
            if (this.mKeyScheme == null) {
                if (this.mKeyAlias.equals(Api23Impl.getKeystoreAlias(keyGenParameterSpec))) {
                    this.mKeyGenParameterSpec = keyGenParameterSpec;
                    return this;
                }
                throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.mKeyAlias + " vs " + Api23Impl.getKeystoreAlias(keyGenParameterSpec));
            }
            throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
        }

        @NonNull
        public Builder setKeyScheme(@NonNull KeyScheme keyScheme) {
            if (AnonymousClass1.$SwitchMap$im$threads$business$preferences$encrypted$MasterKey$KeyScheme[keyScheme.ordinal()] == 1) {
                if (Build.VERSION.SDK_INT >= 23 && this.mKeyGenParameterSpec != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.mKeyScheme = keyScheme;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + keyScheme);
        }

        @NonNull
        public Builder setRequestStrongBoxBacked(boolean z) {
            this.mRequestStrongBoxBacked = z;
            return this;
        }

        @NonNull
        public Builder setUserAuthenticationRequired(boolean z, int i) {
            this.mAuthenticationRequired = z;
            this.mUserAuthenticationValidityDurationSeconds = i;
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str) {
            this.mContext = context.getApplicationContext();
            this.mKeyAlias = str;
        }

        @NonNull
        public Builder setUserAuthenticationRequired(boolean z) {
            return setUserAuthenticationRequired(z, MasterKey.getDefaultAuthenticationValidityDurationSeconds());
        }
    }

    /* loaded from: classes3.dex */
    public enum KeyScheme {
        AES256_GCM
    }

    MasterKey(@NonNull String str, Object obj) {
        this.mKeyAlias = str;
        if (Build.VERSION.SDK_INT >= 23) {
            this.mKeyGenParameterSpec = g96.a(obj);
        } else {
            this.mKeyGenParameterSpec = null;
        }
    }

    @SuppressLint({"MethodNameUnits"})
    public static int getDefaultAuthenticationValidityDurationSeconds() {
        return DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public String getKeyAlias() {
        return this.mKeyAlias;
    }

    @SuppressLint({"MethodNameUnits"})
    public int getUserAuthenticationValidityDurationSeconds() {
        KeyGenParameterSpec keyGenParameterSpec;
        if (Build.VERSION.SDK_INT < 23 || (keyGenParameterSpec = this.mKeyGenParameterSpec) == null) {
            return 0;
        }
        return Api23Impl.getUserAuthenticationValidityDurationSeconds(keyGenParameterSpec);
    }

    public boolean isKeyStoreBacked() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.mKeyAlias);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public boolean isStrongBoxBacked() {
        KeyGenParameterSpec keyGenParameterSpec;
        if (Build.VERSION.SDK_INT >= 28 && (keyGenParameterSpec = this.mKeyGenParameterSpec) != null) {
            return Api28Impl.isStrongBoxBacked(keyGenParameterSpec);
        }
        return false;
    }

    public boolean isUserAuthenticationRequired() {
        KeyGenParameterSpec keyGenParameterSpec;
        if (Build.VERSION.SDK_INT < 23 || (keyGenParameterSpec = this.mKeyGenParameterSpec) == null || !Api23Impl.isUserAuthenticationRequired(keyGenParameterSpec)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String toString() {
        return "MasterKey{keyAlias=" + this.mKeyAlias + ", isKeyStoreBacked=" + isKeyStoreBacked() + "}";
    }
}
