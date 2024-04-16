package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.a;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
final class o implements a.InterfaceC0219a {
    final /* synthetic */ c a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(c cVar) {
        this.a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0219a
    public final void a(boolean z) {
        Handler handler;
        Handler handler2;
        c cVar = this.a;
        handler = cVar.n;
        handler2 = cVar.n;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
