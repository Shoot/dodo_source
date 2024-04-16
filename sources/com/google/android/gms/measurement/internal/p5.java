package com.google.android.gms.measurement.internal;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class p5 implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ o5 b;

    public p5(o5 o5Var, String str) {
        this.b = o5Var;
        gh8.j(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.n().F().b(this.a, th);
    }
}
