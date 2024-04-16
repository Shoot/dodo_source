package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import im.threads.business.transport.PushMessageAttributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class u7 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u7(z6 z6Var, Bundle bundle) {
        this.a = bundle;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z6 z6Var = this.b;
        Bundle bundle = this.a;
        z6Var.l();
        z6Var.u();
        gh8.j(bundle);
        String string = bundle.getString(Action.NAME_ATTRIBUTE);
        String string2 = bundle.getString(PushMessageAttributes.ORIGIN);
        gh8.f(string);
        gh8.f(string2);
        gh8.j(bundle.get("value"));
        if (!z6Var.a.o()) {
            z6Var.n().J().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zznb zznbVar = new zznb(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzbe G = z6Var.h().G(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            z6Var.s().C(new zzae(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), string2, zznbVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), z6Var.h().G(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), G, bundle.getLong("time_to_live"), z6Var.h().G(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
