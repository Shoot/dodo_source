package defpackage;

import android.net.ConnectivityManager;
import androidx.annotation.NonNull;
/* compiled from: ConnectivityManagerCompat.java */
/* renamed from: vq1  reason: default package */
/* loaded from: classes.dex */
public final class vq1 {

    /* compiled from: ConnectivityManagerCompat.java */
    /* renamed from: vq1$a */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(@NonNull ConnectivityManager connectivityManager) {
        return a.a(connectivityManager);
    }
}
