package defpackage;

import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: AddressListModule_ProvideSelectedAddressHandlerFactory.java */
/* renamed from: x8  reason: default package */
/* loaded from: classes3.dex */
public final class x8 implements no3<i> {
    private final as8<re4> a;
    private final as8<k6a> b;
    private final as8<hq3> c;
    private final as8<jv5> d;
    private final as8<t61> e;
    private final as8<dt5> f;

    public x8(as8<re4> as8Var, as8<k6a> as8Var2, as8<hq3> as8Var3, as8<jv5> as8Var4, as8<t61> as8Var5, as8<dt5> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static x8 a(as8<re4> as8Var, as8<k6a> as8Var2, as8<hq3> as8Var3, as8<jv5> as8Var4, as8<t61> as8Var5, as8<dt5> as8Var6) {
        return new x8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static i c(re4 re4Var, k6a k6aVar, hq3 hq3Var, jv5 jv5Var, t61 t61Var, dt5 dt5Var) {
        return (i) jh8.e(t8.a.d(re4Var, k6aVar, hq3Var, jv5Var, t61Var, dt5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
