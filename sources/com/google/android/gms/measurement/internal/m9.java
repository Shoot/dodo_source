package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class m9 implements Runnable {
    private final /* synthetic */ boolean a = true;
    private final /* synthetic */ zzo b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ zzae d;
    private final /* synthetic */ zzae e;
    private final /* synthetic */ x8 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m9(x8 x8Var, boolean z, zzo zzoVar, boolean z2, zzae zzaeVar, zzae zzaeVar2) {
        this.b = zzoVar;
        this.c = z2;
        this.d = zzaeVar;
        this.e = zzaeVar2;
        this.f = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        zzae zzaeVar;
        lxcVar = this.f.d;
        if (lxcVar == null) {
            this.f.n().F().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.a) {
            gh8.j(this.b);
            x8 x8Var = this.f;
            if (this.c) {
                zzaeVar = null;
            } else {
                zzaeVar = this.d;
            }
            x8Var.S(lxcVar, zzaeVar, this.b);
        } else {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    gh8.j(this.b);
                    lxcVar.j1(this.d, this.b);
                } else {
                    lxcVar.q1(this.d);
                }
            } catch (RemoteException e) {
                this.f.n().F().b("Failed to send conditional user property to the service", e);
            }
        }
        this.f.g0();
    }
}
