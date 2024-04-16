package defpackage;

import defpackage.hd8.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PointQuadTree.java */
/* renamed from: hd8  reason: default package */
/* loaded from: classes.dex */
public class hd8<T extends a> {
    private final jf0 a;
    private final int b;
    private Set<T> c;
    private List<hd8<T>> d;

    /* compiled from: PointQuadTree.java */
    /* renamed from: hd8$a */
    /* loaded from: classes.dex */
    public interface a {
        dd8 b();
    }

    public hd8(double d, double d2, double d3, double d4) {
        this(new jf0(d, d2, d3, d4));
    }

    private void c(double d, double d2, T t) {
        List<hd8<T>> list = this.d;
        if (list != null) {
            jf0 jf0Var = this.a;
            if (d2 < jf0Var.f) {
                if (d < jf0Var.e) {
                    list.get(0).c(d, d2, t);
                    return;
                } else {
                    list.get(1).c(d, d2, t);
                    return;
                }
            } else if (d < jf0Var.e) {
                list.get(2).c(d, d2, t);
                return;
            } else {
                list.get(3).c(d, d2, t);
                return;
            }
        }
        if (this.c == null) {
            this.c = new LinkedHashSet();
        }
        this.c.add(t);
        if (this.c.size() > 50 && this.b < 40) {
            f();
        }
    }

    private void e(jf0 jf0Var, Collection<T> collection) {
        if (!this.a.e(jf0Var)) {
            return;
        }
        List<hd8<T>> list = this.d;
        if (list != null) {
            for (hd8<T> hd8Var : list) {
                hd8Var.e(jf0Var, collection);
            }
        } else if (this.c != null) {
            if (jf0Var.b(this.a)) {
                collection.addAll(this.c);
                return;
            }
            for (T t : this.c) {
                if (jf0Var.c(t.b())) {
                    collection.add(t);
                }
            }
        }
    }

    private void f() {
        ArrayList arrayList = new ArrayList(4);
        this.d = arrayList;
        jf0 jf0Var = this.a;
        arrayList.add(new hd8(jf0Var.a, jf0Var.e, jf0Var.b, jf0Var.f, this.b + 1));
        List<hd8<T>> list = this.d;
        jf0 jf0Var2 = this.a;
        list.add(new hd8<>(jf0Var2.e, jf0Var2.c, jf0Var2.b, jf0Var2.f, this.b + 1));
        List<hd8<T>> list2 = this.d;
        jf0 jf0Var3 = this.a;
        list2.add(new hd8<>(jf0Var3.a, jf0Var3.e, jf0Var3.f, jf0Var3.d, this.b + 1));
        List<hd8<T>> list3 = this.d;
        jf0 jf0Var4 = this.a;
        list3.add(new hd8<>(jf0Var4.e, jf0Var4.c, jf0Var4.f, jf0Var4.d, this.b + 1));
        Set<T> set = this.c;
        this.c = null;
        for (T t : set) {
            c(t.b().a, t.b().b, t);
        }
    }

    public void a(T t) {
        dd8 b = t.b();
        if (this.a.a(b.a, b.b)) {
            c(b.a, b.b, t);
        }
    }

    public void b() {
        this.d = null;
        Set<T> set = this.c;
        if (set != null) {
            set.clear();
        }
    }

    public Collection<T> d(jf0 jf0Var) {
        ArrayList arrayList = new ArrayList();
        e(jf0Var, arrayList);
        return arrayList;
    }

    public hd8(jf0 jf0Var) {
        this(jf0Var, 0);
    }

    private hd8(double d, double d2, double d3, double d4, int i) {
        this(new jf0(d, d2, d3, d4), i);
    }

    private hd8(jf0 jf0Var, int i) {
        this.d = null;
        this.a = jf0Var;
        this.b = i;
    }
}
