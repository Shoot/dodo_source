package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: RemoteConfigComponent.java */
/* loaded from: classes2.dex */
public class c implements qx3 {
    private static final t91 j = jp2.c();
    private static final Random k = new Random();
    private static final Map<String, com.google.firebase.remoteconfig.a> l = new HashMap();
    private final Map<String, com.google.firebase.remoteconfig.a> a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final qv3 d;
    private final ew3 e;
    private final lv3 f;
    private final bs8<jc> g;
    private final String h;
    private Map<String, String> i;

    /* compiled from: RemoteConfigComponent.java */
    /* loaded from: classes2.dex */
    private static class a implements a.InterfaceC0219a {
        private static final AtomicReference<a> a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (ho1.a(atomicReference, null, aVar)) {
                    com.google.android.gms.common.api.internal.a.c(application);
                    com.google.android.gms.common.api.internal.a.b().a(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0219a
        public void a(boolean z) {
            c.r(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, @rd0 ScheduledExecutorService scheduledExecutorService, qv3 qv3Var, ew3 ew3Var, lv3 lv3Var, bs8<jc> bs8Var) {
        this(context, scheduledExecutorService, qv3Var, ew3Var, lv3Var, bs8Var, true);
    }

    private com.google.firebase.remoteconfig.internal.b f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.b.h(this.c, h.c(this.b, String.format("%s_%s_%s_%s.json", "frc", this.h, str, str2)));
    }

    private tp1 j(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return new tp1(this.c, bVar, bVar2);
    }

    static e k(Context context, String str, String str2) {
        return new e(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static d28 l(qv3 qv3Var, String str, bs8<jc> bs8Var) {
        if (p(qv3Var) && str.equals("firebase")) {
            return new d28(bs8Var);
        }
        return null;
    }

    private rn9 n(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return new rn9(bVar, mn9.a(bVar, bVar2), this.c);
    }

    private static boolean o(qv3 qv3Var, String str) {
        if (str.equals("firebase") && p(qv3Var)) {
            return true;
        }
        return false;
    }

    private static boolean p(qv3 qv3Var) {
        return qv3Var.m().equals("[DEFAULT]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jc q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void r(boolean z) {
        synchronized (c.class) {
            for (com.google.firebase.remoteconfig.a aVar : l.values()) {
                aVar.B(z);
            }
        }
    }

    @Override // defpackage.qx3
    public void a(@NonNull String str, @NonNull nn9 nn9Var) {
        e(str).q().h(nn9Var);
    }

    synchronized com.google.firebase.remoteconfig.a d(qv3 qv3Var, String str, ew3 ew3Var, lv3 lv3Var, Executor executor, com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2, com.google.firebase.remoteconfig.internal.b bVar3, d dVar, tp1 tp1Var, e eVar, rn9 rn9Var) {
        lv3 lv3Var2;
        try {
            if (!this.a.containsKey(str)) {
                Context context = this.b;
                if (o(qv3Var, str)) {
                    lv3Var2 = lv3Var;
                } else {
                    lv3Var2 = null;
                }
                com.google.firebase.remoteconfig.a aVar = new com.google.firebase.remoteconfig.a(context, qv3Var, ew3Var, lv3Var2, executor, bVar, bVar2, bVar3, dVar, tp1Var, eVar, m(qv3Var, ew3Var, dVar, bVar2, this.b, str, eVar), rn9Var);
                aVar.E();
                this.a.put(str, aVar);
                l.put(str, aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.get(str);
    }

    public synchronized com.google.firebase.remoteconfig.a e(String str) {
        com.google.firebase.remoteconfig.internal.b f;
        com.google.firebase.remoteconfig.internal.b f2;
        com.google.firebase.remoteconfig.internal.b f3;
        e k2;
        tp1 j2;
        try {
            f = f(str, "fetch");
            f2 = f(str, "activate");
            f3 = f(str, "defaults");
            k2 = k(this.b, this.h, str);
            j2 = j(f2, f3);
            final d28 l2 = l(this.d, str, this.g);
            if (l2 != null) {
                j2.b(new xa0() { // from class: ad9
                    @Override // defpackage.xa0
                    public final void a(Object obj, Object obj2) {
                        d28.this.a((String) obj, (c) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return d(this.d, str, this.e, this.f, this.c, f, f2, f3, h(str, f, k2), j2, k2, n(f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.remoteconfig.a g() {
        return e("firebase");
    }

    synchronized d h(String str, com.google.firebase.remoteconfig.internal.b bVar, e eVar) {
        ew3 ew3Var;
        bs8<jc> bs8Var;
        try {
            ew3Var = this.e;
            if (p(this.d)) {
                bs8Var = this.g;
            } else {
                bs8Var = new bs8() { // from class: bd9
                    @Override // defpackage.bs8
                    public final Object get() {
                        jc q;
                        q = com.google.firebase.remoteconfig.c.q();
                        return q;
                    }
                };
            }
        } catch (Throwable th) {
            throw th;
        }
        return new d(ew3Var, bs8Var, this.c, j, k, bVar, i(this.d.n().b(), str, eVar), eVar, this.i);
    }

    ConfigFetchHttpClient i(String str, String str2, e eVar) {
        return new ConfigFetchHttpClient(this.b, this.d.n().c(), str, str2, eVar.b(), eVar.b());
    }

    synchronized f m(qv3 qv3Var, ew3 ew3Var, d dVar, com.google.firebase.remoteconfig.internal.b bVar, Context context, String str, e eVar) {
        return new f(qv3Var, ew3Var, dVar, bVar, context, str, eVar, this.c);
    }

    protected c(Context context, ScheduledExecutorService scheduledExecutorService, qv3 qv3Var, ew3 ew3Var, lv3 lv3Var, bs8<jc> bs8Var, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = qv3Var;
        this.e = ew3Var;
        this.f = lv3Var;
        this.g = bs8Var;
        this.h = qv3Var.n().c();
        a.c(context);
        if (z) {
            o7b.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.this.g();
                }
            });
        }
    }
}
