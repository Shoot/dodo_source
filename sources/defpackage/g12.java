package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
/* compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* renamed from: g12  reason: default package */
/* loaded from: classes2.dex */
public class g12 implements sc {
    @NonNull
    private final jc a;

    public g12(@NonNull jc jcVar) {
        this.a = jcVar;
    }

    @Override // defpackage.sc
    public void a(@NonNull String str, Bundle bundle) {
        this.a.b("clx", str, bundle);
    }
}
