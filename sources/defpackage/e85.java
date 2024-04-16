package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: Iterators.java */
/* renamed from: e85  reason: default package */
/* loaded from: classes2.dex */
public final class e85 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterators.java */
    /* renamed from: e85$a */
    /* loaded from: classes2.dex */
    class a<T> extends yqb<T> {
        boolean a;
        final /* synthetic */ Object b;

        a(Object obj) {
            this.b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.a) {
                this.a = true;
                return (T) this.b;
            }
            throw new NoSuchElementException();
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        hh8.i(collection);
        hh8.i(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = defpackage.n57.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e85.b(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static <T> T c(Iterator<? extends T> it, T t) {
        if (it.hasNext()) {
            return it.next();
        }
        return t;
    }

    public static <T> yqb<T> d(T t) {
        return new a(t);
    }
}
