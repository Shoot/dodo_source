package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: FcmBroadcastProcessor.java */
/* loaded from: classes2.dex */
public class e {
    private static final Object c = new Object();
    private static n0 d;
    private final Context a;
    private final Executor b = new hc6();

    public e(Context context) {
        this.a = context;
    }

    private static y6b<Integer> e(Context context, Intent intent, boolean z) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        n0 f = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (z) {
            if (x.b().e(context)) {
                i0.f(context, f, intent);
            } else {
                f.c(intent);
            }
            return o7b.e(-1);
        }
        return f.c(intent).j(new hc6(), new dv1() { // from class: tp3
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                Integer g;
                g = e.g(y6bVar);
                return g;
            }
        });
    }

    private static n0 f(Context context, String str) {
        n0 n0Var;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new n0(context, str);
                }
                n0Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(y6b y6bVar) throws Exception {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) throws Exception {
        return Integer.valueOf(x.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(y6b y6bVar) throws Exception {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6b j(Context context, Intent intent, boolean z, y6b y6bVar) throws Exception {
        if (ad8.h() && ((Integer) y6bVar.m()).intValue() == 402) {
            return e(context, intent, z).j(new hc6(), new dv1() { // from class: sp3
                @Override // defpackage.dv1
                public final Object a(y6b y6bVar2) {
                    Integer i;
                    i = e.i(y6bVar2);
                    return i;
                }
            });
        }
        return y6bVar;
    }

    public y6b<Integer> k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public y6b<Integer> l(final Context context, final Intent intent) {
        boolean z;
        final boolean z2 = false;
        if (ad8.h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z2 = true;
        }
        if (z && !z2) {
            return e(context, intent, z2);
        }
        return o7b.c(this.b, new Callable() { // from class: qp3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h;
                h = e.h(context, intent);
                return h;
            }
        }).k(this.b, new dv1() { // from class: rp3
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar) {
                y6b j;
                j = e.j(context, intent, z2, y6bVar);
                return j;
            }
        });
    }
}
