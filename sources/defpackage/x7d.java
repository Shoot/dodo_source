package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: x7d  reason: default package */
/* loaded from: classes2.dex */
final class x7d<TResult, TContinuationResult> implements a97<TContinuationResult>, a87, l77, g9d {
    private final Executor a;
    private final r1b b;
    private final rbd c;

    public x7d(@NonNull Executor executor, @NonNull r1b r1bVar, @NonNull rbd rbdVar) {
        this.a = executor;
        this.b = r1bVar;
        this.c = rbdVar;
    }

    @Override // defpackage.l77
    public final void a() {
        this.c.v();
    }

    @Override // defpackage.g9d
    public final void b(@NonNull y6b y6bVar) {
        this.a.execute(new o6d(this, y6bVar));
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
