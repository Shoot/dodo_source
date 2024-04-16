package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapsJVM.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a2\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001a \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u001a(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\t\u001a\u00020\bH\u0001\u001a4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0001\u001a2\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0001¨\u0006\u0010"}, d2 = {"K", "V", "Lkotlin/Pair;", "pair", "", "f", "", c.a, "", "capacity", DateTokenConverter.CONVERTER_KEY, "builder", "b", "g", "expectedSize", e.a, "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/MapsKt")
/* renamed from: f86  reason: default package */
/* loaded from: classes3.dex */
public class f86 extends e86 {
    public static <K, V> Map<K, V> b(Map<K, V> map) {
        z65.h(map, "builder");
        return ((e66) map).o();
    }

    public static <K, V> Map<K, V> c() {
        return new e66();
    }

    public static <K, V> Map<K, V> d(int i) {
        return new e66(i);
    }

    public static int e(int i) {
        if (i >= 0) {
            if (i < 3) {
                return i + 1;
            }
            if (i < 1073741824) {
                return (int) ((i / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public static <K, V> Map<K, V> f(Pair<? extends K, ? extends V> pair) {
        z65.h(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.c(), pair.d());
        z65.g(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> g(Map<? extends K, ? extends V> map) {
        z65.h(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        z65.g(singletonMap, "with(...)");
        return singletonMap;
    }
}
