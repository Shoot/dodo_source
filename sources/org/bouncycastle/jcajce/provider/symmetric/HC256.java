package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class HC256 {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "HC256 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new bj4(), 32);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("HC256", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = HC256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.HC256", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.HC256", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.HC256", str + "$AlgParams");
        }
    }

    private HC256() {
    }
}
