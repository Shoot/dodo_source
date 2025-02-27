package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class SipHash {

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash", 128, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mac24 extends BaseMac {
        public Mac24() {
            super(new bna());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mac48 extends BaseMac {
        public Mac48() {
            super(new bna(4, 8));
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = SipHash.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Mac24");
            configurableProvider.addAlgorithm("Mac.SIPHASH-2-4", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4");
            configurableProvider.addAlgorithm("Mac.SIPHASH-4-8", str + "$Mac48");
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH", str + "$KeyGen");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }

    private SipHash() {
    }
}
