package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class o9 implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ zzo c;
    private final /* synthetic */ huc d;
    private final /* synthetic */ x8 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o9(x8 x8Var, String str, String str2, zzo zzoVar, huc hucVar) {
        this.a = str;
        this.b = str2;
        this.c = zzoVar;
        this.d = hucVar;
        this.e = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            lxcVar = this.e.d;
            if (lxcVar == null) {
                this.e.n().F().c("Failed to get conditional properties; not connected to service", this.a, this.b);
                return;
            }
            gh8.j(this.c);
            ArrayList<Bundle> s0 = jb.s0(lxcVar.D(this.a, this.b, this.c));
            this.e.g0();
            this.e.h().X(this.d, s0);
        } catch (RemoteException e) {
            this.e.n().F().d("Failed to get conditional properties; remote exception", this.a, this.b, e);
        } finally {
            this.e.h().X(this.d, arrayList);
        }
    }
}
