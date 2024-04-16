package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: w29  reason: default package */
/* loaded from: classes3.dex */
public class w29 implements xc0 {
    private int[] a = null;
    private boolean b;

    private int c(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 3; i3 >= 0; i3--) {
            i2 = (i2 << 8) + (bArr[i3 + i] & 255);
        }
        return i2;
    }

    private int d(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i);
        int c2 = c(bArr, i + 4);
        int c3 = c(bArr, i + 8);
        int c4 = c(bArr, i + 12);
        int[] iArr = this.a;
        int i3 = c3 - iArr[43];
        int i4 = c - iArr[42];
        int i5 = 20;
        while (i5 >= 1) {
            int f = f(((i4 * 2) + 1) * i4, 5);
            int f2 = f(((i3 * 2) + 1) * i3, 5);
            int i6 = i5 * 2;
            i5--;
            int i7 = i4;
            i4 = g(c4 - this.a[i6], f2) ^ f;
            c4 = i3;
            i3 = g(c2 - this.a[i6 + 1], f) ^ f2;
            c2 = i7;
        }
        int[] iArr2 = this.a;
        i(i4, bArr2, i2);
        i(c2 - iArr2[0], bArr2, i2 + 4);
        i(i3, bArr2, i2 + 8);
        i(c4 - iArr2[1], bArr2, i2 + 12);
        return 16;
    }

    private int e(byte[] bArr, int i, byte[] bArr2, int i2) {
        int c = c(bArr, i);
        int c2 = c(bArr, i + 4);
        int c3 = c(bArr, i + 8);
        int c4 = c(bArr, i + 12);
        int[] iArr = this.a;
        int i3 = c2 + iArr[0];
        int i4 = c4 + iArr[1];
        int i5 = 1;
        while (i5 <= 20) {
            int f = f(((i3 * 2) + 1) * i3, 5);
            int f2 = f(((i4 * 2) + 1) * i4, 5);
            int i6 = i5 * 2;
            int f3 = f(c3 ^ f2, f) + this.a[i6 + 1];
            i5++;
            c3 = i4;
            i4 = f(c ^ f, f2) + this.a[i6];
            c = i3;
            i3 = f3;
        }
        int[] iArr2 = this.a;
        int i7 = c3 + iArr2[43];
        i(c + iArr2[42], bArr2, i2);
        i(i3, bArr2, i2 + 4);
        i(i7, bArr2, i2 + 8);
        i(i4, bArr2, i2 + 12);
        return 16;
    }

    private int f(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private int g(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private void h(byte[] bArr) {
        int[] iArr;
        int length;
        int length2 = (bArr.length + 3) / 4;
        int length3 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length3];
        for (int length4 = bArr.length - 1; length4 >= 0; length4--) {
            int i = length4 / 4;
            iArr2[i] = (iArr2[i] << 8) + (bArr[length4] & 255);
        }
        int[] iArr3 = new int[44];
        this.a = iArr3;
        iArr3[0] = -1209970333;
        int i2 = 1;
        while (true) {
            iArr = this.a;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = iArr[i2 - 1] - 1640531527;
            i2++;
        }
        if (length3 > iArr.length) {
            length = length3 * 3;
        } else {
            length = iArr.length * 3;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int[] iArr4 = this.a;
            i4 = f(iArr4[i3] + i4 + i5, 3);
            iArr4[i3] = i4;
            i5 = f(iArr2[i6] + i4 + i5, i5 + i4);
            iArr2[i6] = i5;
            i3 = (i3 + 1) % this.a.length;
            i6 = (i6 + 1) % length3;
        }
    }

    private void i(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3 + i2] = (byte) i;
            i >>>= 8;
        }
    }

    @Override // defpackage.xc0
    public int a() {
        return 16;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int a = a();
        if (this.a != null) {
            if (i + a <= bArr.length) {
                if (a + i2 <= bArr2.length) {
                    if (this.b) {
                        return e(bArr, i, bArr2, i2);
                    }
                    return d(bArr, i, bArr2, i2);
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("RC6 engine not initialised");
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            this.b = z;
            h(((lf5) v71Var).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC6 init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
