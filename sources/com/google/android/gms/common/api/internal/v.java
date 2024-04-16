package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
final class v implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ w b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(w wVar, ConnectionResult connectionResult) {
        this.b = wVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        mm mmVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        w wVar = this.b;
        map = wVar.f.j;
        mmVar = wVar.b;
        t tVar = (t) map.get(mmVar);
        if (tVar == null) {
            return;
        }
        if (this.a.u()) {
            this.b.e = true;
            fVar = this.b.a;
            if (fVar.f()) {
                this.b.h();
                return;
            }
            try {
                w wVar2 = this.b;
                fVar3 = wVar2.a;
                fVar4 = wVar2.a;
                fVar3.i(null, fVar4.h());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                fVar2 = this.b.a;
                fVar2.b("Failed to get service from broker.");
                tVar.G(new ConnectionResult(10), null);
                return;
            }
        }
        tVar.G(this.a, null);
    }
}
