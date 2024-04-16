package defpackage;
/* compiled from: RetrofitModule_ProvideCountryApiFactoryFactory.java */
/* renamed from: ll9  reason: default package */
/* loaded from: classes3.dex */
public final class ll9 implements no3<by1> {
    private final gl9 a;
    private final as8<cy1> b;

    public ll9(gl9 gl9Var, as8<cy1> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static ll9 a(gl9 gl9Var, as8<cy1> as8Var) {
        return new ll9(gl9Var, as8Var);
    }

    public static by1 c(gl9 gl9Var, cy1 cy1Var) {
        return (by1) jh8.e(gl9Var.e(cy1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public by1 get() {
        return c(this.a, this.b.get());
    }
}
