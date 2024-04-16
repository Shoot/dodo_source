package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class a9 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ zzo b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ x8 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a9(x8 x8Var, AtomicReference atomicReference, zzo zzoVar, Bundle bundle) {
        this.a = atomicReference;
        this.b = zzoVar;
        this.c = bundle;
        this.d = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        synchronized (this.a) {
            try {
                lxcVar = this.d.d;
            } catch (RemoteException e) {
                this.d.n().F().b("Failed to get trigger URIs; remote exception", e);
                this.a.notify();
            }
            if (lxcVar == null) {
                this.d.n().F().a("Failed to get trigger URIs; not connected to service");
                this.a.notify();
                return;
            }
            gh8.j(this.b);
            this.a.set(lxcVar.z0(this.b, this.c));
            this.d.g0();
            this.a.notify();
        }
    }
}
