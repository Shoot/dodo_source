package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class qb {
    private com.google.android.gms.internal.measurement.d0 a;
    private Long b;
    private long c;
    private final /* synthetic */ ob d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.d0 a(String str, com.google.android.gms.internal.measurement.d0 d0Var) {
        boolean z;
        Object obj;
        String d0 = d0Var.d0();
        List<com.google.android.gms.internal.measurement.f0> e0 = d0Var.e0();
        this.d.m();
        Long l = (Long) db.g0(d0Var, "_eid");
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && d0.equals("_ep")) {
            gh8.j(l);
            this.d.m();
            d0 = (String) db.g0(d0Var, "_en");
            if (TextUtils.isEmpty(d0)) {
                this.d.n().H().b("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                Pair<com.google.android.gms.internal.measurement.d0, Long> G = this.d.p().G(str, l);
                if (G != null && (obj = G.first) != null) {
                    this.a = (com.google.android.gms.internal.measurement.d0) obj;
                    this.c = ((Long) G.second).longValue();
                    this.d.m();
                    this.b = (Long) db.g0(this.a, "_eid");
                } else {
                    this.d.n().H().c("Extra parameter without existing main event. eventName, eventId", d0, l);
                    return null;
                }
            }
            long j = this.c - 1;
            this.c = j;
            if (j <= 0) {
                k p = this.d.p();
                p.l();
                p.n().J().b("Clearing complex main event info. appId", str);
                try {
                    p.A().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    p.n().F().b("Error clearing complex main event", e);
                }
            } else {
                this.d.p().i0(str, l, this.c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.measurement.f0 f0Var : this.a.e0()) {
                this.d.m();
                if (db.E(d0Var, f0Var.e0()) == null) {
                    arrayList.add(f0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(e0);
                e0 = arrayList;
            } else {
                this.d.n().H().b("No unique parameters in main event. eventName", d0);
            }
        } else if (z) {
            this.b = l;
            this.a = d0Var;
            this.d.m();
            Object obj2 = 0L;
            Object g0 = db.g0(d0Var, "_epc");
            if (g0 != null) {
                obj2 = g0;
            }
            long longValue = ((Long) obj2).longValue();
            this.c = longValue;
            if (longValue <= 0) {
                this.d.n().H().b("Complex event with zero extra param count. eventName", d0);
            } else {
                this.d.p().i0(str, (Long) gh8.j(l), this.c, d0Var);
            }
        }
        return (com.google.android.gms.internal.measurement.d0) ((com.google.android.gms.internal.measurement.b2) d0Var.z().C(d0).I().B(e0).u());
    }

    private qb(ob obVar) {
        this.d = obVar;
    }
}
