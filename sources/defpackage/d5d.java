package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: d5d  reason: default package */
/* loaded from: classes2.dex */
public final class d5d implements g9d {
    private final Executor a;
    private final Object b = new Object();
    private a97 c;

    public d5d(@NonNull Executor executor, @NonNull a97 a97Var) {
        this.a = executor;
        this.c = a97Var;
    }

    @Override // defpackage.g9d
    public final void b(@NonNull y6b y6bVar) {
        if (y6bVar.q()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new i4d(this, y6bVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
