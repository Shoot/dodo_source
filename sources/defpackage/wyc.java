package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.u5;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: wyc  reason: default package */
/* loaded from: classes2.dex */
public final class wyc {
    private final a a;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
    /* renamed from: wyc$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Context context, Intent intent);
    }

    public wyc(a aVar) {
        gh8.j(aVar);
        this.a = aVar;
    }

    public final void a(Context context, Intent intent) {
        k4 n = u5.a(context, null, null).n();
        if (intent == null) {
            n.K().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        n.J().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            n.J().a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            n.K().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
