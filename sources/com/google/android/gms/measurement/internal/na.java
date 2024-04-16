package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class na {
    final /* synthetic */ ea a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public na(ea eaVar) {
        this.a = eaVar;
    }

    private final void c(long j, boolean z) {
        this.a.l();
        if (!this.a.a.o()) {
            return;
        }
        this.a.g().r.b(j);
        this.a.n().J().b("Session started, time", Long.valueOf(this.a.b().b()));
        Long valueOf = Long.valueOf(j / 1000);
        this.a.q().Y("auto", "_sid", valueOf, j);
        this.a.g().s.b(valueOf.longValue());
        this.a.g().n.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        this.a.q().S("auto", "_s", j, bundle);
        String a = this.a.g().x.a();
        if (!TextUtils.isEmpty(a)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a);
            this.a.q().S("auto", "_ssr", j, bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.l();
        if (this.a.g().x(this.a.b().currentTimeMillis())) {
            this.a.g().n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.n().J().a("Detected application was in foreground");
                c(this.a.b().currentTimeMillis(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j, boolean z) {
        this.a.l();
        this.a.F();
        if (this.a.g().x(j)) {
            this.a.g().n.a(true);
            if (s8d.a() && this.a.a().s(b0.s0)) {
                this.a.o().H();
            }
        }
        this.a.g().r.b(j);
        if (this.a.g().n.b()) {
            c(j, z);
        }
    }
}
