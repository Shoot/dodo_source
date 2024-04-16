package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: qcd  reason: default package */
/* loaded from: classes2.dex */
public final class qcd implements Runnable {
    final /* synthetic */ rbd a;
    final /* synthetic */ Callable b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qcd(rbd rbdVar, Callable callable) {
        this.a = rbdVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.u(this.b.call());
        } catch (Exception e) {
            this.a.t(e);
        } catch (Throwable th) {
            this.a.t(new RuntimeException(th));
        }
    }
}
