package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
class f1 extends d1<e1, e1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: A */
    public e1 g(Object obj) {
        return ((v) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: B */
    public int h(e1 e1Var) {
        return e1Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: C */
    public int i(e1 e1Var) {
        return e1Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: D */
    public e1 k(e1 e1Var, e1 e1Var2) {
        if (!e1Var2.equals(e1.e())) {
            return e1.k(e1Var, e1Var2);
        }
        return e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: E */
    public e1 n() {
        return e1.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: F */
    public void o(Object obj, e1 e1Var) {
        p(obj, e1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: G */
    public void p(Object obj, e1 e1Var) {
        ((v) obj).unknownFields = e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: H */
    public e1 r(e1 e1Var) {
        e1Var.j();
        return e1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: I */
    public void s(e1 e1Var, j1 j1Var) throws IOException {
        e1Var.o(j1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: J */
    public void t(e1 e1Var, j1 j1Var) throws IOException {
        e1Var.q(j1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    public void j(Object obj) {
        g(obj).j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    public boolean q(w0 w0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: u */
    public void a(e1 e1Var, int i, int i2) {
        e1Var.n(i1.c(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: v */
    public void b(e1 e1Var, int i, long j) {
        e1Var.n(i1.c(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: w */
    public void c(e1 e1Var, int i, e1 e1Var2) {
        e1Var.n(i1.c(i, 3), e1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: x */
    public void d(e1 e1Var, int i, g gVar) {
        e1Var.n(i1.c(i, 2), gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: y */
    public void e(e1 e1Var, int i, long j) {
        e1Var.n(i1.c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.d1
    /* renamed from: z */
    public e1 f(Object obj) {
        e1 g = g(obj);
        if (g == e1.e()) {
            e1 l = e1.l();
            p(obj, l);
            return l;
        }
        return g;
    }
}
