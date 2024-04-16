package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.NonNull;
/* compiled from: NetworkStateTracker.java */
/* renamed from: nw6  reason: default package */
/* loaded from: classes.dex */
public class nw6 extends kr1<kw6> {
    static final String j = nx5.f("NetworkStateTracker");
    private final ConnectivityManager g;
    private b h;
    private a i;

    /* compiled from: NetworkStateTracker.java */
    /* renamed from: nw6$a */
    /* loaded from: classes.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                nx5.c().a(nw6.j, "Network broadcast received", new Throwable[0]);
                nw6 nw6Var = nw6.this;
                nw6Var.d(nw6Var.g());
            }
        }
    }

    /* compiled from: NetworkStateTracker.java */
    /* renamed from: nw6$b */
    /* loaded from: classes.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            nx5.c().a(nw6.j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            nw6 nw6Var = nw6.this;
            nw6Var.d(nw6Var.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NonNull Network network) {
            nx5.c().a(nw6.j, "Network connection lost", new Throwable[0]);
            nw6 nw6Var = nw6.this;
            nw6Var.d(nw6Var.g());
        }
    }

    public nw6(@NonNull Context context, @NonNull d7b d7bVar) {
        super(context, d7bVar);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (j()) {
            this.h = new b();
        } else {
            this.i = new a();
        }
    }

    private static boolean j() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kr1
    public void e() {
        if (j()) {
            try {
                nx5.c().a(j, "Registering network callback", new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                nx5.c().b(j, "Received exception while registering network callback", e);
                return;
            }
        }
        nx5.c().a(j, "Registering broadcast receiver", new Throwable[0]);
        this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.kr1
    public void f() {
        if (j()) {
            try {
                nx5.c().a(j, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                nx5.c().b(j, "Received exception while unregistering network callback", e);
                return;
            }
        }
        nx5.c().a(j, "Unregistering broadcast receiver", new Throwable[0]);
        this.b.unregisterReceiver(this.i);
    }

    kw6 g() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z2 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        boolean i = i();
        boolean a2 = vq1.a(this.g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        return new kw6(z, i, a2, z2);
    }

    @Override // defpackage.kr1
    /* renamed from: h */
    public kw6 b() {
        return g();
    }

    boolean i() {
        Network activeNetwork;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                activeNetwork = this.g.getActiveNetwork();
                NetworkCapabilities networkCapabilities = this.g.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    return false;
                }
                if (!networkCapabilities.hasCapability(16)) {
                    return false;
                }
                return true;
            } catch (SecurityException e) {
                nx5.c().b(j, "Unable to validate active network", e);
                return false;
            }
        }
        return false;
    }
}
