package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
abstract class b0 {
    private static final b0 a = new b();
    private static final b0 b = new c();

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    private static final class b extends b0 {
        private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j) {
            return (List) g1.A(obj, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j, int i) {
            a0 a0Var;
            List<L> arrayList;
            List<L> f = f(obj, j);
            if (f.isEmpty()) {
                if (f instanceof eo5) {
                    arrayList = new a0(i);
                } else if ((f instanceof s0) && (f instanceof x.i)) {
                    arrayList = ((x.i) f).i(i);
                } else {
                    arrayList = new ArrayList<>(i);
                }
                g1.O(obj, j, arrayList);
                return arrayList;
            }
            if (c.isAssignableFrom(f.getClass())) {
                ArrayList arrayList2 = new ArrayList(f.size() + i);
                arrayList2.addAll(f);
                g1.O(obj, j, arrayList2);
                a0Var = arrayList2;
            } else if (f instanceof brb) {
                a0 a0Var2 = new a0(f.size() + i);
                a0Var2.addAll((brb) f);
                g1.O(obj, j, a0Var2);
                a0Var = a0Var2;
            } else if ((f instanceof s0) && (f instanceof x.i)) {
                x.i iVar = (x.i) f;
                if (!iVar.o()) {
                    x.i i2 = iVar.i(f.size() + i);
                    g1.O(obj, j, i2);
                    return i2;
                }
                return f;
            } else {
                return f;
            }
            return a0Var;
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        void c(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) g1.A(obj, j);
            if (list instanceof eo5) {
                unmodifiableList = ((eo5) list).q();
            } else if (c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof s0) && (list instanceof x.i)) {
                    x.i iVar = (x.i) list;
                    if (iVar.o()) {
                        iVar.l();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            g1.O(obj, j, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
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
            g1.O(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* loaded from: classes.dex */
    private static final class c extends b0 {
        private c() {
            super();
        }

        static <E> x.i<E> f(Object obj, long j) {
            return (x.i) g1.A(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        void c(Object obj, long j) {
            f(obj, j).l();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // androidx.datastore.preferences.protobuf.b0
        <E> void d(Object obj, Object obj2, long j) {
            x.i<E> f = f(obj, j);
            x.i<E> f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            x.i<E> iVar = f;
            iVar = f;
            if (size > 0 && size2 > 0) {
                boolean o = f.o();
                x.i<E> iVar2 = f;
                if (!o) {
                    iVar2 = f.i(size2 + size);
                }
                iVar2.addAll(f2);
                iVar = iVar2;
            }
            if (size > 0) {
                f2 = iVar;
            }
            g1.O(obj, j, f2);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        <L> List<L> e(Object obj, long j) {
            int i;
            x.i f = f(obj, j);
            if (!f.o()) {
                int size = f.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size * 2;
                }
                x.i i2 = f.i(i);
                g1.O(obj, j, i2);
                return i2;
            }
            return f;
        }
    }

    private b0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b0 b() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j);
}
