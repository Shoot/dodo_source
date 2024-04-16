package defpackage;

import com.google.android.gms.maps.model.LatLng;
import defpackage.hd8;
import defpackage.ja1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: NonHierarchicalDistanceBasedAlgorithm.java */
/* renamed from: b07  reason: default package */
/* loaded from: classes.dex */
public class b07<T extends ja1> extends v0<T> {
    private static final ura e = new ura(1.0d);
    private int b = 100;
    private final Collection<b<T>> c = new LinkedHashSet();
    private final hd8<b<T>> d = new hd8<>(0.0d, 1.0d, 0.0d, 1.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: NonHierarchicalDistanceBasedAlgorithm.java */
    /* renamed from: b07$b */
    /* loaded from: classes.dex */
    public static class b<T extends ja1> implements hd8.a, ia1<T> {
        private final T a;
        private final dd8 b;
        private final LatLng c;
        private Set<T> d;

        @Override // defpackage.ia1
        public int a() {
            return 1;
        }

        @Override // defpackage.hd8.a
        public dd8 b() {
            return this.b;
        }

        @Override // defpackage.ia1
        /* renamed from: e */
        public Set<T> c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        @Override // defpackage.ia1
        public LatLng getPosition() {
            return this.c;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private b(T t) {
            this.a = t;
            LatLng position = t.getPosition();
            this.c = position;
            this.b = b07.e.b(position);
            this.d = Collections.singleton(t);
        }
    }

    private jf0 i(dd8 dd8Var, double d) {
        double d2 = d / 2.0d;
        double d3 = dd8Var.a;
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        double d6 = dd8Var.b;
        return new jf0(d4, d5, d6 - d2, d6 + d2);
    }

    private double j(dd8 dd8Var, dd8 dd8Var2) {
        double d = dd8Var.a;
        double d2 = dd8Var2.a;
        double d3 = (d - d2) * (d - d2);
        double d4 = dd8Var.b;
        double d5 = dd8Var2.b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }

    @Override // defpackage.db
    public boolean b(Collection<T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (h(t)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.db
    public void c() {
        synchronized (this.d) {
            this.c.clear();
            this.d.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.db
    public Set<? extends ia1<T>> e(float f) {
        double pow = (this.b / Math.pow(2.0d, (int) f)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.d) {
            try {
                Iterator<b<T>> it = k(this.d, f).iterator();
                while (it.hasNext()) {
                    b<T> next = it.next();
                    if (!hashSet.contains(next)) {
                        Collection<b<T>> d = this.d.d(i(next.b(), pow));
                        if (d.size() == 1) {
                            hashSet2.add(next);
                            hashSet.add(next);
                            hashMap.put(next, Double.valueOf(0.0d));
                        } else {
                            hva hvaVar = new hva(((b) next).a.getPosition());
                            hashSet2.add(hvaVar);
                            for (b<T> bVar : d) {
                                Double d2 = (Double) hashMap.get(bVar);
                                Iterator<b<T>> it2 = it;
                                double j = j(bVar.b(), next.b());
                                if (d2 != null) {
                                    if (d2.doubleValue() < j) {
                                        it = it2;
                                    } else {
                                        ((hva) hashMap2.get(bVar)).d(((b) bVar).a);
                                    }
                                }
                                hashMap.put(bVar, Double.valueOf(j));
                                hvaVar.b(((b) bVar).a);
                                hashMap2.put(bVar, hvaVar);
                                it = it2;
                            }
                            hashSet.addAll(d);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet2;
    }

    @Override // defpackage.db
    public int f() {
        return this.b;
    }

    public boolean h(T t) {
        boolean add;
        b<T> bVar = new b<>(t);
        synchronized (this.d) {
            try {
                add = this.c.add(bVar);
                if (add) {
                    this.d.a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return add;
    }

    protected Collection<b<T>> k(hd8<b<T>> hd8Var, float f) {
        return this.c;
    }
}
