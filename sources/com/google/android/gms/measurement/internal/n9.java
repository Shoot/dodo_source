package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class n9 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ zzo b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ zzbe d;
    private final /* synthetic */ String e;
    private final /* synthetic */ x8 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n9(x8 x8Var, boolean z, zzo zzoVar, boolean z2, zzbe zzbeVar, String str) {
        this.a = z;
        this.b = zzoVar;
        this.c = z2;
        this.d = zzbeVar;
        this.e = str;
        this.f = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        zzbe zzbeVar;
        lxcVar = this.f.d;
        if (lxcVar == null) {
            this.f.n().F().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.a) {
            gh8.j(this.b);
            x8 x8Var = this.f;
            if (this.c) {
                zzbeVar = null;
            } else {
                zzbeVar = this.d;
            }
            x8Var.S(lxcVar, zzbeVar, this.b);
        } else {
            try {
                if (TextUtils.isEmpty(this.e)) {
                    gh8.j(this.b);
                    lxcVar.I(this.d, this.b);
                } else {
                    lxcVar.d1(this.d, this.e, this.f.n().N());
                }
            } catch (RemoteException e) {
                this.f.n().F().b("Failed to send event to the service", e);
            }
        }
        this.f.g0();
    }
}
