package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class ja implements Runnable {
    long a;
    long b;
    final /* synthetic */ fa c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ja(fa faVar, long j, long j2) {
        this.c = faVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.k().C(new Runnable() { // from class: com.google.android.gms.measurement.internal.ia
            @Override // java.lang.Runnable
            public final void run() {
                ja jaVar = ja.this;
                fa faVar = jaVar.c;
                long j = jaVar.a;
                long j2 = jaVar.b;
                faVar.b.l();
                faVar.b.n().E().a("Application going to the background");
                faVar.b.g().u.a(true);
                faVar.b.C(true);
                if (!faVar.b.a().Q()) {
                    faVar.b.f.e(j2);
                    faVar.b.D(false, false, j2);
                }
                if (m8d.a() && faVar.b.a().s(b0.G0)) {
                    faVar.b.n().I().b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    faVar.b.q().S("auto", "_ab", j, new Bundle());
                }
            }
        });
    }
}
