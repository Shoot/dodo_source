package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
/* loaded from: classes3.dex */
public class SignatureSpi extends java.security.SignatureSpi implements co7, aac {
    private e23 digest;
    private u72 signer = new p82();

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    @Override // java.security.SignatureSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void engineInitSign(java.security.PrivateKey r5) throws java.security.InvalidKeyException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey
            if (r0 == 0) goto L18
            ux r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            vb4 r0 = new vb4
            byte[] r1 = defpackage.n82.u()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>(r1)
        L15:
            r4.digest = r0
            goto L2f
        L18:
            boolean r0 = r5 instanceof defpackage.ua3
            if (r0 == 0) goto L2e
            ux r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            vb4 r0 = new vb4
            byte[] r1 = defpackage.n82.u()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>(r1)
            goto L15
        L2e:
            r5 = 0
        L2f:
            java.security.SecureRandom r0 = r4.appRandom
            r1 = 1
            if (r0 == 0) goto L3f
            u72 r2 = r4.signer
            qq7 r3 = new qq7
            r3.<init>(r5, r0)
            r2.init(r1, r3)
            goto L44
        L3f:
            u72 r0 = r4.signer
            r0.init(r1, r5)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi.engineInitSign(java.security.PrivateKey):void");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        v71 generatePublicKeyParameter;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            generatePublicKeyParameter = bCDSTU4145PublicKey.engineGetKeyParameters();
            this.digest = new vb4(expandSbox(bCDSTU4145PublicKey.getSbox()));
        } else {
            generatePublicKeyParameter = ECUtil.generatePublicKeyParameter(publicKey);
            this.digest = new vb4(expandSbox(n82.u()));
        }
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        int length;
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] b = this.signer.b(bArr);
            byte[] byteArray = b[0].toByteArray();
            byte[] byteArray2 = b[1].toByteArray();
            if (byteArray.length > byteArray2.length) {
                length = byteArray.length;
            } else {
                length = byteArray2.length;
            }
            int i = length * 2;
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray2, 0, bArr2, (i / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            return new s0(bArr2).getEncoded();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b) throws SignatureException {
        this.digest.update(b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            byte[] F = ((l) n.z(bArr)).F();
            byte[] bArr3 = new byte[F.length / 2];
            byte[] bArr4 = new byte[F.length / 2];
            System.arraycopy(F, 0, bArr4, 0, F.length / 2);
            System.arraycopy(F, F.length / 2, bArr3, 0, F.length / 2);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            return this.signer.a(bArr2, new BigInteger[]{new BigInteger(1, bArr3), bigInteger}[0], bigInteger);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    byte[] expandSbox(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr2[i2] = (byte) ((bArr[i] >> 4) & 15);
            bArr2[i2 + 1] = (byte) (bArr[i] & 15);
        }
        return bArr2;
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
