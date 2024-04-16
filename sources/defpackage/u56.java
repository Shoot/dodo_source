package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ManifestParser.java */
@Deprecated
/* renamed from: u56  reason: default package */
/* loaded from: classes.dex */
public final class u56 {
    private final Context a;

    public u56(Context context) {
        this.a = context;
    }

    private ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.ag4 c(java.lang.String r3) {
        /*
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L48
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            java.lang.Object r3 = r1.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.NoSuchMethodException -> L14 java.lang.IllegalAccessException -> L16 java.lang.InstantiationException -> L18
            goto L2a
        L12:
            r0 = move-exception
            goto L1a
        L14:
            r0 = move-exception
            goto L1e
        L16:
            r0 = move-exception
            goto L22
        L18:
            r0 = move-exception
            goto L26
        L1a:
            d(r3, r0)
            goto L29
        L1e:
            d(r3, r0)
            goto L29
        L22:
            d(r3, r0)
            goto L29
        L26:
            d(r3, r0)
        L29:
            r3 = 0
        L2a:
            boolean r0 = r3 instanceof defpackage.ag4
            if (r0 == 0) goto L31
            ag4 r3 = (defpackage.ag4) r3
            return r3
        L31:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected instanceof GlideModule, but found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L48:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u56.c(java.lang.String):ag4");
    }

    private static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<ag4> b() {
        ApplicationInfo a;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            a = a();
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (a != null && a.metaData != null) {
            if (Log.isLoggable("ManifestParser", 2)) {
                Log.v("ManifestParser", "Got app info metadata: " + a.metaData);
            }
            for (String str : a.metaData.keySet()) {
                if ("GlideModule".equals(a.metaData.get(str))) {
                    arrayList.add(c(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Got null app info metadata");
        }
        return arrayList;
    }
}
