package defpackage;

import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: jwc  reason: default package */
/* loaded from: classes2.dex */
public final class jwc extends jvc.a {
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ jvc j;
    private final /* synthetic */ int e = 5;
    private final /* synthetic */ Object h = null;
    private final /* synthetic */ Object i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwc(jvc jvcVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f = str;
        this.g = obj;
        this.j = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        guc gucVar;
        gucVar = this.j.i;
        ((guc) gh8.j(gucVar)).logHealthData(this.e, this.f, k57.U1(this.g), k57.U1(null), k57.U1(null));
    }
}
