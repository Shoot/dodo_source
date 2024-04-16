package org.bouncycastle.jcajce.provider.asymmetric;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
/* loaded from: classes3.dex */
public class COMPOSITE {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    /* loaded from: classes3.dex */
    private static class CompositeKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public CompositeKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
            p D = p.D(dk8Var.v().F());
            PrivateKey[] privateKeyArr = new PrivateKey[D.size()];
            for (int i = 0; i != D.size(); i++) {
                dk8 u = dk8.u(D.F(i));
                privateKeyArr[i] = this.provider.getKeyInfoConverter(u.w().t()).generatePrivate(u);
            }
            return new zn1(privateKeyArr);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(b1b b1bVar) throws IOException {
            p D = p.D(b1bVar.v().E());
            PublicKey[] publicKeyArr = new PublicKey[D.size()];
            for (int i = 0; i != D.size(); i++) {
                b1b u = b1b.u(D.F(i));
                publicKeyArr[i] = this.provider.getKeyInfoConverter(u.t().t()).generatePublic(u);
            }
            return new bo1(publicKeyArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        protected Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(dk8.u(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(b1b.u(key.getEncoded()));
                }
                throw new InvalidKeyException("key not recognized");
            } catch (IOException e) {
                throw new InvalidKeyException("key could not be parsed: " + e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
            return COMPOSITE.baseConverter.generatePrivate(dk8Var);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(b1b b1bVar) throws IOException {
            return COMPOSITE.baseConverter.generatePublic(b1bVar);
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            StringBuilder sb = new StringBuilder();
            sb.append("KeyFactory.");
            k kVar = pl6.N;
            sb.append(kVar);
            configurableProvider.addAlgorithm(sb.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            configurableProvider.addAlgorithm("KeyFactory.OID." + kVar, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(kVar, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        compositeAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
