package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class b0 extends i {
    final /* synthetic */ g.a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g.a aVar, d.a aVar2) {
        super(aVar2);
        this.b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.i
    public final void b(a.b bVar, a7b<Boolean> a7bVar) throws RemoteException {
        yc9 yc9Var;
        yc9Var = this.b.b;
        yc9Var.a(bVar, a7bVar);
    }
}
