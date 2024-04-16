package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class b5 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ w4 e;

    public b5(w4 w4Var, String str, long j) {
        this.e = w4Var;
        gh8.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.H().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.H().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
