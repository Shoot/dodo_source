package ru.dodopizza.app.presentation.pincodelogin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.api.Status;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import ru.dodopizza.app.di.AppComponent;
/* compiled from: PinCodeSmsBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinCodeSmsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PinCodeSmsBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        String a;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        AppComponent appComponent = (AppComponent) eu2.b(context).a(bc9.b(AppComponent.class));
        r68 F3 = appComponent.F3();
        d B3 = appComponent.B3();
        String str = null;
        if (!z65.c(intent.getAction(), "com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) {
            intent = null;
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            z65.f(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
            if (((Status) obj).p() == 0) {
                Object obj2 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
            }
            if (str != null && (a = F3.a(str)) != null) {
                B3.d(a);
            }
        }
    }
}
