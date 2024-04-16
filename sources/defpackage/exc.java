package defpackage;

import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.y1;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: exc  reason: default package */
/* loaded from: classes2.dex */
public final class exc {
    private final drc a;
    final xzc b;
    final xzc c;
    private final p3d d;

    public exc() {
        drc drcVar = new drc();
        this.a = drcVar;
        xzc xzcVar = new xzc(null, drcVar);
        this.c = xzcVar;
        this.b = xzcVar.d();
        p3d p3dVar = new p3d();
        this.d = p3dVar;
        xzcVar.h("require", new pcd(p3dVar));
        p3dVar.b("internal.platform", new Callable() { // from class: bwc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new icd();
            }
        });
        xzcVar.h("runtime.counter", new znc(Double.valueOf(0.0d)));
    }

    public final bpc a(xzc xzcVar, t0... t0VarArr) {
        bpc bpcVar = bpc.K4;
        for (t0 t0Var : t0VarArr) {
            bpcVar = y1.a(t0Var);
            eyc.b(this.c);
            if ((bpcVar instanceof hpc) || (bpcVar instanceof cpc)) {
                bpcVar = this.a.a(xzcVar, bpcVar);
            }
        }
        return bpcVar;
    }

    public final void b(String str, Callable<? extends ioc> callable) {
        this.d.b(str, callable);
    }
}
