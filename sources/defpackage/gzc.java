package defpackage;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: gzc  reason: default package */
/* loaded from: classes2.dex */
public final class gzc {
    private static volatile pb7<Boolean> a = pb7.a();
    private static final Object b = new Object();

    private static boolean a(Context context) {
        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L24
            java.lang.String r5 = "PhenotypeClientHelper"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r5, r6)
            return r1
        L24:
            pb7<java.lang.Boolean> r6 = defpackage.gzc.a
            boolean r6 = r6.c()
            if (r6 == 0) goto L39
            pb7<java.lang.Boolean> r5 = defpackage.gzc.a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L39:
            java.lang.Object r6 = defpackage.gzc.b
            monitor-enter(r6)
            pb7<java.lang.Boolean> r0 = defpackage.gzc.a     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L54
            pb7<java.lang.Boolean> r5 = defpackage.gzc.a     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L52
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            return r5
        L52:
            r5 = move-exception
            goto La0
        L54:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L52
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L61
            goto L81
        L61:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L52
            r4 = 29
            if (r3 >= r4) goto L6f
            r3 = 0
            goto L71
        L6f:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L71:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L88
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L52
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L88
        L81:
            boolean r5 = a(r5)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L88
            r1 = 1
        L88:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L52
            pb7 r5 = defpackage.pb7.d(r5)     // Catch: java.lang.Throwable -> L52
            defpackage.gzc.a = r5     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            pb7<java.lang.Boolean> r5 = defpackage.gzc.a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        La0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzc.b(android.content.Context, android.net.Uri):boolean");
    }
}
