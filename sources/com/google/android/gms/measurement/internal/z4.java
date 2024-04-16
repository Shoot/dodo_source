package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class z4 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final /* synthetic */ w4 e;

    public z4(w4 w4Var, String str, boolean z) {
        this.e = w4Var;
        gh8.f(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.H().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.H().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
