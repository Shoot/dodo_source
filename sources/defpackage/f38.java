package defpackage;

import com.dodopizza.geo.feature.phonenumbercollector.presentation.PhoneNumberCollectorPresenter;
/* compiled from: PhoneNumberCollectorPresenter_Factory.java */
/* renamed from: f38  reason: default package */
/* loaded from: classes2.dex */
public final class f38 implements no3<PhoneNumberCollectorPresenter> {
    private final as8<h38> a;
    private final as8<xi8> b;
    private final as8<v28> c;
    private final as8<mh0> d;
    private final as8<gc> e;

    public f38(as8<h38> as8Var, as8<xi8> as8Var2, as8<v28> as8Var3, as8<mh0> as8Var4, as8<gc> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static f38 a(as8<h38> as8Var, as8<xi8> as8Var2, as8<v28> as8Var3, as8<mh0> as8Var4, as8<gc> as8Var5) {
        return new f38(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static PhoneNumberCollectorPresenter c(h38 h38Var, xi8 xi8Var, v28 v28Var, mh0 mh0Var, gc gcVar) {
        return new PhoneNumberCollectorPresenter(h38Var, xi8Var, v28Var, mh0Var, gcVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PhoneNumberCollectorPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
