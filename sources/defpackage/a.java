package defpackage;
/* compiled from: $Gson$Preconditions.java */
/* renamed from: a  reason: default package */
/* loaded from: classes2.dex */
public final class a {
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t) {
        t.getClass();
        return t;
    }
}
