package defpackage;

import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: SafeIterableMap.java */
/* renamed from: vs9  reason: default package */
/* loaded from: classes.dex */
public class vs9<K, V> implements Iterable<Map.Entry<K, V>> {
    c<K, V> a;
    private c<K, V> b;
    private final WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: vs9$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.vs9.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // defpackage.vs9.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: vs9$b */
    /* loaded from: classes.dex */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // defpackage.vs9.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // defpackage.vs9.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: vs9$c */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        @NonNull
        final K a;
        @NonNull
        final V b;
        c<K, V> c;
        c<K, V> d;

        c(@NonNull K k, @NonNull V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && this.b.equals(cVar.b)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.a + ContainerUtils.KEY_VALUE_DELIMITER + this.b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: vs9$d */
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        private c<K, V> a;
        private boolean b = true;

        d() {
        }

        @Override // defpackage.vs9.f
        void a(@NonNull c<K, V> cVar) {
            boolean z;
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.a = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.b = z;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.b) {
                this.b = false;
                this.a = vs9.this.a;
            } else {
                c<K, V> cVar2 = this.a;
                if (cVar2 != null) {
                    cVar = cVar2.c;
                } else {
                    cVar = null;
                }
                this.a = cVar;
            }
            return this.a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b) {
                if (vs9.this.a == null) {
                    return false;
                }
                return true;
            }
            c<K, V> cVar = this.a;
            if (cVar == null || cVar.c == null) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: vs9$e */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {
        c<K, V> a;
        c<K, V> b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            if (cVar != cVar2 && cVar2 != null) {
                return c(cVar);
            }
            return null;
        }

        @Override // defpackage.vs9.f
        public void a(@NonNull c<K, V> cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c<K, V> cVar2 = this.a;
            if (cVar2 == cVar) {
                this.a = b(cVar2);
            }
            if (this.b == cVar) {
                this.b = f();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.b;
            this.b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: vs9$f */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        abstract void a(@NonNull c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.a;
    }

    protected c<K, V> d(K k) {
        c<K, V> cVar = this.a;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.b, this.a);
        this.c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vs9)) {
            return false;
        }
        vs9 vs9Var = (vs9) obj;
        if (size() != vs9Var.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = vs9Var.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    @NonNull
    public vs9<K, V>.d f() {
        vs9<K, V>.d dVar = new d();
        this.c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> g() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<K, V> h(@NonNull K k, @NonNull V v) {
        c<K, V> cVar = new c<>(k, v);
        this.d++;
        c<K, V> cVar2 = this.b;
        if (cVar2 == null) {
            this.a = cVar;
            this.b = cVar;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.a, this.b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V k(@NonNull K k, @NonNull V v) {
        c<K, V> d2 = d(k);
        if (d2 != null) {
            return d2.b;
        }
        h(k, v);
        return null;
    }

    public V p(@NonNull K k) {
        c<K, V> d2 = d(k);
        if (d2 == null) {
            return null;
        }
        this.d--;
        if (!this.c.isEmpty()) {
            for (f<K, V> fVar : this.c.keySet()) {
                fVar.a(d2);
            }
        }
        c<K, V> cVar = d2.d;
        if (cVar != null) {
            cVar.c = d2.c;
        } else {
            this.a = d2.c;
        }
        c<K, V> cVar2 = d2.c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.b = cVar;
        }
        d2.c = null;
        d2.d = null;
        return d2.b;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
