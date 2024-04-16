package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class y6 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    zzdd g;
    boolean h;
    Long i;
    String j;

    public y6(Context context, zzdd zzddVar, Long l) {
        this.h = true;
        gh8.j(context);
        Context applicationContext = context.getApplicationContext();
        gh8.j(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzddVar != null) {
            this.g = zzddVar;
            this.b = zzddVar.f;
            this.c = zzddVar.e;
            this.d = zzddVar.d;
            this.h = zzddVar.c;
            this.f = zzddVar.b;
            this.j = zzddVar.h;
            Bundle bundle = zzddVar.g;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
