package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.f0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* compiled from: BinaryReader.java */
/* loaded from: classes2.dex */
abstract class f implements x0 {

    /* compiled from: BinaryReader.java */
    /* loaded from: classes2.dex */
    private static final class b extends f {
        private final boolean a;
        private final byte[] b;
        private int c;
        private final int d;
        private int e;
        private int f;
        private int g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super();
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

        private <T> T T(y0<T> y0Var, o oVar) throws IOException {
            int i = this.g;
            this.g = j1.c(j1.a(this.f), 4);
            try {
                T e = y0Var.e();
                y0Var.i(e, this, oVar);
                y0Var.b(e);
                if (this.f == this.g) {
                    return e;
                }
                throw InvalidProtocolBufferException.j();
            } finally {
                this.g = i;
            }
        }

        private int U() throws IOException {
            e0(4);
            return V();
        }

        private int V() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long W() throws IOException {
            e0(8);
            return X();
        }

        private long X() {
            int i = this.c;
            byte[] bArr = this.b;
            this.c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private <T> T Y(y0<T> y0Var, o oVar) throws IOException {
            int b0 = b0();
            e0(b0);
            int i = this.e;
            int i2 = this.c + b0;
            this.e = i2;
            try {
                T e = y0Var.e();
                y0Var.i(e, this, oVar);
                y0Var.b(e);
                if (this.c == i2) {
                    return e;
                }
                throw InvalidProtocolBufferException.j();
            } finally {
                this.e = i;
            }
        }

        private int b0() throws IOException {
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
                    return (int) d0();
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
                                                        throw InvalidProtocolBufferException.f();
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

        private long d0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte S = S();
                j |= (S & Byte.MAX_VALUE) << i;
                if ((S & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void e0(int i) throws IOException {
            if (i >= 0 && i <= this.e - this.c) {
                return;
            }
            throw InvalidProtocolBufferException.m();
        }

        private void f0(int i) throws IOException {
            if (this.c == i) {
                return;
            }
            throw InvalidProtocolBufferException.m();
        }

        private void g0(int i) throws IOException {
            if (j1.b(this.f) == i) {
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        private void h0(int i) throws IOException {
            e0(i);
            this.c += i;
        }

        private void i0() throws IOException {
            int i = this.g;
            this.g = j1.c(j1.a(this.f), 4);
            while (A() != Integer.MAX_VALUE && D()) {
            }
            if (this.f == this.g) {
                this.g = i;
                return;
            }
            throw InvalidProtocolBufferException.j();
        }

        private void j0() throws IOException {
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
            k0();
        }

        private void k0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (S() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void l0(int i) throws IOException {
            e0(i);
            if ((i & 3) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.j();
        }

        private void m0(int i) throws IOException {
            e0(i);
            if ((i & 7) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int A() throws IOException {
            if (R()) {
                return Integer.MAX_VALUE;
            }
            int b0 = b0();
            this.f = b0;
            if (b0 == this.g) {
                return Integer.MAX_VALUE;
            }
            return j1.a(b0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void B(List<String> list) throws IOException {
            a0(list, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void C(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof u) {
                u uVar = (u) list;
                int b = j1.b(this.f);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            uVar.g(readFloat());
                            if (R()) {
                                return;
                            }
                            i2 = this.c;
                        } while (b0() == this.f);
                        this.c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                int b0 = b0();
                l0(b0);
                int i3 = this.c + b0;
                while (this.c < i3) {
                    uVar.g(Float.intBitsToFloat(V()));
                }
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (R()) {
                            return;
                        }
                        i = this.c;
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            int b02 = b0();
            l0(b02);
            int i4 = this.c + b02;
            while (this.c < i4) {
                list.add(Float.valueOf(Float.intBitsToFloat(V())));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public boolean D() throws IOException {
            int i;
            if (!R() && (i = this.f) != this.g) {
                int b = j1.b(i);
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b == 5) {
                                    h0(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.e();
                            }
                            i0();
                            return true;
                        }
                        h0(b0());
                        return true;
                    }
                    h0(8);
                    return true;
                }
                j0();
                return true;
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int E() throws IOException {
            g0(5);
            return U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void F(List<h> list) throws IOException {
            int i;
            if (j1.b(this.f) == 2) {
                do {
                    list.add(o());
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void G(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof l) {
                l lVar = (l) list;
                int b = j1.b(this.f);
                if (b != 1) {
                    if (b == 2) {
                        int b0 = b0();
                        m0(b0);
                        int i3 = this.c + b0;
                        while (this.c < i3) {
                            lVar.g(Double.longBitsToDouble(X()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    lVar.g(readDouble());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 1) {
                if (b2 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i4 = this.c + b02;
                    while (this.c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(X())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public long H() throws IOException {
            g0(0);
            return c0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public String I() throws IOException {
            return Z(true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public <T> T J(y0<T> y0Var, o oVar) throws IOException {
            g0(3);
            return (T) T(y0Var, oVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public <T> T K(Class<T> cls, o oVar) throws IOException {
            g0(3);
            return (T) T(u0.a().d(cls), oVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public <K, V> void L(Map<K, V> map, f0.a<K, V> aVar, o oVar) throws IOException {
            g0(2);
            int b0 = b0();
            e0(b0);
            int i = this.e;
            this.e = this.c + b0;
            try {
                throw null;
            } catch (Throwable th) {
                this.e = i;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public <T> void M(List<T> list, y0<T> y0Var, o oVar) throws IOException {
            int i;
            if (j1.b(this.f) == 2) {
                int i2 = this.f;
                do {
                    list.add(Y(y0Var, oVar));
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (b0() == i2);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public <T> T N(y0<T> y0Var, o oVar) throws IOException {
            g0(2);
            return (T) Y(y0Var, oVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public <T> T O(Class<T> cls, o oVar) throws IOException {
            g0(2);
            return (T) Y(u0.a().d(cls), oVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public <T> void P(List<T> list, y0<T> y0Var, o oVar) throws IOException {
            int i;
            if (j1.b(this.f) == 3) {
                int i2 = this.f;
                do {
                    list.add(T(y0Var, oVar));
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (b0() == i2);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        public String Z(boolean z) throws IOException {
            g0(2);
            int b0 = b0();
            if (b0 == 0) {
                return "";
            }
            e0(b0);
            if (z) {
                byte[] bArr = this.b;
                int i = this.c;
                if (!i1.n(bArr, i, i + b0)) {
                    throw InvalidProtocolBufferException.d();
                }
            }
            String str = new String(this.b, this.c, b0, y.b);
            this.c += b0;
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int a() {
            return this.f;
        }

        public void a0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (j1.b(this.f) == 2) {
                if ((list instanceof co5) && !z) {
                    co5 co5Var = (co5) list;
                    do {
                        co5Var.E1(o());
                        if (R()) {
                            return;
                        }
                        i2 = this.c;
                    } while (b0() == this.f);
                    this.c = i2;
                    return;
                }
                do {
                    list.add(Z(z));
                    if (R()) {
                        return;
                    }
                    i = this.c;
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public long b() throws IOException {
            g0(1);
            return W();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof x) {
                x xVar = (x) list;
                int b = j1.b(this.f);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            xVar.S0(E());
                            if (R()) {
                                return;
                            }
                            i2 = this.c;
                        } while (b0() == this.f);
                        this.c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                int b0 = b0();
                l0(b0);
                int i3 = this.c + b0;
                while (this.c < i3) {
                    xVar.S0(V());
                }
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(E()));
                        if (R()) {
                            return;
                        }
                        i = this.c;
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            int b02 = b0();
            l0(b02);
            int i4 = this.c + b02;
            while (this.c < i4) {
                list.add(Integer.valueOf(V()));
            }
        }

        public long c0() throws IOException {
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
                    return d0();
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
                                                        throw InvalidProtocolBufferException.f();
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

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void d(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof d0) {
                d0 d0Var = (d0) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            d0Var.h(i.c(c0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    d0Var.h(y());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Long.valueOf(i.c(c0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(y()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public boolean e() throws IOException {
            g0(0);
            if (b0() == 0) {
                return false;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public long f() throws IOException {
            g0(1);
            return W();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof d0) {
                d0 d0Var = (d0) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            d0Var.h(c0());
                        }
                        f0(b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    d0Var.h(s());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Long.valueOf(c0()));
                    }
                    f0(b02);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(s()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int h() throws IOException {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void i(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof d0) {
                d0 d0Var = (d0) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            d0Var.h(c0());
                        }
                        f0(b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    d0Var.h(H());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Long.valueOf(c0()));
                    }
                    f0(b02);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(H()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void j(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof x) {
                x xVar = (x) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            xVar.S0(b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    xVar.S0(k());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(k()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int k() throws IOException {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int l() throws IOException {
            g0(0);
            return i.b(b0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void m(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof g) {
                g gVar = (g) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            if (b0() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            gVar.h(z2);
                        }
                        f0(b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    gVar.h(e());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        if (b0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    f0(b02);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Boolean.valueOf(e()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void n(List<String> list) throws IOException {
            a0(list, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public h o() throws IOException {
            h w;
            g0(2);
            int b0 = b0();
            if (b0 == 0) {
                return h.b;
            }
            e0(b0);
            if (this.a) {
                w = h.r0(this.b, this.c, b0);
            } else {
                w = h.w(this.b, this.c, b0);
            }
            this.c += b0;
            return w;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int p() throws IOException {
            g0(0);
            return b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void q(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof d0) {
                d0 d0Var = (d0) list;
                int b = j1.b(this.f);
                if (b != 1) {
                    if (b == 2) {
                        int b0 = b0();
                        m0(b0);
                        int i3 = this.c + b0;
                        while (this.c < i3) {
                            d0Var.h(X());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    d0Var.h(b());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 1) {
                if (b2 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i4 = this.c + b02;
                    while (this.c < i4) {
                        list.add(Long.valueOf(X()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(b()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void r(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof x) {
                x xVar = (x) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            xVar.S0(i.b(b0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    xVar.S0(l());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Integer.valueOf(i.b(b0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(l()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public double readDouble() throws IOException {
            g0(1);
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public float readFloat() throws IOException {
            g0(5);
            return Float.intBitsToFloat(U());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public long s() throws IOException {
            g0(0);
            return c0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof x) {
                x xVar = (x) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            xVar.S0(b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    xVar.S0(h());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(h()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public int u() throws IOException {
            g0(5);
            return U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void v(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof d0) {
                d0 d0Var = (d0) list;
                int b = j1.b(this.f);
                if (b != 1) {
                    if (b == 2) {
                        int b0 = b0();
                        m0(b0);
                        int i3 = this.c + b0;
                        while (this.c < i3) {
                            d0Var.h(X());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    d0Var.h(f());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 1) {
                if (b2 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i4 = this.c + b02;
                    while (this.c < i4) {
                        list.add(Long.valueOf(X()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Long.valueOf(f()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void w(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof x) {
                x xVar = (x) list;
                int b = j1.b(this.f);
                if (b != 0) {
                    if (b == 2) {
                        int b0 = this.c + b0();
                        while (this.c < b0) {
                            xVar.S0(b0());
                        }
                        f0(b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    xVar.S0(p());
                    if (R()) {
                        return;
                    }
                    i2 = this.c;
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 0) {
                if (b2 == 2) {
                    int b02 = this.c + b0();
                    while (this.c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    f0(b02);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(p()));
                if (R()) {
                    return;
                }
                i = this.c;
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public void x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof x) {
                x xVar = (x) list;
                int b = j1.b(this.f);
                if (b != 2) {
                    if (b == 5) {
                        do {
                            xVar.S0(u());
                            if (R()) {
                                return;
                            }
                            i2 = this.c;
                        } while (b0() == this.f);
                        this.c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.e();
                }
                int b0 = b0();
                l0(b0);
                int i3 = this.c + b0;
                while (this.c < i3) {
                    xVar.S0(V());
                }
                return;
            }
            int b2 = j1.b(this.f);
            if (b2 != 2) {
                if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(u()));
                        if (R()) {
                            return;
                        }
                        i = this.c;
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            int b02 = b0();
            l0(b02);
            int i4 = this.c + b02;
            while (this.c < i4) {
                list.add(Integer.valueOf(V()));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public long y() throws IOException {
            g0(0);
            return i.c(c0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.x0
        public String z() throws IOException {
            return Z(false);
        }
    }

    private f() {
    }

    public static f Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
