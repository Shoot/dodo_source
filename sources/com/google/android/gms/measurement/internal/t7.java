package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class t7 implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t7(z6 z6Var, Bundle bundle) {
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
        String f = gh8.f(bundle.getString(Action.NAME_ATTRIBUTE));
        if (!z6Var.a.o()) {
            z6Var.n().J().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            z6Var.s().C(new zzae(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), "", new zznb(f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), z6Var.h().G(bundle.getString(HiAnalyticsConstant.BI_KEY_APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
