package defpackage;

import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: xvc  reason: default package */
/* loaded from: classes2.dex */
public final class xvc extends jvc.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ euc h;
    private final /* synthetic */ jvc i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvc(jvc jvcVar, String str, String str2, boolean z, euc eucVar) {
        super(jvcVar);
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = eucVar;
        this.i = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.i.i;
        ((guc) gh8.j(gucVar)).getUserProperties(this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.jvc.a
    protected final void b() {
        this.h.q(null);
    }
}
