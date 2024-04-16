package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
/* compiled from: RoutePendingIntentBuilder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lto9;", "", "", c.a, "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/app/PendingIntent;", "a", "b", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: to9  reason: default package */
/* loaded from: classes3.dex */
public final class to9 {
    private final Context a;

    public to9(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    private final int c() {
        if (Build.VERSION.SDK_INT >= 23) {
            return 201326592;
        }
        return 134217728;
    }

    public final PendingIntent a(Intent intent) {
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        PendingIntent activity = PendingIntent.getActivity(this.a, 0, intent, c());
        z65.g(activity, "getActivity(...)");
        return activity;
    }

    public final PendingIntent b(Intent intent) {
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, c());
        z65.g(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
