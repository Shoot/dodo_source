package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class h9 implements Runnable {
    private final /* synthetic */ p8 a;
    private final /* synthetic */ x8 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h9(x8 x8Var, p8 p8Var) {
        this.a = p8Var;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        lxcVar = this.b.d;
        if (lxcVar == null) {
            this.b.n().F().a("Failed to send current screen to service");
            return;
        }
        try {
            p8 p8Var = this.a;
            if (p8Var == null) {
                lxcVar.h0(0L, null, null, this.b.zza().getPackageName());
            } else {
                lxcVar.h0(p8Var.c, p8Var.a, p8Var.b, this.b.zza().getPackageName());
            }
            this.b.g0();
        } catch (RemoteException e) {
            this.b.n().F().b("Failed to send current screen to the service", e);
        }
    }
}
