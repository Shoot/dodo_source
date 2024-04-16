package defpackage;

import com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter;
/* compiled from: SpecialOfferModule_ProvideSpecialOfferDialogPresenterFactory.java */
/* renamed from: pra  reason: default package */
/* loaded from: classes2.dex */
public final class pra implements no3<SpecialOfferDialogPresenter> {
    private final as8<tra> a;
    private final as8<cq8> b;
    private final as8<nfa> c;
    private final as8<kp8> d;
    private final as8<i00> e;
    private final as8<gc> f;
    private final as8<jra> g;
    private final as8<aub> h;
    private final as8<bq> i;

    public pra(as8<tra> as8Var, as8<cq8> as8Var2, as8<nfa> as8Var3, as8<kp8> as8Var4, as8<i00> as8Var5, as8<gc> as8Var6, as8<jra> as8Var7, as8<aub> as8Var8, as8<bq> as8Var9) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
    }

    public static pra a(as8<tra> as8Var, as8<cq8> as8Var2, as8<nfa> as8Var3, as8<kp8> as8Var4, as8<i00> as8Var5, as8<gc> as8Var6, as8<jra> as8Var7, as8<aub> as8Var8, as8<bq> as8Var9) {
        return new pra(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static SpecialOfferDialogPresenter c(tra traVar, cq8 cq8Var, nfa nfaVar, kp8 kp8Var, i00 i00Var, gc gcVar, jra jraVar, aub aubVar, bq bqVar) {
        return (SpecialOfferDialogPresenter) jh8.e(nra.a.b(traVar, cq8Var, nfaVar, kp8Var, i00Var, gcVar, jraVar, aubVar, bqVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SpecialOfferDialogPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
