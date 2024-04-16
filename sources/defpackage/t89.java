package defpackage;

import defpackage.r89;
import io.realm.d0;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Util;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: RealmProxyMediator.java */
/* renamed from: t89  reason: default package */
/* loaded from: classes3.dex */
public abstract class t89 {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(Class<? extends o89> cls) {
        if (cls != null) {
            return;
        }
        throw new NullPointerException("A class extending RealmObject must be provided");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void b(String str) {
        if (str != null && !str.isEmpty()) {
            return;
        }
        throw new NullPointerException("A class extending RealmObject must be provided");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static RealmException i(Class<? extends o89> cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", cls.toString()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static RealmException j(String str) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static IllegalStateException l(String str) {
        return new IllegalStateException("This class is not marked embedded: " + str);
    }

    public abstract <E extends o89> E c(d0 d0Var, E e, boolean z, Map<o89, r89> map, Set<ex4> set);

    public abstract sf1 d(Class<? extends o89> cls, OsSchemaInfo osSchemaInfo);

    public abstract <E extends o89> E e(E e, int i, Map<o89, r89.a<o89>> map);

    public boolean equals(Object obj) {
        if (!(obj instanceof t89)) {
            return false;
        }
        return k().equals(((t89) obj).k());
    }

    public final <T extends o89> Class<T> f(String str) {
        return g(str);
    }

    protected abstract <T extends o89> Class<T> g(String str);

    public abstract Map<Class<? extends o89>, OsObjectSchemaInfo> h();

    public int hashCode() {
        return k().hashCode();
    }

    public abstract Set<Class<? extends o89>> k();

    public final String m(Class<? extends o89> cls) {
        return n(Util.c(cls));
    }

    protected abstract String n(Class<? extends o89> cls);

    public boolean o(Class<? extends o89> cls) {
        return p(cls);
    }

    protected abstract boolean p(Class<? extends o89> cls);

    public abstract long q(d0 d0Var, o89 o89Var, Map<o89, Long> map);

    public abstract <E extends o89> boolean r(Class<E> cls);

    public abstract <E extends o89> E s(Class<E> cls, Object obj, fp9 fp9Var, sf1 sf1Var, boolean z, List<String> list);

    public boolean t() {
        return false;
    }

    public abstract <E extends o89> void u(d0 d0Var, E e, E e2, Map<o89, r89> map, Set<ex4> set);
}
