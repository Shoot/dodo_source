package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: qzc  reason: default package */
/* loaded from: classes2.dex */
final class qzc implements g9d {
    private final Executor a;
    private final Object b = new Object();
    private l77 c;

    public qzc(@NonNull Executor executor, @NonNull l77 l77Var) {
        this.a = executor;
        this.c = l77Var;
    }

    @Override // defpackage.g9d
    public final void b(@NonNull y6b y6bVar) {
        if (y6bVar.o()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new iyc(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
