package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: ruc  reason: default package */
/* loaded from: classes2.dex */
final class ruc implements g9d {
    private final Executor a;
    private final dv1 b;
    private final rbd c;

    public ruc(@NonNull Executor executor, @NonNull dv1 dv1Var, @NonNull rbd rbdVar) {
        this.a = executor;
        this.b = dv1Var;
        this.c = rbdVar;
    }

    @Override // defpackage.g9d
    public final void b(@NonNull y6b y6bVar) {
        this.a.execute(new atc(this, y6bVar));
    }
}
