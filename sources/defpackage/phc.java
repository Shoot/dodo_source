package defpackage;

import java.util.concurrent.Executor;
/* renamed from: phc  reason: default package */
/* loaded from: classes.dex */
public final class phc<TResult> implements am3<TResult> {
    private m77<TResult> a;
    Executor b;
    private final Object c = new Object();

    /* renamed from: phc$a */
    /* loaded from: classes.dex */
    final class a implements Runnable {
        final /* synthetic */ v6b a;

        a(v6b v6bVar) {
            this.a = v6bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (phc.this.c) {
                try {
                    if (phc.this.a != null) {
                        phc.this.a.onComplete(this.a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public phc(Executor executor, m77<TResult> m77Var) {
        this.a = m77Var;
        this.b = executor;
    }

    @Override // defpackage.am3
    public final void onComplete(v6b<TResult> v6bVar) {
        this.b.execute(new a(v6bVar));
    }
}
