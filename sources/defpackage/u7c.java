package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: u7c  reason: default package */
/* loaded from: classes2.dex */
public class u7c {
    private static final int a = Process.myUid();
    private static final Method b;
    private static final Method c;
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final Method i;

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(2:2|3)|4|(21:49|50|7|8|9|10|11|12|13|(12:41|42|16|(9:36|37|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            defpackage.u7c.a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L1a
        L18:
            r5 = r4
        L1a:
            defpackage.u7c.b = r5
            boolean r5 = defpackage.ad8.c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L32
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L32
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L32
            r5[r3] = r8     // Catch: java.lang.Exception -> L32
            r5[r2] = r6     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L32
            goto L33
        L32:
            r0 = r4
        L33:
            defpackage.u7c.c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
            r0 = r4
        L3f:
            defpackage.u7c.d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4e
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4e
            r0[r3] = r5     // Catch: java.lang.Exception -> L4e
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L4e
            goto L50
        L4e:
            r0 = r4
        L50:
            defpackage.u7c.e = r0
            boolean r0 = defpackage.ad8.c()
            if (r0 == 0) goto L66
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L65
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L65
            r0[r3] = r5     // Catch: java.lang.Exception -> L65
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L65
            goto L67
        L65:
        L66:
            r0 = r4
        L67:
            defpackage.u7c.f = r0
            boolean r0 = defpackage.ad8.i()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L80
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L7a
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Exception -> L7a
            goto L81
        L7a:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L80:
            r0 = r4
        L81:
            defpackage.u7c.g = r0
            boolean r0 = defpackage.ad8.i()
            if (r0 == 0) goto La4
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9e
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L9e
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9e
            r7[r3] = r8     // Catch: java.lang.Exception -> L9e
            r7[r2] = r6     // Catch: java.lang.Exception -> L9e
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Exception -> L9e
            goto La5
        L9e:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        La4:
            r0 = r4
        La5:
            defpackage.u7c.h = r0
            boolean r0 = defpackage.ad8.i()
            if (r0 == 0) goto Lb8
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb8
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb8
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> Lb8
        Lb8:
            defpackage.u7c.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7c.<clinit>():void");
    }

    public static void a(@NonNull WorkSource workSource, int i2, @NonNull String str) {
        Method method = c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    @NonNull
    public static WorkSource b(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c2 = t8c.a(context).c(str, 0);
                if (c2 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i2 = c2.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i2, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static boolean c(@NonNull Context context) {
        if (context == null || context.getPackageManager() == null || t8c.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
