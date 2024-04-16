package defpackage;

import com.dodopizza.order.domain.assistant.AssistantApi;
import retrofit2.Retrofit;
/* compiled from: AssistantDomainModule_ProvideAssistantApiFactory.java */
/* renamed from: rs  reason: default package */
/* loaded from: classes2.dex */
public final class rs implements no3<AssistantApi> {
    private final as8<Retrofit> a;

    public rs(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static rs a(as8<Retrofit> as8Var) {
        return new rs(as8Var);
    }

    public static AssistantApi c(Retrofit retrofit) {
        return (AssistantApi) jh8.e(qs.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AssistantApi get() {
        return c(this.a.get());
    }
}
