package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
/* loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    String algorithm;
    ProviderConfiguration configuration;

    /* loaded from: classes3.dex */
    public static class EC extends KeyFactorySpi {
        public EC() {
            super("EC", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", ff0.b);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", ff0.b);
        }
    }

    KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof ob3) {
            return new BCECPrivateKey(this.algorithm, (ob3) keySpec, this.configuration);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (keySpec instanceof oa7) {
            mb3 t = mb3.t(((oa7) keySpec).getEncoded());
            try {
                return new BCECPrivateKey(this.algorithm, new dk8(new eb(oac.C3, t.w()), t), this.configuration);
            } catch (IOException e) {
                throw new InvalidKeySpecException("bad encoding: " + e.getMessage());
            }
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        try {
            if (keySpec instanceof rb3) {
                return new BCECPublicKey(this.algorithm, (rb3) keySpec, this.configuration);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (ECPublicKeySpec) keySpec, this.configuration);
            }
            if (keySpec instanceof qa7) {
                ux c = ra7.c(((qa7) keySpec).getEncoded());
                if (c instanceof qb3) {
                    la3 b = ((qb3) c).b();
                    return engineGeneratePublic(new rb3(((qb3) c).c(), new ib3(b.a(), b.b(), b.e(), b.c(), b.f())));
                }
                throw new IllegalArgumentException("openssh key is not ec public key");
            }
            return super.engineGeneratePublic(keySpec);
        } catch (Exception e) {
            throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPublicKeySpec.class)) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            ib3 ecImplicitlyCa = ff0.b.getEcImplicitlyCa();
            return new ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.a(), ecImplicitlyCa.e()), ecImplicitlyCa));
        } else if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(ECPrivateKeySpec.class)) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            ib3 ecImplicitlyCa2 = ff0.b.getEcImplicitlyCa();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.a(), ecImplicitlyCa2.e()), ecImplicitlyCa2));
        } else if (cls.isAssignableFrom(rb3.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new rb3(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new rb3(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), ff0.b.getEcImplicitlyCa());
        } else if (cls.isAssignableFrom(ob3.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new ob3(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new ob3(eCPrivateKey2.getS(), ff0.b.getEcImplicitlyCa());
        } else if (cls.isAssignableFrom(qa7.class) && (key instanceof ECPublicKey)) {
            if (key instanceof BCECPublicKey) {
                BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
                ib3 parameters = bCECPublicKey.getParameters();
                try {
                    return new qa7(ra7.a(new qb3(bCECPublicKey.getQ(), new la3(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()))));
                } catch (IOException e) {
                    throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
        } else if (cls.isAssignableFrom(oa7.class) && (key instanceof ECPrivateKey)) {
            if (key instanceof BCECPrivateKey) {
                try {
                    return new oa7(dk8.u(key.getEncoded()).B().f().getEncoded());
                } catch (IOException e2) {
                    throw new IllegalArgumentException("cannot encoded key: " + e2.getMessage());
                }
            }
            throw new IllegalArgumentException("invalid key type: " + key.getClass().getName());
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.configuration);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.configuration);
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
        k t = dk8Var.w().t();
        if (t.x(oac.C3)) {
            return new BCECPrivateKey(this.algorithm, dk8Var, this.configuration);
        }
        throw new IOException("algorithm identifier " + t + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(b1b b1bVar) throws IOException {
        k t = b1bVar.t().t();
        if (t.x(oac.C3)) {
            return new BCECPublicKey(this.algorithm, b1bVar, this.configuration);
        }
        throw new IOException("algorithm identifier " + t + " in key not recognised");
    }
}
