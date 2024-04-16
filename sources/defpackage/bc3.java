package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.bonus.EasyBonusApi;
/* compiled from: EasyBonusModule_ProvideEasyBonusApiFactory.java */
/* renamed from: bc3  reason: default package */
/* loaded from: classes3.dex */
public final class bc3 implements no3<EasyBonusApi> {
    private final as8<Retrofit> a;

    public bc3(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static bc3 a(as8<Retrofit> as8Var) {
        return new bc3(as8Var);
    }

    public static EasyBonusApi c(Retrofit retrofit) {
        return (EasyBonusApi) jh8.e(ac3.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public EasyBonusApi get() {
        return c(this.a.get());
    }
}
