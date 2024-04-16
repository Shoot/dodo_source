package defpackage;

import com.dodopizza.order.feature.personaloffer.presentantion.PersonalOffersPresenter;
/* compiled from: PersonalOffersModule_ProvidePersonalOffersPresenterFactory.java */
/* renamed from: f18  reason: default package */
/* loaded from: classes2.dex */
public final class f18 implements no3<PersonalOffersPresenter> {
    private final as8<a18> a;
    private final as8<nfa> b;
    private final as8<gc> c;
    private final as8<o08> d;
    private final as8<k63> e;
    private final as8<y18> f;
    private final as8<i00> g;
    private final as8<hq3> h;

    public f18(as8<a18> as8Var, as8<nfa> as8Var2, as8<gc> as8Var3, as8<o08> as8Var4, as8<k63> as8Var5, as8<y18> as8Var6, as8<i00> as8Var7, as8<hq3> as8Var8) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
    }

    public static f18 a(as8<a18> as8Var, as8<nfa> as8Var2, as8<gc> as8Var3, as8<o08> as8Var4, as8<k63> as8Var5, as8<y18> as8Var6, as8<i00> as8Var7, as8<hq3> as8Var8) {
        return new f18(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8);
    }

    public static PersonalOffersPresenter c(a18 a18Var, nfa nfaVar, gc gcVar, o08 o08Var, k63 k63Var, y18 y18Var, i00 i00Var, hq3 hq3Var) {
        return (PersonalOffersPresenter) jh8.e(c18.a.c(a18Var, nfaVar, gcVar, o08Var, k63Var, y18Var, i00Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PersonalOffersPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
