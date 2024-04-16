package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class DSASigner extends SignatureSpi implements co7, aac {
    private e23 digest;
    private t72 encoding = mta.a;
    private SecureRandom random;
    private u72 signer;

    /* loaded from: classes3.dex */
    public static class detDSA extends DSASigner {
        public detDSA() {
            super(f23.b(), new f82(new rj4(f23.b())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA224 extends DSASigner {
        public detDSA224() {
            super(f23.c(), new f82(new rj4(f23.c())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA256 extends DSASigner {
        public detDSA256() {
            super(f23.d(), new f82(new rj4(f23.d())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA384 extends DSASigner {
        public detDSA384() {
            super(f23.e(), new f82(new rj4(f23.e())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSA512 extends DSASigner {
        public detDSA512() {
            super(f23.j(), new f82(new rj4(f23.j())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(f23.f(), new f82(new rj4(f23.f())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(f23.g(), new f82(new rj4(f23.g())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(f23.h(), new f82(new rj4(f23.h())));
        }
    }

    /* loaded from: classes3.dex */
    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(f23.i(), new f82(new rj4(f23.i())));
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa224 extends DSASigner {
        public dsa224() {
            super(f23.c(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa256 extends DSASigner {
        public dsa256() {
            super(f23.d(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa384 extends DSASigner {
        public dsa384() {
            super(f23.e(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsa512 extends DSASigner {
        public dsa512() {
            super(f23.j(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaRMD160 extends DSASigner {
        public dsaRMD160() {
            super(new d39(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(f23.f(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(f23.g(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(f23.h(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(f23.i(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new p37(), new f82());
        }
    }

    /* loaded from: classes3.dex */
    public static class stdDSA extends DSASigner {
        public stdDSA() {
            super(f23.b(), new f82());
        }
    }

    protected DSASigner(e23 e23Var, u72 u72Var) {
        this.digest = e23Var;
        this.signer = u72Var;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        v71 generatePrivateKeyParameter = DSAUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new qq7(generatePrivateKeyParameter, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, generatePrivateKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        ux generatePublicKeyParameter = DSAUtil.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
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
            BigInteger[] b = this.signer.b(bArr);
            return this.encoding.b(this.signer.getOrder(), b[0], b[1]);
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
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            BigInteger[] a = this.encoding.a(this.signer.getOrder(), bArr);
            return this.signer.a(bArr2, a[0], a[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
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
