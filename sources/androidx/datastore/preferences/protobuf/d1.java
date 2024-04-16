package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
abstract class d1<T, B> {
    abstract void a(B b, int i, int i2);

    abstract void b(B b, int i, long j);

    abstract void c(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(B b, int i, g gVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T k(T t, T t2);

    final void l(B b, w0 w0Var) throws IOException {
        while (w0Var.A() != Integer.MAX_VALUE && m(b, w0Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b, w0 w0Var) throws IOException {
        int a = w0Var.a();
        int a2 = i1.a(a);
        int b2 = i1.b(a);
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            if (b2 == 5) {
                                a(b, a2, w0Var.u());
                                return true;
                            }
                            throw InvalidProtocolBufferException.d();
                        }
                        return false;
                    }
                    B n = n();
                    int c = i1.c(a2, 4);
                    l(n, w0Var);
                    if (c == w0Var.a()) {
                        c(b, a2, r(n));
                        return true;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                d(b, a2, w0Var.o());
                return true;
            }
            b(b, a2, w0Var.b());
            return true;
        }
        e(b, a2, w0Var.H());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(w0 w0Var);

    abstract T r(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(T t, j1 j1Var) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(T t, j1 j1Var) throws IOException;
}
