package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: NumberOutput.java */
/* renamed from: y37  reason: default package */
/* loaded from: classes2.dex */
public final class y37 {
    private static int a = 1000000;
    private static int b = 1000000000;
    private static long c = 1000000000;
    private static long d = -2147483648L;
    private static long e = 2147483647L;
    static final String f = String.valueOf(Integer.MIN_VALUE);
    static final String g = String.valueOf(Long.MIN_VALUE);
    private static final int[] h = new int[1000];
    private static final String[] i;
    private static final String[] j;

    static {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = 0;
                while (i5 < 10) {
                    h[i2] = ((i3 + 48) << 16) | ((i4 + 48) << 8) | (i5 + 48);
                    i5++;
                    i2++;
                }
            }
        }
        i = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int a(int i2, char[] cArr, int i3) {
        int i4 = h[i2];
        cArr[i3] = (char) (i4 >> 16);
        int i5 = i3 + 2;
        cArr[i3 + 1] = (char) ((i4 >> 8) & 127);
        int i6 = i3 + 3;
        cArr[i5] = (char) (i4 & 127);
        return i6;
    }

    private static int b(int i2, char[] cArr, int i3) {
        int i4 = h[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i3] = (char) (i4 >> 16);
                i3++;
            }
            cArr[i3] = (char) ((i4 >> 8) & 127);
            i3++;
        }
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 & 127);
        return i5;
    }

    private static int c(int i2, char[] cArr, int i3) {
        int i4 = i2 / 1000;
        int i5 = i2 - (i4 * 1000);
        int i6 = i4 / 1000;
        int[] iArr = h;
        int i7 = iArr[i6];
        cArr[i3] = (char) (i7 >> 16);
        cArr[i3 + 1] = (char) ((i7 >> 8) & 127);
        cArr[i3 + 2] = (char) (i7 & 127);
        int i8 = iArr[i4 - (i6 * 1000)];
        cArr[i3 + 3] = (char) (i8 >> 16);
        cArr[i3 + 4] = (char) ((i8 >> 8) & 127);
        cArr[i3 + 5] = (char) (i8 & 127);
        int i9 = iArr[i5];
        cArr[i3 + 6] = (char) (i9 >> 16);
        int i10 = i3 + 8;
        cArr[i3 + 7] = (char) ((i9 >> 8) & 127);
        int i11 = i3 + 9;
        cArr[i10] = (char) (i9 & 127);
        return i11;
    }

    private static int d(char[] cArr, int i2) {
        String str = f;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    private static int e(char[] cArr, int i2) {
        String str = g;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    private static int f(int i2, char[] cArr, int i3) {
        if (i2 < a) {
            if (i2 < 1000) {
                return b(i2, cArr, i3);
            }
            int i4 = i2 / 1000;
            return g(cArr, i3, i4, i2 - (i4 * 1000));
        }
        int i5 = i2 / 1000;
        int i6 = i2 - (i5 * 1000);
        int i7 = i5 / 1000;
        int b2 = b(i7, cArr, i3);
        int[] iArr = h;
        int i8 = iArr[i5 - (i7 * 1000)];
        cArr[b2] = (char) (i8 >> 16);
        cArr[b2 + 1] = (char) ((i8 >> 8) & 127);
        cArr[b2 + 2] = (char) (i8 & 127);
        int i9 = iArr[i6];
        cArr[b2 + 3] = (char) (i9 >> 16);
        int i10 = b2 + 5;
        cArr[b2 + 4] = (char) ((i9 >> 8) & 127);
        int i11 = b2 + 6;
        cArr[i10] = (char) (i9 & 127);
        return i11;
    }

    private static int g(char[] cArr, int i2, int i3, int i4) {
        int[] iArr = h;
        int i5 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                cArr[i2] = (char) (i5 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i5 >> 8) & 127);
            i2++;
        }
        cArr[i2] = (char) (i5 & 127);
        int i6 = iArr[i4];
        cArr[i2 + 1] = (char) (i6 >> 16);
        int i7 = i2 + 3;
        cArr[i2 + 2] = (char) ((i6 >> 8) & 127);
        int i8 = i2 + 4;
        cArr[i7] = (char) (i6 & 127);
        return i8;
    }

    public static boolean h(double d2) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return false;
        }
        return true;
    }

    public static boolean i(float f2) {
        if (!Float.isNaN(f2) && !Float.isInfinite(f2)) {
            return false;
        }
        return true;
    }

    public static int j(int i2, char[] cArr, int i3) {
        int i4;
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return d(cArr, i3);
            }
            cArr[i3] = CoreConstants.DASH_CHAR;
            i2 = -i2;
            i3++;
        }
        if (i2 < a) {
            if (i2 < 1000) {
                if (i2 < 10) {
                    cArr[i3] = (char) (i2 + 48);
                    return i3 + 1;
                }
                return b(i2, cArr, i3);
            }
            int i5 = i2 / 1000;
            return a(i2 - (i5 * 1000), cArr, b(i5, cArr, i3));
        }
        int i6 = b;
        if (i2 >= i6) {
            int i7 = i2 - i6;
            if (i7 >= i6) {
                i7 -= i6;
                i4 = i3 + 1;
                cArr[i3] = '2';
            } else {
                i4 = i3 + 1;
                cArr[i3] = '1';
            }
            return c(i7, cArr, i4);
        }
        int i8 = i2 / 1000;
        int i9 = i8 / 1000;
        return a(i2 - (i8 * 1000), cArr, a(i8 - (i9 * 1000), cArr, b(i9, cArr, i3)));
    }

    public static int k(long j2, char[] cArr, int i2) {
        int c2;
        if (j2 < 0) {
            if (j2 > d) {
                return j((int) j2, cArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                return e(cArr, i2);
            }
            cArr[i2] = CoreConstants.DASH_CHAR;
            j2 = -j2;
            i2++;
        } else if (j2 <= e) {
            return j((int) j2, cArr, i2);
        }
        long j3 = c;
        long j4 = j2 / j3;
        long j5 = j2 - (j4 * j3);
        if (j4 < j3) {
            c2 = f((int) j4, cArr, i2);
        } else {
            long j6 = j4 / j3;
            int b2 = b((int) j6, cArr, i2);
            c2 = c((int) (j4 - (j3 * j6)), cArr, b2);
        }
        return c((int) j5, cArr, c2);
    }
}
