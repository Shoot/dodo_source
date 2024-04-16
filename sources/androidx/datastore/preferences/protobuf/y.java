package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;
/* compiled from: LazyField.java */
/* loaded from: classes.dex */
public class y extends z {
    private final l0 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, y> a;

        public y a() {
            return this.a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            y value = this.a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof l0) {
                return this.a.getValue().d((l0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, y> entry) {
            this.a = entry;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.a.next();
            if (next.getValue() instanceof y) {
                return new b(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.a.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public l0 f() {
        return c(this.f);
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
