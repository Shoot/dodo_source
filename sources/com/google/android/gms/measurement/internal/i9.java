package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class i9 implements Runnable {
    private final /* synthetic */ zzbe a;
    private final /* synthetic */ String b;
    private final /* synthetic */ huc c;
    private final /* synthetic */ x8 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9(x8 x8Var, zzbe zzbeVar, String str, huc hucVar) {
        this.a = zzbeVar;
        this.b = str;
        this.c = hucVar;
        this.d = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        try {
            lxcVar = this.d.d;
            if (lxcVar == null) {
                this.d.n().F().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] P = lxcVar.P(this.a, this.b);
            this.d.g0();
            this.d.h().Z(this.c, P);
        } catch (RemoteException e) {
            this.d.n().F().b("Failed to send event to the service to bundle", e);
        } finally {
            this.d.h().Z(this.c, null);
        }
    }
}
