package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
/* loaded from: classes3.dex */
public class ECGOST2012SignatureSpi512 extends SignatureSpi implements co7, aac {
    private int size = 128;
    private int halfSize = 64;
    private e23 digest = new yb4();
    private u72 signer = new sa3();

    static ux generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCECGOST3410_2012PublicKey) {
            return ((BCECGOST3410_2012PublicKey) publicKey).engineGetKeyParameters();
        }
        return ECUtil.generatePublicKeyParameter(publicKey);
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ua3) {
            xa3 xa3Var = (xa3) ECUtil.generatePrivateKeyParameter(privateKey);
            if (xa3Var.b().e().bitLength() >= 505) {
                this.digest.reset();
                SecureRandom secureRandom = ((SignatureSpi) this).appRandom;
                if (secureRandom != null) {
                    this.signer.init(true, new qq7(xa3Var, secureRandom));
                    return;
                } else {
                    this.signer.init(true, xa3Var);
                    return;
                }
            }
            throw new InvalidKeyException("key too weak for ECGOST-2012-512");
        }
        throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        xa3 xa3Var;
        if (publicKey instanceof pb3) {
            xa3Var = (xa3) generatePublicKeyParameter(publicKey);
        } else {
            try {
                xa3Var = (xa3) ECUtil.generatePublicKeyParameter(ff0.e(b1b.u(publicKey.getEncoded())));
            } catch (Exception unused) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
            }
        }
        if (xa3Var.b().e().bitLength() >= 505) {
            this.digest.reset();
            this.signer.init(false, xa3Var);
            return;
        }
        throw new InvalidKeyException("key too weak for ECGOST-2012-512");
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
            byte[] bArr2 = new byte[this.size];
            BigInteger[] b = this.signer.b(bArr);
            byte[] byteArray = b[0].toByteArray();
            byte[] byteArray2 = b[1].toByteArray();
            if (byteArray2[0] != 0) {
                System.arraycopy(byteArray2, 0, bArr2, this.halfSize - byteArray2.length, byteArray2.length);
            } else {
                System.arraycopy(byteArray2, 1, bArr2, this.halfSize - (byteArray2.length - 1), byteArray2.length - 1);
            }
            if (byteArray[0] != 0) {
                System.arraycopy(byteArray, 0, bArr2, this.size - byteArray.length, byteArray.length);
            } else {
                System.arraycopy(byteArray, 1, bArr2, this.size - (byteArray.length - 1), byteArray.length - 1);
            }
            return bArr2;
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
            int i = this.halfSize;
            byte[] bArr3 = new byte[i];
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr, 0, bArr4, 0, i);
            int i2 = this.halfSize;
            System.arraycopy(bArr, i2, bArr3, 0, i2);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.signer.a(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
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
