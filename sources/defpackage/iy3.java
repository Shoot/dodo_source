package defpackage;

import com.google.firebase.perf.metrics.Trace;
import kotlin.Metadata;
/* compiled from: FirebaseTrace.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Liy3;", "Lqjb;", "", "start", "stop", "Lcom/google/firebase/perf/metrics/Trace;", "a", "Lcom/google/firebase/perf/metrics/Trace;", "trace", "<init>", "(Lcom/google/firebase/perf/metrics/Trace;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iy3  reason: default package */
/* loaded from: classes4.dex */
public final class iy3 implements qjb {
    private final Trace a;

    public iy3(Trace trace) {
        z65.h(trace, "trace");
        this.a = trace;
    }

    @Override // defpackage.qjb
    public void start() {
        this.a.start();
    }

    @Override // defpackage.qjb
    public void stop() {
        this.a.stop();
    }
}
