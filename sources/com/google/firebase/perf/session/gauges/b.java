package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
/* compiled from: GaugeMetadataManager.java */
/* loaded from: classes2.dex */
class b {
    private static final sh e = sh.e();
    private final Runtime a;
    private final ActivityManager b;
    private final ActivityManager.MemoryInfo c;
    private final Context d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return hvb.c(txa.f.a(this.c.totalMem));
    }

    public int b() {
        return hvb.c(txa.f.a(this.a.maxMemory()));
    }

    public int c() {
        return hvb.c(txa.d.a(this.b.getMemoryClass()));
    }

    b(Runtime runtime, Context context) {
        this.a = runtime;
        this.d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
