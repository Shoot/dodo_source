package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
/* loaded from: classes3.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {
    private AlgorithmParameters engineParams;
    private final d95 helper = new u40();
    private qq9 paramSpec;
    private final rq9 signer;

    /* loaded from: classes3.dex */
    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new rq9(new dq9()));
        }
    }

    /* loaded from: classes3.dex */
    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new rq9());
        }
    }

    GMSignatureSpi(rq9 rq9Var) {
        this.signer = rq9Var;
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters g = this.helper.g("PSS");
                this.engineParams = g;
                g.init(this.paramSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        v71 generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new qq7(generatePrivateKeyParameter, secureRandom);
        }
        qq9 qq9Var = this.paramSpec;
        if (qq9Var != null) {
            this.signer.init(true, new oq7(generatePrivateKeyParameter, qq9Var.a()));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        v71 generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        qq9 qq9Var = this.paramSpec;
        if (qq9Var != null) {
            generatePublicKeyParameter = new oq7(generatePublicKeyParameter, qq9Var.a());
        }
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.signer.b();
        } catch (CryptoException e) {
            throw new SignatureException("unable to create signature: " + e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws SignatureException {
        this.signer.update(b);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.a(bArr);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof qq9)) {
            throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
        }
        this.paramSpec = (qq9) algorithmParameterSpec;
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.signer.update(bArr, i, i2);
    }
}
