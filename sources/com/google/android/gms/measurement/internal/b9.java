package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class b9 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ zzo b;
    private final /* synthetic */ x8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b9(x8 x8Var, AtomicReference atomicReference, zzo zzoVar) {
        this.a = atomicReference;
        this.b = zzoVar;
        this.c = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        synchronized (this.a) {
            try {
            } catch (RemoteException e) {
                this.c.n().F().b("Failed to get app instance id", e);
                this.a.notify();
            }
            if (this.c.g().K().y()) {
                lxcVar = this.c.d;
                if (lxcVar == null) {
                    this.c.n().F().a("Failed to get app instance id");
                    this.a.notify();
                    return;
                }
                gh8.j(this.b);
                this.a.set(lxcVar.b1(this.b));
                String str = (String) this.a.get();
                if (str != null) {
                    this.c.q().R(str);
                    this.c.g().i.b(str);
                }
                this.c.g0();
                this.a.notify();
                return;
            }
            this.c.n().L().a("Analytics storage consent denied; will not get app instance id");
            this.c.q().R(null);
            this.c.g().i.b(null);
            this.a.set(null);
            this.a.notify();
        }
    }
}
