package defpackage;
/* compiled from: MenuItemVOConverterV5_Factory.java */
/* renamed from: gf6  reason: default package */
/* loaded from: classes4.dex */
public final class gf6 implements no3<ff6> {
    private final as8<hq3> a;
    private final as8<ah6> b;
    private final as8<ee6> c;
    private final as8<ue6> d;

    public gf6(as8<hq3> as8Var, as8<ah6> as8Var2, as8<ee6> as8Var3, as8<ue6> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static gf6 a(as8<hq3> as8Var, as8<ah6> as8Var2, as8<ee6> as8Var3, as8<ue6> as8Var4) {
        return new gf6(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ff6 c(hq3 hq3Var, ah6 ah6Var, ee6 ee6Var, ue6 ue6Var) {
        return new ff6(hq3Var, ah6Var, ee6Var, ue6Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ff6 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
