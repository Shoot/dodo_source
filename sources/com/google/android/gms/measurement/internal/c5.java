package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class c5 {
    private final String a;
    private final String b;
    private boolean c;
    private String d;
    private final /* synthetic */ w4 e;

    public c5(w4 w4Var, String str, String str2) {
        this.e = w4Var;
        gh8.f(str);
        this.a = str;
        this.b = null;
    }

    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.H().getString(this.a, null);
        }
        return this.d;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.e.H().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.d = str;
    }
}
