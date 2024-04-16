package defpackage;
/* compiled from: Jdk8Methods.java */
/* renamed from: g95  reason: default package */
/* loaded from: classes3.dex */
public final class g95 {
    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return 0;
    }

    public static int b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (obj2 == null) {
            return false;
        } else {
            return obj.equals(obj2);
        }
    }

    public static int d(int i, int i2) {
        if (i >= 0) {
            return i / i2;
        }
        return ((i + 1) / i2) - 1;
    }

    public static long e(long j, long j2) {
        if (j >= 0) {
            return j / j2;
        }
        return ((j + 1) / j2) - 1;
    }

    public static int f(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public static int g(long j, int i) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    public static long h(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static <T> T i(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public static int j(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) < 0 && (i ^ i2) >= 0) {
            throw new ArithmeticException("Addition overflows an int: " + i + " + " + i2);
        }
        return i3;
    }

    public static long k(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException("Addition overflows a long: " + j + " + " + j2);
        }
        return j3;
    }

    public static long l(long j, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    long j2 = i;
                    long j3 = j * j2;
                    if (j3 / j2 == j) {
                        return j3;
                    }
                    throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
                }
                return j;
            }
            return 0L;
        } else if (j != Long.MIN_VALUE) {
            return -j;
        } else {
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
    }

    public static long m(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + j2);
    }

    public static int n(int i, int i2) {
        int i3 = i - i2;
        if ((i ^ i3) < 0 && (i ^ i2) < 0) {
            throw new ArithmeticException("Subtraction overflows an int: " + i + " - " + i2);
        }
        return i3;
    }

    public static long o(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) < 0 && (j ^ j2) < 0) {
            throw new ArithmeticException("Subtraction overflows a long: " + j + " - " + j2);
        }
        return j3;
    }

    public static int p(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        throw new ArithmeticException("Calculation overflows an int: " + j);
    }
}
