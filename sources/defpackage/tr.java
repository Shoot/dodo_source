package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: tr  reason: default package */
/* loaded from: classes3.dex */
public final class tr {

    /* renamed from: tr$a */
    /* loaded from: classes3.dex */
    public static class a<T> implements Iterator<T> {
        private final T[] a;
        private int b = 0;

        public a(T[] tArr) {
            this.a = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b < this.a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.b;
            T[] tArr = this.a;
            if (i != tArr.length) {
                this.b = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException("Out of elements: " + this.b);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static void A(char[] cArr, char c) {
        Arrays.fill(cArr, c);
    }

    public static void B(int[] iArr, int i) {
        Arrays.fill(iArr, i);
    }

    public static void C(long[] jArr, long j) {
        Arrays.fill(jArr, j);
    }

    public static void D(short[] sArr, short s) {
        Arrays.fill(sArr, s);
    }

    private static int E(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int F(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ bArr[length];
            } else {
                return i;
            }
        }
    }

    public static int G(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 >= 0) {
                i3 = (i3 * 257) ^ bArr[i + i2];
            } else {
                return i3;
            }
        }
    }

    public static int H(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ cArr[length];
            } else {
                return i;
            }
        }
    }

    public static int I(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ iArr[length];
            } else {
                return i;
            }
        }
    }

    public static int J(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 >= 0) {
                i3 = (i3 * 257) ^ iArr[i + i2];
            } else {
                return i3;
            }
        }
    }

    public static int K(long[] jArr, int i, int i2) {
        if (jArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 >= 0) {
                long j = jArr[i + i2];
                i3 = (((i3 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
            } else {
                return i3;
            }
        }
    }

    public static int L(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ (sArr[length] & 255);
            } else {
                return i;
            }
        }
    }

    public static int M(short[][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + L(sArr[i2]);
        }
        return i;
    }

    public static int N(short[][][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + M(sArr[i2]);
        }
        return i;
    }

    public static boolean O(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static byte[] P(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (true) {
            length--;
            if (length >= 0) {
                bArr2[length] = bArr[i];
                i++;
            } else {
                return bArr2;
            }
        }
    }

    public static byte[] Q(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length - 1;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
            length--;
        }
        return bArr;
    }

    public static int[] R(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[length];
            iArr[length] = i2;
            length--;
        }
        return iArr;
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 |= bArr[i + i4];
        }
        if (i3 != 0) {
            return false;
        }
        return true;
    }

    public static boolean b(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i2 - i;
        if (i5 != i4 - i3) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (bArr[i + i6] != bArr2[i3 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean f(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static void g(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    public static byte[] h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 != null && bArr2.length == bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }
        return h(bArr);
    }

    public static char[] j(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static int[] k(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static long[] l(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static long[] m(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 != null && jArr2.length == jArr.length) {
            System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
            return jArr2;
        }
        return l(jArr);
    }

    public static short[] n(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static boolean[] o(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return h(bArr2);
        }
        if (bArr2 == null) {
            return h(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] q(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return p(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return p(bArr, bArr3);
        }
        if (bArr3 == null) {
            return p(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static byte[] r(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return q(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return q(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return q(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return q(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static short[] s(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            return n(sArr2);
        }
        if (sArr2 == null) {
            return n(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean t(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (bArr != null) {
            if (bArr2 != null) {
                if (i >= 0) {
                    if (i2 <= bArr.length - i) {
                        if (i3 <= bArr2.length - i) {
                            int i4 = 0;
                            for (int i5 = 0; i5 < i; i5++) {
                                i4 |= bArr[i2 + i5] ^ bArr2[i3 + i5];
                            }
                            if (i4 != 0) {
                                return false;
                            }
                            return true;
                        }
                        throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
                    }
                    throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
                }
                throw new IllegalArgumentException("'len' cannot be negative");
            }
            throw new NullPointerException("'b' cannot be null");
        }
        throw new NullPointerException("'a' cannot be null");
    }

    public static boolean u(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr == bArr2) {
            return true;
        }
        if (bArr.length < bArr2.length) {
            length = bArr.length;
        } else {
            length = bArr2.length;
        }
        int length2 = bArr.length ^ bArr2.length;
        for (int i = 0; i != length; i++) {
            length2 |= bArr[i] ^ bArr2[i];
        }
        while (length < bArr2.length) {
            byte b = bArr2[length];
            length2 |= b ^ (~b);
            length++;
        }
        if (length2 != 0) {
            return false;
        }
        return true;
    }

    public static byte[] v(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    public static byte[] w(byte[] bArr, int i, int i2) {
        int E = E(i, i2);
        byte[] bArr2 = new byte[E];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, E));
        return bArr2;
    }

    public static int[] x(int[] iArr, int i, int i2) {
        int E = E(i, i2);
        int[] iArr2 = new int[E];
        System.arraycopy(iArr, i, iArr2, 0, Math.min(iArr.length - i, E));
        return iArr2;
    }

    public static void y(byte[] bArr, byte b) {
        Arrays.fill(bArr, b);
    }

    public static void z(byte[] bArr, int i, int i2, byte b) {
        Arrays.fill(bArr, i, i2, b);
    }
}
