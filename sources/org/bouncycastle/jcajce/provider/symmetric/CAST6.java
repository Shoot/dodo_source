package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
/* loaded from: classes3.dex */
public final class CAST6 {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "CAST6 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.CAST6.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new sk0();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new ra4(new z94(new sk0())));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("CAST6", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = CAST6.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.CAST6", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.CAST6", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.CAST6", str + "$AlgParams");
            addGMacAlgorithm(configurableProvider, "CAST6", str + "$GMAC", str + "$KeyGen");
            addPoly1305Algorithm(configurableProvider, "CAST6", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new pe8(new sk0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-CAST6", 256, new re8());
        }
    }

    private CAST6() {
    }
}
