package defpackage;

import com.appsflyer.AppsFlyerLib;
/* compiled from: AppsFlyerModule_ProvideAppsFlyerLibFactory.java */
/* renamed from: nq  reason: default package */
/* loaded from: classes3.dex */
public final class nq implements no3<AppsFlyerLib> {

    /* compiled from: AppsFlyerModule_ProvideAppsFlyerLibFactory.java */
    /* renamed from: nq$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final nq a = new nq();
    }

    public static nq a() {
        return a.a;
    }

    public static AppsFlyerLib c() {
        return (AppsFlyerLib) jh8.e(mq.a.a());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public AppsFlyerLib get() {
        return c();
    }
}
