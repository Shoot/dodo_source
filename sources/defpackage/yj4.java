package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: HalfSerializer.java */
/* renamed from: yj4  reason: default package */
/* loaded from: classes3.dex */
public final class yj4 {
    public static void a(i1b<?> i1bVar, AtomicInteger atomicInteger, wy wyVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable b = wyVar.b();
            if (b != null) {
                i1bVar.onError(b);
            } else {
                i1bVar.b();
            }
        }
    }

    public static void b(i1b<?> i1bVar, Throwable th, AtomicInteger atomicInteger, wy wyVar) {
        if (wyVar.a(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                i1bVar.onError(wyVar.b());
                return;
            }
            return;
        }
        tp9.q(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void c(i1b<? super T> i1bVar, T t, AtomicInteger atomicInteger, wy wyVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            i1bVar.d(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable b = wyVar.b();
                if (b != null) {
                    i1bVar.onError(b);
                } else {
                    i1bVar.b();
                }
            }
        }
    }
}
