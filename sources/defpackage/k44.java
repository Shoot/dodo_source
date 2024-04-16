package defpackage;

import ru.dodopizza.backend.domain.inapp.InAppNotificationApi;
/* compiled from: FoodMenuModule_ProvideInAppNotificationServiceFactory.java */
/* renamed from: k44  reason: default package */
/* loaded from: classes3.dex */
public final class k44 implements no3<sy4> {
    private final as8<InAppNotificationApi> a;
    private final as8<hq3> b;

    public k44(as8<InAppNotificationApi> as8Var, as8<hq3> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static k44 a(as8<InAppNotificationApi> as8Var, as8<hq3> as8Var2) {
        return new k44(as8Var, as8Var2);
    }

    public static sy4 c(InAppNotificationApi inAppNotificationApi, hq3 hq3Var) {
        return (sy4) jh8.e(f44.a.e(inAppNotificationApi, hq3Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sy4 get() {
        return c(this.a.get(), this.b.get());
    }
}
