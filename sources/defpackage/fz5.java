package defpackage;
/* compiled from: LottieCompositionCache.java */
/* renamed from: fz5  reason: default package */
/* loaded from: classes.dex */
public class fz5 {
    private static final fz5 b = new fz5();
    private final j36<String, ez5> a = new j36<>(20);

    fz5() {
    }

    public static fz5 b() {
        return b;
    }

    public ez5 a(String str) {
        if (str == null) {
            return null;
        }
        return this.a.d(str);
    }

    public void c(String str, ez5 ez5Var) {
        if (str == null) {
            return;
        }
        this.a.e(str, ez5Var);
    }
}
