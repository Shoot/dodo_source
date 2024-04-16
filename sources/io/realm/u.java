package io.realm;

import io.realm.internal.OsList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public abstract class u<T> {
    final a a;
    final OsList b;
    final Class<T> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(a aVar, OsList osList, Class<T> cls) {
        this.a = aVar;
        this.c = cls;
        this.b = osList;
    }

    private void b() {
        this.b.h();
    }

    public final void a(Object obj) {
        e(obj);
        if (obj == null) {
            b();
        } else {
            c(obj);
        }
    }

    protected abstract void c(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i) {
        int r = r();
        if (i >= 0 && r >= i) {
            return;
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.b.X());
    }

    protected abstract void e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.b.q();
    }

    public abstract T g(int i);

    public final void h(int i, T t) {
        e(t);
        if (t == null) {
            i(i);
        } else {
            j(i, t);
        }
    }

    protected void i(int i) {
        this.b.A(i);
    }

    protected abstract void j(int i, Object obj);

    public final boolean k() {
        return this.b.G();
    }

    public final boolean l() {
        return this.b.H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i) {
        this.b.I(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        this.b.J();
    }

    public final T o(int i, Object obj) {
        e(obj);
        T g = g(i);
        if (obj == null) {
            p(i);
        } else {
            q(i, obj);
        }
        return g;
    }

    protected void p(int i) {
        this.b.R(i);
    }

    protected abstract void q(int i, Object obj);

    public final int r() {
        long X = this.b.X();
        if (X < 2147483647L) {
            return (int) X;
        }
        return Integer.MAX_VALUE;
    }
}
