package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.servertime.ServerTimeApi;
/* compiled from: ServerTimeModule_ProvideServerTimeApiFactory.java */
/* renamed from: qda  reason: default package */
/* loaded from: classes3.dex */
public final class qda implements no3<ServerTimeApi> {
    private final as8<Retrofit> a;

    public qda(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static qda a(as8<Retrofit> as8Var) {
        return new qda(as8Var);
    }

    public static ServerTimeApi c(Retrofit retrofit) {
        return (ServerTimeApi) jh8.e(mda.a.d(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ServerTimeApi get() {
        return c(this.a.get());
    }
}
