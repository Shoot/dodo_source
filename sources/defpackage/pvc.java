package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: pvc  reason: default package */
/* loaded from: classes2.dex */
public final class pvc extends jvc.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ jvc h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvc(jvc jvcVar, Activity activity, String str, String str2) {
        super(jvcVar);
        this.e = activity;
        this.f = str;
        this.g = str2;
        this.h = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.h.i;
        ((guc) gh8.j(gucVar)).setCurrentScreen(k57.U1(this.e), this.f, this.g, this.a);
    }
}
