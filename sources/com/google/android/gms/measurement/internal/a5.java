package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class a5 {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final /* synthetic */ w4 e;

    private final long c() {
        return this.e.H().getLong(this.a, 0L);
    }

    private final void d() {
        this.e.l();
        long currentTimeMillis = this.e.b().currentTimeMillis();
        SharedPreferences.Editor edit = this.e.H().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long abs;
        this.e.l();
        this.e.l();
        long c = c();
        if (c == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c - this.e.b().currentTimeMillis());
        }
        long j = this.d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            d();
            return null;
        }
        String string = this.e.H().getString(this.c, null);
        long j2 = this.e.H().getLong(this.b, 0L);
        d();
        if (string != null && j2 > 0) {
            return new Pair<>(string, Long.valueOf(j2));
        }
        return w4.B;
    }

    public final void b(String str, long j) {
        boolean z;
        this.e.l();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.e.H().getLong(this.b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.e.H().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        if ((this.e.h().T0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            z = true;
        } else {
            z = false;
        }
        SharedPreferences.Editor edit2 = this.e.H().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j3);
        edit2.apply();
    }

    private a5(w4 w4Var, String str, long j) {
        this.e = w4Var;
        gh8.f(str);
        gh8.a(j > 0);
        this.a = str + ":start";
        this.b = str + ":count";
        this.c = str + ":value";
        this.d = j;
    }
}
