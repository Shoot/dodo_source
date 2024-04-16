package defpackage;

import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: rvc  reason: default package */
/* loaded from: classes2.dex */
public final class rvc extends jvc.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ jvc f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvc(jvc jvcVar, String str) {
        super(jvcVar);
        this.e = str;
        this.f = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.f.i;
        ((guc) gh8.j(gucVar)).endAdUnitExposure(this.e, this.b);
    }
}
