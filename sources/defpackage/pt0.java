package defpackage;

import ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter;
/* compiled from: CatchAddressModule_ProvideCatchAddressPresenterFactory.java */
/* renamed from: pt0  reason: default package */
/* loaded from: classes3.dex */
public final class pt0 implements no3<CatchAddressPresenter> {
    private final as8<String> a;
    private final as8<Boolean> b;
    private final as8<f63> c;
    private final as8<lt0> d;
    private final as8<i00> e;

    public pt0(as8<String> as8Var, as8<Boolean> as8Var2, as8<f63> as8Var3, as8<lt0> as8Var4, as8<i00> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static pt0 a(as8<String> as8Var, as8<Boolean> as8Var2, as8<f63> as8Var3, as8<lt0> as8Var4, as8<i00> as8Var5) {
        return new pt0(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static CatchAddressPresenter c(String str, boolean z, f63 f63Var, lt0 lt0Var, i00 i00Var) {
        return (CatchAddressPresenter) jh8.e(nt0.a.b(str, z, f63Var, lt0Var, i00Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CatchAddressPresenter get() {
        return c(this.a.get(), this.b.get().booleanValue(), this.c.get(), this.d.get(), this.e.get());
    }
}
