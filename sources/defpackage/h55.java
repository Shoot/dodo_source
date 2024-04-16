package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: h55  reason: default package */
/* loaded from: classes2.dex */
public class h55 {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(@NonNull Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (h55.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            if (ad8.h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    b = Boolean.FALSE;
                }
            }
            a = applicationContext;
            return b.booleanValue();
        }
    }
}
