package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* renamed from: hec  reason: default package */
/* loaded from: classes.dex */
public class hec extends v {
    private static final Map<String, v> b = new HashMap();
    private static final Object c = new Object();
    private static String d;
    private z a;

    private hec(Context context, String str) {
        this.a = z.e(context, str);
    }

    public static v a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        String packageName = context.getPackageName();
        d = packageName;
        return b(context, packageName);
    }

    public static v b(Context context, String str) {
        v vVar;
        if (!TextUtils.isEmpty(str)) {
            synchronized (c) {
                try {
                    Map<String, v> map = b;
                    vVar = map.get(str);
                    if (vVar == null) {
                        map.put(str, new hec(context, str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return vVar;
        }
        throw new IllegalArgumentException("packageName can not be empty");
    }
}
