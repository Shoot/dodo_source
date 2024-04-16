package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TaskRunner.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0012\t\u000eB\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\u0004R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103¨\u00067"}, d2 = {"Lk7b;", "", "Lx6b;", "task", "", DateTokenConverter.CONVERTER_KEY, "l", "", "delayNanos", "b", "Lj7b;", "taskQueue", "j", "(Lj7b;)V", com.huawei.hms.opendevice.c.a, "k", e.a, "Lk7b$a;", "a", "Lk7b$a;", "f", "()Lk7b$a;", "backend", "Ljava/util/logging/Logger;", "Ljava/util/logging/Logger;", "i", "()Ljava/util/logging/Logger;", "logger", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", Image.TYPE_HIGH, "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/Condition;", "Ljava/util/concurrent/locks/Condition;", "g", "()Ljava/util/concurrent/locks/Condition;", "condition", "", "I", "nextQueueName", "", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "<init>", "(Lk7b$a;Ljava/util/logging/Logger;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: k7b  reason: default package */
/* loaded from: classes3.dex */
public final class k7b {
    public static final b k = new b(null);
    private static final Logger l;
    public static final k7b m;
    private final a a;
    private final Logger b;
    private final ReentrantLock c;
    private final Condition d;
    private int e;
    private boolean f;
    private long g;
    private final List<j7b> h;
    private final List<j7b> i;
    private final Runnable j;

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH&J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lk7b$a;", "", "", "a", "Lk7b;", "taskRunner", "", e.a, "nanos", com.huawei.hms.opendevice.c.a, "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "b", "Ljava/lang/Runnable;", "runnable", DateTokenConverter.CONVERTER_KEY, "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k7b$a */
    /* loaded from: classes3.dex */
    public interface a {
        long a();

        <T> BlockingQueue<T> b(BlockingQueue<T> blockingQueue);

        void c(k7b k7bVar, long j);

        void d(k7b k7bVar, Runnable runnable);

        void e(k7b k7bVar);
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lk7b$b;", "", "Lk7b;", "INSTANCE", "Lk7b;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k7b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lk7b$c;", "Lk7b$a;", "", "a", "Lk7b;", "taskRunner", "", e.a, "nanos", com.huawei.hms.opendevice.c.a, "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "b", "Ljava/lang/Runnable;", "runnable", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k7b$c */
    /* loaded from: classes3.dex */
    public static final class c implements a {
        private final ThreadPoolExecutor a;

        public c(ThreadFactory threadFactory) {
            z65.h(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // defpackage.k7b.a
        public long a() {
            return System.nanoTime();
        }

        @Override // defpackage.k7b.a
        public <T> BlockingQueue<T> b(BlockingQueue<T> blockingQueue) {
            z65.h(blockingQueue, "queue");
            return blockingQueue;
        }

        @Override // defpackage.k7b.a
        public void c(k7b k7bVar, long j) throws InterruptedException {
            z65.h(k7bVar, "taskRunner");
            ReentrantLock h = k7bVar.h();
            if (cec.e && !h.isHeldByCurrentThread()) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + h);
            } else if (j > 0) {
                k7bVar.g().awaitNanos(j);
            }
        }

        @Override // defpackage.k7b.a
        public void d(k7b k7bVar, Runnable runnable) {
            z65.h(k7bVar, "taskRunner");
            z65.h(runnable, "runnable");
            this.a.execute(runnable);
        }

        @Override // defpackage.k7b.a
        public void e(k7b k7bVar) {
            z65.h(k7bVar, "taskRunner");
            k7bVar.g().signal();
        }
    }

    /* compiled from: TaskRunner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"k7b$d", "Ljava/lang/Runnable;", "", "run", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k7b$d */
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            while (true) {
                ReentrantLock h = k7b.this.h();
                k7b k7bVar = k7b.this;
                h.lock();
                try {
                    x6b c = k7bVar.c();
                    if (c == null) {
                        return;
                    }
                    Logger i = k7b.this.i();
                    j7b d = c.d();
                    z65.e(d);
                    k7b k7bVar2 = k7b.this;
                    boolean isLoggable = i.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = d.j().f().a();
                        i7b.c(i, c, d, "starting");
                    } else {
                        j = -1;
                    }
                    try {
                        k7bVar2.l(c);
                        Unit unit = Unit.a;
                        if (isLoggable) {
                            long a = d.j().f().a() - j;
                            i7b.c(i, c, d, "finished run in " + i7b.b(a));
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            i7b.c(i, c, d, "failed a run in " + i7b.b(d.j().f().a() - j));
                        }
                        throw th;
                    }
                } finally {
                    h.unlock();
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(k7b.class.getName());
        z65.g(logger, "getLogger(...)");
        l = logger;
        m = new k7b(new c(cec.q(cec.f + " TaskRunner", true)), null, 2, null);
    }

