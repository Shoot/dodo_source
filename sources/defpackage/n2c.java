package defpackage;

import java.math.BigInteger;
/* renamed from: n2c  reason: default package */
/* loaded from: classes3.dex */
public abstract class n2c {
    private static final int[] a = {13, 41, 121, 337, 897, 2305};
    private static final byte[] b = new byte[0];
    private static final int[] c = new int[0];
    private static final jb3[] d = new jb3[0];

    /* renamed from: n2c$a */
    /* loaded from: classes3.dex */
    static class a implements hg8 {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.hg8
        public ig8 a(ig8 ig8Var) {
            m2c m2cVar;
            if (ig8Var instanceof m2c) {
                m2cVar = (m2c) ig8Var;
            } else {
                m2cVar = null;
            }
            if (m2cVar != null && m2cVar.b() == this.a) {
                m2cVar.l(0);
                return m2cVar;
            }
            m2c m2cVar2 = new m2c();
            m2cVar2.l(0);
            m2cVar2.i(this.a);
            if (m2cVar != null) {
                m2cVar2.j(m2cVar.c());
                m2cVar2.k(m2cVar.d());
                m2cVar2.m(m2cVar.f());
                m2cVar2.n(m2cVar.g());
            }
            return m2cVar2;
        }
    }

    /* renamed from: n2c$b */
    /* loaded from: classes3.dex */
    static class b implements hg8 {
        final /* synthetic */ int a;
        final /* synthetic */ boolean b;
        final /* synthetic */ jb3 c;
        final /* synthetic */ ea3 d;

        b(int i, boolean z, jb3 jb3Var, ea3 ea3Var) {
            this.a = i;
            this.b = z;
            this.c = jb3Var;
            this.d = ea3Var;
        }

        private boolean b(m2c m2cVar, int i, int i2, boolean z) {
            if (m2cVar != null && m2cVar.g() >= Math.max(m2cVar.b(), i) && c(m2cVar.c(), i2) && (!z || c(m2cVar.d(), i2))) {
                return true;
            }
            return false;
        }

        private boolean c(jb3[] jb3VarArr, int i) {
            if (jb3VarArr != null && jb3VarArr.length >= i) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00f2 A[LOOP:0: B:46:0x00f0->B:47:0x00f2, LOOP_END] */
        @Override // defpackage.hg8
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public defpackage.ig8 a(defpackage.ig8 r14) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.n2c.b.a(ig8):ig8");
        }
    }

    /* renamed from: n2c$c */
    /* loaded from: classes3.dex */
    static class c implements hg8 {
        final /* synthetic */ m2c a;
        final /* synthetic */ boolean b;
        final /* synthetic */ kb3 c;

        c(m2c m2cVar, boolean z, kb3 kb3Var) {
            this.a = m2cVar;
            this.b = z;
            this.c = kb3Var;
        }

        private boolean b(m2c m2cVar, int i, int i2, boolean z) {
            if (m2cVar != null && m2cVar.g() >= i && c(m2cVar.c(), i2) && (!z || c(m2cVar.d(), i2))) {
                return true;
            }
            return false;
        }

        private boolean c(jb3[] jb3VarArr, int i) {
            if (jb3VarArr != null && jb3VarArr.length >= i) {
                return true;
            }
            return false;
        }

        @Override // defpackage.hg8
        public ig8 a(ig8 ig8Var) {
            m2c m2cVar;
            if (ig8Var instanceof m2c) {
                m2cVar = (m2c) ig8Var;
            } else {
                m2cVar = null;
            }
            int g = this.a.g();
            if (b(m2cVar, g, this.a.c().length, this.b)) {
                m2cVar.a();
                return m2cVar;
            }
            m2c m2cVar2 = new m2c();
            m2cVar2.l(this.a.e());
            jb3 f = this.a.f();
            if (f != null) {
                m2cVar2.m(this.c.a(f));
            }
            jb3[] c = this.a.c();
            int length = c.length;
            jb3[] jb3VarArr = new jb3[length];
            for (int i = 0; i < c.length; i++) {
                jb3VarArr[i] = this.c.a(c[i]);
            }
            m2cVar2.j(jb3VarArr);
            m2cVar2.n(g);
            if (this.b) {
                jb3[] jb3VarArr2 = new jb3[length];
                for (int i2 = 0; i2 < length; i2++) {
                    jb3VarArr2[i2] = jb3VarArr[i2].z();
                }
                m2cVar2.k(jb3VarArr2);
            }
            return m2cVar2;
        }
    }

    public static void c(jb3 jb3Var) {
        int bitLength;
        ea3 i = jb3Var.i();
        if (i == null) {
            return;
        }
        BigInteger w = i.w();
        if (w == null) {
            bitLength = i.t() + 1;
        } else {
            bitLength = w.bitLength();
        }
        i.B(jb3Var, "bc_wnaf", new a(Math.min(16, i(bitLength) + 3)));
    }

