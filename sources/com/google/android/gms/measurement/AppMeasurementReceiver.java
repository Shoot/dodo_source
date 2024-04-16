package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import defpackage.wyc;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends y2c implements wyc.a {
    private wyc c;

    @Override // defpackage.wyc.a
    public final void a(@NonNull Context context, @NonNull Intent intent) {
        y2c.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.c == null) {
            this.c = new wyc(this);
        }
        this.c.a(context, intent);
    }
}
