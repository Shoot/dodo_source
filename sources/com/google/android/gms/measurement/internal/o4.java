package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class o4 {
    @NonNull
    public String a;
    @NonNull
    private String b;
    private long c;
    @NonNull
    public Bundle d;

    private o4(@NonNull String str, @NonNull String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle == null ? new Bundle() : bundle;
        this.c = j;
    }

    public static o4 b(zzbe zzbeVar) {
        return new o4(zzbeVar.a, zzbeVar.c, zzbeVar.b.t(), zzbeVar.d);
    }

    public final zzbe a() {
        return new zzbe(this.a, new zzaz(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}
