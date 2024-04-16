package defpackage;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: CycleDetector.java */
/* renamed from: i62  reason: default package */
/* loaded from: classes2.dex */
class i62 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* renamed from: i62$b */
    /* loaded from: classes2.dex */
    public static class b {
        private final bm1<?> a;
        private final Set<b> b = new HashSet();
        private final Set<b> c = new HashSet();

        b(bm1<?> bm1Var) {
            this.a = bm1Var;
        }

        void a(b bVar) {
            this.b.add(bVar);
        }

        void b(b bVar) {
            this.c.add(bVar);
        }

        bm1<?> c() {
            return this.a;
        }

        Set<b> d() {
            return this.b;
        }

        boolean e() {
            return this.b.isEmpty();
        }

        boolean f() {
            return this.c.isEmpty();
        }

        void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* renamed from: i62$c */
    /* loaded from: classes2.dex */
    public static class c {
        private final su8<?> a;
        private final boolean b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a.equals(this.a) || cVar.b != this.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        private c(su8<?> su8Var, boolean z) {
            this.a = su8Var;
            this.b = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<bm1<?>> list) {
        Set<b> c2 = c(list);
        Set<b> b2 = b(c2);
        int i = 0;
        while (!b2.isEmpty()) {
            b next = b2.iterator().next();
            b2.remove(next);
            i++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b2.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c2) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<bm1<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (bm1<?> bm1Var : list) {
            b bVar = new b(bm1Var);
            for (su8<? super Object> su8Var : bm1Var.j()) {
                c cVar = new c(su8Var, !bm1Var.p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", su8Var));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (d03 d03Var : bVar2.c().g()) {
                    if (d03Var.e() && (set = (Set) hashMap.get(new c(d03Var.c(), d03Var.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
