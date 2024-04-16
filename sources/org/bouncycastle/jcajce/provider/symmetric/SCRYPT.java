package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public class SCRYPT {

    /* loaded from: classes3.dex */
    public static class BasePBKDF2 extends BaseSecretKeyFactory {
        private int scheme;

        public BasePBKDF2(String str, int i) {
            super(str, pl6.M);
            this.scheme = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof ux9) {
                ux9 ux9Var = (ux9) keySpec;
                if (ux9Var.f() != null) {
                    if (ux9Var.b() > 1) {
                        if (ux9Var.c() > 0) {
                            if (ux9Var.e().length != 0) {
                                return new BCPBEKey(this.algName, new lf5(wp9.i(lr7.b.a(ux9Var.e()), ux9Var.f(), ux9Var.b(), ux9Var.a(), ux9Var.d(), ux9Var.c() / 8)));
                            }
                            throw new IllegalArgumentException("password empty");
                        }
                        throw new InvalidKeySpecException("positive key length required: " + ux9Var.c());
                    }
                    throw new IllegalArgumentException("Cost parameter N must be > 1.");
                }
                throw new IllegalArgumentException("Salt S must be provided.");
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SCRYPT.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$ScryptWithUTF8");
            configurableProvider.addAlgorithm("SecretKeyFactory.SCRYPT", sb.toString());
            k kVar = pl6.M;
            configurableProvider.addAlgorithm("SecretKeyFactory", kVar, str + "$ScryptWithUTF8");
        }
    }

    /* loaded from: classes3.dex */
    public static class ScryptWithUTF8 extends BasePBKDF2 {
        public ScryptWithUTF8() {
            super("SCRYPT", 5);
        }
    }

    private SCRYPT() {
    }
}
