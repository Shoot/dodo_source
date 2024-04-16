package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: rbd  reason: default package */
/* loaded from: classes2.dex */
public final class rbd<TResult> extends y6b<TResult> {
    private final Object a = new Object();
    private final aad b = new aad();
    private boolean c;
    private volatile boolean d;
    private Object e;
    private Exception f;

    private final void A() {
        if (!this.c) {
            return;
        }
        throw DuplicateTaskCompletionException.a(this);
    }

    private final void B() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    return;
                }
                this.b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void y() {
        gh8.n(this.c, "Task is not yet complete");
    }

    private final void z() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> a(@NonNull l77 l77Var) {
        b(g7b.a, l77Var);
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> b(@NonNull Executor executor, @NonNull l77 l77Var) {
        this.b.a(new qzc(executor, l77Var));
        B();
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> c(@NonNull n77<TResult> n77Var) {
        this.b.a(new f2d(g7b.a, n77Var));
        B();
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> d(@NonNull Executor executor, @NonNull n77<TResult> n77Var) {
        this.b.a(new f2d(executor, n77Var));
        B();
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> e(@NonNull a87 a87Var) {
        f(g7b.a, a87Var);
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> f(@NonNull Executor executor, @NonNull a87 a87Var) {
        this.b.a(new r3d(executor, a87Var));
        B();
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> g(@NonNull a97<? super TResult> a97Var) {
        h(g7b.a, a97Var);
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final y6b<TResult> h(@NonNull Executor executor, @NonNull a97<? super TResult> a97Var) {
        this.b.a(new d5d(executor, a97Var));
        B();
        return this;
    }

    @Override // defpackage.y6b
    @NonNull
    public final <TContinuationResult> y6b<TContinuationResult> i(@NonNull dv1<TResult, TContinuationResult> dv1Var) {
        return j(g7b.a, dv1Var);
    }

    @Override // defpackage.y6b
    @NonNull
    public final <TContinuationResult> y6b<TContinuationResult> j(@NonNull Executor executor, @NonNull dv1<TResult, TContinuationResult> dv1Var) {
        rbd rbdVar = new rbd();
        this.b.a(new ruc(executor, dv1Var, rbdVar));
        B();
        return rbdVar;
    }

    @Override // defpackage.y6b
    @NonNull
    public final <TContinuationResult> y6b<TContinuationResult> k(@NonNull Executor executor, @NonNull dv1<TResult, y6b<TContinuationResult>> dv1Var) {
        rbd rbdVar = new rbd();
        this.b.a(new xwc(executor, dv1Var, rbdVar));
        B();
        return rbdVar;
    }

    @Override // defpackage.y6b
    public final Exception l() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.y6b
    public final TResult m() {
        TResult tresult;
        synchronized (this.a) {
            try {
                y();
                z();
                Exception exc = this.f;
                if (exc == null) {
                    tresult = (TResult) this.e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // defpackage.y6b
    public final <X extends Throwable> TResult n(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.a) {
            try {
                y();
                z();
                if (!cls.isInstance(this.f)) {
                    Exception exc = this.f;
                    if (exc == null) {
                        tresult = (TResult) this.e;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw cls.cast(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // defpackage.y6b
    public final boolean o() {
        return this.d;
    }

    @Override // defpackage.y6b
    public final boolean p() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.y6b
    public final boolean q() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.y6b
    @NonNull
    public final <TContinuationResult> y6b<TContinuationResult> r(@NonNull r1b<TResult, TContinuationResult> r1bVar) {
        Executor executor = g7b.a;
        rbd rbdVar = new rbd();
        this.b.a(new x7d(executor, r1bVar, rbdVar));
        B();
        return rbdVar;
    }

    @Override // defpackage.y6b
    @NonNull
    public final <TContinuationResult> y6b<TContinuationResult> s(Executor executor, r1b<TResult, TContinuationResult> r1bVar) {
        rbd rbdVar = new rbd();
        this.b.a(new x7d(executor, r1bVar, rbdVar));
        B();
        return rbdVar;
    }

    public final void t(@NonNull Exception exc) {
        gh8.k(exc, "Exception must not be null");
        synchronized (this.a) {
            A();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void u(Object obj) {
        synchronized (this.a) {
            A();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean v() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean w(@NonNull Exception exc) {
        gh8.k(exc, "Exception must not be null");
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean x(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
