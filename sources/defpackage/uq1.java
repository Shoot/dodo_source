package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: uq1  reason: default package */
/* loaded from: classes2.dex */
public class uq1 {
    private static final Object b = new Object();
    private static volatile uq1 c;
    @NonNull
    public ConcurrentHashMap a = new ConcurrentHashMap();

    private uq1() {
    }

    @NonNull
    public static uq1 b() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new uq1();
                    }
                } finally {
                }
            }
        }
        uq1 uq1Var = c;
        gh8.j(uq1Var);
        return uq1Var;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((t8c.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean h = h(context, intent, serviceConnection, i, executor);
                if (!h) {
                    return false;
                }
                return h;
            } finally {
                this.a.remove(serviceConnection, serviceConnection);
            }
        }
        return h(context, intent, serviceConnection, i, executor);
    }

    private static boolean g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof dad)) {
            return true;
        }
        return false;
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean bindService;
        if (ad8.j() && executor != null) {
            bindService = context.bindService(intent, i, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public boolean a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public void c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (g(serviceConnection) && this.a.containsKey(serviceConnection)) {
            try {
                e(context, (ServiceConnection) this.a.get(serviceConnection));
                return;
            } finally {
                this.a.remove(serviceConnection);
            }
        }
        e(context, serviceConnection);
    }

    public final boolean d(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i, Executor executor) {
        return f(context, str, intent, serviceConnection, i, true, executor);
    }
}
