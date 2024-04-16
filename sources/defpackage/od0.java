package defpackage;
/* compiled from: BlockStoreInteractor_Factory.java */
/* renamed from: od0  reason: default package */
/* loaded from: classes4.dex */
public final class od0 implements no3<nd0> {
    private final as8<pd0> a;
    private final as8<jv5> b;
    private final as8<g00> c;
    private final as8<dq3> d;
    private final as8<cva> e;
    private final as8<kx1> f;
    private final as8<qx1> g;

    public od0(as8<pd0> as8Var, as8<jv5> as8Var2, as8<g00> as8Var3, as8<dq3> as8Var4, as8<cva> as8Var5, as8<kx1> as8Var6, as8<qx1> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static od0 a(as8<pd0> as8Var, as8<jv5> as8Var2, as8<g00> as8Var3, as8<dq3> as8Var4, as8<cva> as8Var5, as8<kx1> as8Var6, as8<qx1> as8Var7) {
        return new od0(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static nd0 c(pd0 pd0Var, jv5 jv5Var, g00 g00Var, dq3 dq3Var, cva cvaVar, kx1 kx1Var, qx1 qx1Var) {
        return new nd0(pd0Var, jv5Var, g00Var, dq3Var, cvaVar, kx1Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public nd0 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
