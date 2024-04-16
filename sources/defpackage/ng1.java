package defpackage;

import com.dodopizza.order.feature.combinedmap.presentation.CombinedSelectionMapPresenter;
import com.dodopizza.order.feature.selectionmap.presentation.f;
/* compiled from: CombinedSelectionMapPresenter_Factory.java */
/* renamed from: ng1  reason: default package */
/* loaded from: classes2.dex */
public final class ng1 implements no3<CombinedSelectionMapPresenter> {
    private final as8<f> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<la8> d;
    private final as8<py1> e;
    private final as8<hq3> f;
    private final as8<jg1> g;

    public ng1(as8<f> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<la8> as8Var4, as8<py1> as8Var5, as8<hq3> as8Var6, as8<jg1> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static ng1 a(as8<f> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<la8> as8Var4, as8<py1> as8Var5, as8<hq3> as8Var6, as8<jg1> as8Var7) {
        return new ng1(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static CombinedSelectionMapPresenter c(f fVar, f63 f63Var, gc gcVar, la8 la8Var, py1 py1Var, hq3 hq3Var, jg1 jg1Var) {
        return new CombinedSelectionMapPresenter(fVar, f63Var, gcVar, la8Var, py1Var, hq3Var, jg1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CombinedSelectionMapPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
