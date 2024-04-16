package defpackage;

import java.util.concurrent.Executor;
/* renamed from: zhc  reason: default package */
/* loaded from: classes.dex */
public final class zhc<TResult> implements am3<TResult> {
    private c97<TResult> a;
    private Executor b;
    private final Object c = new Object();

    /* renamed from: zhc$a */
    /* loaded from: classes.dex */
    final class a implements Runnable {
        final /* synthetic */ v6b a;

        a(v6b v6bVar) {
            this.a = v6bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (zhc.this.c) {
                try {
                    if (zhc.this.a != null) {
                        zhc.this.a.onSuccess(this.a.e());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zhc(Executor executor, c97<TResult> c97Var) {
        this.a = c97Var;
        this.b = executor;
    }

    @Override // defpackage.am3
    public final void onComplete(v6b<TResult> v6bVar) {
        if (v6bVar.h() && !v6bVar.f()) {
            this.b.execute(new a(v6bVar));
        }
    }
}
