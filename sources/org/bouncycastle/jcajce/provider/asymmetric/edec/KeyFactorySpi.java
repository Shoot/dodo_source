package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.util.encoders.b;
/* loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private static final byte Ed25519_type = 112;
    private static final byte Ed448_type = 113;
    private static final byte x25519_type = 110;
    private static final byte x448_type = 111;
    String algorithm;
    private final boolean isXdh;
    private final int specificBase;
    static final byte[] x448Prefix = b.a("3042300506032b656f033900");
    static final byte[] x25519Prefix = b.a("302a300506032b656e032100");
    static final byte[] Ed448Prefix = b.a("3043300506032b6571033a00");
    static final byte[] Ed25519Prefix = b.a("302a300506032b6570032100");

    /* loaded from: classes3.dex */
    public static class Ed25519 extends KeyFactorySpi {
        public Ed25519() {
            super("Ed25519", false, 112);
        }
    }

    /* loaded from: classes3.dex */
    public static class Ed448 extends KeyFactorySpi {
        public Ed448() {
            super("Ed448", false, 113);
        }
    }

    /* loaded from: classes3.dex */
    public static class EdDSA extends KeyFactorySpi {
        public EdDSA() {
            super("EdDSA", false, 0);
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super("X25519", true, 110);
        }
    }

    /* loaded from: classes3.dex */
    public static class X448 extends KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    /* loaded from: classes3.dex */
    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z, int i) {
        this.algorithm = str;
        this.isXdh = z;
        this.specificBase = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof oa7) {
            ux c = pa7.c(((oa7) keySpec).getEncoded());
            if (c instanceof lc3) {
                return new BCEdDSAPrivateKey((lc3) c);
            }
            throw new IllegalStateException("openssh private key not Ed25519 private key");
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i = this.specificBase;
            if (i == 0 || i == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    b1b u = b1b.u(encoded);
                    try {
                        encoded = new b1b(new eb(u.t().t()), u.v().E()).p("DER");
                    } catch (IOException e) {
                        throw new InvalidKeySpecException("attempt to reconstruct key failed: " + e.getMessage());
                    }
                }
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(x25519Prefix, encoded);
                    case 111:
                        return new BCXDHPublicKey(x448Prefix, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(Ed25519Prefix, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(Ed448Prefix, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof d79) {
            byte[] encoded2 = ((d79) keySpec).getEncoded();
            switch (this.specificBase) {
                case 110:
                    return new BCXDHPublicKey(new l9c(encoded2));
                case 111:
                    return new BCXDHPublicKey(new s9c(encoded2));
                case 112:
                    return new BCEdDSAPublicKey(new mc3(encoded2));
                case 113:
                    return new BCEdDSAPublicKey(new sc3(encoded2));
                default:
                    throw new InvalidKeySpecException("factory not a specific type, cannot recognise raw encoding");
            }
        } else if (keySpec instanceof qa7) {
            ux c = ra7.c(((qa7) keySpec).getEncoded());
            if (c instanceof mc3) {
                return new BCEdDSAPublicKey(new byte[0], ((mc3) c).getEncoded());
            }
            throw new IllegalStateException("openssh public key not Ed25519 public key");
        }
        return super.engineGeneratePublic(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(oa7.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new oa7(pa7.b(new lc3(l.D(n.z(l.D(p.D(key.getEncoded()).F(2)).F())).F())));
            } catch (IOException e) {
                throw new InvalidKeySpecException(e.getMessage(), e.getCause());
            }
        } else if (cls.isAssignableFrom(qa7.class) && (key instanceof BCEdDSAPublicKey)) {
            try {
                byte[] encoded = key.getEncoded();
                byte[] bArr = Ed25519Prefix;
                if (tr.b(bArr, 0, bArr.length, encoded, 0, encoded.length - 32)) {
                    return new qa7(ra7.a(new mc3(encoded, bArr.length)));
                }
                throw new InvalidKeySpecException("Invalid Ed25519 public key encoding");
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.getMessage(), e2.getCause());
            }
        } else {
            if (cls.isAssignableFrom(d79.class)) {
                if (key instanceof uac) {
                    return new d79(((uac) key).getUEncoding());
                }
                if (key instanceof vc3) {
                    return new d79(((vc3) key).getPointEncoding());
                }
            }
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(dk8 dk8Var) throws IOException {
        k t = dk8Var.w().t();
        if (this.isXdh) {
            int i = this.specificBase;
            if ((i == 0 || i == 111) && t.x(wc3.c)) {
                return new BCXDHPrivateKey(dk8Var);
            }
            int i2 = this.specificBase;
            if ((i2 == 0 || i2 == 110) && t.x(wc3.b)) {
                return new BCXDHPrivateKey(dk8Var);
            }
        } else {
            k kVar = wc3.e;
            if (t.x(kVar) || t.x(wc3.d)) {
                int i3 = this.specificBase;
                if ((i3 == 0 || i3 == 113) && t.x(kVar)) {
                    return new BCEdDSAPrivateKey(dk8Var);
                }
                int i4 = this.specificBase;
                if ((i4 == 0 || i4 == 112) && t.x(wc3.d)) {
                    return new BCEdDSAPrivateKey(dk8Var);
                }
            }
        }
        throw new IOException("algorithm identifier " + t + " in key not recognized");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(b1b b1bVar) throws IOException {
        k t = b1bVar.t().t();
        if (this.isXdh) {
            int i = this.specificBase;
            if ((i == 0 || i == 111) && t.x(wc3.c)) {
                return new BCXDHPublicKey(b1bVar);
            }
            int i2 = this.specificBase;
            if ((i2 == 0 || i2 == 110) && t.x(wc3.b)) {
                return new BCXDHPublicKey(b1bVar);
            }
        } else {
            k kVar = wc3.e;
            if (t.x(kVar) || t.x(wc3.d)) {
                int i3 = this.specificBase;
                if ((i3 == 0 || i3 == 113) && t.x(kVar)) {
                    return new BCEdDSAPublicKey(b1bVar);
                }
                int i4 = this.specificBase;
                if ((i4 == 0 || i4 == 112) && t.x(wc3.d)) {
                    return new BCEdDSAPublicKey(b1bVar);
                }
            }
        }
        throw new IOException("algorithm identifier " + t + " in key not recognized");
    }
}
