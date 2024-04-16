package defpackage;
/* compiled from: RetrofitModule_ProvideOkHttpClientConfiguratorFactory.java */
/* renamed from: rl9  reason: default package */
/* loaded from: classes3.dex */
public final class rl9 implements no3<rn2> {
    private final gl9 a;
    private final as8<sn2> b;

    public rl9(gl9 gl9Var, as8<sn2> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static rl9 a(gl9 gl9Var, as8<sn2> as8Var) {
        return new rl9(gl9Var, as8Var);
    }

    public static rn2 c(gl9 gl9Var, sn2 sn2Var) {
        return (rn2) jh8.e(gl9Var.k(sn2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rn2 get() {
        return c(this.a, this.b.get());
    }
}
