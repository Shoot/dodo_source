package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
/* loaded from: classes3.dex */
public class DigestSignatureSpi extends SignatureSpi {
    private eb algId;
    private rx cipher;
    private e23 digest;

    /* loaded from: classes3.dex */
    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(co7.A0, new o36(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(co7.B0, new p36(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(co7.C0, f23.a(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(j8b.c, new c39(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(j8b.b, new d39(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(j8b.d, new e39(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(g47.i, f23.b(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(ms6.f, f23.c(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(ms6.c, f23.d(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(ms6.d, f23.e(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(ms6.i, f23.f(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(ms6.j, f23.g(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(ms6.k, f23.h(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(ms6.l, f23.i(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(ms6.e, f23.j(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(ms6.g, f23.k(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(ms6.h, f23.l(), new xn7(new g39()));
        }
    }

    /* loaded from: classes3.dex */
    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new p37(), new xn7(new g39()));
        }
    }

    protected DigestSignatureSpi(e23 e23Var, rx rxVar) {
        this.digest = e23Var;
        this.cipher = rxVar;
        this.algId = null;
    }

    private byte[] derEncode(byte[] bArr) throws IOException {
        eb ebVar = this.algId;
        if (ebVar == null) {
            return bArr;
        }
        return new g23(ebVar, bArr).p("DER");
    }

    private String getType(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            n39 generatePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
            this.digest.reset();
            this.cipher.init(true, generatePrivateKeyParameter);
            return;
        }
        throw new InvalidKeyException("Supplied key (" + getType(privateKey) + ") is not a RSAPrivateKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof RSAPublicKey) {
            n39 generatePublicKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
            this.digest.reset();
            this.cipher.init(false, generatePublicKeyParameter);
            return;
        }
        throw new InvalidKeyException("Supplied key (" + getType(publicKey) + ") is not a RSAPublicKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] derEncode = derEncode(bArr);
            return this.cipher.c(derEncode, 0, derEncode.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws SignatureException {
        this.digest.update(b);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] c;
        byte[] derEncode;
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            c = this.cipher.c(bArr, 0, bArr.length);
            derEncode = derEncode(bArr2);
        } catch (Exception unused) {
        }
        if (c.length == derEncode.length) {
            return tr.u(c, derEncode);
        }
        if (c.length == derEncode.length - 2) {
            derEncode[1] = (byte) (derEncode[1] - 2);
            byte b = (byte) (derEncode[3] - 2);
            derEncode[3] = b;
            int i = b + 4;
            int i2 = b + 6;
            int i3 = 0;
            for (int i4 = 0; i4 < derEncode.length - i2; i4++) {
                i3 |= c[i + i4] ^ derEncode[i2 + i4];
            }
            for (int i5 = 0; i5 < i; i5++) {
                i3 |= c[i5] ^ derEncode[i5];
            }
            if (i3 != 0) {
                return false;
            }
            return true;
        }
        tr.u(derEncode, derEncode);
        return false;
    }

    protected DigestSignatureSpi(k kVar, e23 e23Var, rx rxVar) {
        this.digest = e23Var;
        this.cipher = rxVar;
        this.algId = new eb(kVar, q0.a);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.digest.update(bArr, i, i2);
    }
}
