package defpackage;

import defpackage.r89;
import io.realm.d0;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: FilterableMediator.java */
/* renamed from: av3  reason: default package */
/* loaded from: classes3.dex */
public class av3 extends t89 {
    private final t89 a;
    private final Set<Class<? extends o89>> b;

    public av3(t89 t89Var, Collection<Class<? extends o89>> collection, boolean z) {
        this.a = t89Var;
        HashSet hashSet = new HashSet();
        if (t89Var != null) {
            Set<Class<? extends o89>> k = t89Var.k();
            if (!z) {
                for (Class<? extends o89> cls : collection) {
                    if (k.contains(cls)) {
                        hashSet.add(cls);
                    }
                }
            } else {
                for (Class<? extends o89> cls2 : k) {
                    if (!collection.contains(cls2)) {
                        hashSet.add(cls2);
                    }
                }
            }
        }
        this.b = Collections.unmodifiableSet(hashSet);
    }

    private void v(Class<? extends o89> cls) {
        if (this.b.contains(cls)) {
            return;
        }
        throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    @Override // defpackage.t89
    public <E extends o89> E c(d0 d0Var, E e, boolean z, Map<o89, r89> map, Set<ex4> set) {
        v(Util.c(e.getClass()));
        return (E) this.a.c(d0Var, e, z, map, set);
    }

    @Override // defpackage.t89
    public sf1 d(Class<? extends o89> cls, OsSchemaInfo osSchemaInfo) {
        v(cls);
        return this.a.d(cls, osSchemaInfo);
    }

    @Override // defpackage.t89
    public <E extends o89> E e(E e, int i, Map<o89, r89.a<o89>> map) {
        v(Util.c(e.getClass()));
        return (E) this.a.e(e, i, map);
    }

    @Override // defpackage.t89
    protected <T extends o89> Class<T> g(String str) {
        return this.a.f(str);
    }

    @Override // defpackage.t89
    public Map<Class<? extends o89>, OsObjectSchemaInfo> h() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Class<? extends o89>, OsObjectSchemaInfo> entry : this.a.h().entrySet()) {
            if (this.b.contains(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    @Override // defpackage.t89
    public Set<Class<? extends o89>> k() {
        return this.b;
    }

    @Override // defpackage.t89
    protected String n(Class<? extends o89> cls) {
        v(cls);
        return this.a.m(cls);
    }

    @Override // defpackage.t89
    protected boolean p(Class<? extends o89> cls) {
        return this.a.o(cls);
    }

    @Override // defpackage.t89
    public long q(d0 d0Var, o89 o89Var, Map<o89, Long> map) {
        v(Util.c(o89Var.getClass()));
        return this.a.q(d0Var, o89Var, map);
    }

    @Override // defpackage.t89
    public <E extends o89> boolean r(Class<E> cls) {
        v(Util.c(cls));
        return this.a.r(cls);
    }

    @Override // defpackage.t89
    public <E extends o89> E s(Class<E> cls, Object obj, fp9 fp9Var, sf1 sf1Var, boolean z, List<String> list) {
        v(cls);
        return (E) this.a.s(cls, obj, fp9Var, sf1Var, z, list);
    }

    @Override // defpackage.t89
    public boolean t() {
        t89 t89Var = this.a;
        if (t89Var == null) {
            return true;
        }
        return t89Var.t();
    }

    @Override // defpackage.t89
    public <E extends o89> void u(d0 d0Var, E e, E e2, Map<o89, r89> map, Set<ex4> set) {
        v(Util.c(e2.getClass()));
        this.a.u(d0Var, e, e2, map, set);
    }
}
