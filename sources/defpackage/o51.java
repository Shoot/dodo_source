package defpackage;
/* compiled from: CheckoutModule_ProvideRouterFactory.java */
/* renamed from: o51  reason: default package */
/* loaded from: classes3.dex */
public final class o51 implements no3<f63> {
    private final c51 a;

    public o51(c51 c51Var) {
        this.a = c51Var;
    }

    public static o51 a(c51 c51Var) {
        return new o51(c51Var);
    }

    public static f63 c(c51 c51Var) {
        return (f63) jh8.e(c51Var.b());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f63 get() {
        return c(this.a);
    }
}
