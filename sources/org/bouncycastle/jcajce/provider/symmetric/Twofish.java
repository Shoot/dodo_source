package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
/* loaded from: classes3.dex */
public final class Twofish {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Twofish IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Twofish.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new nnb();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new ra4(new z94(new nnb())));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Twofish", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Twofish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.Twofish", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.Twofish", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Twofish", str + "$AlgParams");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAANDTWOFISH-CBC", str + "$PBEWithSHA");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", str + "$PBEWithSHAKeyFactory");
            addGMacAlgorithm(configurableProvider, "Twofish", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "Twofish", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA extends BaseBlockCipher {
        public PBEWithSHA() {
            super(new tk0(new nnb()), 2, 1, 256, 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAKeyFactory() {
            super("PBEwithSHAandTwofish-CBC", null, true, 2, 1, 256, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new pe8(new nnb()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Twofish", 256, new re8());
        }
    }

    private Twofish() {
    }
}
