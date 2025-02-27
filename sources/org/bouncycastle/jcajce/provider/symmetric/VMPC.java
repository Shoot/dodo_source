package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class VMPC {

    /* loaded from: classes3.dex */
    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new rvb(), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC", 128, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mac extends BaseMac {
        public Mac() {
            super(new tvb());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = VMPC.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.VMPC", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.VMPC", str + "$KeyGen");
            configurableProvider.addAlgorithm("Mac.VMPCMAC", str + "$Mac");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC", "VMPCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }
    }

    private VMPC() {
    }
}
