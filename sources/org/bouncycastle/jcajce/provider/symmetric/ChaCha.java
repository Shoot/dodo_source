package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class ChaCha {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParamsCC1305 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "ChaCha20-Poly1305 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new su0(), 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new ru0(), 12);
        }
    }

    /* loaded from: classes3.dex */
    public static class BaseCC20P1305 extends BaseBlockCipher {
        public BaseCC20P1305() {
            super((n) new lu0(), true, 12);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.CHACHA", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.CHACHA", str + "$KeyGen");
            configurableProvider.addAlgorithm("Cipher.CHACHA7539", str + "$Base7539");
            configurableProvider.addAlgorithm("KeyGenerator.CHACHA7539", str + "$KeyGen7539");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA7539", str + "$AlgParams");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.KeyGenerator.");
            k kVar = co7.C1;
            sb2.append(kVar);
            configurableProvider.addAlgorithm(sb2.toString(), "CHACHA7539");
            configurableProvider.addAlgorithm("Cipher.CHACHA20-POLY1305", str + "$BaseCC20P1305");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", str + "$AlgParamsCC1305");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher." + kVar, "CHACHA20-POLY1305");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + kVar, "CHACHA20-POLY1305");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.OID." + kVar, "CHACHA20-POLY1305");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.OID." + kVar, "CHACHA20-POLY1305");
        }
    }

    private ChaCha() {
    }
}
