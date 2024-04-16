package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class r9 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ zzo e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ x8 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r9(x8 x8Var, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar, boolean z) {
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = zzoVar;
        this.f = z;
        this.g = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxc lxcVar;
        synchronized (this.a) {
            try {
                lxcVar = this.g.d;
            } catch (RemoteException e) {
                this.g.n().F().d("(legacy) Failed to get user properties; remote exception", k4.u(this.b), this.c, e);
                this.a.set(Collections.emptyList());
                this.a.notify();
            }
            if (lxcVar == null) {
                this.g.n().F().d("(legacy) Failed to get user properties; not connected to service", k4.u(this.b), this.c, this.d);
                this.a.set(Collections.emptyList());
                this.a.notify();
                return;
            }
            if (TextUtils.isEmpty(this.b)) {
                gh8.j(this.e);
                this.a.set(lxcVar.C1(this.c, this.d, this.f, this.e));
            } else {
                this.a.set(lxcVar.M(this.b, this.c, this.d, this.f));
            }
            this.g.g0();
            this.a.notify();
        }
    }
}
