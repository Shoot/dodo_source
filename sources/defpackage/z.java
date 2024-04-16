package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* renamed from: z  reason: default package */
/* loaded from: classes.dex */
public abstract class z implements x {
    private static final Map<String, z> a = new HashMap();
    private static final Object b = new Object();

    public static z d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return e(context, context.getPackageName());
    }

    public static z e(Context context, String str) {
        z zVar;
        synchronized (b) {
            try {
                Map<String, z> map = a;
                zVar = map.get(str);
                if (zVar == null) {
                    zVar = new oec(context, str);
                    map.put(str, zVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }
}
