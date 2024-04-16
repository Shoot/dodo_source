package defpackage;

import android.app.Application;
/* compiled from: CaptchaInteractor_Factory.java */
/* renamed from: mo0  reason: default package */
/* loaded from: classes.dex */
public final class mo0 implements no3<lo0> {
    private final as8<hp> a;
    private final as8<Application> b;
    private final as8<bo0> c;
    private final as8<qx1> d;
    private final as8<kx1> e;

    public mo0(as8<hp> as8Var, as8<Application> as8Var2, as8<bo0> as8Var3, as8<qx1> as8Var4, as8<kx1> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static mo0 a(as8<hp> as8Var, as8<Application> as8Var2, as8<bo0> as8Var3, as8<qx1> as8Var4, as8<kx1> as8Var5) {
        return new mo0(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static lo0 c(hp hpVar, as8<Application> as8Var, as8<bo0> as8Var2, qx1 qx1Var, kx1 kx1Var) {
        return new lo0(hpVar, as8Var, as8Var2, qx1Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lo0 get() {
        return c(this.a.get(), this.b, this.c, this.d.get(), this.e.get());
    }
}
