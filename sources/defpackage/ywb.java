package defpackage;
/* compiled from: VariableProductCardModule_ProvideVariableProductCardInteractorFactory.java */
/* renamed from: ywb  reason: default package */
/* loaded from: classes3.dex */
public final class ywb implements no3<wwb> {
    private final as8<ah6> a;
    private final as8<ds0> b;
    private final as8<c62> c;
    private final as8<sq0> d;
    private final as8<mxa> e;
    private final as8<gc> f;
    private final as8<wr2> g;
    private final as8<ava> h;

    public ywb(as8<ah6> as8Var, as8<ds0> as8Var2, as8<c62> as8Var3, as8<sq0> as8Var4, as8<mxa> as8Var5, as8<gc> as8Var6, as8<wr2> as8Var7, as8<ava> as8Var8) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
    }

    public static ywb a(as8<ah6> as8Var, as8<ds0> as8Var2, as8<c62> as8Var3, as8<sq0> as8Var4, as8<mxa> as8Var5, as8<gc> as8Var6, as8<wr2> as8Var7, as8<ava> as8Var8) {
        return new ywb(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static wwb c(ah6 ah6Var, ds0 ds0Var, c62 c62Var, sq0 sq0Var, mxa mxaVar, gc gcVar, wr2 wr2Var, ava avaVar) {
        return (wwb) jh8.e(xwb.a.a(ah6Var, ds0Var, c62Var, sq0Var, mxaVar, gcVar, wr2Var, avaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public wwb get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
