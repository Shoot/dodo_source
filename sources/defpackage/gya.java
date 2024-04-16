package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.stories.StoriesApi;
/* compiled from: StoriesModule_ProvideStoriesApiFactory.java */
/* renamed from: gya  reason: default package */
/* loaded from: classes3.dex */
public final class gya implements no3<StoriesApi> {
    private final as8<Retrofit> a;

    public gya(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static gya a(as8<Retrofit> as8Var) {
        return new gya(as8Var);
    }

    public static StoriesApi c(Retrofit retrofit) {
        return (StoriesApi) jh8.e(cya.a.d(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public StoriesApi get() {
        return c(this.a.get());
    }
}
