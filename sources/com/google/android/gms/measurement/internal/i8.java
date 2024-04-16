package com.google.android.gms.measurement.internal;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class i8 implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ Uri b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ f8 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i8(f8 f8Var, boolean z, Uri uri, String str, String str2) {
        this.a = z;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f8.a(this.e, this.a, this.b, this.c, this.d);
    }
}
