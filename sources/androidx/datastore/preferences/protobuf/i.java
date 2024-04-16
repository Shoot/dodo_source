package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i1;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes.dex */
public final class i implements w0 {
    private final h a;
    private int b;
    private int c;
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedInputStreamReader.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i1.b.values().length];
            a = iArr;
            try {
                iArr[i1.b.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i1.b.n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i1.b.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i1.b.p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i1.b.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[i1.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[i1.b.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[i1.b.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[i1.b.e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[i1.b.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[i1.b.q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[i1.b.r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[i1.b.s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[i1.b.t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[i1.b.k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[i1.b.o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[i1.b.f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i(h hVar) {
        h hVar2 = (h) x.b(hVar, "input");
        this.a = hVar2;
        hVar2.d = this;
    }

    public static i Q(h hVar) {
        i iVar = hVar.d;
        if (iVar != null) {
            return iVar;
        }
        return new i(hVar);
    }

    private Object R(i1.b bVar, Class<?> cls, n nVar) throws IOException {
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
                return M(cls, nVar);
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
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(x0<T> x0Var, n nVar) throws IOException {
        int i = this.c;
        this.c = i1.c(i1.a(this.b), 4);
        try {
            T e = x0Var.e();
            x0Var.h(e, this, nVar);
            x0Var.b(e);
            if (this.b == this.c) {
                return e;
            }
            throw InvalidProtocolBufferException.i();
        } finally {
            this.c = i;
        }
    }

    private <T> T T(x0<T> x0Var, n nVar) throws IOException {
        h hVar;
        int C = this.a.C();
        h hVar2 = this.a;
        if (hVar2.a < hVar2.b) {
            int l = hVar2.l(C);
            T e = x0Var.e();
            this.a.a++;
            x0Var.h(e, this, nVar);
            x0Var.b(e);
            this.a.a(0);
            hVar.a--;
            this.a.k(l);
            return e;
        }
        throw InvalidProtocolBufferException.j();
    }

    private void V(int i) throws IOException {
        if (this.a.d() == i) {
            return;
        }
        throw InvalidProtocolBufferException.m();
    }

    private void W(int i) throws IOException {
        if (i1.b(this.b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    private void X(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.i();
    }

    private void Y(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.i();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int A() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        int i2 = this.b;
        if (i2 != 0 && i2 != this.c) {
            return i1.a(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void B(List<String> list) throws IOException {
        U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void C(List<Float> list) throws IOException {
        int B;
        int B2;
        if (list instanceof t) {
            t tVar = (t) list;
            int b = i1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        tVar.g(this.a.s());
                        if (this.a.e()) {
                            return;
                        }
                        B2 = this.a.B();
                    } while (B2 == this.b);
                    this.d = B2;
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            int C = this.a.C();
            X(C);
            int d = this.a.d() + C;
            do {
                tVar.g(this.a.s());
            } while (this.a.d() < d);
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.s()));
                    if (this.a.e()) {
                        return;
                    }
                    B = this.a.B();
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        int C2 = this.a.C();
        X(C2);
        int d2 = this.a.d() + C2;
        do {
            list.add(Float.valueOf(this.a.s()));
        } while (this.a.d() < d2);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public boolean D() throws IOException {
        int i;
        if (!this.a.e() && (i = this.b) != this.c) {
            return this.a.E(i);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int E() throws IOException {
        W(5);
        return this.a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void F(List<g> list) throws IOException {
        int B;
        if (i1.b(this.b) == 2) {
            do {
                list.add(o());
                if (this.a.e()) {
                    return;
                }
                B = this.a.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void G(List<Double> list) throws IOException {
        int B;
        int B2;
        if (list instanceof k) {
            k kVar = (k) list;
            int b = i1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int C = this.a.C();
                    Y(C);
                    int d = this.a.d() + C;
                    do {
                        kVar.g(this.a.o());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                kVar.g(this.a.o());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int C2 = this.a.C();
                Y(C2);
                int d2 = this.a.d() + C2;
                do {
                    list.add(Double.valueOf(this.a.o()));
                } while (this.a.d() < d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Double.valueOf(this.a.o()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public long H() throws IOException {
        W(0);
        return this.a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public String I() throws IOException {
        W(2);
        return this.a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public <T> T J(x0<T> x0Var, n nVar) throws IOException {
        W(2);
        return (T) T(x0Var, nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.w0
    public <T> void K(List<T> list, x0<T> x0Var, n nVar) throws IOException {
        int B;
        if (i1.b(this.b) == 2) {
            int i = this.b;
            do {
                list.add(T(x0Var, nVar));
                if (!this.a.e() && this.d == 0) {
                    B = this.a.B();
                } else {
                    return;
                }
            } while (B == i);
            this.d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public <T> T L(x0<T> x0Var, n nVar) throws IOException {
        W(3);
        return (T) S(x0Var, nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public <T> T M(Class<T> cls, n nVar) throws IOException {
        W(2);
        return (T) T(t0.a().d(cls), nVar);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public <T> T N(Class<T> cls, n nVar) throws IOException {
        W(3);
        return (T) S(t0.a().d(cls), nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        r7.a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void O(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.e0.a<K, V> r9, androidx.datastore.preferences.protobuf.n r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.a
            int r1 = r2.l(r1)
            K r2 = r9.b
            V r3 = r9.d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.h r5 = r7.a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.i1$b r4 = r9.c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.i1$b r4 = r9.a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.h r8 = r7.a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.h r9 = r7.a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.O(java.util.Map, androidx.datastore.preferences.protobuf.e0$a, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.w0
    public <T> void P(List<T> list, x0<T> x0Var, n nVar) throws IOException {
        int B;
        if (i1.b(this.b) == 3) {
            int i = this.b;
            do {
                list.add(S(x0Var, nVar));
                if (!this.a.e() && this.d == 0) {
                    B = this.a.B();
                } else {
                    return;
                }
            } while (B == i);
            this.d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public void U(List<String> list, boolean z) throws IOException {
        String z2;
        int B;
        int B2;
        if (i1.b(this.b) == 2) {
            if ((list instanceof eo5) && !z) {
                eo5 eo5Var = (eo5) list;
                do {
                    eo5Var.Y0(o());
                    if (this.a.e()) {
                        return;
                    }
                    B2 = this.a.B();
                } while (B2 == this.b);
                this.d = B2;
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
                B = this.a.B();
            } while (B == this.b);
            this.d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int a() {
        return this.b;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public long b() throws IOException {
        W(1);
        return this.a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void c(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b = i1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        wVar.S0(this.a.v());
                        if (this.a.e()) {
                            return;
                        }
                        B2 = this.a.B();
                    } while (B2 == this.b);
                    this.d = B2;
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            int C = this.a.C();
            X(C);
            int d = this.a.d() + C;
            do {
                wVar.S0(this.a.v());
            } while (this.a.d() < d);
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (this.a.e()) {
                        return;
                    }
                    B = this.a.B();
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        int C2 = this.a.C();
        X(C2);
        int d2 = this.a.d() + C2;
        do {
            list.add(Integer.valueOf(this.a.v()));
        } while (this.a.d() < d2);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void d(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        c0Var.h(this.a.y());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                c0Var.h(this.a.y());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Long.valueOf(this.a.y()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(this.a.y()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public boolean e() throws IOException {
        W(0);
        return this.a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public long f() throws IOException {
        W(1);
        return this.a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void g(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        c0Var.h(this.a.D());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                c0Var.h(this.a.D());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Long.valueOf(this.a.D()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(this.a.D()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int h() throws IOException {
        W(0);
        return this.a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void i(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        c0Var.h(this.a.u());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                c0Var.h(this.a.u());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(this.a.u()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void j(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        wVar.S0(this.a.p());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                wVar.S0(this.a.p());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.p()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.a.p()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int k() throws IOException {
        W(0);
        return this.a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int l() throws IOException {
        W(0);
        return this.a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void m(List<Boolean> list) throws IOException {
        int B;
        int B2;
        if (list instanceof f) {
            f fVar = (f) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        fVar.h(this.a.m());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                fVar.h(this.a.m());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Boolean.valueOf(this.a.m()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Boolean.valueOf(this.a.m()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void n(List<String> list) throws IOException {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public g o() throws IOException {
        W(2);
        return this.a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int p() throws IOException {
        W(0);
        return this.a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void q(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b = i1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int C = this.a.C();
                    Y(C);
                    int d = this.a.d() + C;
                    do {
                        c0Var.h(this.a.r());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                c0Var.h(this.a.r());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int C2 = this.a.C();
                Y(C2);
                int d2 = this.a.d() + C2;
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.d() < d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(this.a.r()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void r(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        wVar.S0(this.a.x());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                wVar.S0(this.a.x());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.x()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.a.x()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public double readDouble() throws IOException {
        W(1);
        return this.a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public float readFloat() throws IOException {
        W(5);
        return this.a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public long s() throws IOException {
        W(0);
        return this.a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void t(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        wVar.S0(this.a.C());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                wVar.S0(this.a.C());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.C()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.a.C()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public int u() throws IOException {
        W(5);
        return this.a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void v(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b = i1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int C = this.a.C();
                    Y(C);
                    int d = this.a.d() + C;
                    do {
                        c0Var.h(this.a.w());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                c0Var.h(this.a.w());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int C2 = this.a.C();
                Y(C2);
                int d2 = this.a.d() + C2;
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.d() < d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Long.valueOf(this.a.w()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void w(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b = i1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.C();
                    do {
                        wVar.S0(this.a.t());
                    } while (this.a.d() < d);
                    V(d);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                wVar.S0(this.a.t());
                if (this.a.e()) {
                    return;
                }
                B2 = this.a.B();
            } while (B2 == this.b);
            this.d = B2;
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.C();
                do {
                    list.add(Integer.valueOf(this.a.t()));
                } while (this.a.d() < d2);
                V(d2);
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(this.a.t()));
            if (this.a.e()) {
                return;
            }
            B = this.a.B();
        } while (B == this.b);
        this.d = B;
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public void x(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b = i1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        wVar.S0(this.a.q());
                        if (this.a.e()) {
                            return;
                        }
                        B2 = this.a.B();
                    } while (B2 == this.b);
                    this.d = B2;
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            int C = this.a.C();
            X(C);
            int d = this.a.d() + C;
            do {
                wVar.S0(this.a.q());
            } while (this.a.d() < d);
            return;
        }
        int b2 = i1.b(this.b);
        if (b2 != 2) {
            if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (this.a.e()) {
                        return;
                    }
                    B = this.a.B();
                } while (B == this.b);
                this.d = B;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }
        int C2 = this.a.C();
        X(C2);
        int d2 = this.a.d() + C2;
        do {
            list.add(Integer.valueOf(this.a.q()));
        } while (this.a.d() < d2);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public long y() throws IOException {
        W(0);
        return this.a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public String z() throws IOException {
        W(2);
        return this.a.z();
    }
}
