package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class bb implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ cb d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bb(cb cbVar, String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = cbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.t((zzbe) gh8.j(this.d.a.n0().G(this.a, this.b, this.c, "auto", this.d.a.b().currentTimeMillis(), false, true)), this.a);
    }
}
