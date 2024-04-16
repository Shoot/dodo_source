package defpackage;
/* compiled from: NativeChatInteractor_Factory.java */
/* renamed from: rt6  reason: default package */
/* loaded from: classes.dex */
public final class rt6 implements no3<qt6> {
    private final as8<bfb> a;
    private final as8<bo> b;
    private final as8<i00> c;
    private final as8<t52> d;
    private final as8<cu6> e;
    private final as8<bu6> f;
    private final as8<kx1> g;

    public rt6(as8<bfb> as8Var, as8<bo> as8Var2, as8<i00> as8Var3, as8<t52> as8Var4, as8<cu6> as8Var5, as8<bu6> as8Var6, as8<kx1> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static rt6 a(as8<bfb> as8Var, as8<bo> as8Var2, as8<i00> as8Var3, as8<t52> as8Var4, as8<cu6> as8Var5, as8<bu6> as8Var6, as8<kx1> as8Var7) {
        return new rt6(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static qt6 c(bfb bfbVar, bo boVar, i00 i00Var, t52 t52Var, cu6 cu6Var, bu6 bu6Var, kx1 kx1Var) {
        return new qt6(bfbVar, boVar, i00Var, t52Var, cu6Var, bu6Var, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qt6 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
