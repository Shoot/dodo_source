package defpackage;

import com.dodopizza.order.feature.upsell.presentation.UpsalePresenter;
/* compiled from: UpsaleModule_ProvidePresenterFactory.java */
/* renamed from: xsb  reason: default package */
/* loaded from: classes2.dex */
public final class xsb implements no3<UpsalePresenter> {
    private final as8<rsb> a;
    private final as8<hq3> b;
    private final as8<gc> c;
    private final as8<k63> d;

    public xsb(as8<rsb> as8Var, as8<hq3> as8Var2, as8<gc> as8Var3, as8<k63> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static xsb a(as8<rsb> as8Var, as8<hq3> as8Var2, as8<gc> as8Var3, as8<k63> as8Var4) {
        return new xsb(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static UpsalePresenter c(rsb rsbVar, hq3 hq3Var, gc gcVar, k63 k63Var) {
        return (UpsalePresenter) jh8.e(wsb.a.a(rsbVar, hq3Var, gcVar, k63Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public UpsalePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
