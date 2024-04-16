package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.jvc;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: vwc  reason: default package */
/* loaded from: classes2.dex */
final class vwc extends jvc.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ euc f;
    private final /* synthetic */ jvc.c g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwc(jvc.c cVar, Activity activity, euc eucVar) {
        super(jvc.this);
        this.e = activity;
        this.f = eucVar;
        this.g = cVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = jvc.this.i;
        ((guc) gh8.j(gucVar)).onActivitySaveInstanceState(k57.U1(this.e), this.f, this.b);
    }
}
