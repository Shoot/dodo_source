package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
/* renamed from: c86  reason: default package */
/* loaded from: classes2.dex */
public final class c86 {
    private static final String a = "c86";
    private static boolean b = false;
    private static a c = a.LEGACY;

    /* compiled from: com.google.android.gms:play-services-maps@@18.1.0 */
    /* renamed from: c86$a */
    /* loaded from: classes2.dex */
    public enum a {
        LEGACY,
        LATEST
    }

    private c86() {
    }

    public static synchronized int a(@NonNull Context context) {
        int b2;
        synchronized (c86.class) {
            b2 = b(context, null, null);
        }
        return b2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:11|12|13|14|15|16|(10:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29)|30|31)|36|22|23|(0)|26|27|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        android.util.Log.e(defpackage.c86.a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[Catch: all -> 0x0024, RemoteException -> 0x0056, TryCatch #3 {RemoteException -> 0x0056, blocks: (B:23:0x004b, B:25:0x0051, B:28:0x0058), top: B:50:0x004b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x001e, B:13:0x0028, B:14:0x002c, B:16:0x003b, B:18:0x0040, B:23:0x004b, B:25:0x0051, B:28:0x0058, B:31:0x0067, B:33:0x007a, B:30:0x0060, B:37:0x0082, B:38:0x0087, B:40:0x0089), top: B:47:0x0003, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int b(@androidx.annotation.NonNull android.content.Context r5, defpackage.c86.a r6, defpackage.o87 r7) {
        /*
            java.lang.Class<c86> r0 = defpackage.c86.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            defpackage.gh8.k(r5, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = defpackage.c86.a     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L24
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L24
            boolean r1 = defpackage.c86.b     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 == 0) goto L28
            if (r7 == 0) goto L26
            c86$a r5 = defpackage.c86.c     // Catch: java.lang.Throwable -> L24
            r7.a(r5)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r5 = move-exception
            goto L8d
        L26:
            monitor-exit(r0)
            return r2
        L28:
            hxc r1 = defpackage.ntc.a(r5, r6)     // Catch: java.lang.Throwable -> L24 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L88
            hr4 r3 = r1.f()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L81
            defpackage.vm0.e(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L81
            x0d r3 = r1.n()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L81
            defpackage.tb0.c(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L81
            r3 = 1
            defpackage.c86.b = r3     // Catch: java.lang.Throwable -> L24
            r4 = 2
            if (r6 == 0) goto L48
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L4b
            if (r6 == r3) goto L4a
        L48:
            r3 = 0
            goto L4b
        L4a:
            r3 = 2
        L4b:
            int r6 = r1.d()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L56
            if (r6 != r4) goto L58
            c86$a r6 = defpackage.c86.a.LATEST     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L56
            defpackage.c86.c = r6     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L56
            goto L58
        L56:
            r5 = move-exception
            goto L60
        L58:
            ns4 r5 = defpackage.k57.U1(r5)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L56
            r1.O0(r5, r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L56
            goto L67
        L60:
            java.lang.String r6 = defpackage.c86.a     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L24
        L67:
            java.lang.String r5 = defpackage.c86.a     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = "loadedRenderer: "
            c86$a r1 = defpackage.c86.c     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = r6.concat(r1)     // Catch: java.lang.Throwable -> L24
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto L7f
            c86$a r5 = defpackage.c86.c     // Catch: java.lang.Throwable -> L24
            r7.a(r5)     // Catch: java.lang.Throwable -> L24
        L7f:
            monitor-exit(r0)
            return r2
        L81:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L24
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L88:
            r5 = move-exception
            int r5 = r5.a     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r5
        L8d:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c86.b(android.content.Context, c86$a, o87):int");
    }
}
