package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: ArchTaskExecutor.java */
/* renamed from: uq  reason: default package */
/* loaded from: classes.dex */
public class uq extends e7b {
    private static volatile uq c;
    @NonNull
    private static final Executor d = new Executor() { // from class: sq
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            uq.h(runnable);
        }
    };
    @NonNull
    private static final Executor e = new Executor() { // from class: tq
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            uq.i(runnable);
        }
    };
    @NonNull
    private e7b a;
    @NonNull
    private final e7b b;

    private uq() {
        yr2 yr2Var = new yr2();
        this.b = yr2Var;
        this.a = yr2Var;
    }

    @NonNull
    public static Executor f() {
        return e;
    }

    @NonNull
    public static uq g() {
        if (c != null) {
            return c;
        }
        synchronized (uq.class) {
            try {
                if (c == null) {
                    c = new uq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        g().a(runnable);
    }

    @Override // defpackage.e7b
    public void a(@NonNull Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // defpackage.e7b
    public boolean b() {
        return this.a.b();
    }

    @Override // defpackage.e7b
    public void c(@NonNull Runnable runnable) {
        this.a.c(runnable);
    }
}
