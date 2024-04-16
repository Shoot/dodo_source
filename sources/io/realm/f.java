package io.realm;

import io.realm.e0;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: CollectionUtils.java */
/* loaded from: classes3.dex */
public class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(a aVar, o89 o89Var, String str, String str2) {
        if (o89Var instanceof r89) {
            r89 r89Var = (r89) o89Var;
            if (r89Var instanceof DynamicRealmObject) {
                if (r89Var.a().f() == aVar) {
                    String type = ((DynamicRealmObject) o89Var).getType();
                    if (str.equals(e0.class.getCanonicalName()) || str.equals(type)) {
                        return false;
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from %s's. Type of the %s is '%s', type of object is '%s'.", str2, str2, str, type));
                } else if (aVar.b == r89Var.a().f().b) {
                    throw new IllegalArgumentException("Cannot pass DynamicRealmObject between Realm instances.");
                } else {
                    throw new IllegalStateException("Cannot pass an object to a Realm instance created in another thread.");
                }
            } else if (r89Var.a().g() != null && r89Var.a().f().getPath().equals(aVar.getPath())) {
                if (aVar == r89Var.a().f()) {
                    return false;
                }
                throw new IllegalArgumentException("Cannot pass an object from another Realm instance.");
            }
        }
        return true;
    }

    public static <E extends o89> E b(a aVar, E e) {
        d0 d0Var = (d0) aVar;
        if (OsObjectStore.b(d0Var.x(), d0Var.s().o().m(e.getClass())) != null) {
            return (E) d0Var.j0(e, new ex4[0]);
        }
        return (E) d0Var.f0(e, new ex4[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e0 c(a aVar, e0 e0Var) {
        if (e0Var.c() == e0.a.OBJECT) {
            Class<?> d = e0Var.d();
            o89 a = e0Var.a(d);
            if (a instanceof r89) {
                r89 r89Var = (r89) a;
                if (r89Var instanceof DynamicRealmObject) {
                    if (r89Var.a().f() == aVar) {
                        return e0Var;
                    }
                    if (aVar.b == r89Var.a().f().b) {
                        throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                    }
                    throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
                } else if (!aVar.u().h(d).c()) {
                    if (r89Var.a().g() != null && r89Var.a().f().getPath().equals(aVar.getPath())) {
                        if (aVar == r89Var.a().f()) {
                            return e0Var;
                        }
                        throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
                    }
                } else {
                    throw new IllegalArgumentException("Embedded objects are not supported by RealmAny.");
                }
            }
            return e0.e(b(aVar, a));
        }
        return e0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(a aVar, o89 o89Var) {
        if (aVar instanceof d0) {
            return aVar.u().h(o89Var.getClass()).c();
        }
        return aVar.u().i(((DynamicRealmObject) o89Var).getType()).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(d0 d0Var, o89 o89Var, long j) {
        t89 o = d0Var.s().o();
        Class<? extends o89> c = Util.c(o89Var.getClass());
        o.u(d0Var, o89Var, o.s(c, d0Var, d0Var.I0(c).r(j), d0Var.u().e(c), true, Collections.EMPTY_LIST), new HashMap(), Collections.EMPTY_SET);
    }
}
