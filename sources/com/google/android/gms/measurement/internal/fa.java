package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class fa {
    private ja a;
    final /* synthetic */ ea b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fa(ea eaVar) {
        this.b = eaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Handler handler;
        this.b.l();
        if (this.a != null) {
            handler = this.b.c;
            handler.removeCallbacks(this.a);
        }
        this.b.g().u.a(false);
        this.b.C(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j) {
        Handler handler;
        this.a = new ja(this, this.b.b().currentTimeMillis(), j);
        handler = this.b.c;
        handler.postDelayed(this.a, 2000L);
    }
}
