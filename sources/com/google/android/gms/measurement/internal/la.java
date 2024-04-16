package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class la {
    private long a;
    protected long b;
    private final r c;
    final /* synthetic */ ea d;

    public la(ea eaVar) {
        this.d = eaVar;
        this.c = new ka(this, eaVar.a);
        long b = eaVar.b().b();
        this.a = b;
        this.b = b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(la laVar) {
        laVar.d.l();
        laVar.d(false, false, laVar.d.b().b());
        laVar.d.m().u(laVar.d.b().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        long j2 = j - this.b;
        this.b = j;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c.a();
        this.a = 0L;
        this.b = 0L;
    }

    public final boolean d(boolean z, boolean z2, long j) {
        this.d.l();
        this.d.u();
        if (!z6d.a() || !this.d.a().s(b0.n0) || this.d.a.o()) {
            this.d.g().r.b(this.d.b().currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.n().J().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = a(j);
        }
        this.d.n().J().b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        jb.P(this.d.r().B(!this.d.a().Q()), bundle, true);
        if (!z2) {
            this.d.q().B0("auto", "_e", bundle);
        }
        this.a = j;
        this.c.a();
        this.c.b(CoreConstants.MILLIS_IN_ONE_HOUR);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(long j) {
        this.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(long j) {
        this.d.l();
        this.c.a();
        this.a = j;
        this.b = j;
    }
}
