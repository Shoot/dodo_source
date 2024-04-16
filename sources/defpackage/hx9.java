package defpackage;

import com.google.firebase.perf.metrics.Trace;
import defpackage.f74;
/* compiled from: ScreenTraceUtil.java */
/* renamed from: hx9  reason: default package */
/* loaded from: classes2.dex */
public class hx9 {
    private static final sh a = sh.e();

    public static Trace a(Trace trace, f74.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(dr1.FRAMES_TOTAL.toString(), aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(dr1.FRAMES_SLOW.toString(), aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(dr1.FRAMES_FROZEN.toString(), aVar.b());
        }
        sh shVar = a;
        shVar.a("Screen trace: " + trace.f() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
