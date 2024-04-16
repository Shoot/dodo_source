package androidx.lifecycle;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: Lifecycling.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007J \u0010\b\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u001e\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0014\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0014\u0010\u000e\u001a\u00020\f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007R$\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R2\u0010\u0018\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00170\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/i;", "", "object", "Landroidx/lifecycle/g;", "f", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/b;", "constructor", "a", "Ljava/lang/Class;", "klass", "b", "", DateTokenConverter.CONVERTER_KEY, "g", "", com.huawei.hms.push.e.a, "", "className", com.huawei.hms.opendevice.c.a, "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();
    private static final Map<Class<?>, Integer> b = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends b>>> c = new HashMap();

    private i() {
    }

    private final b a(Constructor<? extends b> constructor, Object obj) {
        try {
            b newInstance = constructor.newInstance(obj);
            z65.g(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor<? extends b> b(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            z65.g(str, "fullPackage");
            if (str.length() != 0) {
                z65.g(canonicalName, Action.NAME_ATTRIBUTE);
                canonicalName = canonicalName.substring(str.length() + 1);
                z65.g(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            z65.g(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c2 = c(canonicalName);
            if (str.length() != 0) {
                c2 = str + CoreConstants.DOT + c2;
            }
            Class<?> cls2 = Class.forName(c2);
            z65.f(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String c(String str) {
        String F;
        z65.h(str, "className");
        StringBuilder sb = new StringBuilder();
        F = l0b.F(str, ".", "_", false, 4, null);
        sb.append(F);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    private final boolean e(Class<?> cls) {
        if (cls != null && np5.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public static final g f(Object obj) {
        z65.h(obj, "object");
        boolean z = obj instanceof g;
        boolean z2 = obj instanceof pq2;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((pq2) obj, (g) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((pq2) obj, null);
        }
        if (z) {
            return (g) obj;
        }
        Class<?> cls = obj.getClass();
        i iVar = a;
        if (iVar.d(cls) == 2) {
            List<Constructor<? extends b>> list = c.get(cls);
            z65.e(list);
            List<Constructor<? extends b>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(iVar.a(list2.get(0), obj));
            }
            int size = list2.size();
            b[] bVarArr = new b[size];
            for (int i = 0; i < size; i++) {
                bVarArr[i] = a.a(list2.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(bVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends b>> e;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends b> b2 = b(cls);
        if (b2 != null) {
            Map<Class<?>, List<Constructor<? extends b>>> map = c;
            e = jc1.e(b2);
            map.put(cls, e);
            return 2;
        } else if (a.c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (e(superclass)) {
                z65.g(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends b>> list = c.get(superclass);
                z65.e(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            z65.g(interfaces, "klass.interfaces");
            for (Class<?> cls2 : interfaces) {
                if (e(cls2)) {
                    z65.g(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends b>> list2 = c.get(cls2);
                    z65.e(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            c.put(cls, arrayList);
            return 2;
        }
    }
}
