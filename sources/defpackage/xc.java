package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.gp2;
import defpackage.yh5;
import java.util.logging.Level;
import kotlin.Metadata;
/* compiled from: AnalyticsFactory.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lxc;", "Lwc;", "Lhq3;", "featureService", "Lgc;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmh0;", "b", "Lmh0;", "buildInfo", "Lwh5;", c.a, "Lwh5;", "kustoDefaultInterceptor", "Lyh5$b;", DateTokenConverter.CONVERTER_KEY, "Lyh5$b;", "kustoExperimentsInterceptorFactory", "Loh5;", e.a, "Loh5;", "kustoAnalytics", "Lxv3;", "f", "Lxv3;", "firebaseDefaultInterceptor", "Las8;", "Lcz3;", "g", "Las8;", "flipperAnalyticsEventInterceptorProvider", "<init>", "(Landroid/content/Context;Lmh0;Lwh5;Lyh5$b;Loh5;Lxv3;Las8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xc  reason: default package */
/* loaded from: classes3.dex */
public final class xc implements wc {
    private final Context a;
    private final mh0 b;
    private final wh5 c;
    private final yh5.b d;
    private final oh5 e;
    private final xv3 f;
    private final as8<cz3> g;

    public xc(Context context, mh0 mh0Var, wh5 wh5Var, yh5.b bVar, oh5 oh5Var, xv3 xv3Var, as8<cz3> as8Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(mh0Var, "buildInfo");
        z65.h(wh5Var, "kustoDefaultInterceptor");
        z65.h(bVar, "kustoExperimentsInterceptorFactory");
        z65.h(oh5Var, "kustoAnalytics");
        z65.h(xv3Var, "firebaseDefaultInterceptor");
        z65.h(as8Var, "flipperAnalyticsEventInterceptorProvider");
        this.a = context;
        this.b = mh0Var;
        this.c = wh5Var;
        this.d = bVar;
        this.e = oh5Var;
        this.f = xv3Var;
        this.g = as8Var;
    }

    @Override // defpackage.wc
    public gc a(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        gp2.a aVar = new gp2.a();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.a);
        z65.g(firebaseAnalytics, "getInstance(...)");
        gp2.a b = aVar.a(new mv3(firebaseAnalytics, fc.b())).a(new ph5(this.e, fc.c())).a(new dq(this.a, fc.a())).b(this.c).b(this.d.a(hq3Var)).b(this.f);
        if (this.b.i()) {
            cz3 cz3Var = this.g.get();
            z65.g(cz3Var, "get(...)");
            b.b(cz3Var);
            Level level = Level.INFO;
            z65.g(level, "INFO");
            b.b(new nd("dodo_analytics", level));
        }
        return b.c();
    }
}
