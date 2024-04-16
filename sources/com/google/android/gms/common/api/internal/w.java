package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class w implements b.c, rjc {
    private final a.f a;
    private final mm b;
    private com.google.android.gms.common.internal.e c = null;
    private Set d = null;
    private boolean e = false;
    final /* synthetic */ c f;

    public w(c cVar, a.f fVar, mm mmVar) {
        this.f = cVar;
        this.a = fVar;
        this.b = mmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        com.google.android.gms.common.internal.e eVar;
        if (this.e && (eVar = this.c) != null) {
            this.a.i(eVar, this.d);
        }
    }

    @Override // com.google.android.gms.common.internal.b.c
    public final void a(@NonNull ConnectionResult connectionResult) {
        Handler handler;
        handler = this.f.n;
        handler.post(new v(this, connectionResult));
    }

    @Override // defpackage.rjc
    public final void b(com.google.android.gms.common.internal.e eVar, Set set) {
        if (eVar != null && set != null) {
            this.c = eVar;
            this.d = set;
            h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        c(new ConnectionResult(4));
    }

    @Override // defpackage.rjc
    public final void c(ConnectionResult connectionResult) {
        Map map;
        map = this.f.j;
        t tVar = (t) map.get(this.b);
        if (tVar != null) {
            tVar.H(connectionResult);
        }
    }
}
