package defpackage;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: CallbackToFutureAdapter.java */
/* renamed from: nm0  reason: default package */
/* loaded from: classes.dex */
public final class nm0 {

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: nm0$a */
    /* loaded from: classes.dex */
    public static final class a<T> {
        Object a;
        d<T> b;
        private hj9<Void> c = hj9.E();
        private boolean d;

        a() {
        }

        private void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        void a() {
            this.a = null;
            this.b = null;
            this.c.A(null);
        }

        public boolean b(T t) {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.b(t)) ? false : false;
            if (z) {
                d();
            }
            return z;
        }

        public boolean c() {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.a(true)) ? false : false;
            if (z) {
                d();
            }
            return z;
        }

        public boolean e(@NonNull Throwable th) {
            boolean z = true;
            this.d = true;
            d<T> dVar = this.b;
            z = (dVar == null || !dVar.c(th)) ? false : false;
            if (z) {
                d();
            }
            return z;
        }

        protected void finalize() {
            hj9<Void> hj9Var;
            d<T> dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (!this.d && (hj9Var = this.c) != null) {
                hj9Var.A(null);
            }
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: nm0$b */
    /* loaded from: classes.dex */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: nm0$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        Object a(@NonNull a<T> aVar) throws Exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: nm0$d */
    /* loaded from: classes.dex */
    public static final class d<T> implements kr5<T> {
        final WeakReference<a<T>> a;
        private final c2<T> b = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        /* renamed from: nm0$d$a */
        /* loaded from: classes.dex */
        class a extends c2<T> {
            a() {
            }

            @Override // defpackage.c2
            protected String w() {
                a<T> aVar = d.this.a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + "]";
            }
        }

        d(a<T> aVar) {
            this.a = new WeakReference<>(aVar);
        }

        boolean a(boolean z) {
            return this.b.cancel(z);
        }

        boolean b(T t) {
            return this.b.A(t);
        }

        boolean c(Throwable th) {
            return this.b.B(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a<T> aVar = this.a.get();
            boolean cancel = this.b.cancel(z);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws InterruptedException, ExecutionException {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.b.isDone();
        }

        @Override // defpackage.kr5
        public void k(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.b.k(runnable, executor);
        }

        public String toString() {
            return this.b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.b.get(j, timeUnit);
        }
    }

    @NonNull
    public static <T> kr5<T> a(@NonNull c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.a = cVar.getClass();
        try {
            Object a2 = cVar.a(aVar);
            if (a2 != null) {
                aVar.a = a2;
            }
        } catch (Exception e) {
            dVar.c(e);
        }
        return dVar;
    }
}
