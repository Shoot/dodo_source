package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: ubc  reason: default package */
/* loaded from: classes3.dex */
public class ubc implements xc0 {
    private int[] a = new int[4];
    private int[] b = new int[32];
    private int[] c = new int[32];
    private boolean d = false;
    private boolean e;

    private int c(byte[] bArr, int i) {
        int i2 = i + 2;
        int i3 = (bArr[i + 1] & 255) << 16;
        return (bArr[i + 3] & 255) | i3 | (bArr[i] << 24) | ((bArr[i2] & 255) << 8);
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i);
        int c2 = c(bArr, i + 4);
        for (int i3 = 31; i3 >= 0; i3--) {
            c2 -= (((c << 4) ^ (c >>> 5)) + c) ^ this.c[i3];
            c -= (((c2 << 4) ^ (c2 >>> 5)) + c2) ^ this.b[i3];
        }
        g(c, bArr2, i2);
        g(c2, bArr2, i2 + 4);
        return 8;
    }

    private int e(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i);
        int c2 = c(bArr, i + 4);
        for (int i3 = 0; i3 < 32; i3++) {
            c += (((c2 << 4) ^ (c2 >>> 5)) + c2) ^ this.b[i3];
            c2 += (((c << 4) ^ (c >>> 5)) + c) ^ this.c[i3];
        }
        g(c, bArr2, i2);
        g(c2, bArr2, i2 + 4);
        return 8;
    }

    private void f(byte[] bArr) {
        if (bArr.length == 16) {
            int i = 0;
            int i2 = 0;
            while (i < 4) {
                this.a[i] = c(bArr, i2);
                i++;
                i2 += 4;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < 32; i4++) {
                int[] iArr = this.b;
                int[] iArr2 = this.a;
                iArr[i4] = iArr2[i3 & 3] + i3;
                i3 -= 1640531527;
                this.c[i4] = iArr2[(i3 >>> 11) & 3] + i3;
            }
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
        if (this.d) {
            if (i + 8 <= bArr.length) {
                if (i2 + 8 <= bArr2.length) {
                    if (this.e) {
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
        return "XTEA";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            this.e = z;
            this.d = true;
            f(((lf5) v71Var).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
