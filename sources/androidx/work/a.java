package androidx.work;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a {
    @NonNull
    final Executor a;
    @NonNull
    final Executor b;
    @NonNull
    final a8c c;
    @NonNull
    final q35 d;
    @NonNull
    final qp9 e;
    final String f;
    final int g;
    final int h;
    final int i;
    final int j;
    private final boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0051a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);
        final /* synthetic */ boolean b;

        ThreadFactoryC0051a(boolean z) {
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str;
            if (this.b) {
                str = "WM.task-";
            } else {
                str = "androidx.work-";
            }
            return new Thread(runnable, str + this.a.incrementAndGet());
        }
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public static final class b {
        Executor a;
        a8c b;
        q35 c;
        Executor d;
        qp9 e;
        String f;
        int g = 4;
        int h = 0;
        int i = Integer.MAX_VALUE;
        int j = 20;

        @NonNull
        public a a() {
            return new a(this);
        }
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface c {
        @NonNull
        a a();
    }

    a(@NonNull b bVar) {
        Executor executor = bVar.a;
        if (executor == null) {
            this.a = a(false);
        } else {
            this.a = executor;
        }
        Executor executor2 = bVar.d;
        if (executor2 == null) {
            this.k = true;
            this.b = a(true);
        } else {
            this.k = false;
            this.b = executor2;
        }
        a8c a8cVar = bVar.b;
        if (a8cVar == null) {
            this.c = a8c.c();
        } else {
            this.c = a8cVar;
        }
        q35 q35Var = bVar.c;
        if (q35Var == null) {
            this.d = q35.c();
        } else {
            this.d = q35Var;
        }
        qp9 qp9Var = bVar.e;
        if (qp9Var == null) {
            this.e = new mr2();
        } else {
            this.e = qp9Var;
        }
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.f = bVar.f;
    }

    @NonNull
    private Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z));
    }

    @NonNull
    private ThreadFactory b(boolean z) {
        return new ThreadFactoryC0051a(z);
    }

    public String c() {
        return this.f;
    }

    public u25 d() {
        return null;
    }

    @NonNull
    public Executor e() {
        return this.a;
    }

    @NonNull
    public q35 f() {
        return this.d;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.j / 2;
        }
        return this.j;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    @NonNull
    public qp9 k() {
        return this.e;
    }

    @NonNull
    public Executor l() {
        return this.b;
    }

    @NonNull
    public a8c m() {
        return this.c;
    }
}
