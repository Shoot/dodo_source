package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.jvc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: nwc  reason: default package */
/* loaded from: classes2.dex */
public final class nwc extends jvc.a {
    private final /* synthetic */ Long e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ jvc k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwc(jvc jvcVar, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(jvcVar);
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = bundle;
        this.i = z;
        this.j = z2;
        this.k = jvcVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        long longValue;
        guc gucVar;
        Long l = this.e;
        if (l == null) {
            longValue = this.a;
        } else {
            longValue = l.longValue();
        }
        long j = longValue;
        gucVar = this.k.i;
        ((guc) gh8.j(gucVar)).logEvent(this.f, this.g, this.h, this.i, this.j, j);
    }
}
