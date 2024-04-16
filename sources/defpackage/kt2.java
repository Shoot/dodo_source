package defpackage;

import ru.dodopizza.app.presentation.checkout.deferredtime.DeferredTimePresenter;
/* compiled from: DeferredTimeModule_ProvidePresenterFactory.java */
/* renamed from: kt2  reason: default package */
/* loaded from: classes3.dex */
public final class kt2 implements no3<DeferredTimePresenter> {
    private final as8<Boolean> a;
    private final as8<ava> b;
    private final as8<dt2> c;
    private final as8<f63> d;
    private final as8<gc> e;

    public kt2(as8<Boolean> as8Var, as8<ava> as8Var2, as8<dt2> as8Var3, as8<f63> as8Var4, as8<gc> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static kt2 a(as8<Boolean> as8Var, as8<ava> as8Var2, as8<dt2> as8Var3, as8<f63> as8Var4, as8<gc> as8Var5) {
        return new kt2(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static DeferredTimePresenter c(boolean z, ava avaVar, dt2 dt2Var, f63 f63Var, gc gcVar) {
        return (DeferredTimePresenter) jh8.e(gt2.a.d(z, avaVar, dt2Var, f63Var, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeferredTimePresenter get() {
        return c(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
