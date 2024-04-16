package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class s4 implements Runnable {
    private final q4 a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }

    private s4(String str, q4 q4Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        gh8.j(q4Var);
        this.a = q4Var;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }
}
