package defpackage;

import ru.dodopizza.app.presentation.checkout.taxpayerid.TaxPayerIdPresenter;
/* compiled from: TaxPayerIdModule_ProvidePresenterFactory.java */
/* renamed from: x7b  reason: default package */
/* loaded from: classes3.dex */
public final class x7b implements no3<TaxPayerIdPresenter> {
    private final as8<String> a;
    private final as8<f63> b;
    private final as8<b8b> c;

    public x7b(as8<String> as8Var, as8<f63> as8Var2, as8<b8b> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static x7b a(as8<String> as8Var, as8<f63> as8Var2, as8<b8b> as8Var3) {
        return new x7b(as8Var, as8Var2, as8Var3);
    }

    public static TaxPayerIdPresenter c(String str, f63 f63Var, b8b b8bVar) {
        return (TaxPayerIdPresenter) jh8.e(w7b.a.a(str, f63Var, b8bVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public TaxPayerIdPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
