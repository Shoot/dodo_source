package defpackage;
/* compiled from: MenuItemVOConverterModule_ProvideMenuItemVOConverterFactory.java */
/* renamed from: ef6  reason: default package */
/* loaded from: classes3.dex */
public final class ef6 implements no3<ze6> {
    private final as8<hq3> a;
    private final as8<kh1> b;
    private final as8<z83> c;

    public ef6(as8<hq3> as8Var, as8<kh1> as8Var2, as8<z83> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static ef6 a(as8<hq3> as8Var, as8<kh1> as8Var2, as8<z83> as8Var3) {
        return new ef6(as8Var, as8Var2, as8Var3);
    }

    public static ze6 c(hq3 hq3Var, kh1 kh1Var, z83 z83Var) {
        return (ze6) jh8.e(cf6.a.b(hq3Var, kh1Var, z83Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ze6 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
