package defpackage;
/* compiled from: SearchModule_ProvideSearchInteractorFactory.java */
/* renamed from: oy9  reason: default package */
/* loaded from: classes3.dex */
public final class oy9 implements no3<hy9> {
    private final as8<ah6> a;
    private final as8<e78> b;
    private final as8<zd6> c;
    private final as8<ze6> d;

    public oy9(as8<ah6> as8Var, as8<e78> as8Var2, as8<zd6> as8Var3, as8<ze6> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static oy9 a(as8<ah6> as8Var, as8<e78> as8Var2, as8<zd6> as8Var3, as8<ze6> as8Var4) {
        return new oy9(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static hy9 c(ah6 ah6Var, e78 e78Var, zd6 zd6Var, ze6 ze6Var) {
        return (hy9) jh8.e(ly9.a.c(ah6Var, e78Var, zd6Var, ze6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hy9 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
