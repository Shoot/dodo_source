package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
/* loaded from: classes3.dex */
public class GOST3411 {

    /* loaded from: classes3.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new vb4());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new vb4((vb4) this.digest);
            return digest;
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest2012_256 extends BCMessageDigest implements Cloneable {
        public Digest2012_256() {
            super(new xb4());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest2012_256 digest2012_256 = (Digest2012_256) super.clone();
            digest2012_256.digest = new xb4((xb4) this.digest);
            return digest2012_256;
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest2012_512 extends BCMessageDigest implements Cloneable {
        public Digest2012_512() {
            super(new yb4());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest2012_512 digest2012_512 = (Digest2012_512) super.clone();
            digest2012_512.digest = new yb4((yb4) this.digest);
            return digest2012_512;
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new qj4(new vb4()));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac2012_256 extends BaseMac {
        public HashMac2012_256() {
            super(new qj4(new xb4()));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac2012_512 extends BaseMac {
        public HashMac2012_512() {
            super(new qj4(new yb4()));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator2012_256 extends BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", 256, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator2012_512 extends BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", 512, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.GOST3411", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST", "GOST3411");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.MessageDigest.");
            k kVar = y22.b;
            sb2.append(kVar);
            configurableProvider.addAlgorithm(sb2.toString(), "GOST3411");
            addHMACAlgorithm(configurableProvider, "GOST3411", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "GOST3411", kVar);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-256", str + "$Digest2012_256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + do9.c, "GOST3411-2012-256");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-256", str + "$HashMac2012_256", str + "$KeyGenerator2012_256");
            addHMACAlias(configurableProvider, "GOST3411-2012-256", do9.e);
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-512", str + "$Digest2012_512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + do9.d, "GOST3411-2012-512");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-512", str + "$HashMac2012_512", str + "$KeyGenerator2012_512");
            addHMACAlias(configurableProvider, "GOST3411-2012-512", do9.f);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACGOST3411", str + "$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + kVar, "PBEWITHHMACGOST3411");
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
        }
    }

    private GOST3411() {
    }
}
