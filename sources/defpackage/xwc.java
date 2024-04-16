package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: xwc  reason: default package */
/* loaded from: classes2.dex */
final class xwc<TResult, TContinuationResult> implements a97<TContinuationResult>, a87, l77, g9d {
    private final Executor a;
    private final dv1 b;
    private final rbd c;

    public xwc(@NonNull Executor executor, @NonNull dv1 dv1Var, @NonNull rbd rbdVar) {
        this.a = executor;
        this.b = dv1Var;
        this.c = rbdVar;
    }

    @Override // defpackage.l77
    public final void a() {
        this.c.v();
    }

    @Override // defpackage.g9d
    public final void b(@NonNull y6b y6bVar) {
        this.a.execute(new fwc(this, y6bVar));
    }

    @Override // defpackage.a87
    public final void onFailure(@NonNull Exception exc) {
        this.c.t(exc);
    }

    @Override // defpackage.a97
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.u(tcontinuationresult);
    }
}
