package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.df8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: GroupedLinkedMap.java */
/* renamed from: si4  reason: default package */
/* loaded from: classes.dex */
class si4<K extends df8, V> {
    private final a<K, V> a = new a<>();
    private final Map<K, a<K, V>> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GroupedLinkedMap.java */
    /* renamed from: si4$a */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        final K a;
        private List<V> b;
        a<K, V> c;
        a<K, V> d;

        a() {
            this(null);
        }

        public void a(V v) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(v);
        }

        public V b() {
            int c = c();
            if (c > 0) {
                return this.b.remove(c - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k) {
            this.d = this;
            this.c = this;
            this.a = k;
        }
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2;
        aVar.c = aVar2.c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.d = aVar2.d;
        aVar.c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.c.d = aVar;
        aVar.d.c = aVar;
    }

    public V a(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            c(aVar);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    public V f() {
        for (a aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.b.remove(aVar.a);
            ((df8) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.a.c;
        boolean z = false;
        while (!aVar.equals(this.a)) {
            sb.append(CoreConstants.CURLY_LEFT);
            sb.append(aVar.a);
            sb.append(CoreConstants.COLON_CHAR);
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
