package defpackage;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import defpackage.fo;
import defpackage.jc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* renamed from: ywc  reason: default package */
/* loaded from: classes2.dex */
public final class ywc implements fo.a {
    private final /* synthetic */ zxc a;

    public ywc(zxc zxcVar) {
        this.a = zxcVar;
    }

    @Override // defpackage.h1d
    public final void a(String str, String str2, Bundle bundle, long j) {
        jc.b bVar;
        if (str != null && pqc.i(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(Action.NAME_ATTRIBUTE, str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            bVar = this.a.a;
            bVar.a(3, bundle2);
        }
    }
}
