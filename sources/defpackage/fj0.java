package defpackage;

import ru.dodopizza.app.presentation.product.card.combo.BuyMorePresenter;
/* compiled from: BuyMoreModule_ProvidePresenterFactory.java */
/* renamed from: fj0  reason: default package */
/* loaded from: classes3.dex */
public final class fj0 implements no3<BuyMorePresenter> {
    private final as8<f63> a;
    private final as8<ui0> b;
    private final as8<gc> c;

    public fj0(as8<f63> as8Var, as8<ui0> as8Var2, as8<gc> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static fj0 a(as8<f63> as8Var, as8<ui0> as8Var2, as8<gc> as8Var3) {
        return new fj0(as8Var, as8Var2, as8Var3);
    }

    public static BuyMorePresenter c(f63 f63Var, ui0 ui0Var, gc gcVar) {
        return (BuyMorePresenter) jh8.e(zi0.a.b(f63Var, ui0Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public BuyMorePresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
