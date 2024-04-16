package defpackage;

import com.dodopizza.controlling.feature.rateapp.presentation.RateAppDialogPresenter;
/* compiled from: RateAppDialogModule_ProvideRateAppDialogPresenterFactory.java */
/* renamed from: p49  reason: default package */
/* loaded from: classes.dex */
public final class p49 implements no3<RateAppDialogPresenter> {
    private final as8<m49> a;
    private final as8<q49> b;

    public p49(as8<m49> as8Var, as8<q49> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static p49 a(as8<m49> as8Var, as8<q49> as8Var2) {
        return new p49(as8Var, as8Var2);
    }

    public static RateAppDialogPresenter c(m49 m49Var, q49 q49Var) {
        return (RateAppDialogPresenter) jh8.e(n49.a.b(m49Var, q49Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public RateAppDialogPresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
