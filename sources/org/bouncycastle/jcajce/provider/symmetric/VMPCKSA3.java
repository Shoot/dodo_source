package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class VMPCKSA3 {

    /* loaded from: classes3.dex */
    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new svb(), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC-KSA3", 128, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = VMPCKSA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.VMPC-KSA3", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.VMPC-KSA3", str + "$KeyGen");
        }
    }

    private VMPCKSA3() {
    }
}
