package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: ScheduledRunnable.java */
/* renamed from: vv9  reason: default package */
/* loaded from: classes3.dex */
public final class vv9 extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, z33 {
    static final Object b = new Object();
    static final Object c = new Object();
    static final Object d = new Object();
    static final Object e = new Object();
    final Runnable a;

    public vv9(Runnable runnable, a43 a43Var) {
        super(3);
        this.a = runnable;
        lazySet(0, a43Var);
    }

    @Override // defpackage.z33
    public void a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == e || obj5 == (obj3 = c) || obj5 == (obj4 = d)) {
                break;
            }
            if (get(2) != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == e || obj == (obj2 = b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((a43) obj).d(this);
    }

    public void b(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == e) {
                return;
            }
            if (obj == c) {
                future.cancel(false);
                return;
            } else if (obj == d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // defpackage.z33
    public boolean i() {
        Object obj = get(0);
        if (obj != b && obj != e) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.a.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != b) {
                    ((a43) obj4).d(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != c) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, e));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != b && compareAndSet(0, obj4, e) && obj4 != null) {
            ((a43) obj4).d(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != c || obj5 == d) {
                return;
            }
        } while (!compareAndSet(1, obj5, e));
    }
}
