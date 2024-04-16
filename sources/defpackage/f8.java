package defpackage;

import ru.dodopizza.app.presentation.deliveryaddressform.DeliveryAddressPresenter;
/* compiled from: AddressFormModule_ProvideAddressFormPresenterFactory.java */
/* renamed from: f8  reason: default package */
/* loaded from: classes3.dex */
public final class f8 implements no3<DeliveryAddressPresenter> {
    private final as8<Boolean> a;
    private final as8<f63> b;
    private final as8<r6> c;
    private final as8<dt9> d;
    private final as8<gc> e;
    private final as8<s6> f;

    public f8(as8<Boolean> as8Var, as8<f63> as8Var2, as8<r6> as8Var3, as8<dt9> as8Var4, as8<gc> as8Var5, as8<s6> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static f8 a(as8<Boolean> as8Var, as8<f63> as8Var2, as8<r6> as8Var3, as8<dt9> as8Var4, as8<gc> as8Var5, as8<s6> as8Var6) {
        return new f8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static DeliveryAddressPresenter c(boolean z, f63 f63Var, r6 r6Var, dt9 dt9Var, gc gcVar, s6 s6Var) {
        return (DeliveryAddressPresenter) jh8.e(d8.a.b(z, f63Var, r6Var, dt9Var, gcVar, s6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public DeliveryAddressPresenter get() {
        return c(this.a.get().booleanValue(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
