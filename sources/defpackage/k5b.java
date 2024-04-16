package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: k5b  reason: default package */
/* loaded from: classes3.dex */
public class k5b implements xc0 {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e = false;
    private boolean f;

    private int c(byte[] bArr, int i) {
        int i2 = i + 2;
        int i3 = (bArr[i + 1] & 255) << 16;
        return (bArr[i + 3] & 255) | i3 | (bArr[i] << 24) | ((bArr[i2] & 255) << 8);
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i);
        int c2 = c(bArr, i + 4);
        int i3 = -957401312;
        for (int i4 = 0; i4 != 32; i4++) {
            c2 -= (((c << 4) + this.c) ^ (c + i3)) ^ ((c >>> 5) + this.d);
            c -= (((c2 << 4) + this.a) ^ (c2 + i3)) ^ ((c2 >>> 5) + this.b);
            i3 += 1640531527;
        }
        g(c, bArr2, i2);
        g(c2, bArr2, i2 + 4);
        return 8;
    }

    private int e(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i);
        int c2 = c(bArr, i + 4);
        int i3 = c;
        int i4 = 0;
        for (int i5 = 0; i5 != 32; i5++) {
            i4 -= 1640531527;
            i3 += (((c2 << 4) + this.a) ^ (c2 + i4)) ^ ((c2 >>> 5) + this.b);
            c2 += (((i3 << 4) + this.c) ^ (i3 + i4)) ^ ((i3 >>> 5) + this.d);
        }
        g(i3, bArr2, i2);
        g(c2, bArr2, i2 + 4);
        return 8;
    }

    private void f(byte[] bArr) {
        if (bArr.length == 16) {
            this.a = c(bArr, 0);
            this.b = c(bArr, 4);
            this.c = c(bArr, 8);
            this.d = c(bArr, 12);
            return;
        }
        throw new IllegalArgumentException("Key size must be 128 bits.");
    }

    private void g(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    @Override // defpackage.xc0
    public int a() {
        return 8;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.e) {
            if (i + 8 <= bArr.length) {
                if (i2 + 8 <= bArr2.length) {
                    if (this.f) {
                        return e(bArr, i, bArr2, i2);
                    }
                    return d(bArr, i, bArr2, i2);
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            this.f = z;
            this.e = true;
            f(((lf5) v71Var).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
