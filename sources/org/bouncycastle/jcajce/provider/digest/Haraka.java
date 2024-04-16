package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
/* loaded from: classes3.dex */
public class Haraka {

    /* loaded from: classes3.dex */
    public static class Digest256 extends BCMessageDigest implements Cloneable {
        public Digest256() {
            super(new tm4());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest256 digest256 = (Digest256) super.clone();
            digest256.digest = new tm4((tm4) this.digest);
            return digest256;
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest512 extends BCMessageDigest implements Cloneable {
        public Digest512() {
            super(new um4());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest512 digest512 = (Digest512) super.clone();
            digest512.digest = new um4((um4) this.digest);
            return digest512;
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Haraka.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.HARAKA-256", sb.toString());
            configurableProvider.addAlgorithm("MessageDigest.HARAKA-512", str + "$Digest512");
        }
    }

    private Haraka() {
    }
}
