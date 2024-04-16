package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class a0 extends f {
    final /* synthetic */ g.a e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(g.a aVar, d dVar, Feature[] featureArr, boolean z, int i) {
        super(dVar, featureArr, z, i);
        this.e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.f
    public final void d(a.b bVar, a7b<Void> a7bVar) throws RemoteException {
        yc9 yc9Var;
        yc9Var = this.e.a;
        yc9Var.a(bVar, a7bVar);
    }
}
