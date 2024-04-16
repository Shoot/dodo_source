package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class m extends n0 {
    private final qr f;
    private final c g;

    m(kp5 kp5Var, c cVar, com.google.android.gms.common.a aVar) {
        super(kp5Var, aVar);
        this.f = new qr();
        this.g = cVar;
        this.a.E1("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, c cVar, mm mmVar) {
        kp5 d = LifecycleCallback.d(activity);
        m mVar = (m) d.d4("ConnectionlessLifecycleHelper", m.class);
        if (mVar == null) {
            mVar = new m(d, cVar, com.google.android.gms.common.a.m());
        }
        gh8.k(mmVar, "ApiKey cannot be null");
        mVar.f.add(mmVar);
        cVar.b(mVar);
    }

    private final void v() {
        if (!this.f.isEmpty()) {
            this.g.b(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.n0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.n0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.g.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.n0
    protected final void m(ConnectionResult connectionResult, int i) {
        this.g.F(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.n0
    protected final void n() {
        this.g.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qr t() {
        return this.f;
    }
}
