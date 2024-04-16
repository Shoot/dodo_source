package defpackage;

import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: owc  reason: default package */
/* loaded from: classes2.dex */
public final class owc extends jvc.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ jvc i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owc(jvc jvcVar, String str, String str2, Object obj, boolean z) {
        super(jvcVar);
        this.e = str;
        this.f = str2;
        this.g = obj;
        this.h = z;
        this.i = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.i.i;
        ((guc) gh8.j(gucVar)).setUserProperty(this.e, this.f, k57.U1(this.g), this.h, this.a);
    }
}
