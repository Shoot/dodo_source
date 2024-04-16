package defpackage;
/* compiled from: CheckoutModule_ProvideNavigatorHolderFactory.java */
/* renamed from: j51  reason: default package */
/* loaded from: classes3.dex */
public final class j51 implements no3<dv6> {
    private final c51 a;

    public j51(c51 c51Var) {
        this.a = c51Var;
    }

    public static j51 a(c51 c51Var) {
        return new j51(c51Var);
    }

    public static dv6 c(c51 c51Var) {
        return (dv6) jh8.e(c51Var.a());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public dv6 get() {
        return c(this.a);
    }
}
