package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.gtm.zzfi;
/* compiled from: com.google.android.gms:play-services-analytics@@17.0.1 */
/* loaded from: classes2.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {
    private zzfi a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent) {
        if (this.a == null) {
            this.a = new zzfi();
        }
        zzfi.zzb(context, intent);
    }
}
