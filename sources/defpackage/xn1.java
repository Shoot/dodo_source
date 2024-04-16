package defpackage;

import defpackage.r89;
import io.realm.d0;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: CompositeMediator.java */
/* renamed from: xn1  reason: default package */
/* loaded from: classes3.dex */
public class xn1 extends t89 {
    private final Map<Class<? extends o89>, t89> a;
    private final Map<String, Class<? extends o89>> b = new HashMap();

    public xn1(t89... t89VarArr) {
        HashMap hashMap = new HashMap();
        if (t89VarArr != null) {
            for (t89 t89Var : t89VarArr) {
                for (Class<? extends o89> cls : t89Var.k()) {
                    String m = t89Var.m(cls);
                    Class<? extends o89> cls2 = this.b.get(m);
                    if (cls2 != null && !cls2.equals(cls)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", cls2, cls, hashMap.get(cls2), t89Var, m));
                    }
                    hashMap.put(cls, t89Var);
                    this.b.put(m, cls);
                }
            }
        }
        this.a = Collections.unmodifiableMap(hashMap);
    }

    private t89 v(Class<? extends o89> cls) {
        t89 t89Var = this.a.get(Util.c(cls));
        if (t89Var != null) {
            return t89Var;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    private t89 w(String str) {
        return v(this.b.get(str));
    }

    @Override // defpackage.t89
    public <E extends o89> E c(d0 d0Var, E e, boolean z, Map<o89, r89> map, Set<ex4> set) {
        return (E) v(Util.c(e.getClass())).c(d0Var, e, z, map, set);
    }

    @Override // defpackage.t89
    public sf1 d(Class<? extends o89> cls, OsSchemaInfo osSchemaInfo) {
        return v(cls).d(cls, osSchemaInfo);
    }

    @Override // defpackage.t89
    public <E extends o89> E e(E e, int i, Map<o89, r89.a<o89>> map) {
        return (E) v(Util.c(e.getClass())).e(e, i, map);
    }

    @Override // defpackage.t89
    protected <T extends o89> Class<T> g(String str) {
        return w(str).f(str);
    }

    @Override // defpackage.t89
    public Map<Class<? extends o89>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap();
        for (t89 t89Var : this.a.values()) {
            hashMap.putAll(t89Var.h());
        }
        return hashMap;
    }

    @Override // defpackage.t89
    public Set<Class<? extends o89>> k() {
        return this.a.keySet();
    }

    @Override // defpackage.t89
    protected String n(Class<? extends o89> cls) {
        return v(cls).m(cls);
    }

    @Override // defpackage.t89
    protected boolean p(Class<? extends o89> cls) {
        return v(cls).o(cls);
    }

    @Override // defpackage.t89
    public long q(d0 d0Var, o89 o89Var, Map<o89, Long> map) {
        return v(Util.c(o89Var.getClass())).q(d0Var, o89Var, map);
    }

    @Override // defpackage.t89
    public <E extends o89> boolean r(Class<E> cls) {
        return v(Util.c(cls)).r(cls);
    }

    @Override // defpackage.t89
    public <E extends o89> E s(Class<E> cls, Object obj, fp9 fp9Var, sf1 sf1Var, boolean z, List<String> list) {
        return (E) v(cls).s(cls, obj, fp9Var, sf1Var, z, list);
    }

    @Override // defpackage.t89
    public boolean t() {
        for (Map.Entry<Class<? extends o89>, t89> entry : this.a.entrySet()) {
            if (!entry.getValue().t()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.t89
    public <E extends o89> void u(d0 d0Var, E e, E e2, Map<o89, r89> map, Set<ex4> set) {
        v(Util.c(e2.getClass())).u(d0Var, e, e2, map, set);
    }
}
