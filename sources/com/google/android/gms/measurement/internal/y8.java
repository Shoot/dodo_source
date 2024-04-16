package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class y8 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ zzo c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ huc e;
    private final /* synthetic */ x8 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y8(x8 x8Var, String str, String str2, zzo zzoVar, boolean z, huc hucVar) {
        this.a = str;
        this.b = str2;
        this.c = zzoVar;
        this.d = z;
        this.e = hucVar;
        this.f = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        Bundle bundle = new Bundle();
        try {
            lxcVar = this.f.d;
            if (lxcVar == null) {
                this.f.n().F().c("Failed to get user properties; not connected to service", this.a, this.b);
                return;
            }
            gh8.j(this.c);
            Bundle F = jb.F(lxcVar.C1(this.a, this.b, this.d, this.c));
            this.f.g0();
            this.f.h().V(this.e, F);
        } catch (RemoteException e) {
            this.f.n().F().c("Failed to get user properties; remote exception", this.a, e);
        } finally {
            this.f.h().V(this.e, bundle);
        }
    }
}
