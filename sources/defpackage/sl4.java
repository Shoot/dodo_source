package defpackage;
/* compiled from: HalvesProductCardModule_ProvideHalvesProductCardInteractorFactory.java */
/* renamed from: sl4  reason: default package */
/* loaded from: classes3.dex */
public final class sl4 implements no3<ql4> {
    private final as8<ah6> a;
    private final as8<ds0> b;
    private final as8<sq0> c;
    private final as8<g78> d;
    private final as8<e78> e;
    private final as8<gc> f;

    public sl4(as8<ah6> as8Var, as8<ds0> as8Var2, as8<sq0> as8Var3, as8<g78> as8Var4, as8<e78> as8Var5, as8<gc> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static sl4 a(as8<ah6> as8Var, as8<ds0> as8Var2, as8<sq0> as8Var3, as8<g78> as8Var4, as8<e78> as8Var5, as8<gc> as8Var6) {
        return new sl4(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static ql4 c(ah6 ah6Var, ds0 ds0Var, sq0 sq0Var, g78 g78Var, e78 e78Var, gc gcVar) {
        return (ql4) jh8.e(rl4.a.a(ah6Var, ds0Var, sq0Var, g78Var, e78Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ql4 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
