package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ObservableCreate.java */
/* renamed from: t57  reason: default package */
/* loaded from: classes3.dex */
public final class t57<T> extends r57<T> {
    final z57<T> a;

    /* compiled from: ObservableCreate.java */
    /* renamed from: t57$a */
    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<z33> implements u57<T>, z33 {
        final h67<? super T> a;

        a(h67<? super T> h67Var) {
            this.a = h67Var;
        }

        @Override // defpackage.z33
        public void a() {
            g43.k(this);
        }

        @Override // defpackage.u57
        public void b(z33 z33Var) {
            g43.u(this, z33Var);
        }

        public void c(Throwable th) {
            if (!e(th)) {
                tp9.q(th);
            }
        }

        @Override // defpackage.lf3
        public void d(T t) {
            if (t == null) {
                c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!i()) {
                this.a.d(t);
            }
        }

        public boolean e(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!i()) {
                try {
                    this.a.onError(th);
                    a();
                    return true;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
            return false;
        }

        @Override // defpackage.u57, defpackage.z33
        public boolean i() {
            return g43.o(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public t57(z57<T> z57Var) {
        this.a = z57Var;
    }

    @Override // defpackage.r57
    protected void r(h67<? super T> h67Var) {
        a aVar = new a(h67Var);
        h67Var.c(aVar);
        try {
            this.a.a(aVar);
        } catch (Throwable th) {
            rl3.b(th);
            aVar.c(th);
        }
    }
}
