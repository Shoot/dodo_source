package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import ru.dodopizza.app.di.AppComponent;
/* compiled from: ConnectivityReceiver.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lyq1;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "", "onReceive", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yq1  reason: default package */
/* loaded from: classes3.dex */
public final class yq1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        vc6 b4 = ((AppComponent) eu2.b(context).a(bc9.b(AppComponent.class))).b4();
        if (px6.e(context)) {
            b4.g(vv6.a);
        } else {
            b4.g(vv6.b);
        }
    }
}
