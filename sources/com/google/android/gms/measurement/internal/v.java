package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class v {
    final String a;
    final String b;
    private final String c;
    final long d;
    final long e;
    final zzaz f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(u5 u5Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzaz zzazVar;
        gh8.f(str2);
        gh8.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            u5Var.n().K().b("Event created with reverse previous/current timestamps. appId", k4.u(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    u5Var.n().F().a("Param name can't be null");
                    it.remove();
                } else {
                    Object r0 = u5Var.K().r0(next, bundle2.get(next));
                    if (r0 == null) {
                        u5Var.n().K().b("Param value can't be null", u5Var.C().f(next));
                        it.remove();
                    } else {
                        u5Var.K().N(bundle2, next, r0);
                    }
                }
            }
            zzazVar = new zzaz(bundle2);
        } else {
            zzazVar = new zzaz(new Bundle());
        }
        this.f = zzazVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v a(u5 u5Var, long j) {
        return new v(u5Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }

    private v(u5 u5Var, String str, String str2, String str3, long j, long j2, zzaz zzazVar) {
        gh8.f(str2);
        gh8.f(str3);
        gh8.j(zzazVar);
        this.a = str2;
        this.b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            u5Var.n().K().c("Event created with reverse previous/current timestamps. appId, name", k4.u(str2), k4.u(str3));
        }
        this.f = zzazVar;
    }
}
