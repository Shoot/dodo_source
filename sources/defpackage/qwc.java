package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.jvc;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: qwc  reason: default package */
/* loaded from: classes2.dex */
final class qwc extends jvc.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ jvc.c f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwc(jvc.c cVar, Activity activity) {
        super(jvc.this);
        this.e = activity;
        this.f = cVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = jvc.this.i;
        ((guc) gh8.j(gucVar)).onActivityResumed(k57.U1(this.e), this.b);
    }
}
