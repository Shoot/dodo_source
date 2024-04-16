package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class c9 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ x8 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c9(x8 x8Var, zzo zzoVar) {
        this.a = zzoVar;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        lxcVar = this.b.d;
        if (lxcVar == null) {
            this.b.n().F().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            gh8.j(this.a);
            lxcVar.K0(this.a);
        } catch (RemoteException e) {
            this.b.n().F().b("Failed to reset data on the service: remote exception", e);
        }
        this.b.g0();
    }
}
