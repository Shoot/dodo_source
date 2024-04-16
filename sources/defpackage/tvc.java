package defpackage;

import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: tvc  reason: default package */
/* loaded from: classes2.dex */
public final class tvc extends jvc.a {
    private final /* synthetic */ euc e;
    private final /* synthetic */ jvc f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvc(jvc jvcVar, euc eucVar) {
        super(jvcVar);
        this.e = eucVar;
        this.f = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.f.i;
        ((guc) gh8.j(gucVar)).getCachedAppInstanceId(this.e);
    }

    @Override // defpackage.jvc.a
    protected final void b() {
        this.e.q(null);
    }
}
