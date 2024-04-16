package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ConstraintTracker.java */
/* renamed from: kr1  reason: default package */
/* loaded from: classes.dex */
public abstract class kr1<T> {
    private static final String f = nx5.f("ConstraintTracker");
    protected final d7b a;
    protected final Context b;
    private final Object c = new Object();
    private final Set<jr1<T>> d = new LinkedHashSet();
    T e;

    /* compiled from: ConstraintTracker.java */
    /* renamed from: kr1$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        final /* synthetic */ List a;

        a(List list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (jr1 jr1Var : this.a) {
                jr1Var.a(kr1.this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kr1(@NonNull Context context, @NonNull d7b d7bVar) {
        this.b = context.getApplicationContext();
        this.a = d7bVar;
    }

    public void a(jr1<T> jr1Var) {
        synchronized (this.c) {
            try {
                if (this.d.add(jr1Var)) {
                    if (this.d.size() == 1) {
                        this.e = b();
                        nx5.c().a(f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.e), new Throwable[0]);
                        e();
                    }
                    jr1Var.a(this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract T b();

    public void c(jr1<T> jr1Var) {
        synchronized (this.c) {
            try {
                if (this.d.remove(jr1Var) && this.d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(T t) {
        synchronized (this.c) {
            try {
                T t2 = this.e;
                if (t2 != t && (t2 == null || !t2.equals(t))) {
                    this.e = t;
                    this.a.a().execute(new a(new ArrayList(this.d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
