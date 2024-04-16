package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
final class r implements Runnable {
    final /* synthetic */ s a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar) {
        this.a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        t tVar = this.a.a;
        fVar = tVar.b;
        fVar2 = tVar.b;
        fVar.b(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
