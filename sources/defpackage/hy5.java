package defpackage;
/* compiled from: LogoutInteractor_Factory.java */
/* renamed from: hy5  reason: default package */
/* loaded from: classes.dex */
public final class hy5 implements no3<gy5> {
    private final as8<i00> a;
    private final as8<xda> b;
    private final as8<dua> c;
    private final as8<kx1> d;

    public hy5(as8<i00> as8Var, as8<xda> as8Var2, as8<dua> as8Var3, as8<kx1> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static hy5 a(as8<i00> as8Var, as8<xda> as8Var2, as8<dua> as8Var3, as8<kx1> as8Var4) {
        return new hy5(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static gy5 c(i00 i00Var, xda xdaVar, dua duaVar, kx1 kx1Var) {
        return new gy5(i00Var, xdaVar, duaVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gy5 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
