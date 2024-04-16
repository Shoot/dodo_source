package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0013\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aQ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\n\u0010\b\u001aa\u0010\r\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a@\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001a4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001aQ\u0010\u001a\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00152\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u001c\u0010\b\u001aS\u0010\u001d\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a2\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a2\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aG\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0086\u0002\u001aI\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010#\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002\u001aB\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a0\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¨\u0006("}, d2 = {"K", "V", "", Image.TYPE_HIGH, "", "Lkotlin/Pair;", "pairs", "k", "([Lkotlin/Pair;)Ljava/util/Map;", "", Image.TYPE_MEDIUM, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "j", "([Lkotlin/Pair;)Ljava/util/HashMap;", Action.KEY_ATTRIBUTE, "i", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "r", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "q", Image.TYPE_SMALL, "M", "destination", "t", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "v", "w", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "u", "x", "pair", "p", "map", "o", "l", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "n", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/MapsKt")
/* renamed from: g86  reason: default package */
/* loaded from: classes3.dex */
public class g86 extends f86 {
    public static <K, V> Map<K, V> h() {
        ng3 ng3Var = ng3.a;
        z65.f(ng3Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return ng3Var;
    }

    public static <K, V> V i(Map<K, ? extends V> map, K k) {
        z65.h(map, "<this>");
        return (V) e86.a(map, k);
    }

    public static <K, V> HashMap<K, V> j(Pair<? extends K, ? extends V>... pairArr) {
        int e;
        z65.h(pairArr, "pairs");
        e = f86.e(pairArr.length);
        HashMap<K, V> hashMap = new HashMap<>(e);
        r(hashMap, pairArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> k(Pair<? extends K, ? extends V>... pairArr) {
        Map<K, V> h;
        int e;
        z65.h(pairArr, "pairs");
        if (pairArr.length > 0) {
            e = f86.e(pairArr.length);
            return w(pairArr, new LinkedHashMap(e));
        }
        h = h();
        return h;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map, K k) {
        Map x;
        z65.h(map, "<this>");
        x = x(map);
        x.remove(k);
        return n(x);
    }

    public static <K, V> Map<K, V> m(Pair<? extends K, ? extends V>... pairArr) {
        int e;
        z65.h(pairArr, "pairs");
        e = f86.e(pairArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        r(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> n(Map<K, ? extends V> map) {
        Map<K, V> h;
        z65.h(map, "<this>");
        int size = map.size();
        if (size == 0) {
            h = h();
            return h;
        } else if (size == 1) {
            return f86.g(map);
        } else {
            return map;
        }
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        z65.h(map, "<this>");
        z65.h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        Map<K, V> f;
        z65.h(map, "<this>");
        z65.h(pair, "pair");
        if (map.isEmpty()) {
            f = f86.f(pair);
            return f;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final <K, V> void q(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        z65.h(map, "<this>");
        z65.h(iterable, "pairs");
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put((K) pair.a(), (V) pair.b());
        }
    }

    public static final <K, V> void r(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        z65.h(map, "<this>");
        z65.h(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((K) pair.a(), (V) pair.b());
        }
    }

    public static <K, V> Map<K, V> s(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Map<K, V> h;
        Pair<? extends K, ? extends V> next;
        Map<K, V> f;
        int e;
        z65.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                h = h();
                return h;
            } else if (size != 1) {
                e = f86.e(collection.size());
                return t(iterable, new LinkedHashMap(e));
            } else {
                if (iterable instanceof List) {
                    next = (Pair<? extends K, ? extends V>) ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                f = f86.f(next);
                return f;
            }
        }
        return n(t(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M t(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        z65.h(iterable, "<this>");
        z65.h(m, "destination");
        q(m, iterable);
        return m;
    }

    public static <K, V> Map<K, V> u(Map<? extends K, ? extends V> map) {
        Map<K, V> h;
        Map<K, V> x;
        z65.h(map, "<this>");
        int size = map.size();
        if (size == 0) {
            h = h();
            return h;
        } else if (size != 1) {
            x = x(map);
            return x;
        } else {
            return f86.g(map);
        }
    }

    public static <K, V> Map<K, V> v(Pair<? extends K, ? extends V>[] pairArr) {
        Map<K, V> h;
        Map<K, V> f;
        int e;
        z65.h(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            h = h();
            return h;
        } else if (length != 1) {
            e = f86.e(pairArr.length);
            return w(pairArr, new LinkedHashMap(e));
        } else {
            f = f86.f(pairArr[0]);
            return f;
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M w(Pair<? extends K, ? extends V>[] pairArr, M m) {
        z65.h(pairArr, "<this>");
        z65.h(m, "destination");
        r(m, pairArr);
        return m;
    }

    public static <K, V> Map<K, V> x(Map<? extends K, ? extends V> map) {
        z65.h(map, "<this>");
        return new LinkedHashMap(map);
    }
}
