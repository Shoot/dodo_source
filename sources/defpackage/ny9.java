package defpackage;

import ru.dodopizza.app.presentation.search.SearchPresenter;
/* compiled from: SearchModule_ProvidePresenterFactory.java */
/* renamed from: ny9  reason: default package */
/* loaded from: classes3.dex */
public final class ny9 implements no3<SearchPresenter> {
    private final as8<hy9> a;
    private final as8<k63> b;
    private final as8<f63> c;
    private final as8<gc> d;
    private final as8<hl8> e;

    public ny9(as8<hy9> as8Var, as8<k63> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4, as8<hl8> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static ny9 a(as8<hy9> as8Var, as8<k63> as8Var2, as8<f63> as8Var3, as8<gc> as8Var4, as8<hl8> as8Var5) {
        return new ny9(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static SearchPresenter c(hy9 hy9Var, k63 k63Var, f63 f63Var, gc gcVar, hl8 hl8Var) {
        return (SearchPresenter) jh8.e(ly9.a.b(hy9Var, k63Var, f63Var, gcVar, hl8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public SearchPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
