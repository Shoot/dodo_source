package defpackage;

import android.os.Bundle;
import defpackage.fo;
import defpackage.jc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* renamed from: uuc  reason: default package */
/* loaded from: classes2.dex */
public final class uuc implements fo.a {
    private final /* synthetic */ gwc a;

    public uuc(gwc gwcVar) {
        this.a = gwcVar;
    }

    @Override // defpackage.h1d
    public final void a(String str, String str2, Bundle bundle, long j) {
        jc.b bVar;
        if (!this.a.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", pqc.c(str2));
        bVar = this.a.b;
        bVar.a(2, bundle2);
    }
}
