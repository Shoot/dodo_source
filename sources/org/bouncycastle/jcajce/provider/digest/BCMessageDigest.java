package org.bouncycastle.jcajce.provider.digest;

import java.security.DigestException;
import java.security.MessageDigest;
/* loaded from: classes3.dex */
public class BCMessageDigest extends MessageDigest {
    protected e23 digest;
    protected int digestSize;

    /* JADX INFO: Access modifiers changed from: protected */
    public BCMessageDigest(e23 e23Var) {
        super(e23Var.getAlgorithmName());
        this.digest = e23Var;
        this.digestSize = e23Var.getDigestSize();
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i, int i2) throws DigestException {
        int i3 = this.digestSize;
        if (i2 >= i3) {
            if (bArr.length - i >= i3) {
                this.digest.doFinal(bArr, i);
                return this.digestSize;
            }
            throw new DigestException("insufficient space in the output buffer to store the digest");
        }
        throw new DigestException("partial digests not returned");
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.digest.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digestSize];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
