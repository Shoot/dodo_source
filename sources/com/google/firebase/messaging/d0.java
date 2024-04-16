package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsStore.java */
/* loaded from: classes2.dex */
public final class d0 {
    private static WeakReference<d0> d;
    private final SharedPreferences a;
    private z b;
    private final Executor c;

    private d0(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized d0 a(Context context, Executor executor) {
        d0 d0Var;
        synchronized (d0.class) {
            try {
                WeakReference<d0> weakReference = d;
                if (weakReference != null) {
                    d0Var = weakReference.get();
                } else {
                    d0Var = null;
                }
                if (d0Var == null) {
                    d0Var = new d0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    d0Var.c();
                    d = new WeakReference<>(d0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d0Var;
    }

    private synchronized void c() {
        this.b = z.c(this.a, "topic_operation_queue", ",", this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized c0 b() {
        return c0.a(this.b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(c0 c0Var) {
        return this.b.f(c0Var.e());
    }
}
