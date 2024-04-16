package defpackage;

import com.dodopizza.order.feature.halves.constructor.presentation.HalvesConstructorPresenter;
/* compiled from: HalvesConstructorPresenter_Factory.java */
/* renamed from: rk4  reason: default package */
/* loaded from: classes2.dex */
public final class rk4 implements no3<HalvesConstructorPresenter> {
    private final as8<ek4> a;
    private final as8<lk4> b;
    private final as8<f63> c;
    private final as8<zl4> d;
    private final as8<gc> e;
    private final as8<tk4> f;
    private final as8<hq3> g;

    public rk4(as8<ek4> as8Var, as8<lk4> as8Var2, as8<f63> as8Var3, as8<zl4> as8Var4, as8<gc> as8Var5, as8<tk4> as8Var6, as8<hq3> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static rk4 a(as8<ek4> as8Var, as8<lk4> as8Var2, as8<f63> as8Var3, as8<zl4> as8Var4, as8<gc> as8Var5, as8<tk4> as8Var6, as8<hq3> as8Var7) {
        return new rk4(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static HalvesConstructorPresenter c(ek4 ek4Var, lk4 lk4Var, f63 f63Var, zl4 zl4Var, gc gcVar, tk4 tk4Var, hq3 hq3Var) {
        return new HalvesConstructorPresenter(ek4Var, lk4Var, f63Var, zl4Var, gcVar, tk4Var, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public HalvesConstructorPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
