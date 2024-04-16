package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: atc  reason: default package */
/* loaded from: classes2.dex */
final class atc implements Runnable {
    final /* synthetic */ y6b a;
    final /* synthetic */ ruc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public atc(ruc rucVar, y6b y6bVar) {
        this.b = rucVar;
        this.a = y6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rbd rbdVar;
        rbd rbdVar2;
        rbd rbdVar3;
        dv1 dv1Var;
        rbd rbdVar4;
        rbd rbdVar5;
        if (this.a.o()) {
            rbdVar5 = this.b.c;
            rbdVar5.v();
            return;
        }
        try {
            dv1Var = this.b.b;
            Object a = dv1Var.a(this.a);
            rbdVar4 = this.b.c;
            rbdVar4.u(a);
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
