package defpackage;

import retrofit2.Retrofit;
/* compiled from: KustoModule_ProvideKustoConfigurationFactory.java */
/* renamed from: fi5  reason: default package */
/* loaded from: classes3.dex */
public final class fi5 implements no3<th5> {
    private final as8<Retrofit> a;

    public fi5(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static fi5 a(as8<Retrofit> as8Var) {
        return new fi5(as8Var);
    }

    public static th5 c(Retrofit retrofit) {
        return (th5) jh8.e(bi5.a.d(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public th5 get() {
        return c(this.a.get());
    }
}
