package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: mr4  reason: default package */
/* loaded from: classes3.dex */
public class mr4 implements xc0 {
    private int[] a = null;

    private int d(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    private int[] e(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = d(bArr, i2 * 2);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] f(boolean z, byte[] bArr) {
        if (z) {
            return e(bArr);
        }
        return h(e(bArr));
    }

    private void g(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int d = d(bArr, i);
        int d2 = d(bArr, i + 2);
        int d3 = d(bArr, i + 4);
        int d4 = d(bArr, i + 6);
        int i3 = 0;
        int i4 = d3;
        int i5 = d2;
        int i6 = d;
        int i7 = 0;
        while (i3 < 8) {
            int i8 = i(i6, iArr[i7]);
            int i9 = (i5 + iArr[i7 + 1]) & 65535;
            int i10 = (i4 + iArr[i7 + 2]) & 65535;
            int i11 = i(d4, iArr[i7 + 3]);
            int i12 = i7 + 5;
            int i13 = i(i10 ^ i8, iArr[i7 + 4]);
            i7 += 6;
            int i14 = i(((i9 ^ i11) + i13) & 65535, iArr[i12]);
            int i15 = 65535 & (i13 + i14);
            i6 = i8 ^ i14;
            d4 = i11 ^ i15;
            int i16 = i10 ^ i14;
            i3++;
            i4 = i9 ^ i15;
            i5 = i16;
        }
        k(i(i6, iArr[i7]), bArr2, i2);
        k(i4 + iArr[i7 + 1], bArr2, i2 + 2);
        k(i5 + iArr[i7 + 2], bArr2, i2 + 4);
        k(i(d4, iArr[i7 + 3]), bArr2, i2 + 6);
    }

    private int[] h(int[] iArr) {
        int[] iArr2 = new int[52];
        int j = j(iArr[0]);
        int c = c(iArr[1]);
        int c2 = c(iArr[2]);
        iArr2[51] = j(iArr[3]);
        iArr2[50] = c2;
        iArr2[49] = c;
        int i = 48;
        iArr2[48] = j;
        int i2 = 4;
        for (int i3 = 1; i3 < 8; i3++) {
            int i4 = iArr[i2];
            iArr2[i - 1] = iArr[i2 + 1];
            iArr2[i - 2] = i4;
            int j2 = j(iArr[i2 + 2]);
            int c3 = c(iArr[i2 + 3]);
            int i5 = i2 + 5;
            int c4 = c(iArr[i2 + 4]);
            i2 += 6;
            iArr2[i - 3] = j(iArr[i5]);
            iArr2[i - 4] = c3;
            iArr2[i - 5] = c4;
            i -= 6;
            iArr2[i] = j2;
        }
        int i6 = iArr[i2];
        iArr2[i - 1] = iArr[i2 + 1];
        iArr2[i - 2] = i6;
        int j3 = j(iArr[i2 + 2]);
        int c5 = c(iArr[i2 + 3]);
        int c6 = c(iArr[i2 + 4]);
        iArr2[i - 3] = j(iArr[i2 + 5]);
        iArr2[i - 4] = c6;
        iArr2[i - 5] = c5;
        iArr2[i - 6] = j3;
        return iArr2;
    }

    private int i(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i4 = 65537 - i2;
        } else if (i2 == 0) {
            i4 = 65537 - i;
        } else {
            int i5 = i * i2;
            int i6 = i5 & 65535;
            int i7 = i5 >>> 16;
            int i8 = i6 - i7;
            if (i6 < i7) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            i4 = i8 + i3;
        }
        return i4 & 65535;
    }

    private int j(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = (i4 + (i5 * i2)) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = (i2 + (i6 * i4)) & 65535;
        }
        return (1 - i2) & 65535;
    }

    private void k(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    @Override // defpackage.xc0
    public int a() {
        return 8;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.a;
        if (iArr != null) {
            if (i + 8 <= bArr.length) {
                if (i2 + 8 <= bArr2.length) {
                    g(iArr, bArr, i, bArr2, i2);
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("IDEA engine not initialised");
    }

    int c(int i) {
        return (0 - i) & 65535;
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) {
        if (v71Var instanceof lf5) {
            this.a = f(z, ((lf5) v71Var).a());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to IDEA init - " + v71Var.getClass().getName());
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
