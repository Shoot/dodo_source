package defpackage;
/* compiled from: PushTokenManager_Factory.java */
/* renamed from: tt8  reason: default package */
/* loaded from: classes3.dex */
public final class tt8 implements no3<st8> {
    private final as8<xda> a;
    private final as8<pq> b;
    private final as8<bfb> c;
    private final as8<hfb> d;
    private final as8<bo> e;
    private final as8<kx1> f;

    public tt8(as8<xda> as8Var, as8<pq> as8Var2, as8<bfb> as8Var3, as8<hfb> as8Var4, as8<bo> as8Var5, as8<kx1> as8Var6) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
    }

    public static tt8 a(as8<xda> as8Var, as8<pq> as8Var2, as8<bfb> as8Var3, as8<hfb> as8Var4, as8<bo> as8Var5, as8<kx1> as8Var6) {
        return new tt8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6);
    }

    public static st8 c(xda xdaVar, pq pqVar, bfb bfbVar, hfb hfbVar, bo boVar, kx1 kx1Var) {
        return new st8(xdaVar, pqVar, bfbVar, hfbVar, boVar, kx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public st8 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
