package defpackage;

import com.dodopizza.order.feature.promocode.presentation.PromoCodePresenter;
/* compiled from: PromoCodeModule_ProvidePromoCodePresenterFactory.java */
/* renamed from: wp8  reason: default package */
/* loaded from: classes2.dex */
public final class wp8 implements no3<PromoCodePresenter> {
    private final as8<nfa> a;
    private final as8<hq3> b;
    private final as8<gc> c;
    private final as8<cq8> d;
    private final as8<aq8> e;

    public wp8(as8<nfa> as8Var, as8<hq3> as8Var2, as8<gc> as8Var3, as8<cq8> as8Var4, as8<aq8> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static wp8 a(as8<nfa> as8Var, as8<hq3> as8Var2, as8<gc> as8Var3, as8<cq8> as8Var4, as8<aq8> as8Var5) {
        return new wp8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static PromoCodePresenter c(nfa nfaVar, hq3 hq3Var, gc gcVar, cq8 cq8Var, aq8 aq8Var) {
        return (PromoCodePresenter) jh8.e(vp8.a.a(nfaVar, hq3Var, gcVar, cq8Var, aq8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PromoCodePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
