package defpackage;

import java.util.concurrent.Executor;
/* renamed from: uhc  reason: default package */
/* loaded from: classes.dex */
public final class uhc<TResult> implements am3<TResult> {
    private c87 a;
    private Executor b;
    private final Object c = new Object();

    /* renamed from: uhc$a */
    /* loaded from: classes.dex */
    final class a implements Runnable {
        final /* synthetic */ v6b a;

        a(v6b v6bVar) {
            this.a = v6bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (uhc.this.c) {
                try {
                    if (uhc.this.a != null) {
                        uhc.this.a.onFailure(this.a.d());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public uhc(Executor executor, c87 c87Var) {
        this.a = c87Var;
        this.b = executor;
    }

    @Override // defpackage.am3
    public final void onComplete(v6b<TResult> v6bVar) {
        if (!v6bVar.h() && !v6bVar.f()) {
            this.b.execute(new a(v6bVar));
        }
    }
}
