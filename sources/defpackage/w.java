package defpackage;

import android.content.Context;
import android.util.Log;
/* renamed from: w  reason: default package */
/* loaded from: classes.dex */
public abstract class w {
    public static w a(x xVar) {
        return iec.g(xVar);
    }

    public static w c() {
        return iec.f();
    }

    public static synchronized void e(Context context) {
        synchronized (w.class) {
            Log.i("AGConnectInstance", "AGConnectInstance#initialize");
            iec.j(context);
        }
    }

    public abstract Context b();

    public abstract x d();
}
