package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.WorkSpec;
/* compiled from: WorkForegroundRunnable.java */
/* renamed from: z6c  reason: default package */
/* loaded from: classes.dex */
public class z6c implements Runnable {
    static final String g = nx5.f("WorkForegroundRunnable");
    final ufa<Void> a = ufa.t();
    final Context b;
    final WorkSpec c;
    final ListenableWorker d;
    final d54 e;
    final d7b f;

    /* compiled from: WorkForegroundRunnable.java */
    /* renamed from: z6c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ ufa a;

        a(ufa ufaVar) {
            this.a = ufaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.r(z6c.this.d.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* renamed from: z6c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        final /* synthetic */ ufa a;

        b(ufa ufaVar) {
            this.a = ufaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a54 a54Var = (a54) this.a.get();
                if (a54Var != null) {
                    nx5.c().a(z6c.g, String.format("Updating notification for %s", z6c.this.c.c), new Throwable[0]);
                    z6c.this.d.setRunInForeground(true);
                    z6c z6cVar = z6c.this;
                    z6cVar.a.r(z6cVar.e.a(z6cVar.b, z6cVar.d.getId(), a54Var));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", z6c.this.c.c));
            } catch (Throwable th) {
                z6c.this.a.q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public z6c(@NonNull Context context, @NonNull WorkSpec workSpec, @NonNull ListenableWorker listenableWorker, @NonNull d54 d54Var, @NonNull d7b d7bVar) {
        this.b = context;
        this.c = workSpec;
        this.d = listenableWorker;
        this.e = d54Var;
        this.f = d7bVar;
    }

    @NonNull
    public kr5<Void> a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.c.q && !gh0.c()) {
            ufa t = ufa.t();
            this.f.a().execute(new a(t));
            t.k(new b(t), this.f.a());
            return;
        }
        this.a.p(null);
    }
}
