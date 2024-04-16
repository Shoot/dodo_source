package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import ch.qos.logback.classic.Level;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* loaded from: classes2.dex */
public final class y implements n77 {
    private final c a;
    private final int b;
    private final mm c;
    private final long d;
    private final long e;

    y(c cVar, int i, mm mmVar, long j, long j2, String str, String str2) {
        this.a = cVar;
        this.b = i;
        this.c = mmVar;
        this.d = j;
        this.e = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y b(c cVar, int i, mm mmVar) {
        boolean z;
        long j;
        long j2;
        if (!cVar.e()) {
            return null;
        }
        RootTelemetryConfiguration a = co9.b().a();
        if (a != null) {
            if (!a.p()) {
                return null;
            }
            z = a.t();
            t t = cVar.t(mmVar);
            if (t != null) {
                if (!(t.s() instanceof com.google.android.gms.common.internal.b)) {
                    return null;
                }
                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) t.s();
                if (bVar.G() && !bVar.isConnecting()) {
                    ConnectionTelemetryConfiguration c = c(t, bVar, i);
                    if (c == null) {
                        return null;
                    }
                    t.F();
                    z = c.u();
                }
            }
        } else {
            z = true;
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new y(cVar, i, mmVar, j, j2, null, null);
    }

    private static ConnectionTelemetryConfiguration c(t tVar, com.google.android.gms.common.internal.b bVar, int i) {
        int[] k;
        int[] p;
        ConnectionTelemetryConfiguration E = bVar.E();
        if (E == null || !E.t() || ((k = E.k()) != null ? !sr.a(k, i) : !((p = E.p()) == null || !sr.a(p, i))) || tVar.p() >= E.h()) {
            return null;
        }
        return E;
    }

    @Override // defpackage.n77
    public final void a(@NonNull y6b y6bVar) {
        t t;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int h;
        long j;
        long j2;
        int i5;
        if (!this.a.e()) {
            return;
        }
        RootTelemetryConfiguration a = co9.b().a();
        if ((a == null || a.p()) && (t = this.a.t(this.c)) != null && (t.s() instanceof com.google.android.gms.common.internal.b)) {
            com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) t.s();
            boolean z2 = true;
            if (this.d > 0) {
                z = true;
            } else {
                z = false;
            }
            int w = bVar.w();
            if (a != null) {
                z &= a.t();
                int h2 = a.h();
                int k = a.k();
                i = a.u();
                if (bVar.G() && !bVar.isConnecting()) {
                    ConnectionTelemetryConfiguration c = c(t, bVar, this.b);
                    if (c == null) {
                        return;
                    }
                    z2 = (!c.u() || this.d <= 0) ? false : false;
                    k = c.h();
                    z = z2;
                }
                i2 = h2;
                i3 = k;
            } else {
                i = 0;
                i2 = Level.TRACE_INT;
                i3 = 100;
            }
            c cVar = this.a;
            if (y6bVar.q()) {
                i4 = 0;
                h = 0;
            } else {
                if (y6bVar.o()) {
                    i4 = 100;
                } else {
                    Exception l = y6bVar.l();
                    if (l instanceof ApiException) {
                        Status a2 = ((ApiException) l).a();
                        int p = a2.p();
                        ConnectionResult h3 = a2.h();
                        if (h3 == null) {
                            i4 = p;
                        } else {
                            h = h3.h();
                            i4 = p;
                        }
                    } else {
                        i4 = 101;
                    }
                }
                h = -1;
            }
            if (z) {
                long j3 = this.d;
                j2 = System.currentTimeMillis();
                j = j3;
                i5 = (int) (SystemClock.elapsedRealtime() - this.e);
            } else {
                j = 0;
                j2 = 0;
                i5 = -1;
            }
            cVar.E(new MethodInvocation(this.b, i4, h, j, j2, null, null, w, i5), i, i2, i3);
        }
    }
}
