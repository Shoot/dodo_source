package defpackage;

import android.util.Log;
/* compiled from: Logger.java */
/* renamed from: rx5  reason: default package */
/* loaded from: classes2.dex */
public class rx5 {
    static final rx5 c = new rx5("FirebaseCrashlytics");
    private final String a;
    private int b = 4;

    public rx5(String str) {
        this.a = str;
    }

    private boolean a(int i) {
        if (this.b > i && !Log.isLoggable(this.a, i)) {
            return false;
        }
        return true;
    }

    public static rx5 f() {
        return c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.a, str, th);
        }
    }
}
