package defpackage;
/* compiled from: ProfileSettingsInteractor_Factory.java */
/* renamed from: mo8  reason: default package */
/* loaded from: classes2.dex */
public final class mo8 implements no3<lo8> {
    private final as8<t52> a;
    private final as8<dua> b;
    private final as8<gy5> c;
    private final as8<qi8> d;
    private final as8<gc> e;
    private final as8<kx1> f;

    public mo8(as8<t52> as8Var, as8<dua> as8Var2, as8<gy5> as8Var3, as8<qi8> as8Var4, as8<gc> as8Var5, as8<kx1> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static mo8 a(as8<t52> as8Var, as8<dua> as8Var2, as8<gy5> as8Var3, as8<qi8> as8Var4, as8<gc> as8Var5, as8<kx1> as8Var6) {
        return new mo8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static lo8 c(t52 t52Var, dua duaVar, gy5 gy5Var, qi8 qi8Var, gc gcVar, kx1 kx1Var) {
        return new lo8(t52Var, duaVar, gy5Var, qi8Var, gcVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public lo8 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
