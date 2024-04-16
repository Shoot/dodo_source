package defpackage;
/* compiled from: ShoppingCartModule_ProvideVOProviderFactory.java */
/* renamed from: eja  reason: default package */
/* loaded from: classes2.dex */
public final class eja implements no3<t61> {
    private final as8<pv0> a;
    private final as8<e61> b;
    private final as8<t41> c;
    private final as8<ava> d;

    public eja(as8<pv0> as8Var, as8<e61> as8Var2, as8<t41> as8Var3, as8<ava> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static eja a(as8<pv0> as8Var, as8<e61> as8Var2, as8<t41> as8Var3, as8<ava> as8Var4) {
        return new eja(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static t61 c(pv0 pv0Var, e61 e61Var, t41 t41Var, ava avaVar) {
        return (t61) jh8.e(yia.a.f(pv0Var, e61Var, t41Var, avaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public t61 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
