package defpackage;
/* compiled from: NavigationModule_ProvideOrderHistoryExternalRouterFactory.java */
/* renamed from: yu6  reason: default package */
/* loaded from: classes3.dex */
public final class yu6 implements no3<ze7> {
    private final vu6 a;
    private final as8<f63> b;

    public yu6(vu6 vu6Var, as8<f63> as8Var) {
        this.a = vu6Var;
        this.b = as8Var;
    }

    public static yu6 a(vu6 vu6Var, as8<f63> as8Var) {
        return new yu6(vu6Var, as8Var);
    }

    public static ze7 c(vu6 vu6Var, f63 f63Var) {
        return (ze7) jh8.e(vu6Var.c(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ze7 get() {
        return c(this.a, this.b.get());
    }
}
