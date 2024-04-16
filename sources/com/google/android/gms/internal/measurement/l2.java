package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class l2 extends k2 {
    private static <E> o2d<E> e(Object obj, long j) {
        return (o2d) e4.B(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.measurement.k2
    public final <E> void b(Object obj, Object obj2, long j) {
        o2d<E> e = e(obj, j);
        o2d<E> e2 = e(obj2, j);
        int size = e.size();
        int size2 = e2.size();
        o2d<E> o2dVar = e;
        o2dVar = e;
        if (size > 0 && size2 > 0) {
            boolean c = e.c();
            o2d<E> o2dVar2 = e;
            if (!c) {
                o2dVar2 = e.e(size2 + size);
            }
            o2dVar2.addAll(e2);
            o2dVar = o2dVar2;
        }
        if (size > 0) {
            e2 = o2dVar;
        }
        e4.j(obj, j, e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.k2
    public final void d(Object obj, long j) {
        e(obj, j).K1();
    }

    private l2() {
        super();
    }
}
