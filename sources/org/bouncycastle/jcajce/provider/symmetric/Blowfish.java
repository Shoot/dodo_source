package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class Blowfish {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Blowfish IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new tk0(new zd0()), 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new cl0(new zd0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new zd0());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Blowfish", 128, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Blowfish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$CMAC");
            configurableProvider.addAlgorithm("Mac.BLOWFISHCMAC", sb.toString());
            configurableProvider.addAlgorithm("Cipher.BLOWFISH", str + "$ECB");
            k kVar = pl6.A;
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("KeyGenerator.BLOWFISH", str + "$KeyGen");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator", kVar, "BLOWFISH");
            configurableProvider.addAlgorithm("AlgorithmParameters.BLOWFISH", str + "$AlgParams");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", kVar, "BLOWFISH");
        }
    }

    private Blowfish() {
    }
}
