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
/* renamed from: eb6  reason: default package */
/* loaded from: classes3.dex */
public class eb6 extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                dk8 u = dk8.u(n.z(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (ko7.m.x(u.w().t())) {
                        hb6 v = hb6.v(u.B());
                        return new a50(new ib6(v.x(), v.w(), v.t(), v.u(), v.z(), v.A(), v.B()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                b1b u = b1b.u(n.z(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (ko7.m.x(u.t().t())) {
                        jb6 u2 = jb6.u(u.w());
                        return new b50(new kb6(u2.v(), u2.w(), u2.t()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException e) {
                    throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e.getMessage());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
        hb6 v = hb6.v(dk8Var.B().f());
        return new a50(new ib6(v.x(), v.w(), v.t(), v.u(), v.z(), v.A(), v.B()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(b1b b1bVar) throws IOException {
        jb6 u = jb6.u(b1bVar.w());
        return new b50(new kb6(u.v(), u.w(), u.t()));
    }
}
