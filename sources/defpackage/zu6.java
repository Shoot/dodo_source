package defpackage;
/* compiled from: NavigationModule_ProvideRouterFactory.java */
/* renamed from: zu6  reason: default package */
/* loaded from: classes3.dex */
public final class zu6 implements no3<f63> {
    private final vu6 a;

    public zu6(vu6 vu6Var) {
        this.a = vu6Var;
    }

    public static zu6 a(vu6 vu6Var) {
        return new zu6(vu6Var);
    }

    public static f63 c(vu6 vu6Var) {
        return (f63) jh8.e(vu6Var.d());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f63 get() {
        return c(this.a);
    }
}
