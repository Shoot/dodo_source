package defpackage;
/* compiled from: Preconditions.java */
/* renamed from: ih8  reason: default package */
/* loaded from: classes2.dex */
public final class ih8 {
    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T b(T t) {
        t.getClass();
        return t;
    }

    public static <T> T c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }
}
