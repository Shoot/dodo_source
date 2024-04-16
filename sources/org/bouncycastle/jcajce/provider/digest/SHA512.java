package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
/* loaded from: classes3.dex */
public class SHA512 {

    /* loaded from: classes3.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new gq9());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new gq9((gq9) this.digest);
            return digest;
        }
    }

    /* loaded from: classes3.dex */
    public static class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i) {
            super(new hq9(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new hq9((hq9) this.digest);
            return digestT;
        }
    }

    /* loaded from: classes3.dex */
    public static class DigestT224 extends DigestT {
        public DigestT224() {
            super(224);
        }
    }

    /* loaded from: classes3.dex */
    public static class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new qj4(new gq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new qj4(new hq9(224)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new qj4(new hq9(256)));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", 224, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512", "SHA-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + ms6.e, "SHA-512");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/224", str + "$DigestT224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + ms6.g, "SHA-512/224");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/256", str + "$DigestT256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(256)", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(256)", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + ms6.h, "SHA-512/256");
            configurableProvider.addAlgorithm("Mac.OLDHMACSHA512", str + "$OldSHA512");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA512", str + "$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA512", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "SHA512", co7.H0);
            addHMACAlgorithm(configurableProvider, "SHA512/224", str + "$HashMacT224", str + "$KeyGeneratorT224");
            addHMACAlgorithm(configurableProvider, "SHA512/256", str + "$HashMacT256", str + "$KeyGeneratorT256");
        }
    }

    /* loaded from: classes3.dex */
    public static class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new g77(new gq9()));
        }
    }

    private SHA512() {
    }
}
