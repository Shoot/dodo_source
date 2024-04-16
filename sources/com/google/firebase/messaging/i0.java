package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WakeLockHolder.java */
/* loaded from: classes2.dex */
public final class i0 {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();
    private static w2c c;

    private static void b(Context context) {
        if (c == null) {
            w2c w2cVar = new w2c(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = w2cVar;
            w2cVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@NonNull Intent intent) {
        synchronized (b) {
            try {
                if (c != null && d(intent)) {
                    g(intent, false);
                    c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(@NonNull Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"TaskMainThread"})
    public static void f(Context context, n0 n0Var, final Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean d = d(intent);
                g(intent, true);
                if (!d) {
                    c.a(a);
                }
                n0Var.c(intent).c(new n77() { // from class: com.google.firebase.messaging.h0
                    @Override // defpackage.n77
                    public final void a(y6b y6bVar) {
                        i0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void g(@NonNull Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName h(@NonNull Context context, @NonNull Intent intent) {
        synchronized (b) {
            try {
                b(context);
                boolean d = d(intent);
                g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d) {
                    c.a(a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
