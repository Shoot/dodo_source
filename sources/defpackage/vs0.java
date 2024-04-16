package defpackage;

import ru.dodopizza.app.presentation.checkout.cashcharge.CashChargePresenter;
/* compiled from: CashChargeModule_ProvidePresenterFactory.java */
/* renamed from: vs0  reason: default package */
/* loaded from: classes3.dex */
public final class vs0 implements no3<CashChargePresenter> {
    private final as8<os0> a;
    private final as8<f63> b;
    private final as8<jn6> c;
    private final as8<zs0> d;
    private final as8<vn6> e;
    private final as8<on6> f;

    public vs0(as8<os0> as8Var, as8<f63> as8Var2, as8<jn6> as8Var3, as8<zs0> as8Var4, as8<vn6> as8Var5, as8<on6> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static vs0 a(as8<os0> as8Var, as8<f63> as8Var2, as8<jn6> as8Var3, as8<zs0> as8Var4, as8<vn6> as8Var5, as8<on6> as8Var6) {
        return new vs0(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static CashChargePresenter c(os0 os0Var, f63 f63Var, jn6 jn6Var, zs0 zs0Var, vn6 vn6Var, on6 on6Var) {
        return (CashChargePresenter) jh8.e(qs0.a.e(os0Var, f63Var, jn6Var, zs0Var, vn6Var, on6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CashChargePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
