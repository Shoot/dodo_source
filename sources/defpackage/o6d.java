package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: o6d  reason: default package */
/* loaded from: classes2.dex */
final class o6d implements Runnable {
    final /* synthetic */ y6b a;
    final /* synthetic */ x7d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6d(x7d x7dVar, y6b y6bVar) {
        this.b = x7dVar;
        this.a = y6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r1b r1bVar;
        try {
            r1bVar = this.b.b;
            y6b a = r1bVar.a(this.a.m());
            if (a == null) {
                this.b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = g7b.b;
            a.h(executor, this.b);
            a.f(executor, this.b);
            a.b(executor, this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.onFailure((Exception) e.getCause());
            } else {
                this.b.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.b.a();
        } catch (Exception e2) {
            this.b.onFailure(e2);
        }
    }
}
