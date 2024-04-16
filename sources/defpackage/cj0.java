package defpackage;
/* compiled from: BuyMoreModule_ProvideBuyMoreInteractorFactory.java */
/* renamed from: cj0  reason: default package */
/* loaded from: classes3.dex */
public final class cj0 implements no3<ui0> {
    private final as8<si0> a;
    private final as8<ds0> b;
    private final as8<uja> c;
    private final as8<sq0> d;
    private final as8<gc> e;

    public cj0(as8<si0> as8Var, as8<ds0> as8Var2, as8<uja> as8Var3, as8<sq0> as8Var4, as8<gc> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static cj0 a(as8<si0> as8Var, as8<ds0> as8Var2, as8<uja> as8Var3, as8<sq0> as8Var4, as8<gc> as8Var5) {
        return new cj0(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static ui0 c(si0 si0Var, ds0 ds0Var, uja ujaVar, sq0 sq0Var, gc gcVar) {
        return (ui0) jh8.e(zi0.a.a(si0Var, ds0Var, ujaVar, sq0Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ui0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
