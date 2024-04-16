package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u001a&\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a/\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a&\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a;\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0015\u001a*\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000e\u001a;\u0010\u0018\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "", "", "elements", "", "C", "", "D", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "E", "H", "L", "", "Lkotlin/Function1;", "predicate", "predicateResultToRemove", "F", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z", "", "J", "(Ljava/util/List;)Ljava/lang/Object;", "K", "I", "G", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/CollectionsKt")
/* renamed from: pc1  reason: default package */
/* loaded from: classes3.dex */
public class pc1 extends oc1 {
    public static <T> boolean C(Collection<? super T> collection, Iterable<? extends T> iterable) {
        z65.h(collection, "<this>");
        z65.h(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean D(Collection<? super T> collection, T[] tArr) {
        List c;
        z65.h(collection, "<this>");
        z65.h(tArr, "elements");
        c = xr.c(tArr);
        return collection.addAll(c);
    }

    public static final <T> Collection<T> E(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = ic1.F0(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean F(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (function1.invoke((T) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    private static final <T> boolean G(List<T> list, Function1<? super T, Boolean> function1, boolean z) {
        if (!(list instanceof RandomAccess)) {
            z65.f(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return F(unb.b(list), function1, z);
        }
        q55 it = new IntRange(0, ic1.n(list)).iterator();
        int i = 0;
        while (it.hasNext()) {
            int b = it.b();
            T t = list.get(b);
            if (function1.invoke(t).booleanValue() != z) {
                if (i != b) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int n = ic1.n(list);
        if (i > n) {
            return true;
        }
        while (true) {
            list.remove(n);
            if (n != i) {
                n--;
            } else {
                return true;
            }
        }
    }

    public static final <T> boolean H(Collection<? super T> collection, Iterable<? extends T> iterable) {
        z65.h(collection, "<this>");
        z65.h(iterable, "elements");
        return collection.removeAll(E(iterable));
    }

    public static <T> boolean I(List<T> list, Function1<? super T, Boolean> function1) {
        z65.h(list, "<this>");
        z65.h(function1, "predicate");
        return G(list, function1, true);
    }

    public static <T> T J(List<T> list) {
        z65.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T K(List<T> list) {
        z65.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(ic1.n(list));
    }

    public static final <T> boolean L(Collection<? super T> collection, Iterable<? extends T> iterable) {
        z65.h(collection, "<this>");
        z65.h(iterable, "elements");
        return collection.retainAll(E(iterable));
    }
}
