package defpackage;
/* compiled from: NavigationModule_ProvideOrderHistoryDetailsExternalRouterFactory.java */
/* renamed from: xu6  reason: default package */
/* loaded from: classes3.dex */
public final class xu6 implements no3<fe7> {
    private final vu6 a;
    private final as8<f63> b;

    public xu6(vu6 vu6Var, as8<f63> as8Var) {
        this.a = vu6Var;
        this.b = as8Var;
    }

    public static xu6 a(vu6 vu6Var, as8<f63> as8Var) {
        return new xu6(vu6Var, as8Var);
    }

    public static fe7 c(vu6 vu6Var, f63 f63Var) {
        return (fe7) jh8.e(vu6Var.b(f63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fe7 get() {
        return c(this.a, this.b.get());
    }
}
