package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
final class k0 {
    private final int a;
    private final ConnectionResult b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(ConnectionResult connectionResult, int i) {
        gh8.j(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ConnectionResult b() {
        return this.b;
    }
}
