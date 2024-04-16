package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.d;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class g0 extends d0 {
    public final ljc c;

    public g0(ljc ljcVar, a7b a7bVar) {
        super(3, a7bVar);
        this.c = ljcVar;
    }

    @Override // defpackage.hjc
    public final boolean f(t tVar) {
        return this.c.a.f();
    }

    @Override // defpackage.hjc
    public final Feature[] g(t tVar) {
        return this.c.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.d0
    public final void h(t tVar) throws RemoteException {
        this.c.a.d(tVar.s(), this.b);
        d.a b = this.c.a.b();
        if (b != null) {
            tVar.u().put(b, this.c);
        }
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final /* bridge */ /* synthetic */ void d(@NonNull l lVar, boolean z) {
    }
}
