package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.jvc;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* renamed from: pwc  reason: default package */
/* loaded from: classes2.dex */
final class pwc extends jvc.a {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ Activity f;
    private final /* synthetic */ jvc.c g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwc(jvc.c cVar, Bundle bundle, Activity activity) {
        super(jvc.this);
        this.e = bundle;
        this.f = activity;
        this.g = cVar;
    }

    @Override // defpackage.jvc.a
    final void a() throws RemoteException {
        Bundle bundle;
        guc gucVar;
        if (this.e != null) {
            bundle = new Bundle();
            if (this.e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        gucVar = jvc.this.i;
        ((guc) gh8.j(gucVar)).onActivityCreated(k57.U1(this.f), bundle, this.b);
    }
}
