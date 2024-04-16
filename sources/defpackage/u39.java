package defpackage;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
/* renamed from: u39  reason: default package */
/* loaded from: classes3.dex */
public class u39 extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof w39) {
            return new f50((w39) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(dk8.u(n.z(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof y39) {
            return new g50((y39) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return generatePublic(b1b.u(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof f50) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (w39.class.isAssignableFrom(cls)) {
                f50 f50Var = (f50) key;
                return new w39(f50Var.c(), f50Var.a(), f50Var.d(), f50Var.b(), f50Var.f(), f50Var.e());
            }
        } else if (key instanceof g50) {
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (y39.class.isAssignableFrom(cls)) {
                g50 g50Var = (g50) key;
                return new y39(g50Var.d(), g50Var.a(), g50Var.c(), g50Var.b());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (!(key instanceof f50) && !(key instanceof g50)) {
            throw new InvalidKeyException("Unsupported key type");
        }
        return key;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
        v39 v = v39.v(dk8Var.B());
        return new f50(v.w(), v.t(), v.x(), v.u(), v.A(), v.z());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(b1b b1bVar) throws IOException {
        x39 x = x39.x(b1bVar.w());
        return new g50(x.w(), x.t(), x.v(), x.u());
    }
}
