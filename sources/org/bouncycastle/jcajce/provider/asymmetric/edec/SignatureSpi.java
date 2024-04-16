package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import org.bouncycastle.crypto.CryptoException;
/* loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private final String algorithm;
    private oka signer;

    /* loaded from: classes3.dex */
    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super("Ed25519");
        }
    }

    /* loaded from: classes3.dex */
    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super("Ed448");
        }
    }

    /* loaded from: classes3.dex */
    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super(null);
        }
    }

    SignatureSpi(String str) {
        this.algorithm = str;
    }

    private static ux getLwEdDSAKeyPrivate(Key key) throws InvalidKeyException {
        if (key instanceof BCEdDSAPrivateKey) {
            return ((BCEdDSAPrivateKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify EdDSA private key");
    }

    private static ux getLwEdDSAKeyPublic(Key key) throws InvalidKeyException {
        if (key instanceof BCEdDSAPublicKey) {
            return ((BCEdDSAPublicKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify EdDSA public key");
    }

    private oka getSigner(String str) throws InvalidKeyException {
        String str2 = this.algorithm;
        if (str2 != null && !str.equals(str2)) {
            throw new InvalidKeyException("inappropriate key for " + this.algorithm);
        } else if (str.equals("Ed448")) {
            return new tc3(EMPTY_CONTEXT);
        } else {
            return new nc3();
        }
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        String str;
        ux lwEdDSAKeyPrivate = getLwEdDSAKeyPrivate(privateKey);
        if (lwEdDSAKeyPrivate instanceof lc3) {
            str = "Ed25519";
        } else if (lwEdDSAKeyPrivate instanceof rc3) {
            str = "Ed448";
        } else {
            throw new IllegalStateException("unsupported private key type");
        }
        this.signer = getSigner(str);
        this.signer.init(true, lwEdDSAKeyPrivate);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        String str;
        ux lwEdDSAKeyPublic = getLwEdDSAKeyPublic(publicKey);
        if (lwEdDSAKeyPublic instanceof mc3) {
            str = "Ed25519";
        } else if (lwEdDSAKeyPublic instanceof sc3) {
            str = "Ed448";
        } else {
            throw new IllegalStateException("unsupported public key type");
        }
        this.signer = getSigner(str);
        this.signer.init(false, lwEdDSAKeyPublic);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() throws SignatureException {
        try {
            return this.signer.b();
        } catch (CryptoException e) {
            throw new SignatureException(e.getMessage());
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
    protected void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.signer.update(bArr, i, i2);
    }
}