    public k7b(a aVar, Logger logger) {
        z65.h(aVar, "backend");
        z65.h(logger, "logger");
        this.a = aVar;
        this.b = logger;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        z65.g(newCondition, "newCondition(...)");
        this.d = newCondition;
        this.e = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new d();
    }

    private final void b(x6b x6bVar, long j) {
        ReentrantLock reentrantLock = this.c;
        if (cec.e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        j7b d2 = x6bVar.d();
        z65.e(d2);
        if (d2.e() == x6bVar) {
            boolean f = d2.f();
            d2.p(false);
            d2.o(null);
            this.h.remove(d2);
            if (j != -1 && !f && !d2.i()) {
                d2.n(x6bVar, j, true);
            }
            if (!d2.g().isEmpty()) {
                this.i.add(d2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void d(x6b x6bVar) {
        ReentrantLock reentrantLock = this.c;
        if (cec.e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        x6bVar.g(-1L);
        j7b d2 = x6bVar.d();
        z65.e(d2);
        d2.g().remove(x6bVar);
        this.i.remove(d2);
        d2.o(x6bVar);
        this.h.add(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(x6b x6bVar) {
        ReentrantLock reentrantLock;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(x6bVar.b());
        try {
            long f = x6bVar.f();
            reentrantLock = this.c;
            reentrantLock.lock();
            try {
                b(x6bVar, f);
                Unit unit = Unit.a;
                reentrantLock.unlock();
                currentThread.setName(name);
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock = this.c;
            reentrantLock.lock();
            try {
                b(x6bVar, -1L);
                Unit unit2 = Unit.a;
                reentrantLock.unlock();
                currentThread.setName(name);
                throw th;
            } finally {
            }
        }
    }

    public final x6b c() {
        boolean z;
        ReentrantLock reentrantLock = this.c;
        if (cec.e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        while (!this.i.isEmpty()) {
            long a2 = this.a.a();
            Iterator<j7b> it = this.i.iterator();
            long j = Long.MAX_VALUE;
            x6b x6bVar = null;
            while (true) {
                if (it.hasNext()) {
                    x6b x6bVar2 = it.next().g().get(0);
                    long max = Math.max(0L, x6bVar2.c() - a2);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else if (x6bVar != null) {
                        z = true;
                        break;
                    } else {
                        x6bVar = x6bVar2;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (x6bVar != null) {
                d(x6bVar);
                if (z || (!this.f && (!this.i.isEmpty()))) {
                    this.a.d(this, this.j);
                }
                return x6bVar;
            } else if (this.f) {
                if (j < this.g - a2) {
                    this.a.e(this);
                }
                return null;
            } else {
                this.f = true;
                this.g = a2 + j;
                try {
                    try {
                        this.a.c(this, j);
                    } catch (InterruptedException unused) {
                        e();
                    }
                } finally {
                    this.f = false;
                }
            }
        }
        return null;
    }

    public final void e() {
        ReentrantLock reentrantLock = this.c;
        if (cec.e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        int size = this.h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            this.h.get(size).b();
        }
        for (int size2 = this.i.size() - 1; -1 < size2; size2--) {
            j7b j7bVar = this.i.get(size2);
            j7bVar.b();
            if (j7bVar.g().isEmpty()) {
                this.i.remove(size2);
            }
        }
    }

    public final a f() {
        return this.a;
    }

    public final Condition g() {
        return this.d;
    }

    public final ReentrantLock h() {
        return this.c;
    }

    public final Logger i() {
        return this.b;
    }

    public final void j(j7b j7bVar) {
        z65.h(j7bVar, "taskQueue");
        ReentrantLock reentrantLock = this.c;
        if (cec.e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        if (j7bVar.e() == null) {
            if (!j7bVar.g().isEmpty()) {
                zdc.a(this.i, j7bVar);
            } else {
                this.i.remove(j7bVar);
            }
        }
        if (this.f) {
            this.a.e(this);
        } else {
            this.a.d(this, this.j);
        }
    }

    public final j7b k() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            int i = this.e;
            this.e = i + 1;
            reentrantLock.unlock();
            StringBuilder sb = new StringBuilder();
            sb.append('Q');
            sb.append(i);
            return new j7b(this, sb.toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public /* synthetic */ k7b(a aVar, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? l : logger);
    }
}
