package defpackage;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
/* compiled from: AppsFlyerLibInitializer_Factory.java */
/* renamed from: lq  reason: default package */
/* loaded from: classes3.dex */
public final class lq implements no3<kq> {
    private final as8<AppsFlyerLib> a;
    private final as8<mh0> b;
    private final as8<Context> c;
    private final as8<iq> d;

    public lq(as8<AppsFlyerLib> as8Var, as8<mh0> as8Var2, as8<Context> as8Var3, as8<iq> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static lq a(as8<AppsFlyerLib> as8Var, as8<mh0> as8Var2, as8<Context> as8Var3, as8<iq> as8Var4) {
        return new lq(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static kq c(AppsFlyerLib appsFlyerLib, mh0 mh0Var, Context context, iq iqVar) {
        return new kq(appsFlyerLib, mh0Var, context, iqVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kq get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
