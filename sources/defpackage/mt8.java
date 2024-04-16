package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import ru.dodopizza.app.R;
/* compiled from: PushNotificationManager.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Lmt8;", "", "Lsv0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/NotificationChannel;", "b", "Lvw1;", RemoteMessageConst.NOTIFICATION, "", "a", "Landroid/content/Context;", "appContext", "Lih;", "Lih;", "androidLanguageManager", "<init>", "(Landroid/content/Context;Lih;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mt8  reason: default package */
/* loaded from: classes3.dex */
public final class mt8 {
    private final Context a;
    private final ih b;

    public mt8(Context context, ih ihVar) {
        z65.h(context, "appContext");
        z65.h(ihVar, "androidLanguageManager");
        this.a = context;
        this.b = ihVar;
    }

    private final NotificationChannel b(sv0 sv0Var, Context context) {
        int color;
        jt8.a();
        NotificationChannel a = it8.a(sv0Var.b(), sv0Var.c(), 3);
        a.setDescription(sv0Var.a());
        a.enableLights(true);
        a.enableVibration(true);
        color = context.getColor(R.color.surfaceDodoColor);
        a.setLightColor(color);
        a.setLockscreenVisibility(1);
        return a;
    }

    public final void a(vw1 vw1Var) {
        z65.h(vw1Var, RemoteMessageConst.NOTIFICATION);
        Context b = this.b.b(this.a);
        Object systemService = b.getSystemService(RemoteMessageConst.NOTIFICATION);
        z65.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(b(i17.a.a(b, vw1Var.a()), b));
        }
        vw1Var.b(b, notificationManager);
    }
}
