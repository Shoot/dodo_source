package defpackage;
/* compiled from: SubscribeToNewsInteractor_Factory.java */
/* renamed from: g1b  reason: default package */
/* loaded from: classes4.dex */
public final class g1b implements no3<f1b> {
    private final as8<gc> a;
    private final as8<i00> b;
    private final as8<t52> c;
    private final as8<k63> d;
    private final as8<kx1> e;
    private final as8<qx1> f;

    public g1b(as8<gc> as8Var, as8<i00> as8Var2, as8<t52> as8Var3, as8<k63> as8Var4, as8<kx1> as8Var5, as8<qx1> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static g1b a(as8<gc> as8Var, as8<i00> as8Var2, as8<t52> as8Var3, as8<k63> as8Var4, as8<kx1> as8Var5, as8<qx1> as8Var6) {
        return new g1b(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static f1b c(gc gcVar, i00 i00Var, t52 t52Var, k63 k63Var, kx1 kx1Var, qx1 qx1Var) {
        return new f1b(gcVar, i00Var, t52Var, k63Var, kx1Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f1b get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
