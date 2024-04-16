package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: CodedInputStream.java */
/* loaded from: classes.dex */
public abstract class h {
    int a;
    int b;
    int c;
    i d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class b extends h {
        private final byte[] f;
        private final boolean g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;
        private int n;

        private void M() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = i - this.k;
            int i3 = this.n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.i = i4;
                this.h = i - i4;
                return;
            }
            this.i = 0;
        }

        private void P() throws IOException {
            if (this.h - this.j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void R() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws IOException {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    String e = h1.e(this.f, i2, J);
                    this.j += J;
                    return e;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int B() throws IOException {
            if (e()) {
                this.l = 0;
                return 0;
            }
            int J = J();
            this.l = J;
            if (i1.a(J) != 0) {
                return this.l;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long D() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean E(int i) throws IOException {
            int b = i1.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    O(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.d();
                            }
                            return false;
                        }
                        N();
                        a(i1.c(i1.a(i), 4));
                        return true;
                    }
                    O(J());
                    return true;
                }
                O(8);
                return true;
            }
            P();
            return true;
        }

        public byte F() throws IOException {
            int i = this.j;
            if (i != this.h) {
                byte[] bArr = this.f;
                this.j = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m();
        }

        public byte[] G(int i) throws IOException {
            if (i > 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.j = i4;
                    return Arrays.copyOfRange(this.f, i3, i4);
                }
            }
            if (i <= 0) {
                if (i == 0) {
                    return x.c;
                }
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.m();
        }

        public int H() throws IOException {
            int i = this.j;
            if (this.h - i >= 4) {
                byte[] bArr = this.f;
                this.j = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.m();
        }

        public long I() throws IOException {
            int i = this.j;
            if (this.h - i >= 8) {
                byte[] bArr = this.f;
                this.j = i + 8;
                return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.m();
        }

        public int J() throws IOException {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.j = i4;
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
                    this.j = i5;
                    return i;
                }
            }
            return (int) L();
        }

        public long K() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.f;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.j = i3;
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
                    this.j = i4;
                    return j;
                }
            }
            return L();
        }

        long L() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte F = F();
                j |= (F & Byte.MAX_VALUE) << i;
                if ((F & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void N() throws IOException {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void O(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    this.j = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.l == i) {
                return;
            }
            throw InvalidProtocolBufferException.a();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int d() {
            return this.j - this.k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean e() throws IOException {
            if (this.j == this.h) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void k(int i) {
            this.n = i;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int l(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int d = i + d();
                int i2 = this.n;
                if (d <= i2) {
                    this.n = d;
                    M();
                    return i2;
                }
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean m() throws IOException {
            if (K() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g n() throws IOException {
            g w;
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    if (this.g && this.m) {
                        w = g.q0(this.f, i2, J);
                    } else {
                        w = g.w(this.f, i2, J);
                    }
                    this.j += J;
                    return w;
                }
            }
            if (J == 0) {
                return g.b;
            }
            return g.p0(G(J));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double o() throws IOException {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int p() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() throws IOException {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long r() throws IOException {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float s() throws IOException {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int t() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long u() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int v() throws IOException {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long w() throws IOException {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int x() throws IOException {
            return h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long y() throws IOException {
            return h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String z() throws IOException {
            int J = J();
            if (J > 0) {
                int i = this.h;
                int i2 = this.j;
                if (J <= i - i2) {
                    String str = new String(this.f, i2, J, x.a);
                    this.j += J;
                    return str;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.m();
        }

        private b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.n = Integer.MAX_VALUE;
            this.f = bArr;
            this.h = i2 + i;
            this.j = i;
            this.k = i;
            this.g = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class c extends h {
        private final InputStream f;
        private final byte[] g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;

        private g F(int i) throws IOException {
            byte[] I = I(i);
            if (I != null) {
                return g.u(I);
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> J = J(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, i4);
            for (byte[] bArr2 : J) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return g.p0(bArr);
        }

        private byte[] H(int i, boolean z) throws IOException {
            byte[] I = I(i);
            if (I != null) {
                if (z) {
                    return (byte[]) I.clone();
                }
                return I;
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> J = J(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, i4);
            for (byte[] bArr2 : J) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        private byte[] I(int i) throws IOException {
            if (i == 0) {
                return x.c;
            }
            if (i >= 0) {
                int i2 = this.l;
                int i3 = this.j;
                int i4 = i2 + i3 + i;
                if (i4 - this.c <= 0) {
                    int i5 = this.m;
                    if (i4 <= i5) {
                        int i6 = this.h - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.g, this.j, bArr, 0, i6);
                        this.l += this.h;
                        this.j = 0;
                        this.h = 0;
                        while (i6 < i) {
                            int read = this.f.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.l += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.m();
                            }
                        }
                        return bArr;
                    }
                    S((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.f();
        }

        private List<byte[]> J(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.l += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.m();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = this.l + i;
            int i3 = this.m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.i = i4;
                this.h = i - i4;
                return;
            }
            this.i = 0;
        }

        private void Q(int i) throws IOException {
            if (!X(i)) {
                if (i > (this.c - this.l) - this.j) {
                    throw InvalidProtocolBufferException.l();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        private void T(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.l;
                int i3 = this.j;
                int i4 = i2 + i3 + i;
                int i5 = this.m;
                if (i4 <= i5) {
                    this.l = i2 + i3;
                    int i6 = this.h - i3;
                    this.h = 0;
                    this.j = 0;
                    while (i6 < i) {
                        try {
                            long j = i - i6;
                            long skip = this.f.skip(j);
                            int i7 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i7 >= 0 && skip <= j) {
                                if (i7 == 0) {
                                    break;
                                }
                                i6 += (int) skip;
                            } else {
                                throw new IllegalStateException(this.f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } finally {
                            this.l += i6;
                            P();
                        }
                    }
                    if (i6 < i) {
                        int i8 = this.h;
                        int i9 = i8 - this.j;
                        this.j = i8;
                        Q(1);
                        while (true) {
                            int i10 = i - i9;
                            int i11 = this.h;
                            if (i10 > i11) {
                                i9 += i11;
                                this.j = i11;
                                Q(1);
                            } else {
                                this.j = i10;
                                return;
                            }
                        }
                    }
                } else {
                    S((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.m();
                }
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }

        private void U() throws IOException {
            if (this.h - this.j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void W() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private boolean X(int i) throws IOException {
            int i2 = this.j;
            int i3 = i2 + i;
            int i4 = this.h;
            if (i3 > i4) {
                int i5 = this.c;
                int i6 = this.l;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.m) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.g;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.l += i2;
                    this.h -= i2;
                    this.j = 0;
                }
                InputStream inputStream = this.f;
                byte[] bArr2 = this.g;
                int i7 = this.h;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.l) - i7));
                if (read != 0 && read >= -1 && read <= this.g.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.h += read;
                    P();
                    if (this.h >= i) {
                        return true;
                    }
                    return X(i);
                }
                throw new IllegalStateException(this.f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws IOException {
            byte[] H;
            int M = M();
            int i = this.j;
            int i2 = this.h;
            if (M <= i2 - i && M > 0) {
                H = this.g;
                this.j = i + M;
            } else if (M == 0) {
                return "";
            } else {
                i = 0;
                if (M <= i2) {
                    Q(M);
                    H = this.g;
                    this.j = M;
                } else {
                    H = H(M, false);
                }
            }
            return h1.e(H, i, M);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int B() throws IOException {
            if (e()) {
                this.k = 0;
                return 0;
            }
            int M = M();
            this.k = M;
            if (i1.a(M) != 0) {
                return this.k;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long D() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean E(int i) throws IOException {
            int b = i1.b(i);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b != 4) {
                                if (b == 5) {
                                    S(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.d();
                            }
                            return false;
                        }
                        R();
                        a(i1.c(i1.a(i), 4));
                        return true;
                    }
                    S(M());
                    return true;
                }
                S(8);
                return true;
            }
            U();
            return true;
        }

        public byte G() throws IOException {
            if (this.j == this.h) {
                Q(1);
            }
            byte[] bArr = this.g;
            int i = this.j;
            this.j = i + 1;
            return bArr[i];
        }

        public int K() throws IOException {
            int i = this.j;
            if (this.h - i < 4) {
                Q(4);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long L() throws IOException {
            int i = this.j;
            if (this.h - i < 8) {
                Q(8);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int M() throws IOException {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.j = i4;
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
                    this.j = i5;
                    return i;
                }
            }
            return (int) O();
        }

        public long N() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.j = i3;
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
                    this.j = i4;
                    return j;
                }
            }
            return O();
        }

        long O() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte G = G();
                j |= (G & Byte.MAX_VALUE) << i;
                if ((G & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public void R() throws IOException {
            int B;
            do {
                B = B();
                if (B == 0) {
                    return;
                }
            } while (E(B));
        }

        public void S(int i) throws IOException {
            int i2 = this.h;
            int i3 = this.j;
            if (i <= i2 - i3 && i >= 0) {
                this.j = i3 + i;
            } else {
                T(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.k == i) {
                return;
            }
            throw InvalidProtocolBufferException.a();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int d() {
            return this.l + this.j;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean e() throws IOException {
            if (this.j == this.h && !X(1)) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void k(int i) {
            this.m = i;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int l(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = i + this.l + this.j;
                int i3 = this.m;
                if (i2 <= i3) {
                    this.m = i2;
                    P();
                    return i3;
                }
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean m() throws IOException {
            if (N() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g n() throws IOException {
            int M = M();
            int i = this.h;
            int i2 = this.j;
            if (M <= i - i2 && M > 0) {
                g w = g.w(this.g, i2, M);
                this.j += M;
                return w;
            } else if (M == 0) {
                return g.b;
            } else {
                return F(M);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double o() throws IOException {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int p() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long r() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float s() throws IOException {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int t() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long u() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int v() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long w() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int x() throws IOException {
            return h.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long y() throws IOException {
            return h.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String z() throws IOException {
            int M = M();
            if (M > 0) {
                int i = this.h;
                int i2 = this.j;
                if (M <= i - i2) {
                    String str = new String(this.g, i2, M, x.a);
                    this.j += M;
                    return str;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M <= this.h) {
                Q(M);
                String str2 = new String(this.g, this.j, M, x.a);
                this.j += M;
                return str2;
            }
            return new String(H(M, false), x.a);
        }

        private c(InputStream inputStream, int i) {
            super();
            this.m = Integer.MAX_VALUE;
            x.b(inputStream, "input");
            this.f = inputStream;
            this.g = new byte[i];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static h g(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                return h(x.c);
            }
            return new c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static h i(byte[] bArr, int i, int i2) {
        return j(bArr, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h j(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.l(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A() throws IOException;

    public abstract int B() throws IOException;

    public abstract int C() throws IOException;

    public abstract long D() throws IOException;

    public abstract boolean E(int i) throws IOException;

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void k(int i);

    public abstract int l(int i) throws InvalidProtocolBufferException;

    public abstract boolean m() throws IOException;

    public abstract g n() throws IOException;

    public abstract double o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract float s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract String z() throws IOException;

    private h() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
