package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
/* loaded from: classes3.dex */
public class Keccak {

    /* loaded from: classes3.dex */
    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(224);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(384);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i) {
            super(new qe5(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new qe5((qe5) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new qj4(new qe5(224)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new qj4(new qe5(256)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new qj4(new qe5(288)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new qj4(new qe5(384)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new qj4(new qe5(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", 224, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", 384, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest224");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-224", sb.toString());
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-288", str + "$Digest288");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-256", str + "$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-384", str + "$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-512", str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "KECCAK224", str + "$HashMac224", str + "$KeyGenerator224");
            addHMACAlgorithm(configurableProvider, "KECCAK256", str + "$HashMac256", str + "$KeyGenerator256");
            addHMACAlgorithm(configurableProvider, "KECCAK288", str + "$HashMac288", str + "$KeyGenerator288");
            addHMACAlgorithm(configurableProvider, "KECCAK384", str + "$HashMac384", str + "$KeyGenerator384");
            addHMACAlgorithm(configurableProvider, "KECCAK512", str + "$HashMac512", str + "$KeyGenerator512");
        }
    }

    private Keccak() {
    }
}
