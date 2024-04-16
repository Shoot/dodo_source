package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class s implements b.e {
    final /* synthetic */ t a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar) {
        this.a = tVar;
    }

    @Override // com.google.android.gms.common.internal.b.e
    public final void a() {
        Handler handler;
        handler = this.a.m.n;
        handler.post(new r(this));
    }
}
