package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.h1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class CodedOutputStream extends hk0 {
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean d = g1.C();
    j a;
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
    public static abstract class b extends CodedOutputStream {
        final byte[] e;
        final int f;
        int g;
        int h;

        b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.e = bArr;
                this.f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        final void b1(byte b) {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
            this.h++;
        }

        final void c1(int i) {
            byte[] bArr = this.e;
            int i2 = this.g;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.h += 4;
        }

        final void d1(long j) {
            byte[] bArr = this.e;
            int i = this.g;
            bArr[i] = (byte) (j & 255);
            bArr[i + 1] = (byte) ((j >> 8) & 255);
            bArr[i + 2] = (byte) ((j >> 16) & 255);
            bArr[i + 3] = (byte) (255 & (j >> 24));
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            this.h += 8;
        }

        final void e1(int i) {
            if (i >= 0) {
                g1(i);
            } else {
                h1(i);
            }
        }

        final void f1(int i, int i2) {
            g1(i1.c(i, i2));
        }

        final void g1(int i) {
            if (CodedOutputStream.d) {
                long j = this.g;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    g1.H(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                g1.H(bArr2, i3, (byte) i);
                this.h += (int) (this.g - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.h++;
        }

        final void h1(long j) {
            if (CodedOutputStream.d) {
                long j2 = this.g;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    g1.H(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                g1.H(bArr2, i2, (byte) j);
                this.h += (int) (this.g - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr4[i4] = (byte) j;
            this.h++;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends b {
        private final OutputStream i;

        d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void i1() throws IOException {
            this.i.write(this.e, 0, this.g);
            this.g = 0;
        }

        private void j1(int i) throws IOException {
            if (this.f - this.g < i) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void E0(int i, int i2) throws IOException {
            j1(20);
            f1(i, 0);
            e1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void F0(int i) throws IOException {
            if (i >= 0) {
                Y0(i);
            } else {
                a1(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void I0(int i, l0 l0Var, x0 x0Var) throws IOException {
            W0(i, 2);
            m1(l0Var, x0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J0(l0 l0Var) throws IOException {
            Y0(l0Var.d());
            l0Var.h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(int i, l0 l0Var) throws IOException {
            W0(1, 3);
            X0(2, i);
            l1(3, l0Var);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void L0(int i, g gVar) throws IOException {
            W0(1, 3);
            X0(2, i);
            o0(3, gVar);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void U0(int i, String str) throws IOException {
            W0(i, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void V0(String str) throws IOException {
            int g;
            try {
                int length = str.length() * 3;
                int X = CodedOutputStream.X(length);
                int i = X + length;
                int i2 = this.f;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int f = h1.f(str, bArr, 0, length);
                    Y0(f);
                    a(bArr, 0, f);
                    return;
                }
                if (i > i2 - this.g) {
                    i1();
                }
                int X2 = CodedOutputStream.X(str.length());
                int i3 = this.g;
                try {
                    if (X2 == X) {
                        int i4 = i3 + X2;
                        this.g = i4;
                        int f2 = h1.f(str, this.e, i4, this.f - i4);
                        this.g = i3;
                        g = (f2 - i3) - X2;
                        g1(g);
                        this.g = f2;
                    } else {
                        g = h1.g(str);
                        g1(g);
                        this.g = h1.f(str, this.e, this.g, g);
                    }
                    this.h += g;
                } catch (h1.d e) {
                    this.h -= this.g - i3;
                    this.g = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (h1.d e3) {
                d0(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int i, int i2) throws IOException {
            Y0(i1.c(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void X0(int i, int i2) throws IOException {
            j1(20);
            f1(i, 0);
            g1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int i) throws IOException {
            j1(5);
            g1(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Z0(int i, long j) throws IOException {
            j1(20);
            f1(i, 0);
            h1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, defpackage.hk0
        public void a(byte[] bArr, int i, int i2) throws IOException {
            k1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void a1(long j) throws IOException {
            j1(10);
            h1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c0() throws IOException {
            if (this.g > 0) {
                i1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j0(byte b) throws IOException {
            if (this.g == this.f) {
                i1();
            }
            b1(b);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void k0(int i, boolean z) throws IOException {
            j1(11);
            f1(i, 0);
            b1(z ? (byte) 1 : (byte) 0);
        }

        public void k1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f;
            int i4 = this.g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.e, i4, i2);
                this.g += i2;
                this.h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.g = this.f;
            this.h += i5;
            i1();
            if (i7 <= this.f) {
                System.arraycopy(bArr, i6, this.e, 0, i7);
                this.g = i7;
            } else {
                this.i.write(bArr, i6, i7);
            }
            this.h += i7;
        }

        public void l1(int i, l0 l0Var) throws IOException {
            W0(i, 2);
            J0(l0Var);
        }

        void m1(l0 l0Var, x0 x0Var) throws IOException {
            Y0(((androidx.datastore.preferences.protobuf.a) l0Var).l(x0Var));
            x0Var.i(l0Var, this.a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(byte[] bArr, int i, int i2) throws IOException {
            Y0(i2);
            k1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(int i, g gVar) throws IOException {
            W0(i, 2);
            p0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void p0(g gVar) throws IOException {
            Y0(gVar.size());
            gVar.r0(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u0(int i, int i2) throws IOException {
            j1(14);
            f1(i, 5);
            c1(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i) throws IOException {
            j1(4);
            c1(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(int i, long j) throws IOException {
            j1(18);
            f1(i, 1);
            d1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void x0(long j) throws IOException {
            j1(8);
            d1(j);
        }
    }

    public static int A(int i, z zVar) {
        return V(i) + B(zVar);
    }

    public static int B(z zVar) {
        return C(zVar.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i) {
        return X(i) + i;
    }

    public static int D(int i, l0 l0Var) {
        return (V(1) * 2) + W(2, i) + E(3, l0Var);
    }

    public static int E(int i, l0 l0Var) {
        return V(i) + G(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i, l0 l0Var, x0 x0Var) {
        return V(i) + H(l0Var, x0Var);
    }

    public static int G(l0 l0Var) {
        return C(l0Var.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(l0 l0Var, x0 x0Var) {
        return C(((androidx.datastore.preferences.protobuf.a) l0Var).l(x0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int J(int i, g gVar) {
        return (V(1) * 2) + W(2, i) + g(3, gVar);
    }

    @Deprecated
    public static int K(int i) {
        return X(i);
    }

    public static int L(int i, int i2) {
        return V(i) + M(i2);
    }

    public static int M(int i) {
        return 4;
    }

    public static int N(int i, long j) {
        return V(i) + O(j);
    }

    public static int O(long j) {
        return 8;
    }

    public static int P(int i, int i2) {
        return V(i) + Q(i2);
    }

    public static int Q(int i) {
        return X(a0(i));
    }

    public static int R(int i, long j) {
        return V(i) + S(j);
    }

    public static int S(long j) {
        return Z(b0(j));
    }

    public static int T(int i, String str) {
        return V(i) + U(str);
    }

    public static int U(String str) {
        int length;
        try {
            length = h1.g(str);
        } catch (h1.d unused) {
            length = str.getBytes(x.a).length;
        }
        return C(length);
    }

    public static int V(int i) {
        return X(i1.c(i, 0));
    }

    public static int W(int i, int i2) {
        return V(i) + X(i2);
    }

    public static int X(int i) {
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

    public static int Y(int i, long j) {
        return V(i) + Z(j);
    }

    public static int Z(long j) {
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

    public static int a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int d(int i, boolean z) {
        return V(i) + e(z);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static CodedOutputStream f0(OutputStream outputStream, int i) {
        return new d(outputStream, i);
    }

    public static int g(int i, g gVar) {
        return V(i) + h(gVar);
    }

    public static CodedOutputStream g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(g gVar) {
        return C(gVar.size());
    }

    public static CodedOutputStream h0(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    public static int i(int i, double d2) {
        return V(i) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i, int i2) {
        return V(i) + l(i2);
    }

    public static int l(int i) {
        return w(i);
    }

    public static int m(int i, int i2) {
        return V(i) + n(i2);
    }

    public static int n(int i) {
        return 4;
    }

    public static int o(int i, long j) {
        return V(i) + p(j);
    }

    public static int p(long j) {
        return 8;
    }

    public static int q(int i, float f) {
        return V(i) + r(f);
    }

    public static int r(float f) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int s(int i, l0 l0Var, x0 x0Var) {
        return (V(i) * 2) + u(l0Var, x0Var);
    }

    @Deprecated
    public static int t(l0 l0Var) {
        return l0Var.d();
    }

    @Deprecated
    static int u(l0 l0Var, x0 x0Var) {
        return ((androidx.datastore.preferences.protobuf.a) l0Var).l(x0Var);
    }

    public static int v(int i, int i2) {
        return V(i) + w(i2);
    }

    public static int w(int i) {
        if (i >= 0) {
            return X(i);
        }
        return 10;
    }

    public static int x(int i, long j) {
        return V(i) + y(j);
    }

    public static int y(long j) {
        return Z(j);
    }

    public static int z(int i, z zVar) {
        return (V(1) * 2) + W(2, i) + A(3, zVar);
    }

    @Deprecated
    public final void A0(int i, l0 l0Var) throws IOException {
        W0(i, 3);
        C0(l0Var);
        W0(i, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void B0(int i, l0 l0Var, x0 x0Var) throws IOException {
        W0(i, 3);
        D0(l0Var, x0Var);
        W0(i, 4);
    }

    @Deprecated
    public final void C0(l0 l0Var) throws IOException {
        l0Var.h(this);
    }

    @Deprecated
    final void D0(l0 l0Var, x0 x0Var) throws IOException {
        x0Var.i(l0Var, this.a);
    }

    public abstract void E0(int i, int i2) throws IOException;

    public abstract void F0(int i) throws IOException;

    public final void G0(int i, long j) throws IOException {
        Z0(i, j);
    }

    public final void H0(long j) throws IOException {
        a1(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void I0(int i, l0 l0Var, x0 x0Var) throws IOException;

    public abstract void J0(l0 l0Var) throws IOException;

    public abstract void K0(int i, l0 l0Var) throws IOException;

    public abstract void L0(int i, g gVar) throws IOException;

    public final void M0(int i, int i2) throws IOException {
        u0(i, i2);
    }

    public final void N0(int i) throws IOException {
        v0(i);
    }

    public final void O0(int i, long j) throws IOException {
        w0(i, j);
    }

    public final void P0(long j) throws IOException {
        x0(j);
    }

    public final void Q0(int i, int i2) throws IOException {
        X0(i, a0(i2));
    }

    public final void R0(int i) throws IOException {
        Y0(a0(i));
    }

    public final void S0(int i, long j) throws IOException {
        Z0(i, b0(j));
    }

    public final void T0(long j) throws IOException {
        a1(b0(j));
    }

    public abstract void U0(int i, String str) throws IOException;

    public abstract void V0(String str) throws IOException;

    public abstract void W0(int i, int i2) throws IOException;

    public abstract void X0(int i, int i2) throws IOException;

    public abstract void Y0(int i) throws IOException;

    public abstract void Z0(int i, long j) throws IOException;

    @Override // defpackage.hk0
    public abstract void a(byte[] bArr, int i, int i2) throws IOException;

    public abstract void a1(long j) throws IOException;

    public final void c() {
        if (i0() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract void c0() throws IOException;

    final void d0(String str, h1.d dVar) throws IOException {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(x.a);
        try {
            Y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e0() {
        return this.b;
    }

    public abstract int i0();

    public abstract void j0(byte b2) throws IOException;

    public abstract void k0(int i, boolean z) throws IOException;

    public final void l0(boolean z) throws IOException {
        j0(z ? (byte) 1 : (byte) 0);
    }

    public final void m0(byte[] bArr) throws IOException {
        n0(bArr, 0, bArr.length);
    }

    abstract void n0(byte[] bArr, int i, int i2) throws IOException;

    public abstract void o0(int i, g gVar) throws IOException;

    public abstract void p0(g gVar) throws IOException;

    public final void q0(int i, double d2) throws IOException {
        w0(i, Double.doubleToRawLongBits(d2));
    }

    public final void r0(double d2) throws IOException {
        x0(Double.doubleToRawLongBits(d2));
    }

    public final void s0(int i, int i2) throws IOException {
        E0(i, i2);
    }

    public final void t0(int i) throws IOException {
        F0(i);
    }

    public abstract void u0(int i, int i2) throws IOException;

    public abstract void v0(int i) throws IOException;

    public abstract void w0(int i, long j) throws IOException;

    public abstract void x0(long j) throws IOException;

    public final void y0(int i, float f) throws IOException {
        u0(i, Float.floatToRawIntBits(f));
    }

    public final void z0(float f) throws IOException {
        v0(Float.floatToRawIntBits(f));
    }

    private CodedOutputStream() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends CodedOutputStream {
        private final byte[] e;
        private final int f;
        private final int g;
        private int h;

        c(byte[] bArr, int i, int i2) {
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

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i, int i2) throws IOException {
            W0(i, 0);
            F0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F0(int i) throws IOException {
            if (i >= 0) {
                Y0(i);
            } else {
                a1(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void I0(int i, l0 l0Var, x0 x0Var) throws IOException {
            W0(i, 2);
            Y0(((androidx.datastore.preferences.protobuf.a) l0Var).l(x0Var));
            x0Var.i(l0Var, this.a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J0(l0 l0Var) throws IOException {
            Y0(l0Var.d());
            l0Var.h(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K0(int i, l0 l0Var) throws IOException {
            W0(1, 3);
            X0(2, i);
            c1(3, l0Var);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L0(int i, g gVar) throws IOException {
            W0(1, 3);
            X0(2, i);
            o0(3, gVar);
            W0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U0(int i, String str) throws IOException {
            W0(i, 2);
            V0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V0(String str) throws IOException {
            int i = this.h;
            try {
                int X = CodedOutputStream.X(str.length() * 3);
                int X2 = CodedOutputStream.X(str.length());
                if (X2 == X) {
                    int i2 = i + X2;
                    this.h = i2;
                    int f = h1.f(str, this.e, i2, i0());
                    this.h = i;
                    Y0((f - i) - X2);
                    this.h = f;
                } else {
                    Y0(h1.g(str));
                    this.h = h1.f(str, this.e, this.h, i0());
                }
            } catch (h1.d e) {
                this.h = i;
                d0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W0(int i, int i2) throws IOException {
            Y0(i1.c(i, i2));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X0(int i, int i2) throws IOException {
            W0(i, 0);
            Y0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y0(int i) throws IOException {
            if (CodedOutputStream.d && !androidx.datastore.preferences.protobuf.d.c() && i0() >= 5) {
                if ((i & (-128)) == 0) {
                    byte[] bArr = this.e;
                    int i2 = this.h;
                    this.h = i2 + 1;
                    g1.H(bArr, i2, (byte) i);
                    return;
                }
                byte[] bArr2 = this.e;
                int i3 = this.h;
                this.h = i3 + 1;
                g1.H(bArr2, i3, (byte) (i | 128));
                int i4 = i >>> 7;
                if ((i4 & (-128)) == 0) {
                    byte[] bArr3 = this.e;
                    int i5 = this.h;
                    this.h = i5 + 1;
                    g1.H(bArr3, i5, (byte) i4);
                    return;
                }
                byte[] bArr4 = this.e;
                int i6 = this.h;
                this.h = i6 + 1;
                g1.H(bArr4, i6, (byte) (i4 | 128));
                int i7 = i >>> 14;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.e;
                    int i8 = this.h;
                    this.h = i8 + 1;
                    g1.H(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.e;
                int i9 = this.h;
                this.h = i9 + 1;
                g1.H(bArr6, i9, (byte) (i7 | 128));
                int i10 = i >>> 21;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.e;
                    int i11 = this.h;
                    this.h = i11 + 1;
                    g1.H(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.e;
                int i12 = this.h;
                this.h = i12 + 1;
                g1.H(bArr8, i12, (byte) (i10 | 128));
                byte[] bArr9 = this.e;
                int i13 = this.h;
                this.h = i13 + 1;
                g1.H(bArr9, i13, (byte) (i >>> 28));
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

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z0(int i, long j) throws IOException {
            W0(i, 0);
            a1(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, defpackage.hk0
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void a1(long j) throws IOException {
            if (CodedOutputStream.d && i0() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.h;
                    this.h = i + 1;
                    g1.H(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                g1.H(bArr2, i2, (byte) j);
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

        public final void b1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        public final void c1(int i, l0 l0Var) throws IOException {
            W0(i, 2);
            J0(l0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int i0() {
            return this.g - this.h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j0(byte b) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void k0(int i, boolean z) throws IOException {
            W0(i, 0);
            j0(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n0(byte[] bArr, int i, int i2) throws IOException {
            Y0(i2);
            b1(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o0(int i, g gVar) throws IOException {
            W0(i, 2);
            p0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void p0(g gVar) throws IOException {
            Y0(gVar.size());
            gVar.r0(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(int i, int i2) throws IOException {
            W0(i, 5);
            v0(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i) throws IOException {
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

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(int i, long j) throws IOException {
            W0(i, 1);
            x0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x0(long j) throws IOException {
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

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void c0() {
        }
    }
}
