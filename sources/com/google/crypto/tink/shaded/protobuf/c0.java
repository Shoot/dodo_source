package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListFieldSchema.java */
/* loaded from: classes2.dex */
public abstract class c0 {
    private static final c0 a = new b();
    private static final c0 b = new c();

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes2.dex */
    private static final class b extends c0 {
        private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j) {
            return (List) h1.C(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j, int i) {
            b0 b0Var;
            List<L> arrayList;
            List<L> f = f(obj, j);
            if (f.isEmpty()) {
                if (f instanceof co5) {
                    arrayList = new b0(i);
                } else if ((f instanceof t0) && (f instanceof y.i)) {
                    arrayList = ((y.i) f).i(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                h1.R(obj, j, arrayList);
                return arrayList;
            }
            if (c.isAssignableFrom(f.getClass())) {
                ArrayList arrayList2 = new ArrayList(f.size() + i);
                arrayList2.addAll(f);
                h1.R(obj, j, arrayList2);
                b0Var = arrayList2;
            } else if (f instanceof zqb) {
                b0 b0Var2 = new b0(f.size() + i);
                b0Var2.addAll((zqb) f);
                h1.R(obj, j, b0Var2);
                b0Var = b0Var2;
            } else if ((f instanceof t0) && (f instanceof y.i)) {
                y.i iVar = (y.i) f;
                if (!iVar.o()) {
                    y.i i2 = iVar.i(f.size() + i);
                    h1.R(obj, j, i2);
                    return i2;
                }
                return f;
            } else {
                return f;
            }
            return b0Var;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.c0
        void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) h1.C(obj, j);
            if (list instanceof co5) {
                unmodifiableList = ((co5) list).q();
            } else if (c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof t0) && (list instanceof y.i)) {
                    y.i iVar = (y.i) list;
                    if (iVar.o()) {
                        iVar.l();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            h1.R(obj, j, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.c0
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
            h1.R(obj, j, f);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.c0
        <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes2.dex */
    private static final class c extends c0 {
        private c() {
            super();
        }

        static <E> y.i<E> f(Object obj, long j) {
            return (y.i) h1.C(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.c0
        void c(Object obj, long j) {
            f(obj, j).l();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.crypto.tink.shaded.protobuf.c0
        <E> void d(Object obj, Object obj2, long j) {
            y.i<E> f = f(obj, j);
            y.i<E> f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            y.i<E> iVar = f;
            iVar = f;
            if (size > 0 && size2 > 0) {
                boolean o = f.o();
                y.i<E> iVar2 = f;
                if (!o) {
                    iVar2 = f.i(size2 + size);
                }
                iVar2.addAll(f2);
                iVar = iVar2;
            }
            if (size > 0) {
                f2 = iVar;
            }
            h1.R(obj, j, f2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.c0
        <L> List<L> e(Object obj, long j) {
            int i;
            y.i f = f(obj, j);
            if (!f.o()) {
                int size = f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                y.i i2 = f.i(i);
                h1.R(obj, j, i2);
                return i2;
            }
            return f;
        }
    }

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 b() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j);
}
