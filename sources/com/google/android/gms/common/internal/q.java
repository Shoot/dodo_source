package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class q extends j {
    final /* synthetic */ b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar, int i, Bundle bundle) {
        super(bVar, i, null);
        this.g = bVar;
    }

    @Override // com.google.android.gms.common.internal.j
    protected final void f(ConnectionResult connectionResult) {
        if (this.g.q() && b.e0(this.g)) {
            b.a0(this.g, 16);
            return;
        }
        this.g.p.a(connectionResult);
        this.g.I(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.j
    protected final boolean g() {
        this.g.p.a(ConnectionResult.e);
        return true;
    }
}
