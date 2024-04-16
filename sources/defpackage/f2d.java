package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: f2d  reason: default package */
/* loaded from: classes2.dex */
final class f2d implements g9d {
    private final Executor a;
    private final Object b = new Object();
    private n77 c;

    public f2d(@NonNull Executor executor, @NonNull n77 n77Var) {
        this.a = executor;
        this.c = n77Var;
    }

    @Override // defpackage.g9d
    public final void b(@NonNull y6b y6bVar) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new p0d(this, y6bVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
