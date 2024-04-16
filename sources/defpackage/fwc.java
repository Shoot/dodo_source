package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: fwc  reason: default package */
/* loaded from: classes2.dex */
final class fwc implements Runnable {
    final /* synthetic */ y6b a;
    final /* synthetic */ xwc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fwc(xwc xwcVar, y6b y6bVar) {
        this.b = xwcVar;
        this.a = y6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rbd rbdVar;
        rbd rbdVar2;
        rbd rbdVar3;
        dv1 dv1Var;
        try {
            dv1Var = this.b.b;
            y6b y6bVar = (y6b) dv1Var.a(this.a);
            if (y6bVar == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = g7b.b;
            y6bVar.h(executor, this.b);
            y6bVar.f(executor, this.b);
            y6bVar.b(executor, this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                rbdVar3 = this.b.c;
                rbdVar3.t((Exception) e.getCause());
                return;
            }
            rbdVar2 = this.b.c;
            rbdVar2.t(e);
        } catch (Exception e2) {
            rbdVar = this.b.c;
            rbdVar.t(e2);
        }
    }
}
