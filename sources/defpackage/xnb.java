package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: TypeNameIdResolver.java */
/* renamed from: xnb  reason: default package */
/* loaded from: classes2.dex */
public class xnb extends tnb {
    protected final w76<?> c;
    protected final ConcurrentHashMap<String, String> d;
    protected final Map<String, y85> e;
    protected final boolean f;

    protected xnb(w76<?> w76Var, y85 y85Var, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, y85> hashMap) {
        super(y85Var, w76Var.M());
        this.c = w76Var;
        this.d = concurrentHashMap;
        this.e = hashMap;
        this.f = w76Var.S(y76.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    protected static String d(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            return name.substring(lastIndexOf + 1);
        }
        return name;
    }

    public static xnb e(w76<?> w76Var, y85 y85Var, Collection<ss6> collection, boolean z, boolean z2) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        String d;
        if (z != z2) {
            if (z) {
                concurrentHashMap = new ConcurrentHashMap();
                hashMap = null;
            } else {
                hashMap = new HashMap();
                concurrentHashMap = new ConcurrentHashMap(4);
            }
            boolean S = w76Var.S(y76.ACCEPT_CASE_INSENSITIVE_VALUES);
            if (collection != null) {
                for (ss6 ss6Var : collection) {
                    Class<?> a = ss6Var.a();
                    if (ss6Var.b()) {
                        d = ss6Var.getName();
                    } else {
                        d = d(a);
                    }
                    if (z) {
                        concurrentHashMap.put(a.getName(), d);
                    }
                    if (z2) {
                        if (S) {
                            d = d.toLowerCase();
                        }
                        y85 y85Var2 = (y85) hashMap.get(d);
                        if (y85Var2 == null || !a.isAssignableFrom(y85Var2.u())) {
                            hashMap.put(d, w76Var.e(a));
                        }
                    }
                }
            }
            return new xnb(w76Var, y85Var, concurrentHashMap, hashMap);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.snb
    public String a(Object obj) {
        return f(obj.getClass());
    }

    @Override // defpackage.snb
    public String c(Object obj, Class<?> cls) {
        if (obj == null) {
            return f(cls);
        }
        return a(obj);
    }

    protected String f(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String str = this.d.get(name);
        if (str == null) {
            Class<?> u = this.a.Q(cls).u();
            if (this.c.Q()) {
                str = this.c.i().q0(this.c.P(u).k());
            }
            if (str == null) {
                str = d(u);
            }
            this.d.put(name, str);
        }
        return str;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.e);
    }
}
