package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.t79;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Dispatcher.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\u0016\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J+\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0004R\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0006\u0010\u0017\u001a\u00020\u0016R*\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR.\u0010)\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u001e\u0010/\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010.R\u001e\u00100\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0011\u00103\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b#\u00102¨\u00066"}, d2 = {"Lt33;", "", "", "host", "Lt79$a;", "Lt79;", DateTokenConverter.CONVERTER_KEY, "", Image.TYPE_HIGH, "T", "Ljava/util/Deque;", "calls", "call", "", e.a, "(Ljava/util/Deque;Ljava/lang/Object;)V", "a", "(Lt79$a;)V", "b", "(Lt79;)V", "f", "g", "", "i", "maxRequests", "I", "getMaxRequests", "()I", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", c.a, "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: t33  reason: default package */
/* loaded from: classes3.dex */
public final class t33 {
    private Runnable c;
    private ExecutorService d;
    private int a = 64;
    private int b = 5;
    private final ArrayDeque<t79.a> e = new ArrayDeque<>();
    private final ArrayDeque<t79.a> f = new ArrayDeque<>();
    private final ArrayDeque<t79> g = new ArrayDeque<>();

    private final t79.a d(String str) {
        Iterator<t79.a> it = this.f.iterator();
        while (it.hasNext()) {
            t79.a next = it.next();
            if (z65.c(next.f(), str)) {
                return next;
            }
        }
        Iterator<t79.a> it2 = this.e.iterator();
        while (it2.hasNext()) {
            t79.a next2 = it2.next();
            if (z65.c(next2.f(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void e(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.c;
                Unit unit = Unit.a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!h() && runnable != null) {
            runnable.run();
        }
    }

    private final boolean h() {
        int i;
        boolean z;
        if (cec.e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<t79.a> it = this.e.iterator();
                z65.g(it, "iterator(...)");
                while (it.hasNext()) {
                    t79.a next = it.next();
                    if (this.f.size() >= this.a) {
                        break;
                    } else if (next.e().get() < this.b) {
                        it.remove();
                        next.e().incrementAndGet();
                        z65.e(next);
                        arrayList.add(next);
                        this.f.add(next);
                    }
                }
                i = 0;
                if (i() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c().isShutdown()) {
            int size = arrayList.size();
            while (i < size) {
                t79.a aVar = (t79.a) arrayList.get(i);
                aVar.e().decrementAndGet();
                synchronized (this) {
                    this.f.remove(aVar);
                }
                t79.a.c(aVar, null, 1, null);
                i++;
            }
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            int size2 = arrayList.size();
            while (i < size2) {
                ((t79.a) arrayList.get(i)).a(c());
                i++;
            }
        }
        return z;
    }

    public final void a(t79.a aVar) {
        t79.a d;
        z65.h(aVar, "call");
        synchronized (this) {
            try {
                this.e.add(aVar);
                if (!aVar.d().o() && (d = d(aVar.f())) != null) {
                    aVar.g(d);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(t79 t79Var) {
        z65.h(t79Var, "call");
        this.g.add(t79Var);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.d == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, cec.q(cec.f + " Dispatcher", false));
            }
            executorService = this.d;
            z65.e(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void f(t79.a aVar) {
        z65.h(aVar, "call");
        aVar.e().decrementAndGet();
        e(this.f, aVar);
    }

    public final void g(t79 t79Var) {
        z65.h(t79Var, "call");
        e(this.g, t79Var);
    }

    public final synchronized int i() {
        return this.f.size() + this.g.size();
    }
}
