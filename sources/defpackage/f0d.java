package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: f0d  reason: default package */
/* loaded from: classes2.dex */
public final class f0d implements uyc {
    private static final Map<String, f0d> g = new lr();
    private final SharedPreferences a;
    private final Runnable b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;
    private final Object d;
    private volatile Map<String, ?> e;
    private final List<ryc> f;

    private f0d(SharedPreferences sharedPreferences, Runnable runnable) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: i0d
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                f0d.this.d(sharedPreferences2, str);
            }
        };
        this.c = onSharedPreferenceChangeListener;
        this.d = new Object();
        this.f = new ArrayList();
        this.a = sharedPreferences;
        this.b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (oyc.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f0d b(Context context, String str, Runnable runnable) {
        f0d f0dVar;
        if (oyc.a() && !str.startsWith("direct_boot:") && !oyc.c(context)) {
            return null;
        }
        synchronized (f0d.class) {
            try {
                Map<String, f0d> map = g;
                f0dVar = map.get(str);
                if (f0dVar == null) {
                    f0dVar = new f0d(a(context, str), runnable);
                    map.put(str, f0dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f0dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void c() {
        synchronized (f0d.class) {
            try {
                for (f0d f0dVar : g.values()) {
                    f0dVar.a.unregisterOnSharedPreferenceChangeListener(f0dVar.c);
                }
                g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.d) {
            this.e = null;
            this.b.run();
        }
        synchronized (this) {
            try {
                for (ryc rycVar : this.f) {
                    rycVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uyc
    public final Object k(String str) {
        Map<String, ?> map = this.e;
        if (map == null) {
            synchronized (this.d) {
                try {
                    map = this.e;
                    if (map == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.a.getAll();
                        this.e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
