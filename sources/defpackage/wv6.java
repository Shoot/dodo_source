package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
/* compiled from: NetworkAvailabliltyCheck.java */
/* renamed from: wv6  reason: default package */
/* loaded from: classes3.dex */
public class wv6 implements js4 {
    private final ConnectivityManager a;
    private final boolean b = "Android-x86".equalsIgnoreCase(Build.BRAND);
    private final boolean c;

    public wv6(Context context) {
        boolean z;
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
    }

    @Override // defpackage.js4
    public boolean a() {
        if (!this.c) {
            return true;
        }
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (activeNetworkInfo.isConnected()) {
            return true;
        }
        if (this.b && activeNetworkInfo.getType() == 9) {
            return true;
        }
        return false;
    }
}
