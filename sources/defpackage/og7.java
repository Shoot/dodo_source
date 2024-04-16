package defpackage;
/* compiled from: OrderModule_ProvideAnalyticsHelperFactory.java */
/* renamed from: og7  reason: default package */
/* loaded from: classes3.dex */
public final class og7 implements no3<bd> {
    private final as8<gc> a;
    private final as8<ava> b;
    private final as8<a98> c;
    private final as8<r43> d;
    private final as8<zl5> e;
    private final as8<i32> f;
    private final as8<mh0> g;

    public og7(as8<gc> as8Var, as8<ava> as8Var2, as8<a98> as8Var3, as8<r43> as8Var4, as8<zl5> as8Var5, as8<i32> as8Var6, as8<mh0> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static og7 a(as8<gc> as8Var, as8<ava> as8Var2, as8<a98> as8Var3, as8<r43> as8Var4, as8<zl5> as8Var5, as8<i32> as8Var6, as8<mh0> as8Var7) {
        return new og7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static bd c(gc gcVar, ava avaVar, a98 a98Var, r43 r43Var, zl5 zl5Var, i32 i32Var, mh0 mh0Var) {
        return (bd) jh8.e(ng7.a.a(gcVar, avaVar, a98Var, r43Var, zl5Var, i32Var, mh0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public bd get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
