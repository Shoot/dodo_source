package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.d;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class i0 extends d0 {
    public final d.a c;

    public i0(d.a aVar, a7b a7bVar) {
        super(4, a7bVar);
        this.c = aVar;
    }

    @Override // defpackage.hjc
    public final boolean f(t tVar) {
        ljc ljcVar = (ljc) tVar.u().get(this.c);
        if (ljcVar != null && ljcVar.a.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hjc
    public final Feature[] g(t tVar) {
        ljc ljcVar = (ljc) tVar.u().get(this.c);
        if (ljcVar == null) {
            return null;
        }
        return ljcVar.a.c();
    }

    @Override // com.google.android.gms.common.api.internal.d0
    public final void h(t tVar) throws RemoteException {
        ljc ljcVar = (ljc) tVar.u().remove(this.c);
        if (ljcVar != null) {
            ljcVar.b.b(tVar.s(), this.b);
            ljcVar.a.a();
            return;
        }
        this.b.e(Boolean.FALSE);
    }

    @Override // com.google.android.gms.common.api.internal.j0
    public final /* bridge */ /* synthetic */ void d(@NonNull l lVar, boolean z) {
    }
}
