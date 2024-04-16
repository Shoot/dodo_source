package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: q0d  reason: default package */
/* loaded from: classes2.dex */
public final class q0d {
    private static qx5 a = new qx5("GoogleSignInCommon", new String[0]);

    public static sx7<Status> a(c cVar, Context context, boolean z) {
        a.a("Signing out", new Object[0]);
        b(context);
        if (z) {
            return ux7.b(Status.g, cVar);
        }
        return cVar.a(new x1d(cVar));
    }

    private static void b(Context context) {
        z8d.c(context).a();
        for (c cVar : c.b()) {
            cVar.e();
        }
        com.google.android.gms.common.api.internal.c.a();
    }

    public static sx7<Status> c(c cVar, Context context, boolean z) {
        a.a("Revoking access", new Object[0]);
        String e = pxa.b(context).e();
        b(context);
        if (z) {
            return hwc.a(e);
        }
        return cVar.a(new k3d(cVar));
    }
}
