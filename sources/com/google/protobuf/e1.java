package com.google.protobuf;

import java.io.IOException;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
class e1 extends c1<d1, d1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: A */
    public d1 g(Object obj) {
        return ((u) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: B */
    public int h(d1 d1Var) {
        return d1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: C */
    public int i(d1 d1Var) {
        return d1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: D */
    public d1 k(d1 d1Var, d1 d1Var2) {
        if (d1.c().equals(d1Var2)) {
            return d1Var;
        }
        if (d1.c().equals(d1Var)) {
            return d1.j(d1Var, d1Var2);
        }
        return d1Var.i(d1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: E */
    public d1 n() {
        return d1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: F */
    public void o(Object obj, d1 d1Var) {
        p(obj, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: G */
    public void p(Object obj, d1 d1Var) {
        ((u) obj).unknownFields = d1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: H */
    public d1 r(d1 d1Var) {
        d1Var.h();
        return d1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: I */
    public void s(d1 d1Var, i1 i1Var) throws IOException {
        d1Var.p(i1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: J */
    public void t(d1 d1Var, i1 i1Var) throws IOException {
        d1Var.r(i1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    public void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    public boolean q(v0 v0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: u */
    public void a(d1 d1Var, int i, int i2) {
        d1Var.n(h1.c(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: v */
    public void b(d1 d1Var, int i, long j) {
        d1Var.n(h1.c(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: w */
    public void c(d1 d1Var, int i, d1 d1Var2) {
        d1Var.n(h1.c(i, 3), d1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: x */
    public void d(d1 d1Var, int i, f fVar) {
        d1Var.n(h1.c(i, 2), fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: y */
    public void e(d1 d1Var, int i, long j) {
        d1Var.n(h1.c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.c1
    /* renamed from: z */
    public d1 f(Object obj) {
        d1 g = g(obj);
        if (g == d1.c()) {
            d1 k = d1.k();
            p(obj, k);
            return k;
        }
        return g;
    }
}
