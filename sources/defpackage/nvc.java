package defpackage;

import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: nvc  reason: default package */
/* loaded from: classes2.dex */
public final class nvc extends jvc.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ euc g;
    private final /* synthetic */ jvc h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvc(jvc jvcVar, String str, String str2, euc eucVar) {
        super(jvcVar);
        this.e = str;
        this.f = str2;
        this.g = eucVar;
        this.h = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.h.i;
        ((guc) gh8.j(gucVar)).getConditionalUserProperties(this.e, this.f, this.g);
    }

    @Override // defpackage.jvc.a
    protected final void b() {
        this.g.q(null);
    }
}
