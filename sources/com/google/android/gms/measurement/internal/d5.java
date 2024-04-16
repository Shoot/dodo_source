package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class d5 implements ServiceConnection {
    private final String a;
    final /* synthetic */ e5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d5(e5 e5Var, String str) {
        this.b = e5Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.n().K().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            nsc C = otc.C(iBinder);
            if (C == null) {
                this.b.a.n().K().a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.n().J().a("Install Referrer Service connected");
            this.b.a.k().C(new f5(this, C, this));
        } catch (RuntimeException e) {
            this.b.a.n().K().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.n().J().a("Install Referrer Service disconnected");
    }
}
