package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
/* renamed from: ca3  reason: default package */
/* loaded from: classes3.dex */
public class ca3 {
    public static jb3 a(ea3 ea3Var, jb3 jb3Var) {
        if (ea3Var.l(jb3Var.i())) {
            return ea3Var.j(jb3Var.l(false));
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jb3 b(jb3 jb3Var) {
        if (jb3Var.x()) {
            return jb3Var;
        }
        throw new IllegalStateException("Invalid result");
    }

    private static jb3 c(jb3 jb3Var, BigInteger bigInteger, jb3 jb3Var2, BigInteger bigInteger2) {
        jb3 a;
        jb3 b;
        ea3 i = jb3Var.i();
        int a2 = ty3.a(i);
        if (bigInteger.bitLength() <= a2 && bigInteger2.bitLength() <= a2) {
            sy3 b2 = ty3.b(jb3Var);
            sy3 b3 = ty3.b(jb3Var2);
            za3 a3 = b2.a();
            za3 a4 = b3.a();
            int c = b2.c();
            if (c != b3.c()) {
                ry3 ry3Var = new ry3();
                a = ry3Var.a(jb3Var, bigInteger);
                b = ry3Var.a(jb3Var2, bigInteger2);
            } else {
                int i2 = ((a2 + c) - 1) / c;
                jb3 u = i.u();
                int i3 = c * i2;
                int[] r = et6.r(i3, bigInteger);
                int[] r2 = et6.r(i3, bigInteger2);
                int i4 = i3 - 1;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = 0;
                    int i7 = 0;
                    for (int i8 = i4 - i5; i8 >= 0; i8 -= i2) {
                        int i9 = i8 >>> 5;
                        int i10 = i8 & 31;
                        int i11 = r[i9] >>> i10;
                        i6 = ((i6 ^ (i11 >>> 1)) << 1) ^ i11;
                        int i12 = r2[i9] >>> i10;
                        i7 = ((i7 ^ (i12 >>> 1)) << 1) ^ i12;
                    }
                    u = u.K(a3.c(i6).a(a4.c(i7)));
                }
                a = u.a(b2.b());
                b = b3.b();
            }
            return a.a(b);
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jb3 d(ma3 ma3Var, jb3 jb3Var, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z;
        jb3[] c;
        jb3[] c2;
        jb3[] d;
        jb3[] d2;
        boolean z2 = false;
        if (bigInteger.signum() < 0) {
            z = true;
        } else {
            z = false;
        }
        if (bigInteger2.signum() < 0) {
            z2 = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        m2c l = n2c.l(jb3Var, n2c.j(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        m2c m = n2c.m(xh3.c(ma3Var, jb3Var), ma3Var.b(), l, true);
        int min = Math.min(8, l.g());
        int min2 = Math.min(8, m.g());
        if (z) {
            c = l.d();
        } else {
            c = l.c();
        }
        jb3[] jb3VarArr = c;
        if (z2) {
            c2 = m.d();
        } else {
            c2 = m.c();
        }
        jb3[] jb3VarArr2 = c2;
        if (z) {
            d = l.c();
        } else {
            d = l.d();
        }
        jb3[] jb3VarArr3 = d;
        if (z2) {
            d2 = m.c();
        } else {
            d2 = m.d();
        }
        return f(jb3VarArr, jb3VarArr3, n2c.g(min, abs), jb3VarArr2, d2, n2c.g(min2, abs2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jb3 e(jb3 jb3Var, BigInteger bigInteger, jb3 jb3Var2, BigInteger bigInteger2) {
        boolean z;
        jb3[] c;
        jb3[] c2;
        jb3[] d;
        jb3[] d2;
        boolean z2 = false;
        if (bigInteger.signum() < 0) {
            z = true;
        } else {
            z = false;
        }
        if (bigInteger2.signum() < 0) {
            z2 = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int j = n2c.j(abs.bitLength(), 8);
        int j2 = n2c.j(abs2.bitLength(), 8);
        m2c l = n2c.l(jb3Var, j, true);
        m2c l2 = n2c.l(jb3Var2, j2, true);
        int a = ty3.a(jb3Var.i());
        if (!z && !z2 && bigInteger.bitLength() <= a && bigInteger2.bitLength() <= a && l.h() && l2.h()) {
            return c(jb3Var, bigInteger, jb3Var2, bigInteger2);
        }
        int min = Math.min(8, l.g());
        int min2 = Math.min(8, l2.g());
        if (z) {
            c = l.d();
        } else {
            c = l.c();
        }
        jb3[] jb3VarArr = c;
        if (z2) {
            c2 = l2.d();
        } else {
            c2 = l2.c();
        }
        jb3[] jb3VarArr2 = c2;
        if (z) {
            d = l.c();
        } else {
            d = l.d();
        }
        jb3[] jb3VarArr3 = d;
        if (z2) {
            d2 = l2.c();
        } else {
            d2 = l2.d();
        }
        return f(jb3VarArr, jb3VarArr3, n2c.g(min, abs), jb3VarArr2, d2, n2c.g(min2, abs2));
    }

    private static jb3 f(jb3[] jb3VarArr, jb3[] jb3VarArr2, byte[] bArr, jb3[] jb3VarArr3, jb3[] jb3VarArr4, byte[] bArr2) {
        byte b;
        byte b2;
        jb3 jb3Var;
        jb3[] jb3VarArr5;
        jb3[] jb3VarArr6;
        int max = Math.max(bArr.length, bArr2.length);
        jb3 u = jb3VarArr[0].i().u();
        jb3 jb3Var2 = u;
        int i = 0;
        for (int i2 = max - 1; i2 >= 0; i2--) {
            if (i2 < bArr.length) {
                b = bArr[i2];
            } else {
                b = 0;
            }
            if (i2 < bArr2.length) {
                b2 = bArr2[i2];
            } else {
                b2 = 0;
            }
            if ((b | b2) == 0) {
                i++;
            } else {
                if (b != 0) {
                    int abs = Math.abs((int) b);
                    if (b < 0) {
                        jb3VarArr6 = jb3VarArr2;
                    } else {
                        jb3VarArr6 = jb3VarArr;
                    }
                    jb3Var = u.a(jb3VarArr6[abs >>> 1]);
                } else {
                    jb3Var = u;
                }
                if (b2 != 0) {
                    int abs2 = Math.abs((int) b2);
                    if (b2 < 0) {
                        jb3VarArr5 = jb3VarArr4;
                    } else {
                        jb3VarArr5 = jb3VarArr3;
                    }
                    jb3Var = jb3Var.a(jb3VarArr5[abs2 >>> 1]);
                }
                if (i > 0) {
                    jb3Var2 = jb3Var2.I(i);
                    i = 0;
                }
                jb3Var2 = jb3Var2.K(jb3Var);
            }
        }
        if (i > 0) {
            return jb3Var2.I(i);
        }
        return jb3Var2;
    }

    static jb3 g(ma3 ma3Var, jb3[] jb3VarArr, BigInteger[] bigIntegerArr) {
        boolean z;
        boolean z2;
        jb3[] jb3VarArr2 = jb3VarArr;
        int length = jb3VarArr2.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        m2c[] m2cVarArr = new m2c[i];
        byte[][] bArr = new byte[i];
        kb3 b = ma3Var.b();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            if (bigInteger.signum() < 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i3] = z;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            if (bigInteger2.signum() < 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[i4] = z2;
            BigInteger abs2 = bigInteger2.abs();
            int j = n2c.j(Math.max(abs.bitLength(), abs2.bitLength()), 8);
            jb3 jb3Var = jb3VarArr2[i2];
            m2c l = n2c.l(jb3Var, j, true);
            m2c m = n2c.m(xh3.c(ma3Var, jb3Var), b, l, true);
            int min = Math.min(8, l.g());
            int min2 = Math.min(8, m.g());
            m2cVarArr[i3] = l;
            m2cVarArr[i4] = m;
            bArr[i3] = n2c.g(min, abs);
            bArr[i4] = n2c.g(min2, abs2);
            i2++;
            jb3VarArr2 = jb3VarArr;
        }
        return i(zArr, m2cVarArr, bArr);
    }

    static jb3 h(jb3[] jb3VarArr, BigInteger[] bigIntegerArr) {
        boolean z;
        int length = jb3VarArr.length;
        boolean[] zArr = new boolean[length];
        m2c[] m2cVarArr = new m2c[length];
        byte[][] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            BigInteger bigInteger = bigIntegerArr[i];
            if (bigInteger.signum() < 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            BigInteger abs = bigInteger.abs();
            m2c l = n2c.l(jb3VarArr[i], n2c.j(abs.bitLength(), 8), true);
            int min = Math.min(8, l.g());
            m2cVarArr[i] = l;
            bArr[i] = n2c.g(min, abs);
        }
        return i(zArr, m2cVarArr, bArr);
    }

    private static jb3 i(boolean[] zArr, m2c[] m2cVarArr, byte[][] bArr) {
        byte b;
        boolean z;
        jb3[] d;
        int length = bArr.length;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i = Math.max(i, bArr2.length);
        }
        jb3 u = m2cVarArr[0].c()[0].i().u();
        jb3 jb3Var = u;
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            jb3 jb3Var2 = u;
            for (int i4 = 0; i4 < length; i4++) {
                byte[] bArr3 = bArr[i4];
                if (i3 < bArr3.length) {
                    b = bArr3[i3];
                } else {
                    b = 0;
                }
                if (b != 0) {
                    int abs = Math.abs((int) b);
                    m2c m2cVar = m2cVarArr[i4];
                    if (b < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z == zArr[i4]) {
                        d = m2cVar.c();
                    } else {
                        d = m2cVar.d();
                    }
                    jb3Var2 = jb3Var2.a(d[abs >>> 1]);
                }
            }
            if (jb3Var2 == u) {
                i2++;
            } else {
                if (i2 > 0) {
                    jb3Var = jb3Var.I(i2);
                    i2 = 0;
                }
                jb3Var = jb3Var.K(jb3Var2);
            }
        }
        if (i2 > 0) {
            return jb3Var.I(i2);
        }
        return jb3Var;
    }

    static jb3 j(jb3[] jb3VarArr, BigInteger[] bigIntegerArr, la4 la4Var) {
        BigInteger w = jb3VarArr[0].i().w();
        int length = jb3VarArr.length;
        int i = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            BigInteger[] c = la4Var.c(bigIntegerArr[i3].mod(w));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = c[0];
            i2 += 2;
            bigIntegerArr2[i4] = c[1];
        }
        if (la4Var.a()) {
            return g(la4Var, jb3VarArr, bigIntegerArr2);
        }
        jb3[] jb3VarArr2 = new jb3[i];
        int i5 = 0;
        for (jb3 jb3Var : jb3VarArr) {
            jb3 c2 = xh3.c(la4Var, jb3Var);
            int i6 = i5 + 1;
            jb3VarArr2[i5] = jb3Var;
            i5 += 2;
            jb3VarArr2[i6] = c2;
        }
        return h(jb3VarArr2, bigIntegerArr2);
    }

    public static jb3 k(ea3 ea3Var, jb3 jb3Var) {
        if (ea3Var.l(jb3Var.i())) {
            return ea3Var.x(jb3Var);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean l(ea3 ea3Var) {
        return m(ea3Var.s());
    }

    public static boolean m(iv3 iv3Var) {
        if (iv3Var.a() > 1 && iv3Var.b().equals(da3.c) && (iv3Var instanceof ve8)) {
            return true;
        }
        return false;
    }

    public static boolean n(ea3 ea3Var) {
        return o(ea3Var.s());
    }

    public static boolean o(iv3 iv3Var) {
        if (iv3Var.a() == 1) {
            return true;
        }
        return false;
    }

    public static void p(na3[] na3VarArr, int i, int i2, na3 na3Var) {
        na3[] na3VarArr2 = new na3[i2];
        int i3 = 0;
        na3VarArr2[0] = na3VarArr[i];
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2) {
                break;
            }
            na3VarArr2[i4] = na3VarArr2[i3].j(na3VarArr[i + i4]);
            i3 = i4;
        }
        if (na3Var != null) {
            na3VarArr2[i3] = na3VarArr2[i3].j(na3Var);
        }
        na3 g = na3VarArr2[i3].g();
        while (i3 > 0) {
            int i5 = i3 - 1;
            int i6 = i3 + i;
            na3 na3Var2 = na3VarArr[i6];
            na3VarArr[i6] = na3VarArr2[i5].j(g);
            g = g.j(na3Var2);
            i3 = i5;
        }
        na3VarArr[i] = g;
    }

    public static jb3 q(jb3 jb3Var, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        jb3 u = jb3Var.i().u();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                u = jb3Var;
            }
            for (int i = 1; i < bitLength; i++) {
                jb3Var = jb3Var.J();
                if (abs.testBit(i)) {
                    u = u.a(jb3Var);
                }
            }
        }
        if (bigInteger.signum() < 0) {
            return u.z();
        }
        return u;
    }

    public static jb3 r(jb3 jb3Var, BigInteger bigInteger, jb3 jb3Var2, BigInteger bigInteger2) {
        jb3 e;
        ea3 i = jb3Var.i();
        jb3 k = k(i, jb3Var2);
        if ((i instanceof ea3.b) && ((ea3.b) i).I()) {
            e = jb3Var.y(bigInteger).a(k.y(bigInteger2));
        } else {
            ma3 r = i.r();
            if (r instanceof la4) {
                e = j(new jb3[]{jb3Var, k}, new BigInteger[]{bigInteger, bigInteger2}, (la4) r);
            } else {
                e = e(jb3Var, bigInteger, k, bigInteger2);
            }
        }
        return b(e);
    }
}
