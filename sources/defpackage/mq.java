package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AppsFlyerLib;
import kotlin.Metadata;
/* compiled from: AppsFlyerModule.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lmq;", "", "Lcom/appsflyer/AppsFlyerLib;", "appsFlyerLib", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpq;", "b", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mq  reason: default package */
/* loaded from: classes3.dex */
public final class mq {
    public static final mq a = new mq();

    private mq() {
    }

    public final AppsFlyerLib a() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        z65.g(appsFlyerLib, "getInstance(...)");
        return appsFlyerLib;
    }

    public final pq b(AppsFlyerLib appsFlyerLib, Context context) {
        z65.h(appsFlyerLib, "appsFlyerLib");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new qq(appsFlyerLib, context);
    }
}
