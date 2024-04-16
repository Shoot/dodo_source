package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: rxc  reason: default package */
/* loaded from: classes2.dex */
public final class rxc {
    private static uxc a;

    public static synchronized uxc a() {
        uxc uxcVar;
        synchronized (rxc.class) {
            try {
                if (a == null) {
                    b(new txc());
                }
                uxcVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uxcVar;
    }

    private static synchronized void b(uxc uxcVar) {
        synchronized (rxc.class) {
            if (a == null) {
                a = uxcVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }
}
