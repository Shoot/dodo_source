package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class s9 implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ q9 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s9(q9 q9Var, ComponentName componentName) {
        this.a = componentName;
        this.b = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x8.F(this.b.c, this.a);
    }
}
