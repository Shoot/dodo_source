package defpackage;
/* compiled from: MapTileIndex.java */
/* renamed from: k76  reason: default package */
/* loaded from: classes3.dex */
public class k76 {
    public static int a = 29;
    private static int b = 1 << 29;

    private static void a(int i, int i2, int i3) {
        if (i < 0 || i > a) {
            f(i, i, "Zoom");
        }
        long j = 1 << i;
        if (i2 < 0 || i2 >= j) {
            f(i, i2, "X");
        }
        if (i3 < 0 || i3 >= j) {
            f(i, i3, "Y");
        }
    }

    public static long b(int i, int i2, int i3) {
        a(i, i2, i3);
        long j = i;
        int i4 = a;
        return (j << (i4 * 2)) + (i2 << i4) + i3;
    }

    public static int c(long j) {
        return (int) ((j >> a) % b);
    }

    public static int d(long j) {
        return (int) (j % b);
    }

    public static int e(long j) {
        return (int) (j >> (a * 2));
    }

    private static void f(int i, int i2, String str) {
        throw new IllegalArgumentException("MapTileIndex: " + str + " (" + i2 + ") is too big (zoom=" + i + ")");
    }

    public static String g(int i, int i2, int i3) {
        return "/" + i + "/" + i2 + "/" + i3;
    }

    public static String h(long j) {
        return g(e(j), c(j), d(j));
    }
}
