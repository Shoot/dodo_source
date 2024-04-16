package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public class GOST3412_2015 {

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((xc0) new u94(new zb4()), false, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CTR extends BaseBlockCipher {
        public CTR() {
            super(new ch0(new w94(new zb4())), true, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new zb4());
        }
    }

    /* loaded from: classes3.dex */
    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new ch0(new v94(new zb4())), false, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class GCFB8 extends BaseBlockCipher {
        public GCFB8() {
            super(new ch0(new v94(new zb4(), 8)), false, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("GOST3412-2015", i, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new cl0(new zb4()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST3412_2015.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015", sb.toString());
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CFB", str + "$GCFB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CFB8", str + "$GCFB8");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/OFB", str + "$OFB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CBC", str + "$CBC");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CTR", str + "$CTR");
            configurableProvider.addAlgorithm("KeyGenerator.GOST3412-2015", str + "$KeyGen");
            configurableProvider.addAlgorithm("Mac.GOST3412MAC", str + "$Mac");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new ch0(new x94(new zb4())), false, 128);
        }
    }
}
