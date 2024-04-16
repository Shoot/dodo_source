package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
/* loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (keySpec instanceof oa7) {
            ux c = pa7.c(((oa7) keySpec).getEncoded());
            if (c instanceof d82) {
                d82 d82Var = (d82) c;
                return engineGeneratePrivate(new DSAPrivateKeySpec(d82Var.c(), d82Var.b().b(), d82Var.b().c(), d82Var.b().a()));
            }
            throw new IllegalArgumentException("openssh private key is not dsa privare key");
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new InvalidKeySpecException("invalid KeySpec: " + e.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else if (keySpec instanceof qa7) {
            ux c = ra7.c(((qa7) keySpec).getEncoded());
            if (c instanceof e82) {
                e82 e82Var = (e82) c;
                return engineGeneratePublic(new DSAPublicKeySpec(e82Var.c(), e82Var.b().b(), e82Var.b().c(), e82Var.b().a()));
            }
            throw new IllegalArgumentException("openssh public key is not dsa public key");
        } else {
            return super.engineGeneratePublic(keySpec);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        } else if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        } else if (cls.isAssignableFrom(qa7.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new qa7(ra7.a(new e82(dSAPublicKey2.getY(), new b82(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e) {
                throw new IllegalArgumentException("unable to produce encoding: " + e.getMessage());
            }
        } else if (cls.isAssignableFrom(oa7.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
            try {
                return new oa7(pa7.b(new d82(dSAPrivateKey2.getX(), new b82(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
            } catch (IOException e2) {
                throw new IllegalArgumentException("unable to produce encoding: " + e2.getMessage());
            }
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
        k t = dk8Var.w().t();
        if (DSAUtil.isDsaOid(t)) {
            return new BCDSAPrivateKey(dk8Var);
        }
        throw new IOException("algorithm identifier " + t + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(b1b b1bVar) throws IOException {
        k t = b1bVar.t().t();
        if (DSAUtil.isDsaOid(t)) {
            return new BCDSAPublicKey(b1bVar);
        }
        throw new IOException("algorithm identifier " + t + " in key not recognised");
    }
}
