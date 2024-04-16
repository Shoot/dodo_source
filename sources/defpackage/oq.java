package defpackage;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
/* compiled from: AppsFlyerModule_ProvideAppsFlyerServiceFactory.java */
/* renamed from: oq  reason: default package */
/* loaded from: classes3.dex */
public final class oq implements no3<pq> {
    private final as8<AppsFlyerLib> a;
    private final as8<Context> b;

    public oq(as8<AppsFlyerLib> as8Var, as8<Context> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static oq a(as8<AppsFlyerLib> as8Var, as8<Context> as8Var2) {
        return new oq(as8Var, as8Var2);
    }

    public static pq c(AppsFlyerLib appsFlyerLib, Context context) {
        return (pq) jh8.e(mq.a.b(appsFlyerLib, context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public pq get() {
        return c(this.a.get(), this.b.get());
    }
}
