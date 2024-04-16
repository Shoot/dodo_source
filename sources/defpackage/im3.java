package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
/* compiled from: Executors.java */
/* renamed from: im3  reason: default package */
/* loaded from: classes.dex */
public final class im3 {
    private static final Executor a = new a();
    private static final Executor b = new b();

    /* compiled from: Executors.java */
    /* renamed from: im3$a */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            vub.w(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* renamed from: im3$b */
    /* loaded from: classes.dex */
    class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return b;
    }

    public static Executor b() {
        return a;
    }
}
