package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: r3d  reason: default package */
/* loaded from: classes2.dex */
public final class r3d implements g9d {
    private final Executor a;
    private final Object b = new Object();
    private a87 c;

    public r3d(@NonNull Executor executor, @NonNull a87 a87Var) {
        this.a = executor;
        this.c = a87Var;
    }

    @Override // defpackage.g9d
    public final void b(@NonNull y6b y6bVar) {
        if (!y6bVar.q() && !y6bVar.o()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new a3d(this, y6bVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
