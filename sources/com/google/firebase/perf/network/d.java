package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
/* compiled from: InstrumentOkHttpEnqueueCallback.java */
/* loaded from: classes2.dex */
public class d implements fm0 {
    private final fm0 a;
    private final gw6 b;
    private final Timer c;
    private final long d;

    public d(fm0 fm0Var, jmb jmbVar, Timer timer, long j) {
        this.a = fm0Var;
        this.b = gw6.c(jmbVar);
        this.d = j;
        this.c = timer;
    }

    @Override // defpackage.fm0
    public void onFailure(cm0 cm0Var, IOException iOException) {
        hi9 request = cm0Var.request();
        if (request != null) {
            sq4 l = request.l();
            if (l != null) {
                this.b.t(l.y().toString());
            }
            if (request.h() != null) {
                this.b.j(request.h());
            }
        }
        this.b.n(this.d);
        this.b.r(this.c.c());
        hw6.d(this.b);
        this.a.onFailure(cm0Var, iOException);
    }

    @Override // defpackage.fm0
    public void onResponse(cm0 cm0Var, ik9 ik9Var) throws IOException {
        FirebasePerfOkHttpClient.a(ik9Var, this.b, this.d, this.c.c());
        this.a.onResponse(cm0Var, ik9Var);
    }
}
