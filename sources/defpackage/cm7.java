package defpackage;

import java.util.Comparator;
import java.util.Map;
/* compiled from: Ordering.java */
/* renamed from: cm7  reason: default package */
/* loaded from: classes2.dex */
public abstract class cm7<T> implements Comparator<T> {
    public static <T> cm7<T> a(Comparator<T> comparator) {
        if (comparator instanceof cm7) {
            return (cm7) comparator;
        }
        return new jk1(comparator);
    }

    public static <C extends Comparable> cm7<C> c() {
        return qu6.a;
    }

    public <E extends T> ww4<E> b(Iterable<E> iterable) {
        return ww4.l0(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T2 extends T> cm7<Map.Entry<T2, ?>> d() {
        return (cm7<Map.Entry<T2, ?>>) e(b86.b());
    }

    public <F> cm7<F> e(x84<F, ? extends T> x84Var) {
        return new lj0(x84Var, this);
    }
}
