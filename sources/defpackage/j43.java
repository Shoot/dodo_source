package defpackage;
/* compiled from: Disposables.java */
/* renamed from: j43  reason: default package */
/* loaded from: classes3.dex */
public final class j43 {
    public static z33 a() {
        return ig3.INSTANCE;
    }

    public static z33 b() {
        return c(n94.b);
    }

    public static z33 c(Runnable runnable) {
        x47.e(runnable, "run is null");
        return new pp9(runnable);
    }
}
