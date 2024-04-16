package defpackage;

import retrofit2.Retrofit;
/* compiled from: KustoModule_ProvideKustoRetrofitFactory.java */
/* renamed from: ii5  reason: default package */
/* loaded from: classes3.dex */
public final class ii5 implements no3<Retrofit> {
    private final as8<sh5> a;

    public ii5(as8<sh5> as8Var) {
        this.a = as8Var;
    }

    public static ii5 a(as8<sh5> as8Var) {
        return new ii5(as8Var);
    }

    public static Retrofit c(sh5 sh5Var) {
        return (Retrofit) jh8.e(bi5.a.g(sh5Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public Retrofit get() {
        return c(this.a.get());
    }
}
