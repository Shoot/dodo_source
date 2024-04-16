package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;
/* compiled from: LazyField.java */
/* loaded from: classes2.dex */
public class z extends a0 {
    private final m0 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    public static class b<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, z> a;

        public z a() {
            return this.a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            z value = this.a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof m0) {
                return this.a.getValue().d((m0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, z> entry) {
            this.a = entry;
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes2.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.a.next();
            if (next.getValue() instanceof z) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public m0 f() {
        return c(this.f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
