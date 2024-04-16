package defpackage;

import com.dodopizza.core.domain.push.ServicePushApi;
import retrofit2.Retrofit;
/* compiled from: PushModule_ProvideServicePushAPIFactory.java */
/* renamed from: at8  reason: default package */
/* loaded from: classes3.dex */
public final class at8 implements no3<ServicePushApi> {
    private final as8<Retrofit> a;

    public at8(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static at8 a(as8<Retrofit> as8Var) {
        return new at8(as8Var);
    }

    public static ServicePushApi c(Retrofit retrofit) {
        return (ServicePushApi) jh8.e(vs8.a.e(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ServicePushApi get() {
        return c(this.a.get());
    }
}
