package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: MapWithDefault.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"K", "V", "", Action.KEY_ATTRIBUTE, "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/MapsKt")
/* renamed from: e86  reason: default package */
/* loaded from: classes3.dex */
class e86 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k) {
        z65.h(map, "<this>");
        if (map instanceof v76) {
            return (V) ((v76) map).w(k);
        }
        V v = map.get(k);
        if (v == null && !map.containsKey(k)) {
            throw new NoSuchElementException("Key " + k + " is missing in the map.");
        }
        return v;
    }
}
