package defpackage;

import android.content.Context;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;
/* compiled from: FirebasePerfEarly.java */
/* renamed from: pw3  reason: default package */
/* loaded from: classes2.dex */
public class pw3 {
    public pw3(qv3 qv3Var, xta xtaVar, Executor executor) {
        Context k = qv3Var.k();
        a.g().O(k);
        gp b = gp.b();
        b.i(k);
        b.j(new xw3());
        if (xtaVar != null) {
            AppStartTrace k2 = AppStartTrace.k();
            k2.v(k);
            executor.execute(new AppStartTrace.c(k2));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
