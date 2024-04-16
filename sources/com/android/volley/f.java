package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: VolleyLog.java */
/* loaded from: classes.dex */
public class f {
    public static String a = "Volley";
    public static boolean b = Log.isLoggable("Volley", 2);
    private static final String c = f.class.getName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VolleyLog.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final boolean c = f.b;
        private final List<C0094a> a = new ArrayList();
        private boolean b = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: VolleyLog.java */
        /* renamed from: com.android.volley.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0094a {
            public final String a;
            public final long b;
            public final long c;

            public C0094a(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }
        }

        private long c() {
            if (this.a.size() == 0) {
                return 0L;
            }
            long j = this.a.get(0).c;
            List<C0094a> list = this.a;
            return list.get(list.size() - 1).c - j;
        }

        public synchronized void a(String str, long j) {
            if (!this.b) {
                this.a.add(new C0094a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public synchronized void b(String str) {
            this.b = true;
            long c2 = c();
            if (c2 <= 0) {
                return;
            }
            long j = this.a.get(0).c;
            f.b("(%-4d ms) %s", Long.valueOf(c2), str);
            for (C0094a c0094a : this.a) {
                long j2 = c0094a.c;
                f.b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c0094a.b), c0094a.a);
                j = j2;
            }
        }

        protected void finalize() throws Throwable {
            if (!this.b) {
                b("Request on the loose");
                f.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i < stackTrace.length) {
                if (!stackTrace[i].getClassName().equals(c)) {
                    String className = stackTrace[i].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                    break;
                }
                i++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, a(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(a, a(str, objArr), th);
    }

    public static void e(String str, Object... objArr) {
        if (b) {
            Log.v(a, a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        Log.wtf(a, a(str, objArr));
    }
}
