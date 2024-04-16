package com.google.protobuf;

import com.google.protobuf.g1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class CodedOutputStream extends gk0 {
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean d = f1.E();
    i a;
    private boolean b;

    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends CodedOutputStream {
        private final byte[] e;
        private final int f;
        private final int g;
        private int h;

        b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.e = bArr;
                    this.f = i;
                    this.h = i;
                    this.g = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void A0(int i, int i2) throws IOException {
            S0(i, 0);
            B0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void B0(int i) throws IOException {
            if (i >= 0) {
                U0(i);
            } else {
                W0(i);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void E0(int i, k0 k0Var, w0 w0Var) throws IOException {
            S0(i, 2);
            U0(((com.google.protobuf.a) k0Var).r(w0Var));
            w0Var.h(k0Var, this.a);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void F0(k0 k0Var) throws IOException {
            U0(k0Var.d());
            k0Var.l(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void G0(int i, k0 k0Var) throws IOException {
            S0(1, 3);
            T0(2, i);
            Y0(3, k0Var);
            S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void H0(int i, f fVar) throws IOException {
            S0(1, 3);
            T0(2, i);
            k0(3, fVar);
            S0(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void Q0(int i, String str) throws IOException {
            S0(i, 2);
            R0(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void R0(String str) throws IOException {
            int i = this.h;
            try {
                int V = CodedOutputStream.V(str.length() * 3);
                int V2 = CodedOutputStream.V(str.length());
                if (V2 == V) {
                    int i2 = i + V2;
                    this.h = i2;
                    int f = g1.f(str, this.e, i2, e0());
                    this.h = i;
                    U0((f - i) - V2);
                    this.h = f;
                } else {
                    U0(g1.g(str));
                    this.h = g1.f(str, this.e, this.h, e0());
                }
            } catch (g1.d e) {
                this.h = i;
                a0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void S0(int i, int i2) throws IOException {
            U0(h1.c(i, i2));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void T0(int i, int i2) throws IOException {
            S0(i, 0);
            U0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void U0(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i2 = this.h;
                    this.h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr2 = this.e;
            int i3 = this.h;
            this.h = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void V0(int i, long j) throws IOException {
            S0(i, 0);
            W0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void W0(long j) throws IOException {
            if (CodedOutputStream.d && e0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    f1.K(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                f1.K(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.h;
            this.h = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void X0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void Y0(int i, k0 k0Var) throws IOException {
            S0(i, 2);
            F0(k0Var);
        }

        @Override // com.google.protobuf.CodedOutputStream, defpackage.gk0
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            X0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int e0() {
            return this.g - this.h;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void f0(byte b) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void g0(int i, boolean z) throws IOException {
            S0(i, 0);
            f0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void j0(byte[] bArr, int i, int i2) throws IOException {
            U0(i2);
            X0(bArr, i, i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void k0(int i, f fVar) throws IOException {
            S0(i, 2);
            l0(fVar);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void l0(f fVar) throws IOException {
            U0(fVar.size());
            fVar.r0(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void q0(int i, int i2) throws IOException {
            S0(i, 5);
            r0(i2);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void r0(int i) throws IOException {
            try {
                byte[] bArr = this.e;
                int i2 = this.h;
                bArr[i2] = (byte) (i & 255);
                bArr[i2 + 1] = (byte) ((i >> 8) & 255);
                bArr[i2 + 2] = (byte) ((i >> 16) & 255);
                this.h = i2 + 4;
                bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void s0(int i, long j) throws IOException {
            S0(i, 1);
            t0(j);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void t0(long j) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                bArr[i] = (byte) (((int) j) & 255);
                bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
                bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
                bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
                bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
                bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
                bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
                this.h = i + 8;
                bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }
    }

    public static int A(int i, y yVar) {
        return T(i) + B(yVar);
    }

    public static int B(y yVar) {
        return C(yVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i) {
        return V(i) + i;
    }

    public static int D(int i, k0 k0Var) {
        return (T(1) * 2) + U(2, i) + E(3, k0Var);
    }

    public static int E(int i, k0 k0Var) {
        return T(i) + G(k0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i, k0 k0Var, w0 w0Var) {
        return T(i) + H(k0Var, w0Var);
    }

    public static int G(k0 k0Var) {
        return C(k0Var.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(k0 k0Var, w0 w0Var) {
        return C(((com.google.protobuf.a) k0Var).r(w0Var));
    }

    public static int I(int i, f fVar) {
        return (T(1) * 2) + U(2, i) + g(3, fVar);
    }

    public static int J(int i, int i2) {
        return T(i) + K(i2);
    }

    public static int K(int i) {
        return 4;
    }

    public static int L(int i, long j) {
        return T(i) + M(j);
    }

    public static int M(long j) {
        return 8;
    }

    public static int N(int i, int i2) {
        return T(i) + O(i2);
    }

    public static int O(int i) {
        return V(Y(i));
    }

    public static int P(int i, long j) {
        return T(i) + Q(j);
    }

    public static int Q(long j) {
        return X(Z(j));
    }

    public static int R(int i, String str) {
        return T(i) + S(str);
    }

    public static int S(String str) {
        int length;
        try {
            length = g1.g(str);
        } catch (g1.d unused) {
            length = str.getBytes(w.b).length;
        }
        return C(length);
    }

    public static int T(int i) {
        return V(h1.c(i, 0));
    }

    public static int U(int i, int i2) {
        return T(i) + V(i2);
    }

    public static int V(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int W(int i, long j) {
        return T(i) + X(j);
    }

    public static int X(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public static int Y(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long Z(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream c0(byte[] bArr) {
        return d0(bArr, 0, bArr.length);
    }

    public static int d(int i, boolean z) {
        return T(i) + e(z);
    }

    public static CodedOutputStream d0(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i, f fVar) {
        return T(i) + h(fVar);
    }

    public static int h(f fVar) {
        return C(fVar.size());
    }

    public static int i(int i, double d2) {
        return T(i) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i, int i2) {
        return T(i) + l(i2);
    }

    public static int l(int i) {
        return w(i);
    }

    public static int m(int i, int i2) {
        return T(i) + n(i2);
    }

    public static int n(int i) {
        return 4;
    }

    public static int o(int i, long j) {
        return T(i) + p(j);
    }

    public static int p(long j) {
        return 8;
    }

    public static int q(int i, float f) {
        return T(i) + r(f);
    }

    public static int r(float f) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int s(int i, k0 k0Var, w0 w0Var) {
        return (T(i) * 2) + u(k0Var, w0Var);
    }

    @Deprecated
    public static int t(k0 k0Var) {
        return k0Var.d();
    }

    @Deprecated
    static int u(k0 k0Var, w0 w0Var) {
        return ((com.google.protobuf.a) k0Var).r(w0Var);
    }

    public static int v(int i, int i2) {
        return T(i) + w(i2);
    }

    public static int w(int i) {
        if (i >= 0) {
            return V(i);
        }
        return 10;
    }

    public static int x(int i, long j) {
        return T(i) + y(j);
    }

    public static int y(long j) {
        return X(j);
    }

    public static int z(int i, y yVar) {
        return (T(1) * 2) + U(2, i) + A(3, yVar);
    }

    public abstract void A0(int i, int i2) throws IOException;

    public abstract void B0(int i) throws IOException;

    public final void C0(int i, long j) throws IOException {
        V0(i, j);
    }

    public final void D0(long j) throws IOException {
        W0(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void E0(int i, k0 k0Var, w0 w0Var) throws IOException;

    public abstract void F0(k0 k0Var) throws IOException;

    public abstract void G0(int i, k0 k0Var) throws IOException;

    public abstract void H0(int i, f fVar) throws IOException;

    public final void I0(int i, int i2) throws IOException {
        q0(i, i2);
    }

    public final void J0(int i) throws IOException {
        r0(i);
    }

    public final void K0(int i, long j) throws IOException {
        s0(i, j);
    }

    public final void L0(long j) throws IOException {
        t0(j);
    }

    public final void M0(int i, int i2) throws IOException {
        T0(i, Y(i2));
    }

    public final void N0(int i) throws IOException {
        U0(Y(i));
    }

    public final void O0(int i, long j) throws IOException {
        V0(i, Z(j));
    }

    public final void P0(long j) throws IOException {
        W0(Z(j));
    }

    public abstract void Q0(int i, String str) throws IOException;

    public abstract void R0(String str) throws IOException;

    public abstract void S0(int i, int i2) throws IOException;

    public abstract void T0(int i, int i2) throws IOException;

    public abstract void U0(int i) throws IOException;

    public abstract void V0(int i, long j) throws IOException;

    public abstract void W0(long j) throws IOException;

    @Override // defpackage.gk0
    public abstract void a(byte[] bArr, int i, int i2) throws IOException;

    final void a0(String str, g1.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(w.b);
        try {
            U0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0() {
        return this.b;
    }

    public final void c() {
        if (e0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract int e0();

    public abstract void f0(byte b2) throws IOException;

    public abstract void g0(int i, boolean z) throws IOException;

    public final void h0(boolean z) throws IOException {
        f0(z ? (byte) 1 : (byte) 0);
    }

    public final void i0(byte[] bArr) throws IOException {
        j0(bArr, 0, bArr.length);
    }

    abstract void j0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void k0(int i, f fVar) throws IOException;

    public abstract void l0(f fVar) throws IOException;

    public final void m0(int i, double d2) throws IOException {
        s0(i, Double.doubleToRawLongBits(d2));
    }

    public final void n0(double d2) throws IOException {
        t0(Double.doubleToRawLongBits(d2));
    }

    public final void o0(int i, int i2) throws IOException {
        A0(i, i2);
    }

    public final void p0(int i) throws IOException {
        B0(i);
    }

    public abstract void q0(int i, int i2) throws IOException;

    public abstract void r0(int i) throws IOException;

    public abstract void s0(int i, long j) throws IOException;

    public abstract void t0(long j) throws IOException;

    public final void u0(int i, float f) throws IOException {
        q0(i, Float.floatToRawIntBits(f));
    }

    public final void v0(float f) throws IOException {
        r0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void w0(int i, k0 k0Var) throws IOException {
        S0(i, 3);
        y0(k0Var);
        S0(i, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void x0(int i, k0 k0Var, w0 w0Var) throws IOException {
        S0(i, 3);
        z0(k0Var, w0Var);
        S0(i, 4);
    }

    @Deprecated
    public final void y0(k0 k0Var) throws IOException {
        k0Var.l(this);
    }

    @Deprecated
    final void z0(k0 k0Var, w0 w0Var) throws IOException {
        w0Var.h(k0Var, this.a);
    }

    private CodedOutputStream() {
    }
}
