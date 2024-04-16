package defpackage;

import com.google.firebase.installations.h;
import java.util.concurrent.TimeUnit;
/* compiled from: RequestLimiter.java */
/* renamed from: ti9  reason: default package */
/* loaded from: classes2.dex */
class ti9 {
    private static final long d = TimeUnit.HOURS.toMillis(24);
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    private final h a = h.c();
    private long b;
    private int c;

    private synchronized long a(int i) {
        if (!c(i)) {
            return d;
        }
        return (long) Math.min(Math.pow(2.0d, this.c) + this.a.e(), e);
    }

    private static boolean c(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return false;
        }
        return true;
    }

    private static boolean d(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            return false;
        }
        return true;
    }

    private synchronized void e() {
        this.c = 0;
    }

    public synchronized boolean b() {
        boolean z;
        if (this.c != 0) {
            if (this.a.a() <= this.b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public synchronized void f(int i) {
        if (d(i)) {
            e();
            return;
        }
        this.c++;
        this.b = this.a.a() + a(i);
    }
}
