package defpackage;

import java.math.BigInteger;
import java.util.Random;
/* renamed from: na3  reason: default package */
/* loaded from: classes3.dex */
public abstract class na3 implements da3 {

    /* renamed from: na3$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends na3 {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [na3] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v3, types: [na3] */
        public na3 u() {
            int f = f();
            if ((f & 1) != 0) {
                int i = (f + 1) >>> 1;
                int a = 31 - g65.a(i);
                int i2 = 1;
                na3 na3Var = this;
                while (a > 0) {
                    na3Var = na3Var.q(i2 << 1).a(na3Var);
                    a--;
                    i2 = i >>> a;
                    if ((i2 & 1) != 0) {
                        na3Var = na3Var.q(2).a(this);
                    }
                }
                return na3Var;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }

        public boolean v() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [na3] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v2, types: [na3] */
        public int w() {
            int f = f();
            int a = 31 - g65.a(f);
            int i = 1;
            na3 na3Var = this;
            while (a > 0) {
                na3Var = na3Var.q(i).a(na3Var);
                a--;
                i = f >>> a;
                if ((i & 1) != 0) {
                    na3Var = na3Var.o().a(this);
                }
            }
            if (na3Var.i()) {
                return 0;
            }
            if (na3Var.h()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    /* renamed from: na3$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends na3 {
    }

    /* renamed from: na3$c */
    /* loaded from: classes3.dex */
    public static class c extends a {
        private int g;
        private int h;
        private int[] i;
        iy5 j;

        public c(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.g = 2;
                this.i = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else {
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.g = 3;
                this.i = new int[]{i2, i3, i4};
            }
            this.h = i;
            this.j = new iy5(bigInteger);
        }

        @Override // defpackage.na3
        public na3 a(na3 na3Var) {
            iy5 iy5Var = (iy5) this.j.clone();
            iy5Var.g(((c) na3Var).j, 0);
            return new c(this.h, this.i, iy5Var);
        }

        @Override // defpackage.na3
        public na3 b() {
            return new c(this.h, this.i, this.j.e());
        }

        @Override // defpackage.na3
        public int c() {
            return this.j.m();
        }

        @Override // defpackage.na3
        public na3 d(na3 na3Var) {
            return j(na3Var.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.h == cVar.h && this.g == cVar.g && tr.e(this.i, cVar.i) && this.j.equals(cVar.j)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.na3
        public int f() {
            return this.h;
        }

        @Override // defpackage.na3
        public na3 g() {
            int i = this.h;
            int[] iArr = this.i;
            return new c(i, iArr, this.j.y(i, iArr));
        }

        @Override // defpackage.na3
        public boolean h() {
            return this.j.v();
        }

        public int hashCode() {
            return (this.j.hashCode() ^ this.h) ^ tr.I(this.i);
        }

        @Override // defpackage.na3
        public boolean i() {
            return this.j.w();
        }

        @Override // defpackage.na3
        public na3 j(na3 na3Var) {
            int i = this.h;
            int[] iArr = this.i;
            return new c(i, iArr, this.j.z(((c) na3Var).j, i, iArr));
        }

        @Override // defpackage.na3
        public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
            return l(na3Var, na3Var2, na3Var3);
        }

        @Override // defpackage.na3
        public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
            iy5 iy5Var = this.j;
            iy5 iy5Var2 = ((c) na3Var).j;
            iy5 iy5Var3 = ((c) na3Var2).j;
            iy5 iy5Var4 = ((c) na3Var3).j;
            iy5 C = iy5Var.C(iy5Var2, this.h, this.i);
            iy5 C2 = iy5Var3.C(iy5Var4, this.h, this.i);
            if (C == iy5Var || C == iy5Var2) {
                C = (iy5) C.clone();
            }
            C.g(C2, 0);
            C.F(this.h, this.i);
            return new c(this.h, this.i, C);
        }

        @Override // defpackage.na3
        public na3 n() {
            if (!this.j.w() && !this.j.v()) {
                return q(this.h - 1);
            }
            return this;
        }

        @Override // defpackage.na3
        public na3 o() {
            int i = this.h;
            int[] iArr = this.i;
            return new c(i, iArr, this.j.A(i, iArr));
        }

        @Override // defpackage.na3
        public na3 p(na3 na3Var, na3 na3Var2) {
            iy5 iy5Var = this.j;
            iy5 iy5Var2 = ((c) na3Var).j;
            iy5 iy5Var3 = ((c) na3Var2).j;
            iy5 P = iy5Var.P(this.h, this.i);
            iy5 C = iy5Var2.C(iy5Var3, this.h, this.i);
            if (P == iy5Var) {
                P = (iy5) P.clone();
            }
            P.g(C, 0);
            P.F(this.h, this.i);
            return new c(this.h, this.i, P);
        }

        @Override // defpackage.na3
        public na3 q(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.h;
            int[] iArr = this.i;
            return new c(i2, iArr, this.j.B(i, i2, iArr));
        }

        @Override // defpackage.na3
        public na3 r(na3 na3Var) {
            return a(na3Var);
        }

        @Override // defpackage.na3
        public boolean s() {
            return this.j.S();
        }

        @Override // defpackage.na3
        public BigInteger t() {
            return this.j.T();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(int i, int[] iArr, iy5 iy5Var) {
            this.h = i;
            this.g = iArr.length == 1 ? 2 : 3;
            this.i = iArr;
            this.j = iy5Var;
        }

        @Override // defpackage.na3
        public na3 m() {
            return this;
        }
    }

    /* renamed from: na3$d */
    /* loaded from: classes3.dex */
    public static class d extends b {
        BigInteger g;
        BigInteger h;
        BigInteger i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 != null && bigInteger3.signum() >= 0 && bigInteger3.compareTo(bigInteger) < 0) {
                this.g = bigInteger;
                this.h = bigInteger2;
                this.i = bigInteger3;
                return;
            }
            throw new IllegalArgumentException("x value invalid in Fp field element");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static BigInteger u(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength >= 96 && bigInteger.shiftRight(bitLength - 64).longValue() == -1) {
                return da3.b.shiftLeft(bitLength).subtract(bigInteger);
            }
            return null;
        }

        private na3 v(na3 na3Var) {
            if (!na3Var.o().equals(this)) {
                return null;
            }
            return na3Var;
        }

        private BigInteger[] w(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = da3.b;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = da3.c;
            BigInteger bigInteger8 = bigInteger6;
            for (int i = bitLength - 1; i >= lowestSetBit + 1; i--) {
                bigInteger4 = B(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i)) {
                    bigInteger8 = B(bigInteger4, bigInteger2);
                    bigInteger6 = B(bigInteger6, bigInteger5);
                    bigInteger7 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = C(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger C = C(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger C2 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = C(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = C2;
                    bigInteger6 = C;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger B = B(bigInteger4, bigInteger8);
            BigInteger B2 = B(B, bigInteger2);
            BigInteger C3 = C(bigInteger6.multiply(bigInteger7).subtract(B));
            BigInteger C4 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(B)));
            BigInteger B3 = B(B, B2);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                C3 = B(C3, C4);
                C4 = C(C4.multiply(C4).subtract(B3.shiftLeft(1)));
                B3 = B(B3, B3);
            }
            return new BigInteger[]{C3, C4};
        }

        protected BigInteger A(BigInteger bigInteger) {
            return db0.j(this.g, bigInteger);
        }

        protected BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
            return C(bigInteger.multiply(bigInteger2));
        }

        protected BigInteger C(BigInteger bigInteger) {
            boolean z;
            if (this.h != null) {
                if (bigInteger.signum() < 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    bigInteger = bigInteger.abs();
                }
                int bitLength = this.g.bitLength();
                boolean equals = this.h.equals(da3.b);
                while (bigInteger.bitLength() > bitLength + 1) {
                    BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                    BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                    if (!equals) {
                        shiftRight = shiftRight.multiply(this.h);
                    }
                    bigInteger = shiftRight.add(subtract);
                }
                while (bigInteger.compareTo(this.g) >= 0) {
                    bigInteger = bigInteger.subtract(this.g);
                }
                if (z && bigInteger.signum() != 0) {
                    return this.g.subtract(bigInteger);
                }
                return bigInteger;
            }
            return bigInteger.mod(this.g);
        }

        protected BigInteger D(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            if (subtract.signum() < 0) {
                return subtract.add(this.g);
            }
            return subtract;
        }

        @Override // defpackage.na3
        public na3 a(na3 na3Var) {
            return new d(this.g, this.h, x(this.i, na3Var.t()));
        }

        @Override // defpackage.na3
        public na3 b() {
            BigInteger add = this.i.add(da3.b);
            if (add.compareTo(this.g) == 0) {
                add = da3.a;
            }
            return new d(this.g, this.h, add);
        }

        @Override // defpackage.na3
        public na3 d(na3 na3Var) {
            return new d(this.g, this.h, B(this.i, A(na3Var.t())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.g.equals(dVar.g) && this.i.equals(dVar.i)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.na3
        public int f() {
            return this.g.bitLength();
        }

        @Override // defpackage.na3
        public na3 g() {
            return new d(this.g, this.h, A(this.i));
        }

        public int hashCode() {
            return this.g.hashCode() ^ this.i.hashCode();
        }

        @Override // defpackage.na3
        public na3 j(na3 na3Var) {
            return new d(this.g, this.h, B(this.i, na3Var.t()));
        }

        @Override // defpackage.na3
        public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
            BigInteger bigInteger = this.i;
            BigInteger t = na3Var.t();
            BigInteger t2 = na3Var2.t();
            BigInteger t3 = na3Var3.t();
            return new d(this.g, this.h, C(bigInteger.multiply(t).subtract(t2.multiply(t3))));
        }

        @Override // defpackage.na3
        public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
            BigInteger bigInteger = this.i;
            BigInteger t = na3Var.t();
            BigInteger t2 = na3Var2.t();
            BigInteger t3 = na3Var3.t();
            return new d(this.g, this.h, C(bigInteger.multiply(t).add(t2.multiply(t3))));
        }

        @Override // defpackage.na3
        public na3 m() {
            if (this.i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.g;
            return new d(bigInteger, this.h, bigInteger.subtract(this.i));
        }

        @Override // defpackage.na3
        public na3 n() {
            if (!i() && !h()) {
                if (this.g.testBit(0)) {
                    if (this.g.testBit(1)) {
                        BigInteger add = this.g.shiftRight(2).add(da3.b);
                        BigInteger bigInteger = this.g;
                        return v(new d(bigInteger, this.h, this.i.modPow(add, bigInteger)));
                    } else if (this.g.testBit(2)) {
                        BigInteger modPow = this.i.modPow(this.g.shiftRight(3), this.g);
                        BigInteger B = B(modPow, this.i);
                        if (B(B, modPow).equals(da3.b)) {
                            return v(new d(this.g, this.h, B));
                        }
                        return v(new d(this.g, this.h, B(B, da3.c.modPow(this.g.shiftRight(2), this.g))));
                    } else {
                        BigInteger shiftRight = this.g.shiftRight(1);
                        BigInteger modPow2 = this.i.modPow(shiftRight, this.g);
                        BigInteger bigInteger2 = da3.b;
                        if (!modPow2.equals(bigInteger2)) {
                            return null;
                        }
                        BigInteger bigInteger3 = this.i;
                        BigInteger y = y(y(bigInteger3));
                        BigInteger add2 = shiftRight.add(bigInteger2);
                        BigInteger subtract = this.g.subtract(bigInteger2);
                        Random random = new Random();
                        while (true) {
                            BigInteger bigInteger4 = new BigInteger(this.g.bitLength(), random);
                            if (bigInteger4.compareTo(this.g) < 0 && C(bigInteger4.multiply(bigInteger4).subtract(y)).modPow(shiftRight, this.g).equals(subtract)) {
                                BigInteger[] w = w(bigInteger4, bigInteger3, add2);
                                BigInteger bigInteger5 = w[0];
                                BigInteger bigInteger6 = w[1];
                                if (B(bigInteger6, bigInteger6).equals(y)) {
                                    return new d(this.g, this.h, z(bigInteger6));
                                }
                                if (!bigInteger5.equals(da3.b) && !bigInteger5.equals(subtract)) {
                                    return null;
                                }
                            }
                        }
                    }
                } else {
                    throw new RuntimeException("not done yet");
                }
            } else {
                return this;
            }
        }

        @Override // defpackage.na3
        public na3 o() {
            BigInteger bigInteger = this.g;
            BigInteger bigInteger2 = this.h;
            BigInteger bigInteger3 = this.i;
            return new d(bigInteger, bigInteger2, B(bigInteger3, bigInteger3));
        }

        @Override // defpackage.na3
        public na3 p(na3 na3Var, na3 na3Var2) {
            BigInteger bigInteger = this.i;
            BigInteger t = na3Var.t();
            BigInteger t2 = na3Var2.t();
            return new d(this.g, this.h, C(bigInteger.multiply(bigInteger).add(t.multiply(t2))));
        }

        @Override // defpackage.na3
        public na3 r(na3 na3Var) {
            return new d(this.g, this.h, D(this.i, na3Var.t()));
        }

        @Override // defpackage.na3
        public BigInteger t() {
            return this.i;
        }

        protected BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            if (add.compareTo(this.g) >= 0) {
                return add.subtract(this.g);
            }
            return add;
        }

        protected BigInteger y(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            if (shiftLeft.compareTo(this.g) >= 0) {
                return shiftLeft.subtract(this.g);
            }
            return shiftLeft;
        }

        protected BigInteger z(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }
    }

    public abstract na3 a(na3 na3Var);

    public abstract na3 b();

    public int c() {
        return t().bitLength();
    }

    public abstract na3 d(na3 na3Var);

    public byte[] e() {
        return db0.b((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract na3 g();

    public boolean h() {
        if (c() == 1) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (t().signum() == 0) {
            return true;
        }
        return false;
    }

    public abstract na3 j(na3 na3Var);

    public na3 k(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return j(na3Var).r(na3Var2.j(na3Var3));
    }

    public na3 l(na3 na3Var, na3 na3Var2, na3 na3Var3) {
        return j(na3Var).a(na3Var2.j(na3Var3));
    }

    public abstract na3 m();

    public abstract na3 n();

    public abstract na3 o();

    public na3 p(na3 na3Var, na3 na3Var2) {
        return o().a(na3Var.j(na3Var2));
    }

    public na3 q(int i) {
        na3 na3Var = this;
        for (int i2 = 0; i2 < i; i2++) {
            na3Var = na3Var.o();
        }
        return na3Var;
    }

    public abstract na3 r(na3 na3Var);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public String toString() {
        return t().toString(16);
    }
}
