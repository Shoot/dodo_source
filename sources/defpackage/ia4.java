package defpackage;

import java.lang.reflect.Array;
/* renamed from: ia4  reason: default package */
/* loaded from: classes3.dex */
public class ia4 extends pa6 {
    private int[][] c;
    private int d;

    public ia4(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.b = i;
        this.a = iArr.length;
        this.d = iArr2.length;
        int i2 = i & 31;
        int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
        for (int i4 = 0; i4 < this.a; i4++) {
            int[] iArr3 = iArr[i4];
            int i5 = this.d - 1;
            iArr3[i5] = iArr3[i5] & i3;
        }
        this.c = iArr;
    }

    public byte[] c() {
        int i = this.a;
        int i2 = 8;
        byte[] bArr = new byte[(((this.b + 7) >>> 3) * i) + 8];
        or5.a(i, bArr, 0);
        or5.a(this.b, bArr, 4);
        int i3 = this.b;
        int i4 = i3 >>> 5;
        int i5 = i3 & 31;
        for (int i6 = 0; i6 < this.a; i6++) {
            int i7 = 0;
            while (i7 < i4) {
                or5.a(this.c[i6][i7], bArr, i2);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((this.c[i6][i4] >>> i8) & 255);
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ia4)) {
            return false;
        }
        ia4 ia4Var = (ia4) obj;
        if (this.a != ia4Var.a || this.b != ia4Var.b || this.d != ia4Var.d) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (!b65.b(this.c[i], ia4Var.c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((this.a * 31) + this.b) * 31) + this.d;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + tr.I(this.c[i2]);
        }
        return i;
    }

    public String toString() {
        int i = this.b & 31;
        int i2 = this.d;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.c[i3][this.d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public ia4(ia4 ia4Var) {
        this.b = ia4Var.a();
        this.a = ia4Var.b();
        this.d = ia4Var.d;
        this.c = new int[ia4Var.c.length];
        int i = 0;
        while (true) {
            int[][] iArr = this.c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = b65.a(ia4Var.c[i]);
            i++;
        }
    }

    public ia4(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.a = or5.e(bArr, 0);
        int e = or5.e(bArr, 4);
        this.b = e;
        int i = this.a;
        int i2 = ((e + 7) >>> 3) * i;
        if (i > 0) {
            int i3 = 8;
            if (i2 == bArr.length - 8) {
                int i4 = (e + 31) >>> 5;
                this.d = i4;
                this.c = (int[][]) Array.newInstance(Integer.TYPE, i, i4);
                int i5 = this.b;
                int i6 = i5 >> 5;
                int i7 = i5 & 31;
                for (int i8 = 0; i8 < this.a; i8++) {
                    int i9 = 0;
                    while (i9 < i6) {
                        this.c[i8][i9] = or5.e(bArr, i3);
                        i9++;
                        i3 += 4;
                    }
                    int i10 = 0;
                    while (i10 < i7) {
                        int[] iArr = this.c[i8];
                        iArr[i6] = ((bArr[i3] & 255) << i10) ^ iArr[i6];
                        i10 += 8;
                        i3++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
