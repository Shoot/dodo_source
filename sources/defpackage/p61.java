package defpackage;
/* compiled from: CheckoutStateModule_ProvideCheckoutStateLogicFactory.java */
/* renamed from: p61  reason: default package */
/* loaded from: classes3.dex */
public final class p61 implements no3<h61> {
    private final l61 a;

    public p61(l61 l61Var) {
        this.a = l61Var;
    }

    public static p61 a(l61 l61Var) {
        return new p61(l61Var);
    }

    public static h61 c(l61 l61Var) {
        return (h61) jh8.e(l61Var.d());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h61 get() {
        return c(this.a);
    }
}
