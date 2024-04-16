package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.i1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* compiled from: BinaryReader.java */
/* loaded from: classes.dex */
abstract class e implements w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BinaryReader.java */
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

    /* compiled from: BinaryReader.java */
    /* loaded from: classes.dex */
    private static final class b extends e {
        private final boolean a;
        private final byte[] b;
        private int c;
        private final int d;
        private int e;
        private int f;
        private int g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.a = z;
            this.b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.c = arrayOffset;
            this.d = arrayOffset;
            this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            if (this.c == this.e) {
                return true;
            }
            return false;
        }

        private byte S() throws IOException {
            int i = this.c;
            if (i != this.e) {
                byte[] bArr = this.b;
                this.c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m();
        }

        private Object T(i1.b bVar, Class<?> cls, n nVar) throws IOException {
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

        private <T> T U(x0<T> x0Var, n nVar) throws IOException {
            int i = this.g;
            this.g = i1.c(i1.a(this.f), 4);
            try {
                T e = x0Var.e();
                x0Var.h(e, this, nVar);
                x0Var.b(e);
                if (this.f == this.g) {
                    return e;
                }
                throw InvalidProtocolBufferException.i();
            } finally {
                this.g = i;
            }
        }

        private int V() throws IOException {
            f0(4);
            return W();
        }

        private int W() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long X() throws IOException {
            f0(8);
            return Y();
        }

        private long Y() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private <T> T Z(x0<T> x0Var, n nVar) throws IOException {
            int c0 = c0();
            f0(c0);
            int i = this.e;
            int i2 = this.c + c0;
            this.e = i2;
            try {
                T e = x0Var.e();
                x0Var.h(e, this, nVar);
                x0Var.b(e);
                if (this.c == i2) {
                    return e;
                }
                throw InvalidProtocolBufferException.i();
            } finally {
                this.e = i;
            }
        }

        private int c0() throws IOException {
            int i;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 != i2) {
                byte[] bArr = this.b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.c = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return (int) e0();
                } else {
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
                                                    } else {
                                                        throw InvalidProtocolBufferException.e();
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
                    this.c = i5;
                    return i;
                }
            }
            throw InvalidProtocolBufferException.m();
        }

        private long e0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte S = S();
                j |= (S & Byte.MAX_VALUE) << i;
                if ((S & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void f0(int i) throws IOException {
            if (i >= 0 && i <= this.e - this.c) {
                return;
            }
            throw InvalidProtocolBufferException.m();
        }

        private void g0(int i) throws IOException {
            if (this.c == i) {
                return;
            }
            throw InvalidProtocolBufferException.m();
        }

        private void h0(int i) throws IOException {
            if (i1.b(this.f) == i) {
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        private void i0(int i) throws IOException {
            f0(i);
            this.c += i;
        }

        private void j0() throws IOException {
            int i = this.g;
            this.g = i1.c(i1.a(this.f), 4);
            while (A() != Integer.MAX_VALUE && D()) {
            }
            if (this.f == this.g) {
                this.g = i;
                return;
            }
            throw InvalidProtocolBufferException.i();
        }

        private void k0() throws IOException {
            int i = this.e;
            int i2 = this.c;
            if (i - i2 >= 10) {
                byte[] bArr = this.b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            l0();
        }

        private void l0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void m0(int i) throws IOException {
            f0(i);
            if ((i & 3) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.i();
        }

        private void n0(int i) throws IOException {
            f0(i);
            if ((i & 7) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int A() throws IOException {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int c0 = c0();
            this.f = c0;
            if (c0 == this.g) {
                return Integer.MAX_VALUE;
            }
            return i1.a(c0);
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void B(List<String> list) throws IOException {
            b0(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void C(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof t) {
                t tVar = (t) list;
                int b = i1.b(this.f);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            tVar.g(readFloat());
                            if (R()) {
                                return;
                            }
                            i2 = this.c;
                        } while (c0() == this.f);
                        this.c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                int c0 = c0();
                m0(c0);
                int i3 = this.c + c0;
                while (this.c < i3) {
                    tVar.g(Float.intBitsToFloat(W()));
                }
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (R()) {
                            return;
                        }
                        i = this.c;
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            int c02 = c0();
            m0(c02);
            int i4 = this.c + c02;
            while (this.c < i4) {
                list.add(Float.valueOf(Float.intBitsToFloat(W())));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public boolean D() throws IOException {
            int i;
            if (!R() && (i = this.f) != this.g) {
                int b = i1.b(i);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 5) {
                                    i0(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.d();
                            }
                            j0();
                            return true;
                        }
                        i0(c0());
                        return true;
                    }
                    i0(8);
                    return true;
                }
                k0();
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int E() throws IOException {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void F(List<g> list) throws IOException {
            int i;
            if (i1.b(this.f) == 2) {
                do {
                    list.add(o());
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void G(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof k) {
                k kVar = (k) list;
                int b = i1.b(this.f);
                if (b != 1) {
                    if (b == 2) {
                        int c0 = c0();
                        n0(c0);
                        int i3 = this.c + c0;
                        while (this.c < i3) {
                            kVar.g(Double.longBitsToDouble(Y()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    kVar.g(readDouble());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 1) {
                if (b2 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public long H() throws IOException {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public String I() throws IOException {
            return a0(true);
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public <T> T J(x0<T> x0Var, n nVar) throws IOException {
            h0(2);
            return (T) Z(x0Var, nVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.w0
        public <T> void K(List<T> list, x0<T> x0Var, n nVar) throws IOException {
            int i;
            if (i1.b(this.f) == 2) {
                int i2 = this.f;
                do {
                    list.add(Z(x0Var, nVar));
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (c0() == i2);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public <T> T L(x0<T> x0Var, n nVar) throws IOException {
            h0(3);
            return (T) U(x0Var, nVar);
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public <T> T M(Class<T> cls, n nVar) throws IOException {
            h0(2);
            return (T) Z(t0.a().d(cls), nVar);
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public <T> T N(Class<T> cls, n nVar) throws IOException {
            h0(3);
            return (T) U(t0.a().d(cls), nVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.w0
        public <K, V> void O(Map<K, V> map, e0.a<K, V> aVar, n nVar) throws IOException {
            h0(2);
            int c0 = c0();
            f0(c0);
            int i = this.e;
            this.e = this.c + c0;
            try {
                Object obj = aVar.b;
                Object obj2 = aVar.d;
                while (true) {
                    int A = A();
                    if (A == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (A != 1) {
                        if (A != 2) {
                            try {
                                if (!D()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                    break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                if (!D()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                }
                            }
                        } else {
                            obj2 = T(aVar.c, aVar.d.getClass(), nVar);
                        }
                    } else {
                        obj = T(aVar.a, null, null);
                    }
                }
            } finally {
                this.e = i;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.w0
        public <T> void P(List<T> list, x0<T> x0Var, n nVar) throws IOException {
            int i;
            if (i1.b(this.f) == 3) {
                int i2 = this.f;
                do {
                    list.add(U(x0Var, nVar));
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (c0() == i2);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int a() {
            return this.f;
        }

        public String a0(boolean z) throws IOException {
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return "";
            }
            f0(c0);
            if (z) {
                byte[] bArr = this.b;
                int i = this.c;
                if (!h1.n(bArr, i, i + c0)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.b, this.c, c0, x.a);
            this.c += c0;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public long b() throws IOException {
            h0(1);
            return X();
        }

        public void b0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (i1.b(this.f) == 2) {
                if ((list instanceof eo5) && !z) {
                    eo5 eo5Var = (eo5) list;
                    do {
                        eo5Var.Y0(o());
                        if (R()) {
                            return;
                        }
                        i2 = this.c;
                    } while (c0() == this.f);
                    this.c = i2;
                    return;
                }
                do {
                    list.add(a0(z));
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (c0() == this.f);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof w) {
                w wVar = (w) list;
                int b = i1.b(this.f);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            wVar.S0(E());
                            if (R()) {
                                return;
                            }
                            i2 = this.c;
                        } while (c0() == this.f);
                        this.c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                int c0 = c0();
                m0(c0);
                int i3 = this.c + c0;
                while (this.c < i3) {
                    wVar.S0(W());
                }
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(E()));
                        if (R()) {
                            return;
                        }
                        i = this.c;
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            int c02 = c0();
            m0(c02);
            int i4 = this.c + c02;
            while (this.c < i4) {
                list.add(Integer.valueOf(W()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void d(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            c0Var.h(h.c(d0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    c0Var.h(y());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Long.valueOf(h.c(d0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(y()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        public long d0() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.c;
            int i2 = this.e;
            if (i2 != i) {
                byte[] bArr = this.b;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.c = i3;
                    return b;
                } else if (i2 - i3 < 9) {
                    return e0();
                } else {
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
                                                    } else {
                                                        throw InvalidProtocolBufferException.e();
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
                    this.c = i4;
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public boolean e() throws IOException {
            h0(0);
            if (c0() == 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public long f() throws IOException {
            h0(1);
            return X();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            c0Var.h(d0());
                        }
                        g0(c0);
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    c0Var.h(s());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Long.valueOf(d0()));
                    }
                    g0(c02);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(s()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int h() throws IOException {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void i(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            c0Var.h(d0());
                        }
                        g0(c0);
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    c0Var.h(H());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Long.valueOf(d0()));
                    }
                    g0(c02);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(H()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void j(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof w) {
                w wVar = (w) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            wVar.S0(c0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    wVar.S0(k());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(k()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int k() throws IOException {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int l() throws IOException {
            h0(0);
            return h.b(c0());
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void m(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof f) {
                f fVar = (f) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            if (c0() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            fVar.h(z2);
                        }
                        g0(c0);
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    fVar.h(e());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        if (c0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    g0(c02);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Boolean.valueOf(e()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void n(List<String> list) throws IOException {
            b0(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public g o() throws IOException {
            g w;
            h0(2);
            int c0 = c0();
            if (c0 == 0) {
                return g.b;
            }
            f0(c0);
            if (this.a) {
                w = g.q0(this.b, this.c, c0);
            } else {
                w = g.w(this.b, this.c, c0);
            }
            this.c += c0;
            return w;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int p() throws IOException {
            h0(0);
            return c0();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void q(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b = i1.b(this.f);
                if (b != 1) {
                    if (b == 2) {
                        int c0 = c0();
                        n0(c0);
                        int i3 = this.c + c0;
                        while (this.c < i3) {
                            c0Var.h(Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    c0Var.h(b());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 1) {
                if (b2 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(b()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void r(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof w) {
                w wVar = (w) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            wVar.S0(h.b(c0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    wVar.S0(l());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(h.b(c0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(l()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public double readDouble() throws IOException {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public float readFloat() throws IOException {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public long s() throws IOException {
            h0(0);
            return d0();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof w) {
                w wVar = (w) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            wVar.S0(c0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    wVar.S0(h());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(h()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public int u() throws IOException {
            h0(5);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void v(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b = i1.b(this.f);
                if (b != 1) {
                    if (b == 2) {
                        int c0 = c0();
                        n0(c0);
                        int i3 = this.c + c0;
                        while (this.c < i3) {
                            c0Var.h(Y());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    c0Var.h(f());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 1) {
                if (b2 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i4 = this.c + c02;
                    while (this.c < i4) {
                        list.add(Long.valueOf(Y()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Long.valueOf(f()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void w(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof w) {
                w wVar = (w) list;
                int b = i1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int c0 = this.c + c0();
                        while (this.c < c0) {
                            wVar.S0(c0());
                        }
                        g0(c0);
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    wVar.S0(p());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (c0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int c02 = this.c + c0();
                    while (this.c < c02) {
                        list.add(Integer.valueOf(c0()));
                    }
                    g0(c02);
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(p()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (c0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public void x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof w) {
                w wVar = (w) list;
                int b = i1.b(this.f);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            wVar.S0(u());
                            if (R()) {
                                return;
                            }
                            i2 = this.c;
                        } while (c0() == this.f);
                        this.c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.d();
                }
                int c0 = c0();
                m0(c0);
                int i3 = this.c + c0;
                while (this.c < i3) {
                    wVar.S0(W());
                }
                return;
            }
            int b2 = i1.b(this.f);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(u()));
                        if (R()) {
                            return;
                        }
                        i = this.c;
                    } while (c0() == this.f);
                    this.c = i;
                    return;
                }
                throw InvalidProtocolBufferException.d();
            }
            int c02 = c0();
            m0(c02);
            int i4 = this.c + c02;
            while (this.c < i4) {
                list.add(Integer.valueOf(W()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public long y() throws IOException {
            h0(0);
            return h.c(d0());
        }

        @Override // androidx.datastore.preferences.protobuf.w0
        public String z() throws IOException {
            return a0(false);
        }
    }

    private e() {
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
