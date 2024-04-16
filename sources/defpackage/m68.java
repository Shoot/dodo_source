package defpackage;

import ru.dodopizza.app.presentation.phonenumberlogin.a;
import ru.dodopizza.app.presentation.phonenumberlogin.e;
import ru.dodopizza.app.presentation.pincodelogin.PinCodeLoginPresenter;
/* compiled from: PinCodeLoginPresenter_Factory.java */
/* renamed from: m68  reason: default package */
/* loaded from: classes4.dex */
public final class m68 implements no3<PinCodeLoginPresenter> {
    private final as8<f63> a;
    private final as8<gc> b;
    private final as8<String> c;
    private final as8<String> d;
    private final as8<i68> e;
    private final as8<e.a> f;
    private final as8<a> g;

    public m68(as8<f63> as8Var, as8<gc> as8Var2, as8<String> as8Var3, as8<String> as8Var4, as8<i68> as8Var5, as8<e.a> as8Var6, as8<a> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static m68 a(as8<f63> as8Var, as8<gc> as8Var2, as8<String> as8Var3, as8<String> as8Var4, as8<i68> as8Var5, as8<e.a> as8Var6, as8<a> as8Var7) {
        return new m68(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static PinCodeLoginPresenter c(f63 f63Var, gc gcVar, String str, String str2, i68 i68Var, e.a aVar, a aVar2) {
        return new PinCodeLoginPresenter(f63Var, gcVar, str, str2, i68Var, aVar, aVar2);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PinCodeLoginPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
