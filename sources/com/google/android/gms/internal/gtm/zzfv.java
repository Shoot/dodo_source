package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import java.lang.reflect.Method;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class zzfv {
    private static final Method zza;
    private static final Method zzb;

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 6
            r3 = 0
            java.lang.String r4 = "JobSchedulerCompat"
            r5 = 0
            r6 = 24
            if (r1 < r6) goto L34
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r7 = android.app.job.JobInfo.class
            r1[r3] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 1
            r1[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r8 = 2
            r1[r8] = r7     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 3
            r1[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L35
        L28:
            boolean r0 = android.util.Log.isLoggable(r4, r2)
            if (r0 == 0) goto L34
            java.lang.String r0 = "No scheduleAsPackage method available, falling back to schedule"
            android.util.Log.e(r4, r0)
        L34:
            r0 = r5
        L35:
            com.google.android.gms.internal.gtm.zzfv.zza = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L52
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L46
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L46
            goto L52
        L46:
            boolean r0 = android.util.Log.isLoggable(r4, r2)
            if (r0 == 0) goto L52
            java.lang.String r0 = "No myUserId method available"
            android.util.Log.e(r4, r0)
        L52:
            com.google.android.gms.internal.gtm.zzfv.zzb = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = com.google.android.gms.internal.gtm.zzfv.zza
            if (r8 == 0) goto L77
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = defpackage.fdb.a(r5, r8)
            if (r5 == 0) goto L18
            goto L77
        L18:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.gtm.zzfv.zzb
            r8 = 0
            if (r5 == 0) goto L32
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            if (r5 == 0) goto L32
            int r5 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2e java.lang.IllegalAccessException -> L30
            goto L43
        L2e:
            r5 = move-exception
            goto L34
        L30:
            r5 = move-exception
            goto L34
        L32:
            r5 = 0
            goto L43
        L34:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L32
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r5)
            goto L32
        L43:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = "DispatchAlarm"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.gtm.zzfv.zza
            if (r2 == 0) goto L72
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r3[r8] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r4 = 1
            r3[r4] = r0     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r0 = 2
            r3[r0] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            r5 = 3
            r3[r5] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            if (r5 == 0) goto L76
            int r8 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L6a java.lang.IllegalAccessException -> L6c
            goto L76
        L6a:
            r5 = move-exception
            goto L6d
        L6c:
            r5 = move-exception
        L6d:
            java.lang.String r8 = "error calling scheduleAsPackage"
            android.util.Log.e(r1, r8, r5)
        L72:
            int r8 = r7.schedule(r6)
        L76:
            return r8
        L77:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfv.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
