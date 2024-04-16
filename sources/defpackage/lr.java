package defpackage;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: ArrayMap.java */
/* renamed from: lr  reason: default package */
/* loaded from: classes.dex */
public class lr<K, V> extends wka<K, V> implements Map<K, V> {
    j66<K, V> h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayMap.java */
    /* renamed from: lr$a */
    /* loaded from: classes.dex */
    public class a extends j66<K, V> {
        a() {
        }

        @Override // defpackage.j66
        protected void a() {
            lr.this.clear();
        }

        @Override // defpackage.j66
        protected Object b(int i, int i2) {
            return lr.this.b[(i << 1) + i2];
        }

        @Override // defpackage.j66
        protected Map<K, V> c() {
            return lr.this;
        }

        @Override // defpackage.j66
        protected int d() {
            return lr.this.c;
        }

        @Override // defpackage.j66
        protected int e(Object obj) {
            return lr.this.h(obj);
        }

        @Override // defpackage.j66
        protected int f(Object obj) {
            return lr.this.j(obj);
        }

        @Override // defpackage.j66
        protected void g(K k, V v) {
            lr.this.put(k, v);
        }

        @Override // defpackage.j66
        protected void h(int i) {
            lr.this.m(i);
        }

        @Override // defpackage.j66
        protected V i(int i, V v) {
            return lr.this.n(i, v);
        }
    }

    public lr() {
    }

    private j66<K, V> p() {
        if (this.h == null) {
            this.h = new a();
        }
        return this.h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return p().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return p().m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        d(this.c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(@NonNull Collection<?> collection) {
        return j66.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return p().n();
    }

    public lr(int i) {
        super(i);
    }

    public lr(wka wkaVar) {
        super(wkaVar);
    }
}
