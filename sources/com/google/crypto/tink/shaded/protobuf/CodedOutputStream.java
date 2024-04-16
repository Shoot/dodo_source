package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.i1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public abstract class CodedOutputStream extends fk0 {
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean d = h1.E();
    k a;
    private boolean b;

    /* loaded from: classes2.dex */
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
    /* loaded from: classes2.dex */
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        final void A0(int i, m0 m0Var, y0 y0Var) throws IOException {
            M0(i, 2);
            O0(((com.google.crypto.tink.shaded.protobuf.a) m0Var).l(y0Var));
            y0Var.j(m0Var, this.a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void B0(int i, m0 m0Var) throws IOException {
            M0(1, 3);
            N0(2, i);
            T0(3, m0Var);
            M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void C0(int i, h hVar) throws IOException {
            M0(1, 3);
            N0(2, i);
            j0(3, hVar);
            M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void L0(int i, String str) throws IOException {
            M0(i, 2);
            V0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void M0(int i, int i2) throws IOException {
            O0(j1.c(i, i2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void N0(int i, int i2) throws IOException {
            M0(i, 0);
            O0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void O0(int i) throws IOException {
            if (CodedOutputStream.d && !d.c() && f0() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.e;
                    int i2 = this.h;
                    this.h = i2 + 1;
                    h1.K(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.e;
                int i3 = this.h;
                this.h = i3 + 1;
                h1.K(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.e;
                    int i5 = this.h;
                    this.h = i5 + 1;
                    h1.K(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.e;
                int i6 = this.h;
                this.h = i6 + 1;
                h1.K(bArr4, i6, (byte) (i4 | 128));
                int i7 = i >>> 14;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.e;
                    int i8 = this.h;
                    this.h = i8 + 1;
                    h1.K(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.e;
                int i9 = this.h;
                this.h = i9 + 1;
                h1.K(bArr6, i9, (byte) (i7 | 128));
                int i10 = i >>> 21;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.e;
                    int i11 = this.h;
                    this.h = i11 + 1;
                    h1.K(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.e;
                int i12 = this.h;
                this.h = i12 + 1;
                h1.K(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.e;
                int i13 = this.h;
                this.h = i13 + 1;
                h1.K(bArr9, i13, (byte) (i >>> 28));
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.e;
                    int i14 = this.h;
                    this.h = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                }
            }
            byte[] bArr11 = this.e;
            int i15 = this.h;
            this.h = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P0(int i, long j) throws IOException {
            M0(i, 0);
            Q0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Q0(long j) throws IOException {
            if (CodedOutputStream.d && f0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    h1.K(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                h1.K(bArr2, i2, (byte) j);
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

        public final void R0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void S0(h hVar) throws IOException {
            O0(hVar.size());
            hVar.x0(this);
        }

        public final void T0(int i, m0 m0Var) throws IOException {
            M0(i, 2);
            U0(m0Var);
        }

        public final void U0(m0 m0Var) throws IOException {
            O0(m0Var.d());
            m0Var.i(this);
        }

        public final void V0(String str) throws IOException {
            int i = this.h;
            try {
                int W = CodedOutputStream.W(str.length() * 3);
                int W2 = CodedOutputStream.W(str.length());
                if (W2 == W) {
                    int i2 = i + W2;
                    this.h = i2;
                    int f = i1.f(str, this.e, i2, f0());
                    this.h = i;
                    O0((f - i) - W2);
                    this.h = f;
                } else {
                    O0(i1.g(str));
                    this.h = i1.f(str, this.e, this.h, f0());
                }
            } catch (i1.d e) {
                this.h = i;
                b0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, defpackage.fk0
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            R0(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int f0() {
            return this.g - this.h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g0(byte b) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(int i, boolean z) throws IOException {
            M0(i, 0);
            g0(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void j0(int i, h hVar) throws IOException {
            M0(i, 2);
            S0(hVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i, int i2) throws IOException {
            M0(i, 5);
            p0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i) throws IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i, long j) throws IOException {
            M0(i, 1);
            r0(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j) throws IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void w0(int i, int i2) throws IOException {
            M0(i, 0);
            x0(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void x0(int i) throws IOException {
            if (i >= 0) {
                O0(i);
            } else {
                Q0(i);
            }
        }
    }

    public static int A(int i, a0 a0Var) {
        return U(i) + B(a0Var);
    }

    public static int B(a0 a0Var) {
        return C(a0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i) {
        return W(i) + i;
    }

    public static int D(int i, m0 m0Var) {
        return (U(1) * 2) + V(2, i) + E(3, m0Var);
    }

    public static int E(int i, m0 m0Var) {
        return U(i) + G(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i, m0 m0Var, y0 y0Var) {
        return U(i) + H(m0Var, y0Var);
    }

    public static int G(m0 m0Var) {
        return C(m0Var.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(m0 m0Var, y0 y0Var) {
        return C(((com.google.crypto.tink.shaded.protobuf.a) m0Var).l(y0Var));
    }

    public static int I(int i, h hVar) {
        return (U(1) * 2) + V(2, i) + g(3, hVar);
    }

    @Deprecated
    public static int J(int i) {
        return W(i);
    }

    public static int K(int i, int i2) {
        return U(i) + L(i2);
    }

    public static int L(int i) {
        return 4;
    }

    public static int M(int i, long j) {
        return U(i) + N(j);
    }

    public static int N(long j) {
        return 8;
    }

    public static int O(int i, int i2) {
        return U(i) + P(i2);
    }

    public static int P(int i) {
        return W(Z(i));
    }

    public static int Q(int i, long j) {
        return U(i) + R(j);
    }

    public static int R(long j) {
        return Y(a0(j));
    }

    public static int S(int i, String str) {
        return U(i) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = i1.g(str);
        } catch (i1.d unused) {
            length = str.getBytes(y.b).length;
        }
        return C(length);
    }

    public static int U(int i) {
        return W(j1.c(i, 0));
    }

    public static int V(int i, int i2) {
        return U(i) + W(i2);
    }

    public static int W(int i) {
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

    public static int X(int i, long j) {
        return U(i) + Y(j);
    }

    public static int Y(long j) {
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

    public static int Z(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long a0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int d(int i, boolean z) {
        return U(i) + e(z);
    }

    public static CodedOutputStream d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static CodedOutputStream e0(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i, h hVar) {
        return U(i) + h(hVar);
    }

    public static int h(h hVar) {
        return C(hVar.size());
    }

    public static int i(int i, double d2) {
        return U(i) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i, int i2) {
        return U(i) + l(i2);
    }

    public static int l(int i) {
        return w(i);
    }

    public static int m(int i, int i2) {
        return U(i) + n(i2);
    }

    public static int n(int i) {
        return 4;
    }

    public static int o(int i, long j) {
        return U(i) + p(j);
    }

    public static int p(long j) {
        return 8;
    }

    public static int q(int i, float f) {
        return U(i) + r(f);
    }

    public static int r(float f) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int s(int i, m0 m0Var, y0 y0Var) {
        return (U(i) * 2) + u(m0Var, y0Var);
    }

    @Deprecated
    public static int t(m0 m0Var) {
        return m0Var.d();
    }

    @Deprecated
    static int u(m0 m0Var, y0 y0Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) m0Var).l(y0Var);
    }

    public static int v(int i, int i2) {
        return U(i) + w(i2);
    }

    public static int w(int i) {
        if (i >= 0) {
            return W(i);
        }
        return 10;
    }

    public static int x(int i, long j) {
        return U(i) + y(j);
    }

    public static int y(long j) {
        return Y(j);
    }

    public static int z(int i, a0 a0Var) {
        return (U(1) * 2) + V(2, i) + A(3, a0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void A0(int i, m0 m0Var, y0 y0Var) throws IOException;

    public abstract void B0(int i, m0 m0Var) throws IOException;

    public abstract void C0(int i, h hVar) throws IOException;

    public final void D0(int i, int i2) throws IOException {
        o0(i, i2);
    }

    public final void E0(int i) throws IOException {
        p0(i);
    }

    public final void F0(int i, long j) throws IOException {
        q0(i, j);
    }

    public final void G0(long j) throws IOException {
        r0(j);
    }

    public final void H0(int i, int i2) throws IOException {
        N0(i, Z(i2));
    }

    public final void I0(int i) throws IOException {
        O0(Z(i));
    }

    public final void J0(int i, long j) throws IOException {
        P0(i, a0(j));
    }

    public final void K0(long j) throws IOException {
        Q0(a0(j));
    }

    public abstract void L0(int i, String str) throws IOException;

    public abstract void M0(int i, int i2) throws IOException;

    public abstract void N0(int i, int i2) throws IOException;

    public abstract void O0(int i) throws IOException;

    public abstract void P0(int i, long j) throws IOException;

    public abstract void Q0(long j) throws IOException;

    @Override // defpackage.fk0
    public abstract void a(byte[] bArr, int i, int i2) throws IOException;

    final void b0(String str, i1.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(y.b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public final void c() {
        if (f0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c0() {
        return this.b;
    }

    public abstract int f0();

    public abstract void g0(byte b2) throws IOException;

    public abstract void h0(int i, boolean z) throws IOException;

    public final void i0(boolean z) throws IOException {
        g0(z ? (byte) 1 : (byte) 0);
    }

    public abstract void j0(int i, h hVar) throws IOException;

    public final void k0(int i, double d2) throws IOException {
        q0(i, Double.doubleToRawLongBits(d2));
    }

    public final void l0(double d2) throws IOException {
        r0(Double.doubleToRawLongBits(d2));
    }

    public final void m0(int i, int i2) throws IOException {
        w0(i, i2);
    }

    public final void n0(int i) throws IOException {
        x0(i);
    }

    public abstract void o0(int i, int i2) throws IOException;

    public abstract void p0(int i) throws IOException;

    public abstract void q0(int i, long j) throws IOException;

    public abstract void r0(long j) throws IOException;

    public final void s0(int i, float f) throws IOException {
        o0(i, Float.floatToRawIntBits(f));
    }

    public final void t0(float f) throws IOException {
        p0(Float.floatToRawIntBits(f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void u0(int i, m0 m0Var, y0 y0Var) throws IOException {
        M0(i, 3);
        v0(m0Var, y0Var);
        M0(i, 4);
    }

    @Deprecated
    final void v0(m0 m0Var, y0 y0Var) throws IOException {
        y0Var.j(m0Var, this.a);
    }

    public abstract void w0(int i, int i2) throws IOException;

    public abstract void x0(int i) throws IOException;

    public final void y0(int i, long j) throws IOException {
        P0(i, j);
    }

    public final void z0(long j) throws IOException {
        Q0(j);
    }

    private CodedOutputStream() {
    }
}
