package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class e9 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ huc b;
    private final /* synthetic */ x8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e9(x8 x8Var, zzo zzoVar, huc hucVar) {
        this.a = zzoVar;
        this.b = hucVar;
        this.c = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        try {
            if (this.c.g().K().y()) {
                lxcVar = this.c.d;
                if (lxcVar == null) {
                    this.c.n().F().a("Failed to get app instance id");
                    return;
                }
                gh8.j(this.a);
                String b1 = lxcVar.b1(this.a);
                if (b1 != null) {
                    this.c.q().R(b1);
                    this.c.g().i.b(b1);
                }
                this.c.g0();
                this.c.h().W(this.b, b1);
                return;
            }
            this.c.n().L().a("Analytics storage consent denied; will not get app instance id");
            this.c.q().R(null);
            this.c.g().i.b(null);
        } catch (RemoteException e) {
            this.c.n().F().b("Failed to get app instance id", e);
        } finally {
            this.c.h().W(this.b, null);
        }
    }
}
