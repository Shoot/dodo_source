package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import io.realm.d0;
import io.realm.k0;
import io.realm.n0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RealmExt.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\u001a\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u0006\u0012\u0002\b\u00030\u0007\u001a\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000H\u0002¨\u0006\u0010"}, d2 = {"", "T", "Lio/realm/d0;", "", "entities", "", "a", "", "", "Lio/realm/n0;", "b", "realmObject", c.a, "anyObject", "", DateTokenConverter.CONVERTER_KEY, "persistence_release"}, k = 2, mv = {1, 5, 1})
/* renamed from: k89  reason: default package */
/* loaded from: classes2.dex */
public final class k89 {
    public static final <T> void a(d0 d0Var, Collection<? extends T> collection) {
        List W;
        z65.h(d0Var, "<this>");
        z65.h(collection, "entities");
        if (!collection.isEmpty()) {
            W = sc1.W(collection);
            List list = W;
            ArrayList arrayList = new ArrayList();
            for (n0 n0Var : b(list)) {
                pc1.C(arrayList, c(n0Var));
            }
            a(d0Var, arrayList);
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

    public static final List<n0> b(Iterable<?> iterable) {
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

    private static final List<n0> c(n0 n0Var) {
        Class<?> cls;
        Field[] declaredFields;
        String o;
        String o2;
        ArrayList arrayList = new ArrayList();
        if (n0Var instanceof r89) {
            cls = n0Var.getClass().getSuperclass();
        } else {
            cls = n0Var.getClass();
        }
        if (cls == null) {
            declaredFields = null;
        } else {
            declaredFields = cls.getDeclaredFields();
        }
        if (declaredFields != null) {
            for (Field field : declaredFields) {
                if (o89.class.isAssignableFrom(field.getType())) {
                    try {
                        String name = field.getName();
                        z65.g(name, "field.name");
                        o = l0b.o(name);
                        Object invoke = n0Var.getClass().getMethod(z65.q("get", o), new Class[0]).invoke(n0Var, new Object[0]);
                        z65.g(invoke, e.a);
                        if (d(invoke)) {
                            arrayList.add((n0) invoke);
                        }
                    } catch (Exception unused) {
                    }
                } else if (k0.class.isAssignableFrom(field.getType())) {
                    String name2 = field.getName();
                    z65.g(name2, "field.name");
                    o2 = l0b.o(name2);
                    Object invoke2 = n0Var.getClass().getMethod(z65.q("get", o2), new Class[0]).invoke(n0Var, new Object[0]);
                    if (invoke2 != null) {
                        for (Object obj : (k0) invoke2) {
                            z65.g(obj, e.a);
                            if (d(obj)) {
                                arrayList.add((n0) obj);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static final boolean d(Object obj) {
        return n0.class.isAssignableFrom(obj.getClass());
    }
}
