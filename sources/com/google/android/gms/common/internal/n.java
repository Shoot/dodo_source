package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class n extends omc {
    private b a;
    private final int b;

    public n(@NonNull b bVar, int i) {
        this.a = bVar;
        this.b = i;
    }

    @Override // defpackage.wr4
    public final void c1(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // defpackage.wr4
    public final void m0(int i, @NonNull IBinder iBinder, Bundle bundle) {
        gh8.k(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.K(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.wr4
    public final void t1(int i, @NonNull IBinder iBinder, @NonNull zzj zzjVar) {
        b bVar = this.a;
        gh8.k(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        gh8.j(zzjVar);
        b.Z(bVar, zzjVar);
        m0(i, iBinder, zzjVar.a);
    }
}
