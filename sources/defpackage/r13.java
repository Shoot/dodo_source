package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: DeviceCacheManager.java */
/* renamed from: r13  reason: default package */
/* loaded from: classes2.dex */
public class r13 {
    private static final sh c = sh.e();
    private static r13 d;
    private volatile SharedPreferences a;
    private final ExecutorService b;

    public r13(ExecutorService executorService) {
        this.b = executorService;
    }

    private Context d() {
        try {
            qv3.l();
            return qv3.l().k();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static synchronized r13 e() {
        r13 r13Var;
        synchronized (r13.class) {
            try {
                if (d == null) {
                    d = new r13(Executors.newSingleThreadExecutor());
                }
                r13Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r13Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        if (this.a == null && context != null) {
            this.a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    public qb7<Boolean> b(String str) {
        if (str == null) {
            c.a("Key is null when getting boolean value on device cache.");
            return qb7.a();
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return qb7.a();
            }
        }
        if (!this.a.contains(str)) {
            return qb7.a();
        }
        try {
            return qb7.e(Boolean.valueOf(this.a.getBoolean(str, false)));
        } catch (ClassCastException e) {
            c.b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return qb7.a();
        }
    }

    public qb7<Double> c(String str) {
        if (str == null) {
            c.a("Key is null when getting double value on device cache.");
            return qb7.a();
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return qb7.a();
            }
        }
        if (!this.a.contains(str)) {
            return qb7.a();
        }
        try {
            try {
                return qb7.e(Double.valueOf(Double.longBitsToDouble(this.a.getLong(str, 0L))));
            } catch (ClassCastException unused) {
                return qb7.e(Double.valueOf(Float.valueOf(this.a.getFloat(str, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e) {
            c.b("Key %s from sharedPreferences has type other than double: %s", str, e.getMessage());
            return qb7.a();
        }
    }

    public qb7<Long> f(String str) {
        if (str == null) {
            c.a("Key is null when getting long value on device cache.");
            return qb7.a();
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return qb7.a();
            }
        }
        if (!this.a.contains(str)) {
            return qb7.a();
        }
        try {
            return qb7.e(Long.valueOf(this.a.getLong(str, 0L)));
        } catch (ClassCastException e) {
            c.b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return qb7.a();
        }
    }

    public qb7<String> g(String str) {
        if (str == null) {
            c.a("Key is null when getting String value on device cache.");
            return qb7.a();
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return qb7.a();
            }
        }
        if (!this.a.contains(str)) {
            return qb7.a();
        }
        try {
            return qb7.e(this.a.getString(str, ""));
        } catch (ClassCastException e) {
            c.b("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return qb7.a();
        }
    }

    public synchronized void i(final Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new Runnable() { // from class: q13
                @Override // java.lang.Runnable
                public final void run() {
                    r13.this.h(context);
                }
            });
        }
    }

    public boolean j(String str, double d2) {
        if (str == null) {
            c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
        return true;
    }

    public boolean k(String str, long j) {
        if (str == null) {
            c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(str, j).apply();
        return true;
    }

    public boolean l(String str, String str2) {
        if (str == null) {
            c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.a.edit().remove(str).apply();
            return true;
        }
        this.a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean m(String str, boolean z) {
        if (str == null) {
            c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.a == null) {
            i(d());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
        return true;
    }
}
