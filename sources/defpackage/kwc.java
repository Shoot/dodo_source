package defpackage;

import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: kwc  reason: default package */
/* loaded from: classes2.dex */
public final class kwc extends jvc.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ euc f;
    private final /* synthetic */ jvc g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwc(jvc jvcVar, String str, euc eucVar) {
        super(jvcVar);
        this.e = str;
        this.f = eucVar;
        this.g = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.g.i;
        ((guc) gh8.j(gucVar)).getMaxUserProperties(this.e, this.f);
    }

    @Override // defpackage.jvc.a
    protected final void b() {
        this.f.q(null);
    }
}
