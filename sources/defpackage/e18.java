package defpackage;
/* compiled from: PersonalOffersModule_ProvidePersonalOffersInteractorFactory.java */
/* renamed from: e18  reason: default package */
/* loaded from: classes2.dex */
public final class e18 implements no3<a18> {
    private final as8<t52> a;
    private final as8<l08> b;
    private final as8<kx1> c;

    public e18(as8<t52> as8Var, as8<l08> as8Var2, as8<kx1> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static e18 a(as8<t52> as8Var, as8<l08> as8Var2, as8<kx1> as8Var3) {
        return new e18(as8Var, as8Var2, as8Var3);
    }

    public static a18 c(t52 t52Var, l08 l08Var, kx1 kx1Var) {
        return (a18) jh8.e(c18.a.b(t52Var, l08Var, kx1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a18 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
