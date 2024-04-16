package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
/* loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof nb4) {
            return new BCGOST3410PrivateKey((nb4) keySpec);
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof sb4) {
            return new BCGOST3410PublicKey((sb4) keySpec);
        }
        return super.engineGeneratePublic(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(sb4.class) && (key instanceof ob4)) {
            ob4 ob4Var = (ob4) key;
            qb4 a = ob4Var.getParameters().a();
            return new sb4(ob4Var.getY(), a.b(), a.c(), a.a());
        } else if (cls.isAssignableFrom(nb4.class) && (key instanceof lb4)) {
            lb4 lb4Var = (lb4) key;
            qb4 a2 = lb4Var.getParameters().a();
            return new nb4(lb4Var.getX(), a2.b(), a2.c(), a2.a());
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ob4) {
            return new BCGOST3410PublicKey((ob4) key);
        }
        if (key instanceof lb4) {
            return new BCGOST3410PrivateKey((lb4) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
        k t = dk8Var.w().t();
        if (t.x(y22.l)) {
            return new BCGOST3410PrivateKey(dk8Var);
        }
        throw new IOException("algorithm identifier " + t + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(b1b b1bVar) throws IOException {
        k t = b1bVar.t().t();
        if (t.x(y22.l)) {
            return new BCGOST3410PublicKey(b1bVar);
        }
        throw new IOException("algorithm identifier " + t + " in key not recognised");
    }
}
