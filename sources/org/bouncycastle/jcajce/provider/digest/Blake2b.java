package org.bouncycastle.jcajce.provider.digest;

import ch.qos.logback.core.net.SyslogConstants;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
/* loaded from: classes3.dex */
public class Blake2b {

    /* loaded from: classes3.dex */
    public static class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new nc0((int) SyslogConstants.LOG_LOCAL4));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.digest = new nc0((nc0) this.digest);
            return blake2b160;
        }
    }

    /* loaded from: classes3.dex */
    public static class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new nc0(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.digest = new nc0((nc0) this.digest);
            return blake2b256;
        }
    }

    /* loaded from: classes3.dex */
    public static class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new nc0(384));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.digest = new nc0((nc0) this.digest);
            return blake2b384;
        }
    }

    /* loaded from: classes3.dex */
    public static class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new nc0(512));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.digest = new nc0((nc0) this.digest);
            return blake2b512;
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Blake2b512");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-512", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + pl6.H, "BLAKE2B-512");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-384", str + "$Blake2b384");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + pl6.G, "BLAKE2B-384");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-256", str + "$Blake2b256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + pl6.F, "BLAKE2B-256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-160", str + "$Blake2b160");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + pl6.E, "BLAKE2B-160");
        }
    }

    private Blake2b() {
    }
}
