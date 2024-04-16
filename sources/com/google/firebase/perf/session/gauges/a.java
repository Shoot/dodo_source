package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.session.gauges.a;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: CpuGaugeCollector.java */
/* loaded from: classes2.dex */
public class a {
    private static final sh g = sh.e();
    private static final long h = TimeUnit.SECONDS.toMicros(1);
    private final String c;
    private final long d;
    private ScheduledFuture e = null;
    private long f = -1;
    public final ConcurrentLinkedQueue<p02> a = new ConcurrentLinkedQueue<>();
    private final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public a() {
        int myPid = Process.myPid();
        this.c = "/proc/" + Integer.toString(myPid) + "/stat";
        this.d = e();
    }

    private long d(long j) {
        return Math.round((j / this.d) * h);
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j) {
        if (j <= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Timer timer) {
        p02 m = m(timer);
        if (m != null) {
            this.a.add(m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Timer timer) {
        p02 m = m(timer);
        if (m != null) {
            this.a.add(m);
        }
    }

    private synchronized void i(final Timer timer) {
        try {
            this.b.schedule(new Runnable() { // from class: o02
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.g(timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            sh shVar = g;
            shVar.j("Unable to collect Cpu Metric: " + e.getMessage());
        }
    }

    private synchronized void j(long j, final Timer timer) {
        this.f = j;
        try {
            this.e = this.b.scheduleAtFixedRate(new Runnable() { // from class: n02
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.h(timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            sh shVar = g;
            shVar.j("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    private p02 m(Timer timer) {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.c));
            try {
                long b = timer.b();
                String[] split = bufferedReader.readLine().split(" ");
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[15]);
                p02 a = p02.d0().I(b).J(d(Long.parseLong(split[14]) + Long.parseLong(split[16]))).K(d(parseLong + parseLong2)).a();
                bufferedReader.close();
                return a;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            sh shVar = g;
            shVar.j("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            sh shVar2 = g;
            shVar2.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            sh shVar22 = g;
            shVar22.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            sh shVar222 = g;
            shVar222.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void c(Timer timer) {
        i(timer);
    }

    public void k(long j, Timer timer) {
        long j2 = this.d;
        if (j2 == -1 || j2 == 0 || f(j)) {
            return;
        }
        if (this.e != null) {
            if (this.f != j) {
                l();
                j(j, timer);
                return;
            }
            return;
        }
        j(j, timer);
    }

    public void l() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.e = null;
        this.f = -1L;
    }
}
