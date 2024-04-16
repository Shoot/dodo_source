package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
/* renamed from: w2c  reason: default package */
/* loaded from: classes2.dex */
public class w2c {
    private static final long r = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService s = null;
    private static final Object t = new Object();
    private static volatile quc u = new nqc();
    private final Object a;
    private final PowerManager.WakeLock b;
    private int c;
    private Future<?> d;
    private long e;
    private final Set<ewc> f;
    private boolean g;
    private int h;
    hqc i;
    private t91 j;
    private WorkSource k;
    private final String l;
    private final String m;
    private final Context n;
    private final Map<String, ysc> o;
    private AtomicInteger p;
    private final ScheduledExecutorService q;

    public w2c(@NonNull Context context, int i, @NonNull String str) {
        String str2;
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.j = jp2.c();
        this.o = new HashMap();
        this.p = new AtomicInteger(0);
        gh8.k(context, "WakeLock: context must not be null");
        gh8.g(str, "WakeLock: wakeLockName must not be empty");
        this.n = context.getApplicationContext();
        this.m = str;
        this.i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.l = str2;
        } else {
            this.l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.b = newWakeLock;
            if (u7c.c(context)) {
                WorkSource b = u7c.b(context, b0b.a(packageName) ? context.getPackageName() : packageName);
                this.k = b;
                if (b != null) {
                    i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = s;
            if (scheduledExecutorService == null) {
                synchronized (t) {
                    try {
                        scheduledExecutorService = s;
                        if (scheduledExecutorService == null) {
                            yzc.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    public static /* synthetic */ void e(@NonNull w2c w2cVar) {
        synchronized (w2cVar.a) {
            try {
                if (!w2cVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(w2cVar.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                w2cVar.g();
                if (!w2cVar.b()) {
                    return;
                }
                w2cVar.c = 1;
                w2cVar.h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        this.f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        ewc ewcVar = (ewc) arrayList.get(0);
        throw null;
    }

    private final void h(int i) {
        synchronized (this.a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.g) {
                    int i2 = this.c - 1;
                    this.c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.c = 0;
                }
                g();
                for (ysc yscVar : this.o.values()) {
                    yscVar.a = 0;
                }
                this.o.clear();
                Future<?> future = this.d;
                if (future != null) {
                    future.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                this.h = 0;
                if (this.b.isHeld()) {
                    try {
                        this.b.release();
                        if (this.i != null) {
                            this.i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.l).concat(" failed to release!"), e);
                            if (this.i != null) {
                                this.i = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.l).concat(" should be held!"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public void a(long j) {
        this.p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, r), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.i = hqc.a(false, null);
                    this.b.acquire();
                    this.j.b();
                }
                this.c++;
                this.h++;
                f(null);
                ysc yscVar = this.o.get(null);
                if (yscVar == null) {
                    yscVar = new ysc(null);
                    this.o.put(null, yscVar);
                }
                yscVar.a++;
                long b = this.j.b();
                if (Long.MAX_VALUE - b > max) {
                    j2 = b + max;
                }
                if (j2 > this.e) {
                    this.e = j2;
                    Future<?> future = this.d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.d = this.q.schedule(new Runnable() { // from class: xlc
                        @Override // java.lang.Runnable
                        public final void run() {
                            w2c.e(w2c.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            if (this.c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void c() {
        if (this.p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.l).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            try {
                f(null);
                if (this.o.containsKey(null)) {
                    ysc yscVar = this.o.get(null);
                    if (yscVar != null) {
                        int i = yscVar.a - 1;
                        yscVar.a = i;
                        if (i == 0) {
                            this.o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z) {
        synchronized (this.a) {
            this.g = z;
        }
    }
}
