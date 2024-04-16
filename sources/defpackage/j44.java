package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.inapp.InAppNotificationApi;
/* compiled from: FoodMenuModule_ProvideInAppNotificationApiFactory.java */
/* renamed from: j44  reason: default package */
/* loaded from: classes3.dex */
public final class j44 implements no3<InAppNotificationApi> {
    private final as8<Retrofit> a;

    public j44(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static j44 a(as8<Retrofit> as8Var) {
        return new j44(as8Var);
    }

    public static InAppNotificationApi c(Retrofit retrofit) {
        return (InAppNotificationApi) jh8.e(f44.a.d(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public InAppNotificationApi get() {
        return c(this.a.get());
    }
}
