package defpackage;

import java.util.Collection;
/* compiled from: Iterables.java */
/* renamed from: c85  reason: default package */
/* loaded from: classes2.dex */
public final class c85 {
    private static <E> Collection<E> a(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return mr5.g(iterable.iterator());
    }

    public static <T> T b(Iterable<? extends T> iterable, T t) {
        return (T) e85.c(iterable.iterator(), t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] c(Iterable<?> iterable) {
        return a(iterable).toArray();
    }
}
