package defpackage;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: AbstractFuture.java */
/* renamed from: k1  reason: default package */
/* loaded from: classes.dex */
public abstract class k1<V> implements kr5<V> {
    static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger e = Logger.getLogger(k1.class.getName());
    static final b f;
    private static final Object g;
    volatile Object a;
    volatile e b;
    volatile i c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(k1<?> k1Var, e eVar, e eVar2);

        abstract boolean b(k1<?> k1Var, Object obj, Object obj2);

        abstract boolean c(k1<?> k1Var, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$c */
    /* loaded from: classes.dex */
    public static final class c {
        static final c c;
        static final c d;
        final boolean a;
        final Throwable b;

        static {
            if (k1.d) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, null);
            c = new c(true, null);
        }

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$d */
    /* loaded from: classes.dex */
    public static final class d {
        static final d b = new d(new a("Failure occurred while trying to finish a future."));
        final Throwable a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: k1$d$a */
        /* loaded from: classes.dex */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.a = (Throwable) k1.d(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$e */
    /* loaded from: classes.dex */
    public static final class e {
        static final e d = new e(null, null);
        final Runnable a;
        final Executor b;
        e c;

        e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$f */
    /* loaded from: classes.dex */
    private static final class f extends b {
        final AtomicReferenceFieldUpdater<i, Thread> a;
        final AtomicReferenceFieldUpdater<i, i> b;
        final AtomicReferenceFieldUpdater<k1, i> c;
        final AtomicReferenceFieldUpdater<k1, e> d;
        final AtomicReferenceFieldUpdater<k1, Object> e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<k1, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<k1, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<k1, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // defpackage.k1.b
        boolean a(k1<?> k1Var, e eVar, e eVar2) {
            return d2.a(this.d, k1Var, eVar, eVar2);
        }

        @Override // defpackage.k1.b
        boolean b(k1<?> k1Var, Object obj, Object obj2) {
            return d2.a(this.e, k1Var, obj, obj2);
        }

        @Override // defpackage.k1.b
        boolean c(k1<?> k1Var, i iVar, i iVar2) {
            return d2.a(this.c, k1Var, iVar, iVar2);
        }

        @Override // defpackage.k1.b
        void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // defpackage.k1.b
        void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {
        final k1<V> a;
        final kr5<? extends V> b;

        g(k1<V> k1Var, kr5<? extends V> kr5Var) {
            this.a = k1Var;
            this.b = kr5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.a != this) {
                return;
            }
            if (k1.f.b(this.a, this, k1.i(this.b))) {
                k1.f(this.a);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$h */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // defpackage.k1.b
        boolean a(k1<?> k1Var, e eVar, e eVar2) {
            synchronized (k1Var) {
                try {
                    if (k1Var.b == eVar) {
                        k1Var.b = eVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.k1.b
        boolean b(k1<?> k1Var, Object obj, Object obj2) {
            synchronized (k1Var) {
                try {
                    if (k1Var.a == obj) {
                        k1Var.a = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.k1.b
        boolean c(k1<?> k1Var, i iVar, i iVar2) {
            synchronized (k1Var) {
                try {
                    if (k1Var.c == iVar) {
                        k1Var.c = iVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.k1.b
        void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // defpackage.k1.b
        void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* renamed from: k1$i */
    /* loaded from: classes.dex */
    public static final class i {
        static final i c = new i(false);
        volatile Thread a;
        volatile i b;

        i(boolean z) {
        }

        void a(i iVar) {
            k1.f.d(this, iVar);
        }

        void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            k1.f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k1.class, i.class, com.huawei.hms.opendevice.c.a), AtomicReferenceFieldUpdater.newUpdater(k1.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f = hVar;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    private void a(StringBuilder sb) {
        try {
            Object j = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(j));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    @NonNull
    static <T> T d(T t) {
        t.getClass();
        return t;
    }

    private e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.b;
        } while (!f.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [k1$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [k1<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [k1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [k1<V>, k1] */
    static void f(k1<?> k1Var) {
        e eVar = null;
        while (true) {
            k1Var.n();
            k1Var.b();
            e e2 = k1Var.e(eVar);
            while (e2 != null) {
                eVar = e2.c;
                Runnable runnable = e2.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    k1Var = gVar.a;
                    if (k1Var.a == gVar) {
                        if (f.b(k1Var, gVar, i(gVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, e2.b);
                }
                e2 = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).a);
        }
        throw c("Task was cancelled.", ((c) obj).b);
    }

    static Object i(kr5<?> kr5Var) {
        if (kr5Var instanceof k1) {
            Object obj = ((k1) kr5Var).a;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.a) {
                    if (cVar.b != null) {
                        return new c(false, cVar.b);
                    }
                    return c.d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = kr5Var.isCancelled();
        if ((!d) & isCancelled) {
            return c.d;
        }
        try {
            Object j = j(kr5Var);
            if (j == null) {
                return g;
            }
            return j;
        } catch (CancellationException e2) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + kr5Var, e2));
            }
            return new c(false, e2);
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.c;
        } while (!f.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    private void o(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.c;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.a == null) {
                        break;
                    }
                } else if (!f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        c cVar;
        boolean z3;
        Object obj = this.a;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof g)) {
            if (d) {
                cVar = new c(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                cVar = c.c;
            } else {
                cVar = c.d;
            }
            boolean z4 = false;
            k1<V> k1Var = this;
            while (true) {
                if (f.b(k1Var, obj, cVar)) {
                    if (z) {
                        k1Var.l();
                    }
                    f(k1Var);
                    if (!(obj instanceof g)) {
                        return true;
                    }
                    kr5<? extends V> kr5Var = ((g) obj).b;
                    if (kr5Var instanceof k1) {
                        k1Var = (k1) kr5Var;
                        obj = k1Var.a;
                        if (obj == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!(z3 | (obj instanceof g))) {
                            return true;
                        }
                        z4 = true;
                    } else {
                        kr5Var.cancel(z);
                        return true;
                    }
                } else {
                    obj = k1Var.a;
                    if (!(obj instanceof g)) {
                        return z4;
                    }
                }
            }
        } else {
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if ((obj != null) & (!(obj instanceof g))) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.c;
                if (iVar != i.c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.c;
                        }
                    } while (iVar != i.c);
                    return h(this.a);
                }
                return h(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String k1Var = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                int i2 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + k1Var);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.a;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(obj instanceof g)) & z;
    }

    @Override // defpackage.kr5
    public final void k(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.b;
        if (eVar != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (f.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.b;
            } while (eVar != e.d);
            g(runnable, executor);
        }
        g(runnable, executor);
    }

    protected String m() {
        Object obj = this.a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).b) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(V v) {
        if (v == null) {
            v = (V) g;
        }
        if (f.b(this, null, v)) {
            f(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th) {
        if (f.b(this, null, new d((Throwable) d(th)))) {
            f(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(kr5<? extends V> kr5Var) {
        d dVar;
        d(kr5Var);
        Object obj = this.a;
        if (obj == null) {
            if (kr5Var.isDone()) {
                if (!f.b(this, null, i(kr5Var))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, kr5Var);
            if (f.b(this, null, gVar)) {
                try {
                    kr5Var.k(gVar, q23.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.b;
                    }
                    f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.a;
        }
        if (obj instanceof c) {
            kr5Var.cancel(((c) obj).a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = m();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected void b() {
    }

    protected void l() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.c;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            obj = this.a;
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.c;
                } while (iVar != i.c);
                return h(this.a);
            }
            return h(this.a);
        }
        throw new InterruptedException();
    }
}
