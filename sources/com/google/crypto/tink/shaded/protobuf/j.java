package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.f0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes2.dex */
public final class j implements x0 {
    private final i a;
    private int b;
    private int c;
    private int d = 0;

    private j(i iVar) {
        i iVar2 = (i) y.b(iVar, "input");
        this.a = iVar2;
        iVar2.d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.d;
        if (jVar != null) {
            return jVar;
        }
        return new j(iVar);
    }

    private <T> T R(y0<T> y0Var, o oVar) throws IOException {
        int i = this.c;
        this.c = j1.c(j1.a(this.b), 4);
        try {
            T e = y0Var.e();
            y0Var.i(e, this, oVar);
            y0Var.b(e);
            if (this.b == this.c) {
                return e;
            }
            throw InvalidProtocolBufferException.j();
        } finally {
            this.c = i;
        }
    }

    private <T> T S(y0<T> y0Var, o oVar) throws IOException {
        i iVar;
        int A = this.a.A();
        i iVar2 = this.a;
        if (iVar2.a < iVar2.b) {
            int j = iVar2.j(A);
            T e = y0Var.e();
            this.a.a++;
            y0Var.i(e, this, oVar);
            y0Var.b(e);
            this.a.a(0);
            iVar.a--;
            this.a.i(j);
            return e;
        }
        throw InvalidProtocolBufferException.k();
    }

    private void U(int i) throws IOException {
        if (this.a.d() == i) {
            return;
        }
        throw InvalidProtocolBufferException.m();
    }

