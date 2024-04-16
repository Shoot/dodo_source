package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.wq1;
/* compiled from: DefaultConnectivityMonitorFactory.java */
/* renamed from: np2  reason: default package */
/* loaded from: classes.dex */
public class np2 implements xq1 {
    @Override // defpackage.xq1
    @NonNull
    public wq1 a(@NonNull Context context, @NonNull wq1.a aVar) {
        boolean z;
        String str;
        if (iu1.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            return new mp2(context, aVar);
        }
        return new o37();
    }
}
