package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.b;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
final class f implements b.a {
    final /* synthetic */ pq1 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(pq1 pq1Var) {
        this.a = pq1Var;
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void onConnectionSuspended(int i) {
        this.a.onConnectionSuspended(i);
    }

    @Override // com.google.android.gms.common.internal.b.a
    public final void x(Bundle bundle) {
        this.a.x(bundle);
    }
}
