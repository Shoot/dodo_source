package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.facebook.flipper.plugins.network.NetworkFlipperPlugin;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RateLimiter.java */
/* renamed from: z49  reason: default package */
/* loaded from: classes2.dex */
public final class z49 {
    private final com.google.firebase.perf.config.a a;
    private final double b;
    private final double c;
    private a d;
    private a e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RateLimiter.java */
    /* renamed from: z49$a */
    /* loaded from: classes2.dex */
    public static class a {
        private static final sh k = sh.e();
        private static final long l = TimeUnit.SECONDS.toMicros(1);
        private final v91 a;
        private final boolean b;
        private Timer c;
        private g49 d;
        private long e;
        private double f;
        private g49 g;
        private g49 h;
        private long i;
        private long j;

        a(g49 g49Var, long j, v91 v91Var, com.google.firebase.perf.config.a aVar, String str, boolean z) {
            this.a = v91Var;
            this.e = j;
            this.d = g49Var;
            this.f = j;
            this.c = v91Var.a();
            g(aVar, str, z);
            this.b = z;
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.E();
            }
            return aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.t();
            }
            return aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.F();
            }
            return aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            if (str == "Trace") {
                return aVar.t();
            }
            return aVar.t();
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z) {
            long f = f(aVar, str);
            long e = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            g49 g49Var = new g49(e, f, timeUnit);
            this.g = g49Var;
            this.i = e;
            if (z) {
                k.b("Foreground %s logging rate:%f, burst capacity:%d", str, g49Var, Long.valueOf(e));
            }
            long d = d(aVar, str);
            long c = c(aVar, str);
            g49 g49Var2 = new g49(c, d, timeUnit);
            this.h = g49Var2;
            this.j = c;
            if (z) {
                k.b("Background %s logging rate:%f, capacity:%d", str, g49Var2, Long.valueOf(c));
            }
        }

        synchronized void a(boolean z) {
            g49 g49Var;
            long j;
            try {
                if (z) {
                    g49Var = this.g;
                } else {
                    g49Var = this.h;
                }
                this.d = g49Var;
                if (z) {
                    j = this.i;
                } else {
                    j = this.j;
                }
                this.e = j;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean b(@NonNull wx7 wx7Var) {
            try {
                Timer a = this.a.a();
                double d = (this.c.d(a) * this.d.a()) / l;
                if (d > 0.0d) {
                    this.f = Math.min(this.f + d, this.e);
                    this.c = a;
                }
                double d2 = this.f;
                if (d2 >= 1.0d) {
                    this.f = d2 - 1.0d;
                    return true;
                }
                if (this.b) {
                    k.j("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public z49(@NonNull Context context, g49 g49Var, long j) {
        this(g49Var, j, new v91(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f = hvb.b(context);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean c(List<zx7> list) {
        if (list.size() <= 0 || list.get(0).f0() <= 0 || list.get(0).e0(0) != efa.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (this.c < this.a.f()) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (this.b < this.a.s()) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if (this.b < this.a.G()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.d.a(z);
        this.e.a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(wx7 wx7Var) {
        if (!j(wx7Var)) {
            return false;
        }
        if (wx7Var.i()) {
            return !this.e.b(wx7Var);
        }
        if (!wx7Var.m()) {
            return true;
        }
        return !this.d.b(wx7Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(wx7 wx7Var) {
        if (wx7Var.m() && !f() && !c(wx7Var.n().A0())) {
            return false;
        }
        if (i(wx7Var) && !d() && !c(wx7Var.n().A0())) {
            return false;
        }
        if (wx7Var.i() && !e() && !c(wx7Var.j().w0())) {
            return false;
        }
        return true;
    }

    protected boolean i(wx7 wx7Var) {
        if (wx7Var.m() && wx7Var.n().z0().startsWith("_st_") && wx7Var.n().o0("Hosting_activity")) {
            return true;
        }
        return false;
    }

    boolean j(@NonNull wx7 wx7Var) {
        if ((wx7Var.m() && ((wx7Var.n().z0().equals(er1.FOREGROUND_TRACE_NAME.toString()) || wx7Var.n().z0().equals(er1.BACKGROUND_TRACE_NAME.toString())) && wx7Var.n().s0() > 0)) || wx7Var.h()) {
            return false;
        }
        return true;
    }

    z49(g49 g49Var, long j, v91 v91Var, double d, double d2, com.google.firebase.perf.config.a aVar) {
        this.d = null;
        this.e = null;
        boolean z = false;
        this.f = false;
        hvb.a(0.0d <= d && d < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d2 && d2 < 1.0d) {
            z = true;
        }
        hvb.a(z, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.b = d;
        this.c = d2;
        this.a = aVar;
        this.d = new a(g49Var, j, v91Var, aVar, "Trace", this.f);
        this.e = new a(g49Var, j, v91Var, aVar, NetworkFlipperPlugin.ID, this.f);
    }
}
