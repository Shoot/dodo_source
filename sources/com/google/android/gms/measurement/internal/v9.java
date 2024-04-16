package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
final class v9 implements Runnable {
    private final /* synthetic */ lxc a;
    private final /* synthetic */ q9 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v9(q9 q9Var, lxc lxcVar) {
        this.a = lxcVar;
        this.b = q9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            try {
                this.b.a = false;
                if (!this.b.c.b0()) {
                    this.b.c.n().E().a("Connected to remote service");
                    this.b.c.R(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
