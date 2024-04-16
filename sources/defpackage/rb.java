package defpackage;

import ru.dodopizza.app.presentation.allpizzerias.AllPizzeriasPresenter;
/* compiled from: AllPizzeriasModule_ProvideAllPizzeriasPresenterFactory.java */
/* renamed from: rb  reason: default package */
/* loaded from: classes3.dex */
public final class rb implements no3<AllPizzeriasPresenter> {
    private final as8<f63> a;
    private final as8<cf4> b;

    public rb(as8<f63> as8Var, as8<cf4> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static rb a(as8<f63> as8Var, as8<cf4> as8Var2) {
        return new rb(as8Var, as8Var2);
    }

    public static AllPizzeriasPresenter c(f63 f63Var, cf4 cf4Var) {
        return (AllPizzeriasPresenter) jh8.e(qb.a.a(f63Var, cf4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AllPizzeriasPresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
