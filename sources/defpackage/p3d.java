package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: p3d  reason: default package */
/* loaded from: classes2.dex */
public final class p3d {
    private Map<String, Callable<? extends ioc>> a = new HashMap();

    public final bpc a(String str) {
        if (this.a.containsKey(str)) {
            try {
                return this.a.get(str).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: " + str);
            }
        }
        return bpc.K4;
    }

    public final void b(String str, Callable<? extends ioc> callable) {
        this.a.put(str, callable);
    }
}
