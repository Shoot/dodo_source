package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
/* loaded from: classes3.dex */
public class SM3 {

    /* loaded from: classes3.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new sq9());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new sq9((sq9) this.digest);
            return digest;
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new qj4(new sq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSM3", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SM3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SM3", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SM3", "SM3");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.1.2.156.197.1.401", "SM3");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + qa4.b0, "SM3");
            addHMACAlgorithm(configurableProvider, "SM3", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "SM3", qa4.c0);
        }
    }

    private SM3() {
    }
}
