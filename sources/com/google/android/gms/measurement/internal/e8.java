package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class e8 implements Runnable {
    private final /* synthetic */ t a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e8(z6 z6Var, t tVar) {
        this.a = tVar;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.g().y(this.a)) {
            this.b.s().T(false);
        } else {
            this.b.n().I().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.a.a()));
        }
    }
}
