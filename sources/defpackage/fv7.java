package defpackage;
/* compiled from: PaymentModule_ProvideOkHttpClientFactory.java */
/* renamed from: fv7  reason: default package */
/* loaded from: classes3.dex */
public final class fv7 implements no3<b77> {
    private final as8<p80> a;
    private final as8<xj3> b;
    private final as8<rn2> c;

    public fv7(as8<p80> as8Var, as8<xj3> as8Var2, as8<rn2> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static fv7 a(as8<p80> as8Var, as8<xj3> as8Var2, as8<rn2> as8Var3) {
        return new fv7(as8Var, as8Var2, as8Var3);
    }

    public static b77 c(p80 p80Var, xj3 xj3Var, rn2 rn2Var) {
        return (b77) jh8.e(gu7.a.y(p80Var, xj3Var, rn2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b77 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
