package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class f9 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ Bundle b;
    private final /* synthetic */ x8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f9(x8 x8Var, zzo zzoVar, Bundle bundle) {
        this.a = zzoVar;
        this.b = bundle;
        this.c = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        lxcVar = this.c.d;
        if (lxcVar == null) {
            this.c.n().F().a("Failed to send default event parameters to service");
            return;
        }
        try {
            gh8.j(this.a);
            lxcVar.U0(this.b, this.a);
        } catch (RemoteException e) {
            this.c.n().F().b("Failed to send default event parameters to service", e);
        }
    }
}
