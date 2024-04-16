package defpackage;

import org.slf4j.Marker;
/* renamed from: we8  reason: default package */
/* loaded from: classes3.dex */
public class we8 {
    private ka4 a;
    private int b;
    private int[] c;

    public we8(ka4 ka4Var, int i) {
        this.a = ka4Var;
        this.b = i;
        int[] iArr = new int[i + 1];
        this.c = iArr;
        iArr[i] = 1;
    }

    private int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private void d() {
        int length = this.c.length;
        do {
            this.b = length - 1;
            length = this.b;
            if (length < 0) {
                return;
            }
        } while (this.c[length] == 0);
    }

    private static int i(int[] iArr) {
        int c = c(iArr);
        if (c == -1) {
            return 0;
        }
        return iArr[c];
    }

    private static boolean j(int[] iArr, int[] iArr2) {
        int c = c(iArr);
        if (c != c(iArr2)) {
            return false;
        }
        for (int i = 0; i <= c; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] l(int[] iArr, int[] iArr2) {
        int c = c(iArr2);
        if (c != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int f = this.a.f(i(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (c <= c(iArr3)) {
                iArr3 = a(o(p(iArr2, c(iArr3) - c), this.a.h(i(iArr3), f)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    private int[] o(int[] iArr, int i) {
        int c = c(iArr);
        if (c != -1 && i != 0) {
            if (i == 1) {
                return b65.a(iArr);
            }
            int[] iArr2 = new int[c + 1];
            while (c >= 0) {
                iArr2[c] = this.a.h(iArr[c], i);
                c--;
            }
            return iArr2;
        }
        return new int[1];
    }

    private static int[] p(int[] iArr, int i) {
        int c = c(iArr);
        if (c == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[c + i + 1];
        System.arraycopy(iArr, 0, iArr2, i, c + 1);
        return iArr2;
    }

    private static int[] q(int[] iArr) {
        int c = c(iArr);
        if (c == -1) {
            return new int[1];
        }
        int i = c + 1;
        if (iArr.length == i) {
            return b65.a(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public void b(we8 we8Var) {
        this.c = a(this.c, we8Var.c);
        d();
    }

    public int e(int i) {
        int[] iArr = this.c;
        int i2 = this.b;
        int i3 = iArr[i2];
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 = this.a.h(i3, i) ^ this.c[i4];
        }
        return i3;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof we8)) {
            we8 we8Var = (we8) obj;
            if (this.a.equals(we8Var.a) && this.b == we8Var.b && j(this.c, we8Var.c)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i) {
        if (i >= 0 && i <= this.b) {
            return this.c[i];
        }
        return 0;
    }

    public int g() {
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i = 8;
        int i2 = 1;
        while (this.a.d() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.c.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i < iArr.length) {
                hashCode = (hashCode * 31) + iArr[i];
                i++;
            } else {
                return hashCode;
            }
        }
    }

    public we8 k(we8 we8Var) {
        return new we8(this.a, l(this.c, we8Var.c));
    }

    public void m(int i) {
        if (this.a.g(i)) {
            this.c = o(this.c, i);
            d();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public we8 n(int i) {
        if (this.a.g(i)) {
            return new we8(this.a, o(this.c, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public String toString() {
        String str = " Polynomial over " + this.a.toString() + ": \n";
        for (int i = 0; i < this.c.length; i++) {
            str = str + this.a.b(this.c[i]) + "Y^" + i + Marker.ANY_NON_NULL_MARKER;
        }
        return str + ";";
    }

    public we8(ka4 ka4Var, byte[] bArr) {
        this.a = ka4Var;
        int i = 8;
        int i2 = 1;
        while (ka4Var.d() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[bArr.length / i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                d();
                return;
            }
            int i5 = 0;
            while (i5 < i) {
                int[] iArr2 = this.c;
                iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                i5 += 8;
                i4++;
            }
            if (!this.a.g(this.c[i3])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i3++;
        }
    }

    public we8(ka4 ka4Var, int[] iArr) {
        this.a = ka4Var;
        this.c = q(iArr);
        d();
    }

    public we8(we8 we8Var) {
        this.a = we8Var.a;
        this.b = we8Var.b;
        this.c = b65.a(we8Var.c);
    }
}
