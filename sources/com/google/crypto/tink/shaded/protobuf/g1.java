package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes2.dex */
class g1 extends e1<f1, f1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: A */
    public f1 g(Object obj) {
        return ((w) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: B */
    public int h(f1 f1Var) {
        return f1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: C */
    public int i(f1 f1Var) {
        return f1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: D */
    public f1 k(f1 f1Var, f1 f1Var2) {
        if (!f1Var2.equals(f1.c())) {
            return f1.i(f1Var, f1Var2);
        }
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: E */
    public f1 n() {
        return f1.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: F */
    public void o(Object obj, f1 f1Var) {
        p(obj, f1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: G */
    public void p(Object obj, f1 f1Var) {
        ((w) obj).unknownFields = f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: H */
    public f1 r(f1 f1Var) {
        f1Var.h();
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: I */
    public void s(f1 f1Var, k1 k1Var) throws IOException {
        f1Var.o(k1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: J */
    public void t(f1 f1Var, k1 k1Var) throws IOException {
        f1Var.q(k1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public boolean q(x0 x0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: u */
    public void a(f1 f1Var, int i, int i2) {
        f1Var.m(j1.c(i, 5), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: v */
    public void b(f1 f1Var, int i, long j) {
        f1Var.m(j1.c(i, 1), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: w */
    public void c(f1 f1Var, int i, f1 f1Var2) {
        f1Var.m(j1.c(i, 3), f1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: x */
    public void d(f1 f1Var, int i, h hVar) {
        f1Var.m(j1.c(i, 2), hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: y */
    public void e(f1 f1Var, int i, long j) {
        f1Var.m(j1.c(i, 0), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.e1
    /* renamed from: z */
    public f1 f(Object obj) {
        f1 g = g(obj);
        if (g == f1.c()) {
            f1 j = f1.j();
            p(obj, j);
            return j;
        }
        return g;
    }
}
