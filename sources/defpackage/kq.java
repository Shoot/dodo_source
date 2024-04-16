package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appsflyer.AppsFlyerLib;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: AppsFlyerLibInitializer.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkq;", "", "", "a", "Lcom/appsflyer/AppsFlyerLib;", "Lcom/appsflyer/AppsFlyerLib;", "appsFlyerLib", "Lmh0;", "b", "Lmh0;", "buildInfo", "Landroid/content/Context;", c.a, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Liq;", DateTokenConverter.CONVERTER_KEY, "Liq;", "deepLinksReporter", "<init>", "(Lcom/appsflyer/AppsFlyerLib;Lmh0;Landroid/content/Context;Liq;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kq  reason: default package */
/* loaded from: classes3.dex */
public final class kq {
    private final AppsFlyerLib a;
    private final mh0 b;
    private final Context c;
    private final iq d;

    public kq(AppsFlyerLib appsFlyerLib, mh0 mh0Var, Context context, iq iqVar) {
        z65.h(appsFlyerLib, "appsFlyerLib");
        z65.h(mh0Var, "buildInfo");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(iqVar, "deepLinksReporter");
        this.a = appsFlyerLib;
        this.b = mh0Var;
        this.c = context;
        this.d = iqVar;
    }

    public final void a() {
        AppsFlyerLib appsFlyerLib = this.a;
        appsFlyerLib.setDebugLog(this.b.i());
        appsFlyerLib.subscribeForDeepLink(this.d);
        appsFlyerLib.setHost(this.c.getString(R.string.empty_string), this.c.getString(R.string.appsflyer_host));
        appsFlyerLib.setOneLinkCustomDomain(this.c.getString(R.string.appsflyer_one_link_custom_domain_1), this.c.getString(R.string.appsflyer_one_link_custom_domain_2));
        appsFlyerLib.init(this.c.getString(R.string.appsflyer_api_key), this.d, this.c);
        appsFlyerLib.start(this.c);
        if (this.b.j()) {
            appsFlyerLib.setOutOfStore(this.c.getString(R.string.appsflyer_huawei_store));
        }
    }
}
