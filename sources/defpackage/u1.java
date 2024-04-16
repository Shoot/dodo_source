package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: AbstractMultimap.java */
/* renamed from: u1  reason: default package */
/* loaded from: classes2.dex */
abstract class u1<K, V> implements dq6<K, V> {
    @Override // defpackage.dq6
    public abstract Map<K, Collection<V>> a();

    public boolean b(Object obj) {
        for (Collection<V> collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return eq6.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
