package defpackage;
/* compiled from: CheckoutStateModule_ProvideVOProviderFactory.java */
/* renamed from: s61  reason: default package */
/* loaded from: classes3.dex */
public final class s61 implements no3<t61> {
    private final l61 a;
    private final as8<pv0> b;
    private final as8<e61> c;
    private final as8<t41> d;
    private final as8<ava> e;

    public s61(l61 l61Var, as8<pv0> as8Var, as8<e61> as8Var2, as8<t41> as8Var3, as8<ava> as8Var4) {
        this.a = l61Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
    }

    public static s61 a(l61 l61Var, as8<pv0> as8Var, as8<e61> as8Var2, as8<t41> as8Var3, as8<ava> as8Var4) {
        return new s61(l61Var, as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static t61 c(l61 l61Var, pv0 pv0Var, e61 e61Var, t41 t41Var, ava avaVar) {
        return (t61) jh8.e(l61Var.g(pv0Var, e61Var, t41Var, avaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public t61 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
