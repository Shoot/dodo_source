package defpackage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: euc  reason: default package */
/* loaded from: classes2.dex */
public final class euc extends kuc {
    private final AtomicReference<Bundle> a = new AtomicReference<>();
    private boolean b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T T1(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L43
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L43
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euc.T1(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final Bundle C(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.a.get();
        }
        return bundle;
    }

    public final Long U1(long j) {
        return (Long) T1(C(j), Long.class);
    }

    public final String V1(long j) {
        return (String) T1(C(j), String.class);
    }

    @Override // defpackage.huc
    public final void q(Bundle bundle) {
        synchronized (this.a) {
            try {
                this.a.set(bundle);
                this.b = true;
                this.a.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
