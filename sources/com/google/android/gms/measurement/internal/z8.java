package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class z8 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ zznb c;
    private final /* synthetic */ x8 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z8(x8 x8Var, zzo zzoVar, boolean z, zznb zznbVar) {
        this.a = zzoVar;
        this.b = z;
        this.c = zznbVar;
        this.d = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        zznb zznbVar;
        lxcVar = this.d.d;
        if (lxcVar == null) {
            this.d.n().F().a("Discarding data. Failed to set user property");
            return;
        }
        gh8.j(this.a);
        x8 x8Var = this.d;
        if (this.b) {
            zznbVar = null;
        } else {
            zznbVar = this.c;
        }
        x8Var.S(lxcVar, zznbVar, this.a);
        this.d.g0();
    }
}
