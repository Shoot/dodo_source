package com.google.protobuf;

import com.google.protobuf.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
abstract class a0 {
    private static final a0 a = new b();
    private static final a0 b = new c();

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    private static final class b extends a0 {
        private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j) {
            return (List) f1.C(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j, int i) {
            z zVar;
            List<L> arrayList;
            List<L> f = f(obj, j);
            if (f.isEmpty()) {
                if (f instanceof do5) {
                    arrayList = new z(i);
                } else if ((f instanceof r0) && (f instanceof w.i)) {
                    arrayList = ((w.i) f).i(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                f1.R(obj, j, arrayList);
                return arrayList;
            }
            if (c.isAssignableFrom(f.getClass())) {
                ArrayList arrayList2 = new ArrayList(f.size() + i);
                arrayList2.addAll(f);
                f1.R(obj, j, arrayList2);
                zVar = arrayList2;
            } else if (f instanceof arb) {
                z zVar2 = new z(f.size() + i);
                zVar2.addAll((arb) f);
                f1.R(obj, j, zVar2);
                zVar = zVar2;
            } else if ((f instanceof r0) && (f instanceof w.i)) {
                w.i iVar = (w.i) f;
                if (!iVar.o()) {
                    w.i i2 = iVar.i(f.size() + i);
                    f1.R(obj, j, i2);
                    return i2;
                }
                return f;
            } else {
                return f;
            }
            return zVar;
        }

        @Override // com.google.protobuf.a0
        void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) f1.C(obj, j);
            if (list instanceof do5) {
                unmodifiableList = ((do5) list).q();
            } else if (c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof r0) && (list instanceof w.i)) {
                    w.i iVar = (w.i) list;
                    if (iVar.o()) {
                        iVar.l();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            f1.R(obj, j, unmodifiableList);
        }

        @Override // com.google.protobuf.a0
        <E> void d(Object obj, Object obj2, long j) {
            List f = f(obj2, j);
            List g = g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            f1.R(obj, j, f);
        }

        @Override // com.google.protobuf.a0
        <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    private static final class c extends a0 {
        private c() {
            super();
        }

        static <E> w.i<E> f(Object obj, long j) {
            return (w.i) f1.C(obj, j);
        }

        @Override // com.google.protobuf.a0
        void c(Object obj, long j) {
            f(obj, j).l();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.a0
        <E> void d(Object obj, Object obj2, long j) {
            w.i<E> f = f(obj, j);
            w.i<E> f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            w.i<E> iVar = f;
            iVar = f;
            if (size > 0 && size2 > 0) {
                boolean o = f.o();
                w.i<E> iVar2 = f;
                if (!o) {
                    iVar2 = f.i(size2 + size);
                }
                iVar2.addAll(f2);
                iVar = iVar2;
            }
            if (size > 0) {
                f2 = iVar;
            }
            f1.R(obj, j, f2);
        }

        @Override // com.google.protobuf.a0
        <L> List<L> e(Object obj, long j) {
            int i;
            w.i f = f(obj, j);
            if (!f.o()) {
                int size = f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                w.i i2 = f.i(i);
                f1.R(obj, j, i2);
                return i2;
            }
            return f;
        }
    }

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 b() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j);
}
