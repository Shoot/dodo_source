package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.bonus.BonusActionApi;
/* compiled from: BonusActionModule_ProvideBonusActionApiFactory.java */
/* renamed from: ge0  reason: default package */
/* loaded from: classes3.dex */
public final class ge0 implements no3<BonusActionApi> {
    private final as8<Retrofit> a;

    public ge0(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static ge0 a(as8<Retrofit> as8Var) {
        return new ge0(as8Var);
    }

    public static BonusActionApi c(Retrofit retrofit) {
        return (BonusActionApi) jh8.e(fe0.a.a(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public BonusActionApi get() {
        return c(this.a.get());
    }
}
