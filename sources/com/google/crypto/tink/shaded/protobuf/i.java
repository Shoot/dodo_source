package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: CodedInputStream.java */
/* loaded from: classes2.dex */
public abstract class i {
    private static volatile int f = 100;
    int a;
    int b;
    int c;
    j d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* loaded from: classes2.dex */
    public static final class b extends i {
        private final byte[] g;
        private final boolean h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private boolean n;
        private int o;

        private void K() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = i - this.l;
            int i3 = this.o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.j = i4;
                this.i = i - i4;
                return;
            }
            this.j = 0;
        }

        private void N() throws IOException {
            if (this.i - this.k >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.k;
                this.k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void P() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int A() throws IOException {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long B() throws IOException {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean C(int i) throws IOException {
            int b = j1.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    M(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.e();
                            }
                            return false;
                        }
                        L();
                        a(j1.c(j1.a(i), 4));
                        return true;
                    }
                    M(H());
                    return true;
                }
                M(8);
                return true;
            }
            N();
            return true;
        }

        public byte D() throws IOException {
            int i = this.k;
            if (i != this.i) {
                byte[] bArr = this.g;
                this.k = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m();
        }

        public byte[] E(int i) throws IOException {
            if (i > 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.k = i4;
                    return Arrays.copyOfRange(this.g, i3, i4);
                }
            }
            if (i <= 0) {
                if (i == 0) {
                    return y.d;
                }
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.m();
        }

        public int F() throws IOException {
            int i = this.k;
            if (this.i - i >= 4) {
                byte[] bArr = this.g;
                this.k = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.m();
        }

        public long G() throws IOException {
            int i = this.k;
            if (this.i - i >= 8) {
                byte[] bArr = this.g;
                this.k = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.m();
        }

        public int H() throws IOException {
            int i;
            int i2 = this.k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.k = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.k = i5;
                    return i;
                }
            }
            return (int) J();
        }

        public long I() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.k = i3;
                    return b;
                } else if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                i4 = i8;
                                j = (-2080896) ^ i9;
                            } else {
                                long j4 = i9;
                                i4 = i + 5;
                                long j5 = j4 ^ (bArr[i8] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j6 = j5 ^ (bArr[i4] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j5 = j6 ^ (bArr[i10] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j6 = j5 ^ (bArr[i4] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                    i4 = i10;
                                }
                                j = j5 ^ j3;
                            }
                        }
                    }
                    this.k = i4;
                    return j;
                }
            }
            return J();
        }

        long J() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte D = D();
                j |= (D & Byte.MAX_VALUE) << i;
                if ((D & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void L() throws IOException {
            int z;
            do {
                z = z();
                if (z == 0) {
                    return;
                }
            } while (C(z));
        }

        public void M(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.i;
                int i3 = this.k;
                if (i <= i2 - i3) {
                    this.k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.m == i) {
                return;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int d() {
            return this.k - this.l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean e() throws IOException {
            if (this.k == this.i) {
                return true;
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public void i(int i) {
            this.o = i;
            K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int j(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + d();
                if (d >= 0) {
                    int i2 = this.o;
                    if (d <= i2) {
                        this.o = d;
                        K();
                        return i2;
                    }
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public boolean k() throws IOException {
            if (I() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public h l() throws IOException {
            h w;
            int H = H();
            if (H > 0) {
                int i = this.i;
                int i2 = this.k;
                if (H <= i - i2) {
                    if (this.h && this.n) {
                        w = h.r0(this.g, i2, H);
                    } else {
                        w = h.w(this.g, i2, H);
                    }
                    this.k += H;
                    return w;
                }
            }
            if (H == 0) {
                return h.b;
            }
            return h.q0(E(H));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public double m() throws IOException {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int n() throws IOException {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int o() throws IOException {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long p() throws IOException {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public float q() throws IOException {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int r() throws IOException {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long s() throws IOException {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int t() throws IOException {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long u() throws IOException {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int v() throws IOException {
            return i.b(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public long w() throws IOException {
            return i.c(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String x() throws IOException {
            int H = H();
            if (H > 0) {
                int i = this.i;
                int i2 = this.k;
                if (H <= i - i2) {
                    String str = new String(this.g, i2, H, y.b);
                    this.k += H;
                    return str;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H < 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public String y() throws IOException {
            int H = H();
            if (H > 0) {
                int i = this.i;
                int i2 = this.k;
                if (H <= i - i2) {
                    String e = i1.e(this.g, i2, H);
                    this.k += H;
                    return e;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i
        public int z() throws IOException {
            if (e()) {
                this.m = 0;
                return 0;
            }
            int H = H();
            this.m = H;
            if (j1.a(H) != 0) {
                return this.m;
            }
            throw InvalidProtocolBufferException.c();
        }

        private b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.o = Integer.MAX_VALUE;
            this.g = bArr;
            this.i = i2 + i;
            this.k = i;
            this.l = i;
            this.h = z;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static i f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static i g(byte[] bArr, int i, int i2) {
        return h(bArr, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i h(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.j(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int A() throws IOException;

    public abstract long B() throws IOException;

    public abstract boolean C(int i) throws IOException;

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void i(int i);

    public abstract int j(int i) throws InvalidProtocolBufferException;

    public abstract boolean k() throws IOException;

    public abstract h l() throws IOException;

    public abstract double m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract float q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract String x() throws IOException;

    public abstract String y() throws IOException;

    public abstract int z() throws IOException;

    private i() {
        this.b = f;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
