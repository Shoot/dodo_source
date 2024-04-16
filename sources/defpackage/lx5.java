package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
/* compiled from: LogcatLogger.java */
/* renamed from: lx5  reason: default package */
/* loaded from: classes.dex */
public class lx5 implements tz5 {
    private static final Set<String> a = new HashSet();

    @Override // defpackage.tz5
    public void a(String str) {
        b(str, null);
    }

    @Override // defpackage.tz5
    public void b(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    public void c(String str, Throwable th) {
        if (oi5.a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // defpackage.tz5
    public void debug(String str) {
        c(str, null);
    }

    @Override // defpackage.tz5
    public void error(String str, Throwable th) {
        if (oi5.a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
