package defpackage;
/* compiled from: Preconditions.java */
/* renamed from: hh8  reason: default package */
/* loaded from: classes2.dex */
public final class hh8 {
    private static String a(int i, int i2, String str) {
        if (i < 0) {
            return zza.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zza.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String b(int i, int i2, String str) {
        if (i < 0) {
            return zza.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zza.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String c(int i, int i2, int i3) {
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                return zza.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            return b(i2, i3, "end index");
        }
        return b(i, i3, "start index");
    }

    public static void d(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void e(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void f(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zza.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static int g(int i, int i2) {
        return h(i, i2, "index");
    }

    public static int h(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(a(i, i2, str));
    }

    public static <T> T i(T t) {
        t.getClass();
        return t;
    }

    public static <T> T j(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int k(int i, int i2) {
        return l(i, i2, "index");
    }

    public static int l(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(b(i, i2, str));
    }

    public static void m(int i, int i2, int i3) {
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException(c(i, i2, i3));
    }

    public static void n(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void o(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(zza.a(str, Integer.valueOf(i)));
    }

    public static void p(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(zza.a(str, obj));
    }
}
