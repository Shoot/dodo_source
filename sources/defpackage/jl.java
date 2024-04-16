package defpackage;

import defpackage.j81;
import defpackage.znb;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: AnnotatedMethodCollector.java */
/* renamed from: jl  reason: default package */
/* loaded from: classes2.dex */
public class jl extends tc1 {
    private final j81.a d;
    private final boolean e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnnotatedMethodCollector.java */
    /* renamed from: jl$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public znb a;
        public Method b;
        public pl c;

        public a(znb znbVar, Method method, pl plVar) {
            this.a = znbVar;
            this.b = method;
            this.c = plVar;
        }

        public il a() {
            Method method = this.b;
            if (method == null) {
                return null;
            }
            return new il(this.a, method, this.c.b(), null);
        }
    }

    jl(ql qlVar, j81.a aVar, boolean z) {
        super(qlVar);
        this.d = qlVar == null ? null : aVar;
        this.e = z;
    }

    private void i(znb znbVar, Class<?> cls, Map<rc6, a> map, Class<?> cls2) {
        Method[] w;
        pl e;
        if (cls2 != null) {
            j(znbVar, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : q81.w(cls)) {
            if (k(method)) {
                rc6 rc6Var = new rc6(method);
                a aVar = map.get(rc6Var);
                if (aVar == null) {
                    if (this.a == null) {
                        e = pl.e();
                    } else {
                        e = e(method.getDeclaredAnnotations());
                    }
                    map.put(rc6Var, new a(znbVar, method, e));
                } else {
                    if (this.e) {
                        aVar.c = f(aVar.c, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.b;
                    if (method2 == null) {
                        aVar.b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.b = method;
                        aVar.a = znbVar;
                    }
                }
            }
        }
    }

    private static boolean k(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    public static kl m(ql qlVar, znb znbVar, j81.a aVar, rnb rnbVar, y85 y85Var, List<y85> list, Class<?> cls, boolean z) {
        return new jl(qlVar, aVar, z).l(rnbVar, znbVar, y85Var, list, cls);
    }

    protected void j(znb znbVar, Class<?> cls, Map<rc6, a> map, Class<?> cls2) {
        Method[] declaredMethods;
        if (this.a == null) {
            return;
        }
        for (Class<?> cls3 : q81.u(cls2, cls, true)) {
            for (Method method : cls3.getDeclaredMethods()) {
                if (k(method)) {
                    rc6 rc6Var = new rc6(method);
                    a aVar = map.get(rc6Var);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        map.put(rc6Var, new a(znbVar, null, e(declaredAnnotations)));
                    } else {
                        aVar.c = f(aVar.c, declaredAnnotations);
                    }
                }
            }
        }
    }

    kl l(rnb rnbVar, znb znbVar, y85 y85Var, List<y85> list, Class<?> cls) {
        Class<?> a2;
        Class<?> a3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i(znbVar, y85Var.u(), linkedHashMap, cls);
        for (y85 y85Var2 : list) {
            j81.a aVar = this.d;
            if (aVar == null) {
                a3 = null;
            } else {
                a3 = aVar.a(y85Var2.u());
            }
            i(new znb.a(rnbVar, y85Var2.l()), y85Var2.u(), linkedHashMap, a3);
        }
        j81.a aVar2 = this.d;
        if (aVar2 != null && (a2 = aVar2.a(Object.class)) != null) {
            j(znbVar, y85Var.u(), linkedHashMap, a2);
            if (this.a != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry<rc6, a> entry : linkedHashMap.entrySet()) {
                    rc6 key = entry.getKey();
                    if ("hashCode".equals(key.b()) && key.a() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(key.b(), new Class[0]);
                            if (declaredMethod != null) {
                                a value = entry.getValue();
                                value.c = f(value.c, declaredMethod.getDeclaredAnnotations());
                                value.b = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new kl();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<rc6, a> entry2 : linkedHashMap.entrySet()) {
            il a4 = entry2.getValue().a();
            if (a4 != null) {
                linkedHashMap2.put(entry2.getKey(), a4);
            }
        }
        return new kl(linkedHashMap2);
    }
}
