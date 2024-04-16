package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: StdSubtypeResolver.java */
/* renamed from: dxa  reason: default package */
/* loaded from: classes2.dex */
public class dxa extends q1b implements Serializable {
    protected LinkedHashSet<ss6> a;

    @Override // defpackage.q1b
    public Collection<ss6> a(w76<?> w76Var, bl blVar) {
        ql i = w76Var.i();
        HashMap<ss6, ss6> hashMap = new HashMap<>();
        if (this.a != null) {
            Class<?> c = blVar.c();
            Iterator<ss6> it = this.a.iterator();
            while (it.hasNext()) {
                ss6 next = it.next();
                if (c.isAssignableFrom(next.a())) {
                    c(cl.m(w76Var, next.a()), next, w76Var, i, hashMap);
                }
            }
        }
        c(blVar, new ss6(blVar.c(), null), w76Var, i, hashMap);
        return new ArrayList(hashMap.values());
    }

    @Override // defpackage.q1b
    public Collection<ss6> b(w76<?> w76Var, hl hlVar, y85 y85Var) {
        Class<?> c;
        List<ss6> p0;
        ql i = w76Var.i();
        if (y85Var != null) {
            c = y85Var.u();
        } else if (hlVar != null) {
            c = hlVar.c();
        } else {
            throw new IllegalArgumentException("Both property and base type are nulls");
        }
        HashMap<ss6, ss6> hashMap = new HashMap<>();
        LinkedHashSet<ss6> linkedHashSet = this.a;
        if (linkedHashSet != null) {
            Iterator<ss6> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ss6 next = it.next();
                if (c.isAssignableFrom(next.a())) {
                    c(cl.m(w76Var, next.a()), next, w76Var, i, hashMap);
                }
            }
        }
        if (hlVar != null && (p0 = i.p0(hlVar)) != null) {
            for (ss6 ss6Var : p0) {
                c(cl.m(w76Var, ss6Var.a()), ss6Var, w76Var, i, hashMap);
            }
        }
        c(cl.m(w76Var, c), new ss6(c, null), w76Var, i, hashMap);
        return new ArrayList(hashMap.values());
    }

    protected void c(bl blVar, ss6 ss6Var, w76<?> w76Var, ql qlVar, HashMap<ss6, ss6> hashMap) {
        String q0;
        if (!ss6Var.b() && (q0 = qlVar.q0(blVar)) != null) {
            ss6Var = new ss6(ss6Var.a(), q0);
        }
        ss6 ss6Var2 = new ss6(ss6Var.a());
        if (hashMap.containsKey(ss6Var2)) {
            if (ss6Var.b() && !hashMap.get(ss6Var2).b()) {
                hashMap.put(ss6Var2, ss6Var);
                return;
            }
            return;
        }
        hashMap.put(ss6Var2, ss6Var);
        List<ss6> p0 = qlVar.p0(blVar);
        if (p0 != null && !p0.isEmpty()) {
            for (ss6 ss6Var3 : p0) {
                c(cl.m(w76Var, ss6Var3.a()), ss6Var3, w76Var, qlVar, hashMap);
            }
        }
    }
}
