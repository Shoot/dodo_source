package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import com.google.firebase.perf.session.PerfSession;
import defpackage.wjb;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TraceMetricBuilder.java */
/* loaded from: classes2.dex */
public class a {
    private final Trace a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@NonNull Trace trace) {
        this.a = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public wjb a() {
        wjb.b R = wjb.H0().S(this.a.f()).Q(this.a.h().e()).R(this.a.h().d(this.a.e()));
        for (Counter counter : this.a.d().values()) {
            R.O(counter.b(), counter.a());
        }
        List<Trace> i = this.a.i();
        if (!i.isEmpty()) {
            for (Trace trace : i) {
                R.L(new a(trace).a());
            }
        }
        R.N(this.a.getAttributes());
        zx7[] b = PerfSession.b(this.a.g());
        if (b != null) {
            R.I(Arrays.asList(b));
        }
        return R.a();
    }
}
