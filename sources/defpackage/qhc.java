package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: qhc  reason: default package */
/* loaded from: classes.dex */
public final class qhc {
    private static Map<Class<?>, wda> c = new HashMap();
    private static Map<Class<?>, Object> d = new HashMap();
    private Map<Class<?>, wda> a = new HashMap();
    private Map<Class<?>, Object> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public qhc(List<wda> list, Context context) {
        c(list, context);
    }

    private static Constructor a(Class cls, Class... clsArr) {
        Constructor<?>[] declaredConstructors;
        boolean z = false;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == clsArr.length) {
                for (int i = 0; i < clsArr.length; i++) {
                    if (parameterTypes[i] == clsArr[i]) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    return constructor;
                }
            }
        }
        return null;
    }

    private void b(String str, Exception exc) {
        String str2;
        Log.e("ServiceRepository", "Instantiate shared service " + str + exc.getLocalizedMessage());
        StringBuilder sb = new StringBuilder();
        sb.append("cause message:");
        if (exc.getCause() != null) {
            str2 = exc.getCause().getMessage();
        } else {
            str2 = "";
        }
        sb.append(str2);
        Log.e("ServiceRepository", sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[Catch: InvocationTargetException -> 0x0065, InstantiationException -> 0x0067, IllegalAccessException -> 0x0069, TryCatch #2 {IllegalAccessException -> 0x0069, InstantiationException -> 0x0067, InvocationTargetException -> 0x0065, blocks: (B:20:0x004a, B:22:0x005c, B:30:0x0073, B:29:0x006b), top: B:37:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[Catch: InvocationTargetException -> 0x0065, InstantiationException -> 0x0067, IllegalAccessException -> 0x0069, TryCatch #2 {IllegalAccessException -> 0x0069, InstantiationException -> 0x0067, InvocationTargetException -> 0x0065, blocks: (B:20:0x004a, B:22:0x005c, B:30:0x0073, B:29:0x006b), top: B:37:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.util.List<defpackage.wda> r7, android.content.Context r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            java.util.Iterator r7 = r7.iterator()
        L7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()
            wda r0 = (defpackage.wda) r0
            boolean r1 = r0.d()
            if (r1 == 0) goto L2f
            java.util.Map<java.lang.Class<?>, wda> r1 = defpackage.qhc.c
            java.lang.Class r2 = r0.a()
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L32
            java.util.Map<java.lang.Class<?>, wda> r1 = defpackage.qhc.c
        L27:
            java.lang.Class r2 = r0.a()
            r1.put(r2, r0)
            goto L32
        L2f:
            java.util.Map<java.lang.Class<?>, wda> r1 = r6.a
            goto L27
        L32:
            boolean r1 = r0.c()
            if (r1 == 0) goto L7
            java.lang.Class r1 = r0.b()
            if (r1 == 0) goto L7
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = defpackage.qhc.d
            java.lang.Class r2 = r0.a()
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L7
            java.lang.Class r1 = r0.b()     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            java.lang.reflect.Constructor r1 = a(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            if (r1 == 0) goto L6b
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            r2[r5] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            goto L73
        L65:
            r0 = move-exception
            goto L7d
        L67:
            r0 = move-exception
            goto L83
        L69:
            r0 = move-exception
            goto L86
        L6b:
            java.lang.Class r1 = r0.b()     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
        L73:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = defpackage.qhc.d     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            java.lang.Class r0 = r0.a()     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            r2.put(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L65 java.lang.InstantiationException -> L67 java.lang.IllegalAccessException -> L69
            goto L7
        L7d:
            java.lang.String r1 = "TargetException"
        L7f:
            r6.b(r1, r0)
            goto L7
        L83:
            java.lang.String r1 = "InstantiationException"
            goto L7f
        L86:
            java.lang.String r1 = "AccessException"
            goto L7f
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhc.c(java.util.List, android.content.Context):void");
    }
}
