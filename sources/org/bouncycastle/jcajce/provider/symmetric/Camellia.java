package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
/* loaded from: classes3.dex */
public final class Camellia {

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = b32.b();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("Camellia");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Camellia IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new tk0(new sm0()), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new sm0();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new ra4(new z94(new sm0())));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", null);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("Camellia", i, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.CAMELLIA", sb.toString());
            k kVar = os6.a;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar, "CAMELLIA");
            k kVar2 = os6.b;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar2, "CAMELLIA");
            k kVar3 = os6.c;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar3, "CAMELLIA");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CAMELLIA", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar2, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", kVar3, "CAMELLIA");
            configurableProvider.addAlgorithm("Cipher.CAMELLIA", str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar2, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", kVar3, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher.CAMELLIARFC3211WRAP", str + "$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.CAMELLIAWRAP", str + "$Wrap");
            k kVar4 = os6.d;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar4, "CAMELLIAWRAP");
            k kVar5 = os6.e;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar5, "CAMELLIAWRAP");
            k kVar6 = os6.f;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar6, "CAMELLIAWRAP");
            configurableProvider.addAlgorithm("SecretKeyFactory.CAMELLIA", str + "$KeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar2, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar3, "CAMELLIA");
            configurableProvider.addAlgorithm("KeyGenerator.CAMELLIA", str + "$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", kVar4, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar5, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar6, str + "$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", kVar, str + "$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", kVar2, str + "$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", kVar3, str + "$KeyGen256");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new pe8(new sm0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new re8());
        }
    }

    /* loaded from: classes3.dex */
    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new y29(new sm0()), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new tm0());
        }
    }

    private Camellia() {
    }
}
