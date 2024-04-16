package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class y7 implements Runnable {
    private final /* synthetic */ huc a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y7(z6 z6Var, huc hucVar) {
        this.a = hucVar;
        this.b = z6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.z6 r0 = r7.b
            com.google.android.gms.measurement.internal.ea r0 = r0.t()
            boolean r1 = defpackage.n8d.a()
            r2 = 0
            if (r1 == 0) goto L68
            com.google.android.gms.measurement.internal.g r1 = r0.a()
            com.google.android.gms.measurement.internal.e4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.b0.z0
            boolean r1 = r1.s(r3)
            if (r1 == 0) goto L68
            com.google.android.gms.measurement.internal.w4 r1 = r0.g()
            com.google.android.gms.measurement.internal.w6 r1 = r1.K()
            boolean r1 = r1.y()
            if (r1 != 0) goto L36
            com.google.android.gms.measurement.internal.k4 r0 = r0.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.L()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L34:
            r0 = r2
            goto L76
        L36:
            com.google.android.gms.measurement.internal.w4 r1 = r0.g()
            t91 r3 = r0.b()
            long r3 = r3.currentTimeMillis()
            boolean r1 = r1.x(r3)
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.w4 r1 = r0.g()
            com.google.android.gms.measurement.internal.b5 r1 = r1.s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            goto L34
        L59:
            com.google.android.gms.measurement.internal.w4 r0 = r0.g()
            com.google.android.gms.measurement.internal.b5 r0 = r0.s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L76
        L68:
            com.google.android.gms.measurement.internal.k4 r0 = r0.n()
            com.google.android.gms.measurement.internal.m4 r0 = r0.L()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.a(r1)
            goto L34
        L76:
            if (r0 == 0) goto L8a
            com.google.android.gms.measurement.internal.z6 r1 = r7.b
            com.google.android.gms.measurement.internal.u5 r1 = r1.a
            com.google.android.gms.measurement.internal.jb r1 = r1.K()
            huc r2 = r7.a
            long r3 = r0.longValue()
            r1.U(r2, r3)
            return
        L8a:
            huc r0 = r7.a     // Catch: android.os.RemoteException -> L90
            r0.q(r2)     // Catch: android.os.RemoteException -> L90
            return
        L90:
            r0 = move-exception
            com.google.android.gms.measurement.internal.z6 r1 = r7.b
            com.google.android.gms.measurement.internal.u5 r1 = r1.a
            com.google.android.gms.measurement.internal.k4 r1 = r1.n()
            com.google.android.gms.measurement.internal.m4 r1 = r1.F()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y7.run():void");
    }
}
