package defpackage;
/* compiled from: MenuItemV5PersonalPriceEnricher_Factory.java */
/* renamed from: xe6  reason: default package */
/* loaded from: classes4.dex */
public final class xe6 implements no3<we6> {
    private final as8<hq3> a;
    private final as8<zf6> b;

    public xe6(as8<hq3> as8Var, as8<zf6> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static xe6 a(as8<hq3> as8Var, as8<zf6> as8Var2) {
        return new xe6(as8Var, as8Var2);
    }

    public static we6 c(hq3 hq3Var, zf6 zf6Var) {
        return new we6(hq3Var, zf6Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public we6 get() {
        return c(this.a.get(), this.b.get());
    }
}