    public static int[] d(BigInteger bigInteger) {
        int i;
        if ((bigInteger.bitLength() >>> 16) == 0) {
            if (bigInteger.signum() == 0) {
                return c;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength();
            int i2 = bitLength >> 1;
            int[] iArr = new int[i2];
            BigInteger xor = add.xor(bigInteger);
            int i3 = bitLength - 1;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (i6 < i3) {
                if (!xor.testBit(i6)) {
                    i5++;
                } else {
                    if (bigInteger.testBit(i6)) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    iArr[i4] = i5 | (i << 16);
                    i6++;
                    i4++;
                    i5 = 1;
                }
                i6++;
            }
            int i7 = i4 + 1;
            iArr[i4] = 65536 | i5;
            if (i2 > i7) {
                return p(iArr, i7);
            }
            return iArr;
        }
        throw new IllegalArgumentException("'k' must have bitlength < 2^16");
    }

    public static int[] e(int i, BigInteger bigInteger) {
        if (i == 2) {
            return d(bigInteger);
        }
        if (i >= 2 && i <= 16) {
            if ((bigInteger.bitLength() >>> 16) == 0) {
                if (bigInteger.signum() == 0) {
                    return c;
                }
                int bitLength = (bigInteger.bitLength() / i) + 1;
                int[] iArr = new int[bitLength];
                int i2 = 1 << i;
                int i3 = i2 - 1;
                int i4 = i2 >>> 1;
                int i5 = 0;
                int i6 = 0;
                boolean z = false;
                while (i5 <= bigInteger.bitLength()) {
                    if (bigInteger.testBit(i5) == z) {
                        i5++;
                    } else {
                        bigInteger = bigInteger.shiftRight(i5);
                        int intValue = bigInteger.intValue() & i3;
                        if (z) {
                            intValue++;
                        }
                        if ((intValue & i4) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            intValue -= i2;
                        }
                        if (i6 > 0) {
                            i5--;
                        }
                        iArr[i6] = i5 | (intValue << 16);
                        i5 = i;
                        i6++;
                    }
                }
                if (bitLength > i6) {
                    return p(iArr, i6);
                }
                return iArr;
            }
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        throw new IllegalArgumentException("'width' must be in the range [2, 16]");
    }

    public static byte[] f(BigInteger bigInteger) {
        int i;
        if (bigInteger.signum() == 0) {
            return b;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i2 = bitLength - 1;
        byte[] bArr = new byte[i2];
        BigInteger xor = add.xor(bigInteger);
        int i3 = 1;
        while (i3 < i2) {
            if (xor.testBit(i3)) {
                int i4 = i3 - 1;
                if (bigInteger.testBit(i3)) {
                    i = -1;
                } else {
                    i = 1;
                }
                bArr[i4] = (byte) i;
                i3++;
            }
            i3++;
        }
        bArr[bitLength - 2] = 1;
        return bArr;
    }

    public static byte[] g(int i, BigInteger bigInteger) {
        if (i == 2) {
            return f(bigInteger);
        }
        if (i >= 2 && i <= 8) {
            if (bigInteger.signum() == 0) {
                return b;
            }
            int bitLength = bigInteger.bitLength() + 1;
            byte[] bArr = new byte[bitLength];
            int i2 = 1 << i;
            int i3 = i2 - 1;
            int i4 = i2 >>> 1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i5) == z) {
                    i5++;
                } else {
                    bigInteger = bigInteger.shiftRight(i5);
                    int intValue = bigInteger.intValue() & i3;
                    if (z) {
                        intValue++;
                    }
                    if ((intValue & i4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        intValue -= i2;
                    }
                    if (i6 > 0) {
                        i5--;
                    }
                    int i7 = i6 + i5;
                    bArr[i7] = (byte) intValue;
                    i6 = i7 + 1;
                    i5 = i;
                }
            }
            if (bitLength > i6) {
                return o(bArr, i6);
            }
            return bArr;
        }
        throw new IllegalArgumentException("'width' must be in the range [2, 8]");
    }

    public static int h(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static int i(int i) {
        return k(i, a, 16);
    }

    public static int j(int i, int i2) {
        return k(i, a, i2);
    }

    public static int k(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < iArr.length && i >= iArr[i3]) {
            i3++;
        }
        return Math.max(2, Math.min(i2, i3 + 2));
    }

    public static m2c l(jb3 jb3Var, int i, boolean z) {
        ea3 i2 = jb3Var.i();
        return (m2c) i2.B(jb3Var, "bc_wnaf", new b(i, z, jb3Var, i2));
    }

    public static m2c m(jb3 jb3Var, kb3 kb3Var, m2c m2cVar, boolean z) {
        return (m2c) jb3Var.i().B(jb3Var, "bc_wnaf", new c(m2cVar, z, kb3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static jb3[] n(jb3[] jb3VarArr, int i) {
        jb3[] jb3VarArr2 = new jb3[i];
        System.arraycopy(jb3VarArr, 0, jb3VarArr2, 0, jb3VarArr.length);
        return jb3VarArr2;
    }

    private static byte[] o(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    private static int[] p(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }
}
