package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
/* loaded from: classes3.dex */
public final class Serpent {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Serpent IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new tk0(new dda()), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new ch0(new yk0(new dda(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new dda();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.Serpent", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.Serpent", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Serpent", str + "$AlgParams");
            configurableProvider.addAlgorithm("Cipher.Tnepres", str + "$TECB");
            configurableProvider.addAlgorithm("KeyGenerator.Tnepres", str + "$TKeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Tnepres", str + "$TAlgParams");
            configurableProvider.addAlgorithm("Cipher", sa4.j, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", sa4.n, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", sa4.r, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", sa4.k, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", sa4.o, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", sa4.s, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", sa4.m, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", sa4.q, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", sa4.u, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", sa4.l, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", sa4.p, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", sa4.t, str + "$OFB");
            addGMacAlgorithm(configurableProvider, "SERPENT", str + "$SerpentGMAC", str + "$KeyGen");
            addGMacAlgorithm(configurableProvider, "TNEPRES", str + "$TSerpentGMAC", str + "$TKeyGen");
            addPoly1305Algorithm(configurableProvider, "SERPENT", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new ch0(new e47(new dda(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new pe8(new dda()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new re8());
        }
    }

    /* loaded from: classes3.dex */
    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new ra4(new z94(new dda())));
        }
    }

    /* loaded from: classes3.dex */
    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Tnepres IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public xc0 get() {
                    return new ohb();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new ra4(new z94(new ohb())));
        }
    }

    private Serpent() {
    }
}
