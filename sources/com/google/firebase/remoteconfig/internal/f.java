package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ConfigRealtimeHandler.java */
/* loaded from: classes2.dex */
public class f {
    private final Set<aq1> a;
    private final g b;
    private final d c;
    private final qv3 d;
    private final ew3 e;
    private final b f;
    private final Context g;
    private final String h;
    private final e i;
    private final ScheduledExecutorService j;

    public f(qv3 qv3Var, ew3 ew3Var, d dVar, b bVar, Context context, String str, e eVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new g(qv3Var, ew3Var, dVar, bVar, context, str, linkedHashSet, eVar, scheduledExecutorService);
        this.d = qv3Var;
        this.c = dVar;
        this.e = ew3Var;
        this.f = bVar;
        this.g = context;
        this.h = str;
        this.i = eVar;
        this.j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.a.isEmpty()) {
            this.b.C();
        }
    }

    public synchronized void b(boolean z) {
        this.b.z(z);
        if (!z) {
            a();
        }
    }
}
