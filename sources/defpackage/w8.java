package defpackage;

import ru.dodopizza.app.presentation.addresslist.AddressListPresenter;
import ru.dodopizza.app.presentation.addresslist.d;
/* compiled from: AddressListModule_ProvidePresenterFactory.java */
/* renamed from: w8  reason: default package */
/* loaded from: classes3.dex */
public final class w8 implements no3<AddressListPresenter> {
    private final as8<gc> a;
    private final as8<cl2<n8>> b;
    private final as8<d> c;
    private final as8<y8> d;
    private final as8<hq3> e;
    private final as8<dt5> f;
    private final as8<s8> g;

    public w8(as8<gc> as8Var, as8<cl2<n8>> as8Var2, as8<d> as8Var3, as8<y8> as8Var4, as8<hq3> as8Var5, as8<dt5> as8Var6, as8<s8> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static w8 a(as8<gc> as8Var, as8<cl2<n8>> as8Var2, as8<d> as8Var3, as8<y8> as8Var4, as8<hq3> as8Var5, as8<dt5> as8Var6, as8<s8> as8Var7) {
        return new w8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static AddressListPresenter c(gc gcVar, cl2<n8> cl2Var, d dVar, y8 y8Var, hq3 hq3Var, dt5 dt5Var, s8 s8Var) {
        return (AddressListPresenter) jh8.e(t8.a.c(gcVar, cl2Var, dVar, y8Var, hq3Var, dt5Var, s8Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AddressListPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
