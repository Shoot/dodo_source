package org.bouncycastle.jcajce.provider.digest;

import ch.qos.logback.core.net.SyslogConstants;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
/* loaded from: classes3.dex */
public class RIPEMD160 {

    /* loaded from: classes3.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new d39());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new d39((d39) this.digest);
            return digest;
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new qj4(new d39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD160", SyslogConstants.LOG_LOCAL4, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD160.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD160", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + j8b.b, "RIPEMD160");
            addHMACAlgorithm(configurableProvider, "RIPEMD160", str + "$HashMac", str + "$KeyGenerator");
            addHMACAlias(configurableProvider, "RIPEMD160", dr4.q);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACRIPEMD160", str + "$PBEWithHmacKeyFactory");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACRIPEMD160", str + "$PBEWithHmac");
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithHmac extends BaseMac {
        public PBEWithHmac() {
            super(new qj4(new d39()), 2, 2, SyslogConstants.LOG_LOCAL4);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithHmacKeyFactory extends PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super("PBEwithHmacRIPEMD160", null, false, 2, 2, SyslogConstants.LOG_LOCAL4, 0);
        }
    }

    private RIPEMD160() {
    }
}
