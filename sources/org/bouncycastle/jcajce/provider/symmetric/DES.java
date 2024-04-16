package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class DES {

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = b32.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("DES");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new tk0(new l62()), 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new uk0(new l62()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new cl0(new l62()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DES64 extends BaseMac {
        public DES64() {
            super(new uk0(new l62(), 64));
        }
    }

    /* loaded from: classes3.dex */
    public static class DES64with7816d4 extends BaseMac {
        public DES64with7816d4() {
            super(new uk0(new l62(), 64, new us4()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DES9797Alg3 extends BaseMac {
        public DES9797Alg3() {
            super(new ys4(new l62()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DES9797Alg3with7816d4 extends BaseMac {
        public DES9797Alg3with7816d4() {
            super(new ys4(new l62(), new us4()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DESCFB8 extends BaseMac {
        public DESCFB8() {
            super(new zk0(new l62()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DESPBEKeyFactory extends BaseSecretKeyFactory {
        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        public DESPBEKeyFactory(String str, k kVar, boolean z, int i, int i2, int i3, int i4) {
            super(str, kVar);
            this.forCipher = z;
            this.scheme = i;
            this.digest = i2;
            this.keySize = i3;
            this.ivSize = i4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            v71 makePBEMacParameters;
            lf5 lf5Var;
            lr7 lr7Var;
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    int i = this.scheme;
                    if (i != 0 && i != 4) {
                        return new BCPBEKey(this.algName, this.algOid, i, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
                    }
                    char[] password = pBEKeySpec.getPassword();
                    if (this.scheme == 0) {
                        lr7Var = lr7.a;
                    } else {
                        lr7Var = lr7.b;
                    }
                    return new an7(password, lr7Var);
                }
                if (this.forCipher) {
                    makePBEMacParameters = PBE.Util.makePBEParameters(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize);
                } else {
                    makePBEMacParameters = PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, this.digest, this.keySize);
                }
                v71 v71Var = makePBEMacParameters;
                if (v71Var instanceof pq7) {
                    lf5Var = (lf5) ((pq7) v71Var).b();
                } else {
                    lf5Var = (lf5) v71Var;
                }
                n62.c(lf5Var.a());
                return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, v71Var);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new l62());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DES", null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof DESKeySpec) {
                return new SecretKeySpec(((DESKeySpec) keySpec).getKey(), "DES");
            }
            return super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls != null) {
                if (secretKey != null) {
                    if (SecretKeySpec.class.isAssignableFrom(cls)) {
                        return new SecretKeySpec(secretKey.getEncoded(), this.algName);
                    }
                    if (DESKeySpec.class.isAssignableFrom(cls)) {
                        try {
                            return new DESKeySpec(secretKey.getEncoded());
                        } catch (Exception e) {
                            throw new InvalidKeySpecException(e.toString());
                        }
                    }
                    throw new InvalidKeySpecException("Invalid KeySpec");
                }
                throw new InvalidKeySpecException("key parameter is null");
            }
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("DES", 64, new m62());
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        protected SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.b(new ff5(b32.b(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new SecretKeySpec(this.engine.a(), this.algName);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        private static final String PREFIX = DES.class.getName();

        private void addAlias(ConfigurableProvider configurableProvider, k kVar, String str) {
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator." + kVar.H(), str);
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory." + kVar.H(), str);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.DES", sb.toString());
            k kVar = g47.e;
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            addAlias(configurableProvider, kVar, "DES");
            configurableProvider.addAlgorithm("Cipher.DESRFC3211WRAP", str + "$RFC3211");
            configurableProvider.addAlgorithm("KeyGenerator.DES", str + "$KeyGenerator");
            configurableProvider.addAlgorithm("SecretKeyFactory.DES", str + "$KeyFactory");
            configurableProvider.addAlgorithm("Mac.DESCMAC", str + "$CMAC");
            configurableProvider.addAlgorithm("Mac.DESMAC", str + "$CBCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES", "DESMAC");
            configurableProvider.addAlgorithm("Mac.DESMAC/CFB8", str + "$DESCFB8");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
            configurableProvider.addAlgorithm("Mac.DESMAC64", str + "$DES64");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64", "DESMAC64");
            configurableProvider.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", str + "$DES64with7816d4");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Mac.DESWITHISO9797", str + "$DES9797Alg3");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
            configurableProvider.addAlgorithm("Mac.ISO9797ALG3MAC", str + "$DES9797Alg3");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
            configurableProvider.addAlgorithm("Mac.ISO9797ALG3WITHISO7816-4PADDING", str + "$DES9797Alg3with7816d4");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar, "DES");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DES", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + kVar, "DES");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD2ANDDES", str + "$PBEWithMD2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5ANDDES", str + "$PBEWithMD5");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA1ANDDES", str + "$PBEWithSHA1");
            k kVar2 = co7.n0;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar2, "PBEWITHMD2ANDDES");
            k kVar3 = co7.p0;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar3, "PBEWITHMD5ANDDES");
            k kVar4 = co7.r0;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar4, "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDDES", str + "$PBEWithMD2KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDDES", str + "$PBEWithMD5KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDDES", str + "$PBEWithSHA1KeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar2, "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar3, "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar4, "PBEWITHSHA1ANDDES");
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD2 extends BaseBlockCipher {
        public PBEWithMD2() {
            super(new tk0(new l62()), 0, 5, 64, 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD2KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andDES", co7.n0, true, 0, 5, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD5 extends BaseBlockCipher {
        public PBEWithMD5() {
            super(new tk0(new l62()), 0, 0, 64, 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD5KeyFactory extends DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andDES", co7.p0, true, 0, 0, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA1 extends BaseBlockCipher {
        public PBEWithSHA1() {
            super(new tk0(new l62()), 0, 1, 64, 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA1KeyFactory extends DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andDES", co7.r0, true, 0, 1, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new y29(new l62()), 8);
        }
    }

    private DES() {
    }
}
