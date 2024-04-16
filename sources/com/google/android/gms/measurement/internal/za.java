package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class za implements Callable<String> {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ va b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public za(va vaVar, zzo zzoVar) {
        this.a = zzoVar;
        this.b = vaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (this.b.Q((String) gh8.j(this.a.a)).y() && w6.e(this.a.v).y()) {
            u4 f = this.b.f(this.a);
            if (f == null) {
                this.b.n().K().a("App info was null when attempting to get app instance id");
                return null;
            }
            return f.w0();
        }
        this.b.n().J().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
