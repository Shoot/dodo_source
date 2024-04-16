package defpackage;

import retrofit2.Retrofit;
/* compiled from: RetrofitModule_ProvideRetrofitFactory.java */
/* renamed from: ul9  reason: default package */
/* loaded from: classes3.dex */
public final class ul9 implements no3<Retrofit> {
    private final gl9 a;
    private final as8<el9> b;

    public ul9(gl9 gl9Var, as8<el9> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static ul9 a(gl9 gl9Var, as8<el9> as8Var) {
        return new ul9(gl9Var, as8Var);
    }

    public static Retrofit c(gl9 gl9Var, el9 el9Var) {
        return (Retrofit) jh8.e(gl9Var.n(el9Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public Retrofit get() {
        return c(this.a, this.b.get());
    }
}
