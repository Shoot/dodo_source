package defpackage;

import ru.dodopizza.app.presentation.phonenumberlogin.PhoneNumberLoginPresenter;
import ru.dodopizza.app.presentation.phonenumberlogin.a;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
/* compiled from: PhoneNumberLoginModule_ProvidePresenterFactory.java */
/* renamed from: w38  reason: default package */
/* loaded from: classes3.dex */
public final class w38 implements no3<PhoneNumberLoginPresenter> {
    private final as8<f63> a;
    private final as8<gc> b;
    private final as8<r38> c;
    private final as8<v28> d;
    private final as8<e> e;
    private final as8<r28> f;
    private final as8<a> g;
    private final as8<ay1> h;
    private final as8<hq3> i;

    public w38(as8<f63> as8Var, as8<gc> as8Var2, as8<r38> as8Var3, as8<v28> as8Var4, as8<e> as8Var5, as8<r28> as8Var6, as8<a> as8Var7, as8<ay1> as8Var8, as8<hq3> as8Var9) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
    }

    public static w38 a(as8<f63> as8Var, as8<gc> as8Var2, as8<r38> as8Var3, as8<v28> as8Var4, as8<e> as8Var5, as8<r28> as8Var6, as8<a> as8Var7, as8<ay1> as8Var8, as8<hq3> as8Var9) {
        return new w38(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9);
    }

    public static PhoneNumberLoginPresenter c(f63 f63Var, gc gcVar, r38 r38Var, v28 v28Var, e eVar, r28 r28Var, a aVar, ay1 ay1Var, hq3 hq3Var) {
        return (PhoneNumberLoginPresenter) jh8.e(s38.a.d(f63Var, gcVar, r38Var, v28Var, eVar, r28Var, aVar, ay1Var, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PhoneNumberLoginPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
