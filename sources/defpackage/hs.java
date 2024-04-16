package defpackage;
/* compiled from: Assertions.java */
/* renamed from: hs  reason: default package */
/* loaded from: classes3.dex */
public final class hs {
    public static <T> T a(String str, T t, boolean z) {
        if (z) {
            return t;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static void b(String str, boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static <T> T c(String str, T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " can not be null");
    }
}
