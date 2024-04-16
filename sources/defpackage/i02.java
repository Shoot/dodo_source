package defpackage;

import ru.dodopizza.app.presentation.covid.CovidWarningPresenter;
/* compiled from: CovidWarningModule_ProvidePresenterFactory.java */
/* renamed from: i02  reason: default package */
/* loaded from: classes3.dex */
public final class i02 implements no3<CovidWarningPresenter> {
    private final as8<f63> a;
    private final as8<e02> b;

    public i02(as8<f63> as8Var, as8<e02> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static i02 a(as8<f63> as8Var, as8<e02> as8Var2) {
        return new i02(as8Var, as8Var2);
    }

    public static CovidWarningPresenter c(f63 f63Var, e02 e02Var) {
        return (CovidWarningPresenter) jh8.e(g02.a.b(f63Var, e02Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CovidWarningPresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
