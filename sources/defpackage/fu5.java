package defpackage;

import ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter;
/* compiled from: LocalityListModule_ProvidesPresenterFactory.java */
/* renamed from: fu5  reason: default package */
/* loaded from: classes3.dex */
public final class fu5 implements no3<LocalityListPresenter> {
    private final as8<h97> a;
    private final as8<ut5> b;
    private final as8<yo9> c;
    private final as8<au5> d;

    public fu5(as8<h97> as8Var, as8<ut5> as8Var2, as8<yo9> as8Var3, as8<au5> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static fu5 a(as8<h97> as8Var, as8<ut5> as8Var2, as8<yo9> as8Var3, as8<au5> as8Var4) {
        return new fu5(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static LocalityListPresenter c(h97 h97Var, ut5 ut5Var, yo9 yo9Var, au5 au5Var) {
        return (LocalityListPresenter) jh8.e(du5.a.b(h97Var, ut5Var, yo9Var, au5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LocalityListPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
