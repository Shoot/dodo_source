package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.t79;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RealConnectionPool.kt */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001#\u0018\u0000 02\u00020\u0001:\u0001\u0012B/\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J8\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'¨\u00061"}, d2 = {"Lv79;", "", "Lu79;", "connection", "", "now", "", e.a, "", "doExtensiveHealthChecks", "Lx6;", "address", "Lt79;", "call", "", "Lqo9;", "routes", "requireMultiplexed", "a", "", "f", c.a, "b", "I", "maxIdleConnections", "Lqq1;", "Lqq1;", DateTokenConverter.CONVERTER_KEY, "()Lqq1;", "connectionListener", "J", "keepAliveDurationNs", "Lj7b;", "Lj7b;", "cleanupQueue", "v79$b", "Lv79$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "Lk7b;", "taskRunner", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lk7b;IJLjava/util/concurrent/TimeUnit;Lqq1;)V", "g", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: v79  reason: default package */
/* loaded from: classes3.dex */
public final class v79 {
    public static final a g = new a(null);
    private final int a;
    private final qq1 b;
    private final long c;
    private final j7b d;
    private final b e;
    private final ConcurrentLinkedQueue<u79> f;

    /* compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv79$a;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: v79$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"v79$b", "Lx6b;", "", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: v79$b */
    /* loaded from: classes3.dex */
    public static final class b extends x6b {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // defpackage.x6b
        public long f() {
            return v79.this.b(System.nanoTime());
        }
    }

    public v79(k7b k7bVar, int i, long j, TimeUnit timeUnit, qq1 qq1Var) {
        z65.h(k7bVar, "taskRunner");
        z65.h(timeUnit, "timeUnit");
        z65.h(qq1Var, "connectionListener");
        this.a = i;
        this.b = qq1Var;
        this.c = timeUnit.toNanos(j);
        this.d = k7bVar.k();
        this.e = new b(cec.f + " ConnectionPool");
        this.f = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }

    private final int e(u79 u79Var, long j) {
        if (cec.e && !Thread.holdsLock(u79Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + u79Var);
        }
        List<Reference<t79>> i = u79Var.i();
        int i2 = 0;
        while (i2 < i.size()) {
            Reference<t79> reference = i.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                z65.f(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                xb8.a.g().m("A connection to " + u79Var.v().a().l() + " was leaked. Did you forget to close a response body?", ((t79.b) reference).a());
                i.remove(i2);
                if (i.isEmpty()) {
                    u79Var.x(j - this.c);
                    return 0;
                }
            }
        }
        return i.size();
    }

    public final u79 a(boolean z, x6 x6Var, t79 t79Var, List<qo9> list, boolean z2) {
        boolean z3;
        boolean z4;
        Socket z5;
        z65.h(x6Var, "address");
        z65.h(t79Var, "call");
        Iterator<u79> it = this.f.iterator();
        while (it.hasNext()) {
            u79 next = it.next();
            z65.e(next);
            synchronized (next) {
                z3 = false;
                if (z2) {
                    try {
                        if (!next.r()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (next.p(x6Var, list)) {
                    t79Var.d(next);
                    z3 = true;
                }
            }
            if (z3) {
                if (next.q(z)) {
                    return next;
                }
                synchronized (next) {
                    z4 = !next.l();
                    next.y(true);
                    z5 = t79Var.z();
                }
                if (z5 != null) {
                    cec.h(z5);
                    this.b.f(next);
                } else if (z4) {
                    this.b.h(next);
                }
            }
        }
        return null;
    }

    public final long b(long j) {
        Iterator<u79> it = this.f.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        u79 u79Var = null;
        int i2 = 0;
        while (it.hasNext()) {
            u79 next = it.next();
            z65.e(next);
            synchronized (next) {
                if (e(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long k = j - next.k();
                    if (k > j2) {
                        u79Var = next;
                        j2 = k;
                    }
                    Unit unit = Unit.a;
                }
            }
        }
        long j3 = this.c;
        if (j2 < j3 && i <= this.a) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        z65.e(u79Var);
        synchronized (u79Var) {
            if (!u79Var.i().isEmpty()) {
                return 0L;
            }
            if (u79Var.k() + j2 != j) {
                return 0L;
            }
            u79Var.y(true);
            this.f.remove(u79Var);
            cec.h(u79Var.z());
            this.b.f(u79Var);
            if (this.f.isEmpty()) {
                this.d.a();
            }
            return 0L;
        }
    }

    public final boolean c(u79 u79Var) {
        z65.h(u79Var, "connection");
        if (cec.e && !Thread.holdsLock(u79Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + u79Var);
        } else if (!u79Var.l() && this.a != 0) {
            j7b.m(this.d, this.e, 0L, 2, null);
            return false;
        } else {
            u79Var.y(true);
            this.f.remove(u79Var);
            if (this.f.isEmpty()) {
                this.d.a();
            }
            return true;
        }
    }

    public final qq1 d() {
        return this.b;
    }

    public final void f(u79 u79Var) {
        z65.h(u79Var, "connection");
        if (cec.e && !Thread.holdsLock(u79Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + u79Var);
        }
        this.f.add(u79Var);
        j7b.m(this.d, this.e, 0L, 2, null);
    }
}
