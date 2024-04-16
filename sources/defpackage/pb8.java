package defpackage;

import java.math.BigInteger;
/* renamed from: pb8  reason: default package */
/* loaded from: classes3.dex */
public class pb8 implements t72 {
    public static final pb8 a = new pb8();

    private void e(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i, int i2) {
        byte[] byteArray = c(bigInteger, bigInteger2).toByteArray();
        int max = Math.max(0, byteArray.length - i2);
        int length = byteArray.length - max;
        int i3 = (i2 - length) + i;
        tr.z(bArr, i, i3, (byte) 0);
        System.arraycopy(byteArray, max, bArr, i3, length);
    }

    @Override // defpackage.t72
    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        int i = db0.i(bigInteger);
        if (bArr.length == i * 2) {
            return new BigInteger[]{d(bigInteger, bArr, 0, i), d(bigInteger, bArr, i, i)};
        }
        throw new IllegalArgumentException("Encoding has incorrect length");
    }

    @Override // defpackage.t72
    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int i = db0.i(bigInteger);
        byte[] bArr = new byte[i * 2];
        e(bigInteger, bigInteger2, bArr, 0, i);
        e(bigInteger, bigInteger3, bArr, i, i);
        return bArr;
    }

    protected BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() >= 0 && bigInteger2.compareTo(bigInteger) < 0) {
            return bigInteger2;
        }
        throw new IllegalArgumentException("Value out of range");
    }

    protected BigInteger d(BigInteger bigInteger, byte[] bArr, int i, int i2) {
        return c(bigInteger, new BigInteger(1, tr.w(bArr, i, i2 + i)));
    }
}
