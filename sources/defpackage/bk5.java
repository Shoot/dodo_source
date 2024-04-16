package defpackage;

import ru.dodopizza.app.presentation.selectlocation.landing.LandingPresenter;
/* compiled from: LandingModule_ProvideLandingPresenterFactory.java */
/* renamed from: bk5  reason: default package */
/* loaded from: classes3.dex */
public final class bk5 implements no3<LandingPresenter> {
    private final as8<String> a;
    private final as8<f63> b;
    private final as8<rj5> c;

    public bk5(as8<String> as8Var, as8<f63> as8Var2, as8<rj5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static bk5 a(as8<String> as8Var, as8<f63> as8Var2, as8<rj5> as8Var3) {
        return new bk5(as8Var, as8Var2, as8Var3);
    }

    public static LandingPresenter c(String str, f63 f63Var, rj5 rj5Var) {
        return (LandingPresenter) jh8.e(vj5.a.c(str, f63Var, rj5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LandingPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
