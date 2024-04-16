package defpackage;

import com.dodopizza.orderhistory.domain.check.CheckApi;
import retrofit2.Retrofit;
/* compiled from: CheckDomainModule_Companion_ProvideCheckApi$orderhistory_releaseFactory.java */
/* renamed from: d31  reason: default package */
/* loaded from: classes2.dex */
public final class d31 implements no3<CheckApi> {
    private final as8<Retrofit> a;

    public d31(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static d31 a(as8<Retrofit> as8Var) {
        return new d31(as8Var);
    }

    public static CheckApi c(Retrofit retrofit) {
        return (CheckApi) jh8.e(c31.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public CheckApi get() {
        return c(this.a.get());
    }
}
