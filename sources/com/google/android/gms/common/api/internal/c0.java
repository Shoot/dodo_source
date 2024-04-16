package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class c0 extends h {
    final /* synthetic */ h.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h.a aVar, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.h
    public final void b(a.b bVar, a7b a7bVar) throws RemoteException {
        yc9 yc9Var;
        yc9Var = this.d.a;
        yc9Var.a(bVar, a7bVar);
    }
}
