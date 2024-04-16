package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class j2 extends k2 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> e(Object obj, long j, int i) {
        i2 i2Var;
        List<L> arrayList;
        List<L> f = f(obj, j);
        if (f.isEmpty()) {
            if (f instanceof t2d) {
                arrayList = new i2(i);
            } else if ((f instanceof f3) && (f instanceof o2d)) {
                arrayList = ((o2d) f).e(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            e4.j(obj, j, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(f.getClass())) {
            ArrayList arrayList2 = new ArrayList(f.size() + i);
            arrayList2.addAll(f);
            e4.j(obj, j, arrayList2);
            i2Var = arrayList2;
        } else if (f instanceof m4d) {
            i2 i2Var2 = new i2(f.size() + i);
            i2Var2.addAll((m4d) f);
            e4.j(obj, j, i2Var2);
            i2Var = i2Var2;
        } else if ((f instanceof f3) && (f instanceof o2d)) {
            o2d o2dVar = (o2d) f;
            if (!o2dVar.c()) {
                o2d e = o2dVar.e(f.size() + i);
                e4.j(obj, j, e);
                return e;
            }
            return f;
        } else {
            return f;
        }
        return i2Var;
    }

    private static <E> List<E> f(Object obj, long j) {
        return (List) e4.B(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.k2
    public final <E> void b(Object obj, Object obj2, long j) {
        List f = f(obj2, j);
        List e = e(obj, j, f.size());
        int size = e.size();
        int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        e4.j(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.k2
    public final void d(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) e4.B(obj, j);
        if (list instanceof t2d) {
            unmodifiableList = ((t2d) list).K();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof f3) && (list instanceof o2d)) {
                o2d o2dVar = (o2d) list;
                if (o2dVar.c()) {
                    o2dVar.K1();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        e4.j(obj, j, unmodifiableList);
    }

    private j2() {
        super();
    }
}
