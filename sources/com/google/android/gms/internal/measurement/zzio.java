package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class zzio extends o0d {
    private static final Logger b = Logger.getLogger(zzio.class.getName());
    private static final boolean c = e4.w();
    r1 a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    private static class a extends zzio {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                if (((bArr.length - i2) | i2) >= 0) {
                    this.d = bArr;
                    this.e = 0;
                    this.g = 0;
                    this.f = i2;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            throw new NullPointerException("buffer");
        }

        private final void E0(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void L(int i) throws IOException {
            if (i >= 0) {
                Y(i);
            } else {
                R(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void O(int i, int i2) throws IOException {
            Z(i, 0);
            L(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void P(int i, long j) throws IOException {
            Z(i, 0);
            R(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void Q(int i, d1 d1Var) throws IOException {
            Z(1, 3);
            f0(2, i);
            p(3, d1Var);
            Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void R(long j) throws IOException {
            if (zzio.c && b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    e4.m(bArr, i, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                e4.m(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr3[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void Y(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr2 = this.d;
            int i3 = this.g;
            this.g = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void Z(int i, int i2) throws IOException {
            Y((i << 3) | i2);
        }

        @Override // defpackage.o0d
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            E0(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final int b() {
            return this.f - this.g;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void f0(int i, int i2) throws IOException {
            Z(i, 0);
            Y(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void l(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void m(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                this.g = i2 + 4;
                bArr[i2 + 3] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void n(int i, int i2) throws IOException {
            Z(i, 5);
            m(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void o(int i, long j) throws IOException {
            Z(i, 1);
            u(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void p(int i, d1 d1Var) throws IOException {
            Z(i, 2);
            v(d1Var);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void q(int i, String str) throws IOException {
            Z(i, 2);
            w(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void r(int i, h3d h3dVar) throws IOException {
            Z(1, 3);
            f0(2, i);
            Z(3, 2);
            y(h3dVar);
            Z(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        final void s(int i, h3d h3dVar, j3 j3Var) throws IOException {
            Z(i, 2);
            Y(((w0) h3dVar).a(j3Var));
            j3Var.h(h3dVar, this.a);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void t(int i, boolean z) throws IOException {
            Z(i, 0);
            l(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void u(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                this.g = i + 8;
                bArr[i + 7] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void v(d1 d1Var) throws IOException {
            Y(d1Var.P());
            d1Var.G(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void w(String str) throws IOException {
            int i = this.g;
            try {
                int z0 = zzio.z0(str.length() * 3);
                int z02 = zzio.z0(str.length());
                if (z02 == z0) {
                    int i2 = i + z02;
                    this.g = i2;
                    int b = f4.b(str, this.d, i2, b());
                    this.g = i;
                    Y((b - i) - z02);
                    this.g = b;
                    return;
                }
                Y(f4.a(str));
                this.g = f4.b(str, this.d, this.g, b());
            } catch (i4 e) {
                this.g = i;
                x(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void y(h3d h3dVar) throws IOException {
            Y(h3dVar.f());
            h3dVar.b(this);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    /* loaded from: classes2.dex */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(int i, String str) {
        return z0(i << 3) + F(str);
    }

    public static int A0(int i, int i2) {
        return z0(i << 3) + z0(i2);
    }

    public static int B(int i, h3d h3dVar) {
        return (z0(8) << 1) + A0(2, i) + z0(24) + X(h3dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int C(int i, h3d h3dVar, j3 j3Var) {
        return (z0(i << 3) << 1) + ((w0) h3dVar).a(j3Var);
    }

    public static int D(int i, boolean z) {
        return z0(i << 3) + 1;
    }

    private static int D0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int E(d1 d1Var) {
        int P = d1Var.P();
        return z0(P) + P;
    }

    public static int F(String str) {
        int length;
        try {
            length = f4.a(str);
        } catch (i4 unused) {
            length = str.getBytes(d2.b).length;
        }
        return z0(length) + length;
    }

    @Deprecated
    public static int G(h3d h3dVar) {
        return h3dVar.f();
    }

    public static zzio H(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int T(int i, long j) {
        return z0(i << 3) + 8;
    }

    public static int U(int i, d1 d1Var) {
        int z0 = z0(i << 3);
        int P = d1Var.P();
        return z0 + z0(P) + P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int V(int i, h3d h3dVar, j3 j3Var) {
        return z0(i << 3) + i(h3dVar, j3Var);
    }

    public static int W(long j) {
        return 8;
    }

    public static int X(h3d h3dVar) {
        int f = h3dVar.f();
        return z0(f) + f;
    }

    public static int b0(int i) {
        return r0(i);
    }

    public static int c(double d) {
        return 8;
    }

    public static int c0(int i, long j) {
        return z0(i << 3) + r0(j);
    }

    public static int d(float f) {
        return 4;
    }

    public static int d0(int i, d1 d1Var) {
        return (z0(8) << 1) + A0(2, i) + U(3, d1Var);
    }

    public static int e(int i, double d) {
        return z0(i << 3) + 8;
    }

    public static int e0(long j) {
        return r0(j);
    }

    public static int f(int i, float f) {
        return z0(i << 3) + 4;
    }

    public static int g(int i, g2 g2Var) {
        return (z0(8) << 1) + A0(2, i) + z(3, g2Var);
    }

    public static int g0(int i) {
        return 4;
    }

    public static int h(g2 g2Var) {
        int b2 = g2Var.b();
        return z0(b2) + b2;
    }

    public static int h0(int i, int i2) {
        return z0(i << 3) + r0(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(h3d h3dVar, j3 j3Var) {
        int a2 = ((w0) h3dVar).a(j3Var);
        return z0(a2) + a2;
    }

    public static int i0(int i, long j) {
        return z0(i << 3) + 8;
    }

    public static int j(boolean z) {
        return 1;
    }

    public static int j0(long j) {
        return 8;
    }

    public static int k(byte[] bArr) {
        int length = bArr.length;
        return z0(length) + length;
    }

    public static int k0(int i) {
        return r0(i);
    }

    public static int l0(int i, int i2) {
        return z0(i << 3) + 4;
    }

    public static int m0(int i, long j) {
        return z0(i << 3) + r0(y0(j));
    }

    public static int n0(long j) {
        return r0(y0(j));
    }

    public static int o0(int i) {
        return 4;
    }

    public static int p0(int i, int i2) {
        return z0(i << 3) + r0(i2);
    }

    public static int q0(int i, long j) {
        return z0(i << 3) + r0(j);
    }

    public static int r0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int s0(int i) {
        return z0(D0(i));
    }

    public static int t0(int i, int i2) {
        return z0(i << 3) + 4;
    }

    public static int w0(int i) {
        return z0(i << 3);
    }

    public static int x0(int i, int i2) {
        return z0(i << 3) + z0(D0(i2));
    }

    private static long y0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int z(int i, g2 g2Var) {
        int z0 = z0(i << 3);
        int b2 = g2Var.b();
        return z0 + z0(b2) + b2;
    }

    public static int z0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void B0(int i) throws IOException {
        Y(D0(i));
    }

    public final void C0(int i, int i2) throws IOException {
        f0(i, D0(i2));
    }

    public final void I() {
        if (b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void J(double d) throws IOException {
        u(Double.doubleToRawLongBits(d));
    }

    public final void K(float f) throws IOException {
        m(Float.floatToRawIntBits(f));
    }

    public abstract void L(int i) throws IOException;

    public final void M(int i, double d) throws IOException {
        o(i, Double.doubleToRawLongBits(d));
    }

    public final void N(int i, float f) throws IOException {
        n(i, Float.floatToRawIntBits(f));
    }

    public abstract void O(int i, int i2) throws IOException;

    public abstract void P(int i, long j) throws IOException;

    public abstract void Q(int i, d1 d1Var) throws IOException;

    public abstract void R(long j) throws IOException;

    public final void S(boolean z) throws IOException {
        l(z ? (byte) 1 : (byte) 0);
    }

    public abstract void Y(int i) throws IOException;

    public abstract void Z(int i, int i2) throws IOException;

    public abstract int b();

    public abstract void f0(int i, int i2) throws IOException;

    public abstract void l(byte b2) throws IOException;

    public abstract void m(int i) throws IOException;

    public abstract void n(int i, int i2) throws IOException;

    public abstract void o(int i, long j) throws IOException;

    public abstract void p(int i, d1 d1Var) throws IOException;

    public abstract void q(int i, String str) throws IOException;

    public abstract void r(int i, h3d h3dVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(int i, h3d h3dVar, j3 j3Var) throws IOException;

    public abstract void t(int i, boolean z) throws IOException;

    public abstract void u(long j) throws IOException;

    public final void u0(int i, long j) throws IOException {
        P(i, y0(j));
    }

    public abstract void v(d1 d1Var) throws IOException;

    public final void v0(long j) throws IOException {
        R(y0(j));
    }

    public abstract void w(String str) throws IOException;

    final void x(String str, i4 i4Var) throws IOException {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) i4Var);
        byte[] bytes = str.getBytes(d2.b);
        try {
            Y(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    public abstract void y(h3d h3dVar) throws IOException;

    private zzio() {
    }
}
