package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: SerialExecutor.java */
/* renamed from: kca  reason: default package */
/* loaded from: classes.dex */
public class kca implements Executor {
    private final Executor b;
    private volatile Runnable d;
    private final ArrayDeque<a> a = new ArrayDeque<>();
    private final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SerialExecutor.java */
    /* renamed from: kca$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        final kca a;
        final Runnable b;

        a(@NonNull kca kcaVar, @NonNull Runnable runnable) {
            this.a = kcaVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } finally {
                this.a.b();
            }
        }
    }

    public kca(@NonNull Executor executor) {
        this.b = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.c) {
            z = !this.a.isEmpty();
        }
        return z;
    }

    void b() {
        synchronized (this.c) {
            try {
                a poll = this.a.poll();
                this.d = poll;
                if (poll != null) {
                    this.b.execute(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.c) {
            try {
                this.a.add(new a(this, runnable));
                if (this.d == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
