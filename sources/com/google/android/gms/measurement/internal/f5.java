package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.classic.spi.CallerData;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class f5 implements Runnable {
    private final /* synthetic */ nsc a;
    private final /* synthetic */ ServiceConnection b;
    private final /* synthetic */ d5 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f5(d5 d5Var, nsc nscVar, ServiceConnection serviceConnection) {
        this.a = nscVar;
        this.b = serviceConnection;
        this.c = d5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z;
        boolean z2;
        d5 d5Var = this.c;
        e5 e5Var = d5Var.b;
        str = d5Var.a;
        nsc nscVar = this.a;
        ServiceConnection serviceConnection = this.b;
        Bundle a = e5Var.a(str, nscVar);
        e5Var.a.k().l();
        e5Var.a.P();
        if (a != null) {
            long j = a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                e5Var.a.n().K().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    e5Var.a.n().J().b("InstallReferrer API result", string);
                    jb K = e5Var.a.K();
                    Uri parse = Uri.parse(CallerData.NA + string);
                    if (y8d.a() && e5Var.a.y().s(b0.B0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (a7d.a() && e5Var.a.y().s(b0.X0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Bundle B = K.B(parse, z, z2);
                    if (B == null) {
                        e5Var.a.n().F().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = B.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                e5Var.a.n().F().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                B.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == e5Var.a.E().h.a()) {
                            e5Var.a.n().J().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (e5Var.a.o()) {
                            e5Var.a.E().h.b(j);
                            e5Var.a.n().J().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            B.putString("_cis", "referrer API v2");
                            e5Var.a.G().W("auto", "_cmp", B, str);
                        }
                    }
                } else {
                    e5Var.a.n().F().a("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            uq1.b().c(e5Var.a.zza(), serviceConnection);
        }
    }
}
