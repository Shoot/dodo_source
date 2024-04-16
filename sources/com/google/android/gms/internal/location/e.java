package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
final class e extends aqc {
    private final com.google.android.gms.common.api.internal.d<pv5> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(com.google.android.gms.common.api.internal.d<pv5> dVar) {
        this.a = dVar;
    }

    @Override // defpackage.arc
    public final void P0(LocationResult locationResult) {
        this.a.c(new c(this, locationResult));
    }

    @Override // defpackage.arc
    public final void a0(LocationAvailability locationAvailability) {
        this.a.c(new d(this, locationAvailability));
    }

    public final synchronized void c() {
        this.a.a();
    }
}
