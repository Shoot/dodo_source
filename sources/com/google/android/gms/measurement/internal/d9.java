package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class d9 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ x8 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d9(x8 x8Var, zzo zzoVar) {
        this.a = zzoVar;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        lxcVar = this.b.d;
        if (lxcVar == null) {
            this.b.n().F().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            gh8.j(this.a);
            lxcVar.p1(this.a);
            this.b.p().I();
            this.b.S(lxcVar, null, this.a);
            this.b.g0();
        } catch (RemoteException e) {
            this.b.n().F().b("Failed to send app launch to the service", e);
        }
    }
}
