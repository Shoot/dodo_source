package defpackage;

import ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter;
/* compiled from: LandingPhoneInputModule_ProvideLandingPhoneInputPresenterFactory.java */
/* renamed from: pk5  reason: default package */
/* loaded from: classes3.dex */
public final class pk5 implements no3<LandingPhoneInputPresenter> {
    private final as8<f63> a;
    private final as8<v28> b;
    private final as8<m28> c;
    private final as8<lk5> d;
    private final as8<String> e;

    public pk5(as8<f63> as8Var, as8<v28> as8Var2, as8<m28> as8Var3, as8<lk5> as8Var4, as8<String> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static pk5 a(as8<f63> as8Var, as8<v28> as8Var2, as8<m28> as8Var3, as8<lk5> as8Var4, as8<String> as8Var5) {
        return new pk5(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static LandingPhoneInputPresenter c(f63 f63Var, v28 v28Var, m28 m28Var, lk5 lk5Var, String str) {
        return (LandingPhoneInputPresenter) jh8.e(nk5.a.b(f63Var, v28Var, m28Var, lk5Var, str));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LandingPhoneInputPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
