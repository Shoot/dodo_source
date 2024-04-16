package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public class t4 extends BroadcastReceiver {
    private final va a;
    private boolean b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t4(va vaVar) {
        gh8.j(vaVar);
        this.a = vaVar;
    }

    public final void b() {
        this.a.p0();
        this.a.k().l();
        if (this.b) {
            return;
        }
        this.a.zza().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.g0().z();
        this.a.n().J().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    public final void c() {
        this.a.p0();
        this.a.k().l();
        this.a.k().l();
        if (!this.b) {
            return;
        }
        this.a.n().J().a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        try {
            this.a.zza().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            this.a.n().F().b("Failed to unregister the network broadcast receiver", e);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.p0();
        String action = intent.getAction();
        this.a.n().J().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean z = this.a.g0().z();
            if (this.c != z) {
                this.c = z;
                this.a.k().C(new x4(this, z));
                return;
            }
            return;
        }
        this.a.n().K().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
