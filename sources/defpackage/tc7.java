package defpackage;

import com.dodopizza.controlling.feature.ordercompleted.presentation.OrderCompletedPresenter;
/* compiled from: OrderCompletedModule_ProvidePresenterFactory.java */
/* renamed from: tc7  reason: default package */
/* loaded from: classes.dex */
public final class tc7 implements no3<OrderCompletedPresenter> {
    private final as8<ic7> a;
    private final as8<oc7> b;
    private final as8<gc> c;
    private final as8<f63> d;
    private final as8<jc7> e;
    private final as8<ah7> f;

    public tc7(as8<ic7> as8Var, as8<oc7> as8Var2, as8<gc> as8Var3, as8<f63> as8Var4, as8<jc7> as8Var5, as8<ah7> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static tc7 a(as8<ic7> as8Var, as8<oc7> as8Var2, as8<gc> as8Var3, as8<f63> as8Var4, as8<jc7> as8Var5, as8<ah7> as8Var6) {
        return new tc7(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static OrderCompletedPresenter c(ic7 ic7Var, oc7 oc7Var, gc gcVar, f63 f63Var, jc7 jc7Var, ah7 ah7Var) {
        return (OrderCompletedPresenter) jh8.e(pc7.a.d(ic7Var, oc7Var, gcVar, f63Var, jc7Var, ah7Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public OrderCompletedPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
