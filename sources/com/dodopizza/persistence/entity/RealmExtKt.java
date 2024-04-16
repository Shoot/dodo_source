package com.dodopizza.persistence.entity;

import io.realm.RealmQuery;
import io.realm.d0;
import io.realm.k0;
import io.realm.n0;
import io.realm.p0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: RealmExt.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aN\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\b\u001a$\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\r*\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\u001a\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f*\u0006\u0012\u0002\b\u00030\u000e\u001a\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\u0011\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0002¨\u0006\u0016"}, d2 = {"Lio/realm/n0;", "T", "Lio/realm/d0;", "", "entities", "Ljava/lang/Class;", "entityClass", "Lkotlin/Function1;", "", "idMapper", "idFieldName", "", "cascadeDelete", "", "", "", "filterRealmObject", "realmObject", "getNestedRealmObjects", "anyObject", "", "isInstanceOfRealmObject", "persistence_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RealmExtKt {
    public static final <T extends n0> void cascadeDelete(d0 d0Var, Collection<? extends T> collection, Class<T> cls, Function1<? super T, String> function1, String str) {
        int w;
        z65.h(d0Var, "<this>");
        z65.h(collection, "entities");
        z65.h(cls, "entityClass");
        z65.h(function1, "idMapper");
        z65.h(str, "idFieldName");
        RealmQuery Y0 = d0Var.Y0(cls);
        Collection<? extends T> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke((Object) it.next()));
        }
        p0 g = Y0.j(str, (String[]) arrayList.toArray(new String[0])).g();
        z65.e(g);
        cascadeDelete(d0Var, g);
    }

    public static /* synthetic */ void cascadeDelete$default(d0 d0Var, Collection collection, Class cls, Function1 function1, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "id";
        }
        cascadeDelete(d0Var, collection, cls, function1, str);
    }

    public static final List<n0> filterRealmObject(Iterable<?> iterable) {
        List M;
        z65.h(iterable, "<this>");
        M = rc1.M(iterable, n0.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : M) {
            n0 n0Var = (n0) obj;
            if (n0Var.isValid() && n0Var.isLoaded()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final List<n0> getNestedRealmObjects(n0 n0Var) {
        Class<?> cls;
        Field[] fieldArr;
        String o;
        String o2;
        ArrayList arrayList = new ArrayList();
        if (n0Var instanceof r89) {
            cls = n0Var.getClass().getSuperclass();
        } else {
            cls = n0Var.getClass();
        }
        if (cls != null) {
            fieldArr = cls.getDeclaredFields();
        } else {
            fieldArr = null;
        }
        if (fieldArr == null) {
            fieldArr = new Field[0];
        }
        for (Field field : fieldArr) {
            if (o89.class.isAssignableFrom(field.getType())) {
                try {
                    String name = field.getName();
                    z65.g(name, "getName(...)");
                    o = l0b.o(name);
                    Object invoke = n0Var.getClass().getMethod("get" + o, new Class[0]).invoke(n0Var, new Object[0]);
                    z65.e(invoke);
                    if (isInstanceOfRealmObject(invoke)) {
                        arrayList.add((n0) invoke);
                    }
                } catch (Exception unused) {
                }
            } else if (k0.class.isAssignableFrom(field.getType())) {
                String name2 = field.getName();
                z65.g(name2, "getName(...)");
                o2 = l0b.o(name2);
                Object invoke2 = n0Var.getClass().getMethod("get" + o2, new Class[0]).invoke(n0Var, new Object[0]);
                if (invoke2 != null) {
                    z65.e(invoke2);
                    for (Object obj : (k0) invoke2) {
                        z65.e(obj);
                        if (isInstanceOfRealmObject(obj)) {
                            arrayList.add((n0) obj);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static final boolean isInstanceOfRealmObject(Object obj) {
        return n0.class.isAssignableFrom(obj.getClass());
    }

    public static final <T> void cascadeDelete(d0 d0Var, Collection<? extends T> collection) {
        List W;
        z65.h(d0Var, "<this>");
        z65.h(collection, "entities");
        if (collection.isEmpty()) {
            return;
        }
        W = sc1.W(collection);
        List list = W;
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : filterRealmObject(list)) {
            pc1.C(arrayList, getNestedRealmObjects(n0Var));
        }
        cascadeDelete(d0Var, arrayList);
        for (T t : list) {
            if (t instanceof n0) {
                n0 n0Var2 = (n0) t;
                if (n0Var2.isValid() && n0Var2.isLoaded()) {
                    n0Var2.deleteFromRealm();
                }
            }
        }
    }
}
