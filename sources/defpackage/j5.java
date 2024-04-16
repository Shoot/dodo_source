package defpackage;

import com.dodopizza.activeorder.feature.activeorderwidget.presentation.ActiveOrderFoodMenuPresenter;
/* compiled from: ActiveOrderFoodMenuPresenter_Factory.java */
/* renamed from: j5  reason: default package */
/* loaded from: classes.dex */
public final class j5 implements no3<ActiveOrderFoodMenuPresenter> {
    private final as8<g5> a;
    private final as8<hq3> b;
    private final as8<f63> c;
    private final as8<ih4> d;

    public j5(as8<g5> as8Var, as8<hq3> as8Var2, as8<f63> as8Var3, as8<ih4> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static j5 a(as8<g5> as8Var, as8<hq3> as8Var2, as8<f63> as8Var3, as8<ih4> as8Var4) {
        return new j5(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ActiveOrderFoodMenuPresenter c(g5 g5Var, hq3 hq3Var, f63 f63Var, ih4 ih4Var) {
        return new ActiveOrderFoodMenuPresenter(g5Var, hq3Var, f63Var, ih4Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ActiveOrderFoodMenuPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
