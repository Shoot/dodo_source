package defpackage;

import java.util.concurrent.Executor;
/* compiled from: SafeLoggingExecutor.java */
/* renamed from: xs9  reason: default package */
/* loaded from: classes2.dex */
class xs9 implements Executor {
    private final Executor a;

    /* compiled from: SafeLoggingExecutor.java */
    /* renamed from: xs9$a */
    /* loaded from: classes2.dex */
    static class a implements Runnable {
        private final Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } catch (Exception e) {
                wx5.d("Executor", "Background execution failure.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xs9(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(new a(runnable));
    }
}
