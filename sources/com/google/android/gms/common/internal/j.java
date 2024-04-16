package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
abstract class j extends m {
    public final int d;
    public final Bundle e;
    final /* synthetic */ b f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b bVar, int i, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f = bVar;
        this.d = i;
        this.e = bundle;
    }

    @Override // com.google.android.gms.common.internal.m
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.d != 0) {
            this.f.f0(1, null);
            Bundle bundle = this.e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            f(new ConnectionResult(this.d, pendingIntent));
        } else if (!g()) {
            this.f.f0(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    protected abstract void f(ConnectionResult connectionResult);

    protected abstract boolean g();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.m
    public final void b() {
    }
}
