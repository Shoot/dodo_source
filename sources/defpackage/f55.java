package defpackage;
/* compiled from: InstantAppStatusInteractor_Factory.java */
/* renamed from: f55  reason: default package */
/* loaded from: classes.dex */
public final class f55 implements no3<e55> {
    private final as8<gc> a;
    private final as8<ci8> b;
    private final as8<c55> c;
    private final as8<hq3> d;
    private final as8<kx1> e;
    private final as8<qx1> f;

    public f55(as8<gc> as8Var, as8<ci8> as8Var2, as8<c55> as8Var3, as8<hq3> as8Var4, as8<kx1> as8Var5, as8<qx1> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static f55 a(as8<gc> as8Var, as8<ci8> as8Var2, as8<c55> as8Var3, as8<hq3> as8Var4, as8<kx1> as8Var5, as8<qx1> as8Var6) {
        return new f55(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static e55 c(gc gcVar, ci8 ci8Var, c55 c55Var, hq3 hq3Var, kx1 kx1Var, qx1 qx1Var) {
        return new e55(gcVar, ci8Var, c55Var, hq3Var, kx1Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public e55 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
