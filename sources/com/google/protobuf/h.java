package com.google.protobuf;

import com.google.protobuf.h1;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
public final class h implements v0 {
    private final g a;
    private int b;
    private int c;
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedInputStreamReader.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h1.b.values().length];
            a = iArr;
            try {
                iArr[h1.b.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h1.b.n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h1.b.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h1.b.p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[h1.b.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[h1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[h1.b.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h1.b.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h1.b.e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[h1.b.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[h1.b.q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[h1.b.r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[h1.b.s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[h1.b.t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[h1.b.k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[h1.b.o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[h1.b.f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private h(g gVar) {
        g gVar2 = (g) w.b(gVar, "input");
        this.a = gVar2;
        gVar2.d = this;
    }

    public static h Q(g gVar) {
        h hVar = gVar.d;
        if (hVar != null) {
            return hVar;
        }
        return new h(gVar);
    }

    private <T> void R(T t, w0<T> w0Var, m mVar) throws IOException {
        int i = this.c;
        this.c = h1.c(h1.a(this.b), 4);
        try {
            w0Var.i(t, this, mVar);
            if (this.b == this.c) {
                return;
            }
            throw InvalidProtocolBufferException.j();
        } finally {
            this.c = i;
        }
    }

    private <T> void S(T t, w0<T> w0Var, m mVar) throws IOException {
        g gVar;
        int A = this.a.A();
        g gVar2 = this.a;
        if (gVar2.a < gVar2.b) {
            int j = gVar2.j(A);
            this.a.a++;
            w0Var.i(t, this, mVar);
            this.a.a(0);
            gVar.a--;
            this.a.i(j);
            return;
        }
        throw InvalidProtocolBufferException.k();
    }

    private Object T(h1.b bVar, Class<?> cls, m mVar) throws IOException {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return N(cls, mVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T U(w0<T> w0Var, m mVar) throws IOException {
        T e = w0Var.e();
        R(e, w0Var, mVar);
        w0Var.b(e);
        return e;
    }

    private <T> T V(w0<T> w0Var, m mVar) throws IOException {
        T e = w0Var.e();
        S(e, w0Var, mVar);
        w0Var.b(e);
        return e;
    }

    private void X(int i) throws IOException {
        if (this.a.d() == i) {
            return;
        }
        throw InvalidProtocolBufferException.m();
    }

    private void Y(int i) throws IOException {
        if (h1.b(this.b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    private void Z(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.j();
    }

    private void a0(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.j();
    }

    @Override // com.google.protobuf.v0
    public int A() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.z();
        }
        int i2 = this.b;
        if (i2 != 0 && i2 != this.c) {
            return h1.a(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.v0
    public void B(List<String> list) throws IOException {
        W(list, false);
    }

    @Override // com.google.protobuf.v0
    public void C(List<Float> list) throws IOException {
        int z;
        int z2;
        if (list instanceof s) {
            s sVar = (s) list;
            int b = h1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        sVar.g(this.a.q());
                        if (this.a.e()) {
                            return;
                        }
                        z2 = this.a.z();
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            int A = this.a.A();
            Z(A);
            int d = this.a.d() + A;
            do {
                sVar.g(this.a.q());
            } while (this.a.d() < d);
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.q()));
                    if (this.a.e()) {
                        return;
                    }
                    z = this.a.z();
                } while (z == this.b);
                this.d = z;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        int A2 = this.a.A();
        Z(A2);
        int d2 = this.a.d() + A2;
        do {
            list.add(Float.valueOf(this.a.q()));
        } while (this.a.d() < d2);
    }

    @Override // com.google.protobuf.v0
    public boolean D() throws IOException {
        int i;
        if (!this.a.e() && (i = this.b) != this.c) {
            return this.a.C(i);
        }
        return false;
    }

    @Override // com.google.protobuf.v0
    public int E() throws IOException {
        Y(5);
        return this.a.t();
    }

    @Override // com.google.protobuf.v0
    public void F(List<f> list) throws IOException {
        int z;
        if (h1.b(this.b) == 2) {
            do {
                list.add(o());
                if (this.a.e()) {
                    return;
                }
                z = this.a.z();
            } while (z == this.b);
            this.d = z;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.v0
    public void G(List<Double> list) throws IOException {
        int z;
        int z2;
        if (list instanceof j) {
            j jVar = (j) list;
            int b = h1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int A = this.a.A();
                    a0(A);
                    int d = this.a.d() + A;
                    do {
                        jVar.g(this.a.m());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                jVar.g(this.a.m());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d2 = this.a.d() + A2;
                do {
                    list.add(Double.valueOf(this.a.m()));
                } while (this.a.d() < d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Double.valueOf(this.a.m()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public long H() throws IOException {
        Y(0);
        return this.a.s();
    }

    @Override // com.google.protobuf.v0
    public String I() throws IOException {
        Y(2);
        return this.a.y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.v0
    @Deprecated
    public <T> void J(List<T> list, w0<T> w0Var, m mVar) throws IOException {
        int z;
        if (h1.b(this.b) == 3) {
            int i = this.b;
            do {
                list.add(U(w0Var, mVar));
                if (!this.a.e() && this.d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i);
            this.d = z;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.v0
    public <T> void K(List<T> list, w0<T> w0Var, m mVar) throws IOException {
        int z;
        if (h1.b(this.b) == 2) {
            int i = this.b;
            do {
                list.add(V(w0Var, mVar));
                if (!this.a.e() && this.d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i);
            this.d = z;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.v0
    @Deprecated
    public <T> T L(Class<T> cls, m mVar) throws IOException {
        Y(3);
        return (T) U(s0.a().c(cls), mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.a.i(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void M(java.util.Map<K, V> r8, com.google.protobuf.d0.a<K, V> r9, com.google.protobuf.m r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.g r1 = r7.a
            int r1 = r1.A()
            com.google.protobuf.g r2 = r7.a
            int r1 = r2.j(r1)
            K r2 = r9.b
            V r3 = r9.d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.g r5 = r7.a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.h1$b r4 = r9.c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            com.google.protobuf.h1$b r4 = r9.a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.g r8 = r7.a
            r8.i(r1)
            return
        L67:
            com.google.protobuf.g r9 = r7.a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h.M(java.util.Map, com.google.protobuf.d0$a, com.google.protobuf.m):void");
    }

    @Override // com.google.protobuf.v0
    public <T> T N(Class<T> cls, m mVar) throws IOException {
        Y(2);
        return (T) V(s0.a().c(cls), mVar);
    }

    @Override // com.google.protobuf.v0
    public <T> void O(T t, w0<T> w0Var, m mVar) throws IOException {
        Y(3);
        R(t, w0Var, mVar);
    }

    @Override // com.google.protobuf.v0
    public <T> void P(T t, w0<T> w0Var, m mVar) throws IOException {
        Y(2);
        S(t, w0Var, mVar);
    }

    public void W(List<String> list, boolean z) throws IOException {
        String z2;
        int z3;
        int z4;
        if (h1.b(this.b) == 2) {
            if ((list instanceof do5) && !z) {
                do5 do5Var = (do5) list;
                do {
                    do5Var.L(o());
                    if (this.a.e()) {
                        return;
                    }
                    z4 = this.a.z();
                } while (z4 == this.b);
                this.d = z4;
                return;
            }
            do {
                if (z) {
                    z2 = I();
                } else {
                    z2 = z();
                }
                list.add(z2);
                if (this.a.e()) {
                    return;
                }
                z3 = this.a.z();
            } while (z3 == this.b);
            this.d = z3;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.v0
    public int a() {
        return this.b;
    }

    @Override // com.google.protobuf.v0
    public long b() throws IOException {
        Y(1);
        return this.a.p();
    }

    @Override // com.google.protobuf.v0
    public void c(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b = h1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        vVar.S0(this.a.t());
                        if (this.a.e()) {
                            return;
                        }
                        z2 = this.a.z();
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            int A = this.a.A();
            Z(A);
            int d = this.a.d() + A;
            do {
                vVar.S0(this.a.t());
            } while (this.a.d() < d);
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (this.a.e()) {
                        return;
                    }
                    z = this.a.z();
                } while (z == this.b);
                this.d = z;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        int A2 = this.a.A();
        Z(A2);
        int d2 = this.a.d() + A2;
        do {
            list.add(Integer.valueOf(this.a.t()));
        } while (this.a.d() < d2);
    }

    @Override // com.google.protobuf.v0
    public void d(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        b0Var.h(this.a.w());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                b0Var.h(this.a.w());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.a.w()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public boolean e() throws IOException {
        Y(0);
        return this.a.k();
    }

    @Override // com.google.protobuf.v0
    public long f() throws IOException {
        Y(1);
        return this.a.u();
    }

    @Override // com.google.protobuf.v0
    public void g(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        b0Var.h(this.a.B());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                b0Var.h(this.a.B());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.B()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.a.B()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public int h() throws IOException {
        Y(0);
        return this.a.A();
    }

    @Override // com.google.protobuf.v0
    public void i(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        b0Var.h(this.a.s());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                b0Var.h(this.a.s());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.a.s()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public void j(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        vVar.S0(this.a.n());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                vVar.S0(this.a.n());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.a.n()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public int k() throws IOException {
        Y(0);
        return this.a.n();
    }

    @Override // com.google.protobuf.v0
    public int l() throws IOException {
        Y(0);
        return this.a.v();
    }

    @Override // com.google.protobuf.v0
    public void m(List<Boolean> list) throws IOException {
        int z;
        int z2;
        if (list instanceof e) {
            e eVar = (e) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        eVar.h(this.a.k());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                eVar.h(this.a.k());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Boolean.valueOf(this.a.k()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public void n(List<String> list) throws IOException {
        W(list, true);
    }

    @Override // com.google.protobuf.v0
    public f o() throws IOException {
        Y(2);
        return this.a.l();
    }

    @Override // com.google.protobuf.v0
    public int p() throws IOException {
        Y(0);
        return this.a.r();
    }

    @Override // com.google.protobuf.v0
    public void q(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b = h1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int A = this.a.A();
                    a0(A);
                    int d = this.a.d() + A;
                    do {
                        b0Var.h(this.a.p());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                b0Var.h(this.a.p());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d2 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.d() < d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.a.p()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public void r(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        vVar.S0(this.a.v());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                vVar.S0(this.a.v());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.a.v()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public double readDouble() throws IOException {
        Y(1);
        return this.a.m();
    }

    @Override // com.google.protobuf.v0
    public float readFloat() throws IOException {
        Y(5);
        return this.a.q();
    }

    @Override // com.google.protobuf.v0
    public long s() throws IOException {
        Y(0);
        return this.a.B();
    }

    @Override // com.google.protobuf.v0
    public void t(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        vVar.S0(this.a.A());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                vVar.S0(this.a.A());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.A()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.a.A()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public int u() throws IOException {
        Y(5);
        return this.a.o();
    }

    @Override // com.google.protobuf.v0
    public void v(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b = h1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int A = this.a.A();
                    a0(A);
                    int d = this.a.d() + A;
                    do {
                        b0Var.h(this.a.u());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                b0Var.h(this.a.u());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d2 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.d() < d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.a.u()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public void w(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b = h1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        vVar.S0(this.a.r());
                    } while (this.a.d() < d);
                    X(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                vVar.S0(this.a.r());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.d() < d2);
                X(d2);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.a.r()));
            if (this.a.e()) {
                return;
            }
            z = this.a.z();
        } while (z == this.b);
        this.d = z;
    }

    @Override // com.google.protobuf.v0
    public void x(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b = h1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        vVar.S0(this.a.o());
                        if (this.a.e()) {
                            return;
                        }
                        z2 = this.a.z();
                    } while (z2 == this.b);
                    this.d = z2;
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            int A = this.a.A();
            Z(A);
            int d = this.a.d() + A;
            do {
                vVar.S0(this.a.o());
            } while (this.a.d() < d);
            return;
        }
        int b2 = h1.b(this.b);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (this.a.e()) {
                        return;
                    }
                    z = this.a.z();
                } while (z == this.b);
                this.d = z;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        int A2 = this.a.A();
        Z(A2);
        int d2 = this.a.d() + A2;
        do {
            list.add(Integer.valueOf(this.a.o()));
        } while (this.a.d() < d2);
    }

    @Override // com.google.protobuf.v0
    public long y() throws IOException {
        Y(0);
        return this.a.w();
    }

    @Override // com.google.protobuf.v0
    public String z() throws IOException {
        Y(2);
        return this.a.x();
    }
}
