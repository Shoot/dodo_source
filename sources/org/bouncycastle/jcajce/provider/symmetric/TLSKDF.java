package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public class TLSKDF {

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = TLSKDF.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$TLS10");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS10KDF", sb.toString());
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS11KDF", str + "$TLS11");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA256KDF", str + "$TLS12withSHA256");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA384KDF", str + "$TLS12withSHA384");
            configurableProvider.addAlgorithm("SecretKeyFactory.TLS12WITHSHA512KDF", str + "$TLS12withSHA512");
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super("TLS10KDF");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof l5b) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((l5b) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super("TLS11KDF");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof l5b) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((l5b) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static class TLS12 extends TLSKeyMaterialFactory {
        private final x36 prf;

        protected TLS12(String str, x36 x36Var) {
            super(str);
            this.prf = x36Var;
        }

        private byte[] PRF(l5b l5bVar, x36 x36Var) {
            byte[] p = tr.p(a0b.e(l5bVar.a()), l5bVar.d());
            byte[] c = l5bVar.c();
            byte[] bArr = new byte[l5bVar.b()];
            TLSKDF.hmac_hash(x36Var, c, p, bArr);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof l5b) {
                return new SecretKeySpec(PRF((l5b) keySpec, this.prf), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new qj4(new dq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new qj4(new eq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new qj4(new gq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        protected TLSKeyMaterialFactory(String str) {
            super(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] PRF_legacy(l5b l5bVar) {
        qj4 qj4Var = new qj4(f23.a());
        qj4 qj4Var2 = new qj4(f23.b());
        byte[] p = tr.p(a0b.e(l5bVar.a()), l5bVar.d());
        byte[] c = l5bVar.c();
        int length = (c.length + 1) / 2;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        System.arraycopy(c, 0, bArr, 0, length);
        System.arraycopy(c, c.length - length, bArr2, 0, length);
        int b = l5bVar.b();
        byte[] bArr3 = new byte[b];
        byte[] bArr4 = new byte[b];
        hmac_hash(qj4Var, bArr, p, bArr3);
        hmac_hash(qj4Var2, bArr2, p, bArr4);
        for (int i = 0; i < b; i++) {
            bArr3[i] = (byte) (bArr3[i] ^ bArr4[i]);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hmac_hash(x36 x36Var, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        x36Var.init(new lf5(bArr));
        int macSize = x36Var.getMacSize();
        int length = ((bArr3.length + macSize) - 1) / macSize;
        int macSize2 = x36Var.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[x36Var.getMacSize()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            x36Var.update(bArr6, 0, bArr6.length);
            x36Var.doFinal(bArr4, 0);
            x36Var.update(bArr4, 0, macSize2);
            x36Var.update(bArr2, 0, bArr2.length);
            x36Var.doFinal(bArr5, 0);
            int i2 = macSize * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(macSize, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }
}
