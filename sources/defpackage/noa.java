package defpackage;
/* compiled from: SnackProductCardModule_ProvideSnackProductCardInteractorFactory.java */
/* renamed from: noa  reason: default package */
/* loaded from: classes3.dex */
public final class noa implements no3<koa> {
    private final as8<ah6> a;
    private final as8<ds0> b;
    private final as8<sq0> c;
    private final as8<gc> d;
    private final as8<ue6> e;

    public noa(as8<ah6> as8Var, as8<ds0> as8Var2, as8<sq0> as8Var3, as8<gc> as8Var4, as8<ue6> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static noa a(as8<ah6> as8Var, as8<ds0> as8Var2, as8<sq0> as8Var3, as8<gc> as8Var4, as8<ue6> as8Var5) {
        return new noa(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static koa c(ah6 ah6Var, ds0 ds0Var, sq0 sq0Var, gc gcVar, ue6 ue6Var) {
        return (koa) jh8.e(loa.a.b(ah6Var, ds0Var, sq0Var, gcVar, ue6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public koa get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
