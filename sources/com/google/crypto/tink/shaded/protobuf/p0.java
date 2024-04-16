package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.t;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* loaded from: classes2.dex */
final class p0<T> implements y0<T> {
    private final m0 a;
    private final e1<?, ?> b;
    private final boolean c;
    private final p<?> d;

    private p0(e1<?, ?> e1Var, p<?> pVar, m0 m0Var) {
        this.b = e1Var;
        this.c = pVar.e(m0Var);
        this.d = pVar;
        this.a = m0Var;
    }

    private <UT, UB> int k(e1<UT, UB> e1Var, T t) {
        return e1Var.i(e1Var.g(t));
    }

    private <UT, UB, ET extends t.b<ET>> void l(e1<UT, UB> e1Var, p<ET> pVar, T t, x0 x0Var, o oVar) throws IOException {
        UB f = e1Var.f(t);
        t<ET> d = pVar.d(t);
        do {
            try {
                if (x0Var.A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                e1Var.o(t, f);
            }
        } while (n(x0Var, oVar, pVar, d, e1Var, f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> p0<T> m(e1<?, ?> e1Var, p<?> pVar, m0 m0Var) {
        return new p0<>(e1Var, pVar, m0Var);
    }

    private <UT, UB, ET extends t.b<ET>> boolean n(x0 x0Var, o oVar, p<ET> pVar, t<ET> tVar, e1<UT, UB> e1Var, UB ub) throws IOException {
        int a = x0Var.a();
        if (a != j1.a) {
            if (j1.b(a) == 2) {
                Object b = pVar.b(oVar, this.a, j1.a(a));
                if (b != null) {
                    pVar.h(x0Var, b, oVar, tVar);
                    return true;
                }
                return e1Var.m(ub, x0Var);
            }
            return x0Var.D();
        }
        Object obj = null;
        h hVar = null;
        int i = 0;
        while (x0Var.A() != Integer.MAX_VALUE) {
            int a2 = x0Var.a();
            if (a2 == j1.c) {
                i = x0Var.h();
                obj = pVar.b(oVar, this.a, i);
            } else if (a2 == j1.d) {
                if (obj != null) {
                    pVar.h(x0Var, obj, oVar, tVar);
                } else {
                    hVar = x0Var.o();
                }
            } else if (!x0Var.D()) {
                break;
            }
        }
        if (x0Var.a() == j1.b) {
            if (hVar != null) {
                if (obj != null) {
                    pVar.i(hVar, obj, oVar, tVar);
                } else {
                    e1Var.d(ub, i, hVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.b();
    }

    private <UT, UB> void o(e1<UT, UB> e1Var, T t, k1 k1Var) throws IOException {
        e1Var.s(e1Var.g(t), k1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void a(T t, T t2) {
        a1.G(this.b, t, t2);
        if (this.c) {
            a1.E(this.d, t, t2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void b(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public final boolean c(T t) {
        return this.d.c(t).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public int d(T t) {
        int k = k(this.b, t);
        if (this.c) {
            return k + this.d.c(t).j();
        }
        return k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public T e() {
        return (T) this.a.e().k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public int f(T t) {
        int hashCode = this.b.g(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.c(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public boolean g(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.e.b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.w r0 = (com.google.crypto.tink.shaded.protobuf.w) r0
            com.google.crypto.tink.shaded.protobuf.f1 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.f1 r2 = com.google.crypto.tink.shaded.protobuf.f1.c()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.f1 r1 = com.google.crypto.tink.shaded.protobuf.f1.j()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.w$c r11 = (com.google.crypto.tink.shaded.protobuf.w.c) r11
            com.google.crypto.tink.shaded.protobuf.t r11 = r11.L()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r13, r15)
            int r13 = r15.a
            int r3 = com.google.crypto.tink.shaded.protobuf.j1.a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.j1.b(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.p<?> r2 = r10.d
            com.google.crypto.tink.shaded.protobuf.o r3 = r15.d
            com.google.crypto.tink.shaded.protobuf.m0 r5 = r10.a
            int r6 = com.google.crypto.tink.shaded.protobuf.j1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.w$e r8 = (com.google.crypto.tink.shaded.protobuf.w.e) r8
            if (r8 == 0) goto L5c
            com.google.crypto.tink.shaded.protobuf.u0 r13 = com.google.crypto.tink.shaded.protobuf.u0.a()
            com.google.crypto.tink.shaded.protobuf.m0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.y0 r13 = r13.d(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.w$d r2 = r8.b
            java.lang.Object r3 = r15.c
            r11.w(r2, r3)
        L5a:
            r2 = r8
            goto L19
        L5c:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.e.G(r2, r3, r4, r5, r6, r7)
            goto L5a
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.e.N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r6 = r15.a
            int r7 = com.google.crypto.tink.shaded.protobuf.j1.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.j1.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.u0 r6 = com.google.crypto.tink.shaded.protobuf.u0.a()
            com.google.crypto.tink.shaded.protobuf.m0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.y0 r6 = r6.d(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.w$d r6 = r2.b
            java.lang.Object r7 = r15.c
            r11.w(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r15)
            java.lang.Object r3 = r15.c
            com.google.crypto.tink.shaded.protobuf.h r3 = (com.google.crypto.tink.shaded.protobuf.h) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r13 = r15.a
            com.google.crypto.tink.shaded.protobuf.p<?> r2 = r10.d
            com.google.crypto.tink.shaded.protobuf.o r6 = r15.d
            com.google.crypto.tink.shaded.protobuf.m0 r7 = r10.a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.w$e r2 = (com.google.crypto.tink.shaded.protobuf.w.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.j1.b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.e.N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.j1.c(r13, r5)
            r1.m(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r11 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.j()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void i(T t, x0 x0Var, o oVar) throws IOException {
        l(this.b, this.d, t, x0Var, oVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y0
    public void j(T t, k1 k1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> r = this.d.c(t).r();
        while (r.hasNext()) {
            Map.Entry<?, Object> next = r.next();
            t.b bVar = (t.b) next.getKey();
            if (bVar.m() == j1.c.MESSAGE && !bVar.j() && !bVar.n()) {
                if (next instanceof z.b) {
                    k1Var.b(bVar.e(), ((z.b) next).a().e());
                } else {
                    k1Var.b(bVar.e(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        o(this.b, t, k1Var);
    }
}
