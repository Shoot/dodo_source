package defpackage;

import ru.dodopizza.app.presentation.checkout.deliverytotable.TableNumberSelectionPresenter;
/* compiled from: DeliveryToTableModule_ProvidePresenterFactory.java */
/* renamed from: wz2  reason: default package */
/* loaded from: classes3.dex */
public final class wz2 implements no3<TableNumberSelectionPresenter> {
    private final as8<f63> a;
    private final as8<gc> b;

    public wz2(as8<f63> as8Var, as8<gc> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static wz2 a(as8<f63> as8Var, as8<gc> as8Var2) {
        return new wz2(as8Var, as8Var2);
    }

    public static TableNumberSelectionPresenter c(f63 f63Var, gc gcVar) {
        return (TableNumberSelectionPresenter) jh8.e(vz2.a.a(f63Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public TableNumberSelectionPresenter get() {
        return c(this.a.get(), this.b.get());
    }
}