    private void V(int i) throws IOException {
        if (j1.b(this.b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    private void W(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.j();
    }

    private void X(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
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
            return j1.a(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void B(List<String> list) throws IOException {
        T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void C(List<Float> list) throws IOException {
        int z;
        int z2;
        if (list instanceof u) {
            u uVar = (u) list;
            int b = j1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        uVar.g(this.a.q());
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
            W(A);
            int d = this.a.d() + A;
            do {
                uVar.g(this.a.q());
            } while (this.a.d() < d);
            return;
        }
        int b2 = j1.b(this.b);
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
        W(A2);
        int d2 = this.a.d() + A2;
        do {
            list.add(Float.valueOf(this.a.q()));
        } while (this.a.d() < d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public boolean D() throws IOException {
        int i;
        if (!this.a.e() && (i = this.b) != this.c) {
            return this.a.C(i);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public int E() throws IOException {
        V(5);
        return this.a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void F(List<h> list) throws IOException {
        int z;
        if (j1.b(this.b) == 2) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void G(List<Double> list) throws IOException {
        int z;
        int z2;
        if (list instanceof l) {
            l lVar = (l) list;
            int b = j1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int A = this.a.A();
                    X(A);
                    int d = this.a.d() + A;
                    do {
                        lVar.g(this.a.m());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                lVar.g(this.a.m());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int A2 = this.a.A();
                X(A2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public long H() throws IOException {
        V(0);
        return this.a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public String I() throws IOException {
        V(2);
        return this.a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public <T> T J(y0<T> y0Var, o oVar) throws IOException {
        V(3);
        return (T) R(y0Var, oVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public <T> T K(Class<T> cls, o oVar) throws IOException {
        V(3);
        return (T) R(u0.a().d(cls), oVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public <K, V> void L(Map<K, V> map, f0.a<K, V> aVar, o oVar) throws IOException {
        V(2);
        this.a.j(this.a.A());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public <T> void M(List<T> list, y0<T> y0Var, o oVar) throws IOException {
        int z;
        if (j1.b(this.b) == 2) {
            int i = this.b;
            do {
                list.add(S(y0Var, oVar));
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public <T> T N(y0<T> y0Var, o oVar) throws IOException {
        V(2);
        return (T) S(y0Var, oVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public <T> T O(Class<T> cls, o oVar) throws IOException {
        V(2);
        return (T) S(u0.a().d(cls), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public <T> void P(List<T> list, y0<T> y0Var, o oVar) throws IOException {
        int z;
        if (j1.b(this.b) == 3) {
            int i = this.b;
            do {
                list.add(R(y0Var, oVar));
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

    public void T(List<String> list, boolean z) throws IOException {
        String z2;
        int z3;
        int z4;
        if (j1.b(this.b) == 2) {
            if ((list instanceof co5) && !z) {
                co5 co5Var = (co5) list;
                do {
                    co5Var.E1(o());
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public int a() {
        return this.b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public long b() throws IOException {
        V(1);
        return this.a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void c(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b = j1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        xVar.S0(this.a.t());
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
            W(A);
            int d = this.a.d() + A;
            do {
                xVar.S0(this.a.t());
            } while (this.a.d() < d);
            return;
        }
        int b2 = j1.b(this.b);
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
        W(A2);
        int d2 = this.a.d() + A2;
        do {
            list.add(Integer.valueOf(this.a.t()));
        } while (this.a.d() < d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void d(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        d0Var.h(this.a.w());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                d0Var.h(this.a.w());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public boolean e() throws IOException {
        V(0);
        return this.a.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public long f() throws IOException {
        V(1);
        return this.a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void g(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        d0Var.h(this.a.B());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                d0Var.h(this.a.B());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.B()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public int h() throws IOException {
        V(0);
        return this.a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void i(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        d0Var.h(this.a.s());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                d0Var.h(this.a.s());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void j(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        xVar.S0(this.a.n());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                xVar.S0(this.a.n());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public int k() throws IOException {
        V(0);
        return this.a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public int l() throws IOException {
        V(0);
        return this.a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void m(List<Boolean> list) throws IOException {
        int z;
        int z2;
        if (list instanceof g) {
            g gVar = (g) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        gVar.h(this.a.k());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                gVar.h(this.a.k());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void n(List<String> list) throws IOException {
        T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public h o() throws IOException {
        V(2);
        return this.a.l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public int p() throws IOException {
        V(0);
        return this.a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void q(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int b = j1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int A = this.a.A();
                    X(A);
                    int d = this.a.d() + A;
                    do {
                        d0Var.h(this.a.p());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                d0Var.h(this.a.p());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int A2 = this.a.A();
                X(A2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void r(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        xVar.S0(this.a.v());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                xVar.S0(this.a.v());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public double readDouble() throws IOException {
        V(1);
        return this.a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public float readFloat() throws IOException {
        V(5);
        return this.a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public long s() throws IOException {
        V(0);
        return this.a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void t(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        xVar.S0(this.a.A());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                xVar.S0(this.a.A());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.A()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public int u() throws IOException {
        V(5);
        return this.a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void v(List<Long> list) throws IOException {
        int z;
        int z2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int b = j1.b(this.b);
            if (b != 1) {
                if (b == 2) {
                    int A = this.a.A();
                    X(A);
                    int d = this.a.d() + A;
                    do {
                        d0Var.h(this.a.u());
                    } while (this.a.d() < d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                d0Var.h(this.a.u());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 1) {
            if (b2 == 2) {
                int A2 = this.a.A();
                X(A2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void w(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b = j1.b(this.b);
            if (b != 0) {
                if (b == 2) {
                    int d = this.a.d() + this.a.A();
                    do {
                        xVar.S0(this.a.r());
                    } while (this.a.d() < d);
                    U(d);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                xVar.S0(this.a.r());
                if (this.a.e()) {
                    return;
                }
                z2 = this.a.z();
            } while (z2 == this.b);
            this.d = z2;
            return;
        }
        int b2 = j1.b(this.b);
        if (b2 != 0) {
            if (b2 == 2) {
                int d2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.d() < d2);
                U(d2);
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

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public void x(List<Integer> list) throws IOException {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b = j1.b(this.b);
            if (b != 2) {
                if (b == 5) {
                    do {
                        xVar.S0(this.a.o());
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
            W(A);
            int d = this.a.d() + A;
            do {
                xVar.S0(this.a.o());
            } while (this.a.d() < d);
            return;
        }
        int b2 = j1.b(this.b);
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
        W(A2);
        int d2 = this.a.d() + A2;
        do {
            list.add(Integer.valueOf(this.a.o()));
        } while (this.a.d() < d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public long y() throws IOException {
        V(0);
        return this.a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.x0
    public String z() throws IOException {
        V(2);
        return this.a.x();
    }
}
