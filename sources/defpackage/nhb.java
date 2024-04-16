package defpackage;

import defpackage.ea3;
import defpackage.jb3;
import java.math.BigInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nhb  reason: default package */
/* loaded from: classes3.dex */
public class nhb {
    private static final BigInteger a;
    private static final BigInteger b;
    private static final BigInteger c;
    public static final pcc[] d;
    public static final byte[][] e;
    public static final pcc[] f;
    public static final byte[][] g;

    static {
        BigInteger bigInteger = da3.b;
        BigInteger negate = bigInteger.negate();
        a = negate;
        b = da3.c.negate();
        BigInteger negate2 = da3.d.negate();
        c = negate2;
        BigInteger bigInteger2 = da3.a;
        d = new pcc[]{null, new pcc(bigInteger, bigInteger2), null, new pcc(negate2, negate), null, new pcc(negate, negate), null, new pcc(bigInteger, negate), null};
        e = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        f = new pcc[]{null, new pcc(bigInteger, bigInteger2), null, new pcc(negate2, bigInteger), null, new pcc(negate, bigInteger), null, new pcc(bigInteger, bigInteger), null};
        g = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static yka a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b2, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b2));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger shiftRight = add.shiftRight(i4);
        if (add.testBit(i4 - 1)) {
            shiftRight = shiftRight.add(da3.b);
        }
        return new yka(shiftRight, i2);
    }

    public static BigInteger[] b(byte b2, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger negate;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = da3.c;
            bigInteger2 = BigInteger.valueOf(b2);
        } else {
            bigInteger = da3.a;
            bigInteger2 = da3.b;
        }
        int i2 = 1;
        while (i2 < i) {
            if (b2 == 1) {
                negate = bigInteger2;
            } else {
                negate = bigInteger2.negate();
            }
            i2++;
            BigInteger bigInteger3 = bigInteger2;
            bigInteger2 = negate.subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger3;
        }
        return new BigInteger[]{bigInteger, bigInteger2};
    }

    public static byte c(int i) {
        int i2;
        if (i == 0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return (byte) i2;
    }

    public static jb3.b[] d(jb3.b bVar, byte b2) {
        byte[][] bArr;
        if (b2 == 0) {
            bArr = e;
        } else {
            bArr = g;
        }
        jb3.b[] bVarArr = new jb3.b[(bArr.length + 1) >>> 1];
        bVarArr[0] = bVar;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            bVarArr[i >>> 1] = h(bVar, bArr[i]);
        }
        bVar.i().z(bVarArr);
        return bVarArr;
    }

    protected static int e(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(da3.c)) {
                return 1;
            }
            if (bigInteger.equals(da3.e)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] f(ea3.b bVar) {
        if (bVar.I()) {
            int t = bVar.t();
            int intValue = bVar.n().t().intValue();
            byte c2 = c(intValue);
            int e2 = e(bVar.p());
            BigInteger[] b2 = b(c2, (t + 3) - intValue, false);
            if (c2 == 1) {
                b2[0] = b2[0].negate();
                b2[1] = b2[1].negate();
            }
            BigInteger bigInteger = da3.b;
            return new BigInteger[]{bigInteger.add(b2[1]).shiftRight(e2), bigInteger.add(b2[0]).shiftRight(e2).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static BigInteger g(byte b2, int i) {
        if (i == 4) {
            if (b2 == 1) {
                return BigInteger.valueOf(6L);
            }
            return BigInteger.valueOf(10L);
        }
        BigInteger[] b3 = b(b2, i, false);
        BigInteger bit = da3.a.setBit(i);
        return da3.c.multiply(b3[0]).multiply(b3[1].modInverse(bit)).mod(bit);
    }

    public static jb3.b h(jb3.b bVar, byte[] bArr) {
        jb3.b bVar2;
        jb3.b bVar3 = (jb3.b) bVar.i().u();
        jb3.b bVar4 = (jb3.b) bVar.z();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b2 = bArr[length];
            if (b2 != 0) {
                jb3.b L = bVar3.L(i);
                if (b2 > 0) {
                    bVar2 = bVar;
                } else {
                    bVar2 = bVar4;
                }
                bVar3 = (jb3.b) L.a(bVar2);
                i = 0;
            }
        }
        if (i > 0) {
            return bVar3.L(i);
        }
        return bVar3;
    }

    public static BigInteger i(byte b2, pcc pccVar) {
        BigInteger subtract;
        BigInteger bigInteger = pccVar.a;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = pccVar.a.multiply(pccVar.b);
        BigInteger bigInteger2 = pccVar.b;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b2 == 1) {
            subtract = multiply.add(multiply2);
        } else if (b2 == -1) {
            subtract = multiply.subtract(multiply2);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        return subtract.add(shiftLeft);
    }

    public static pcc j(BigInteger bigInteger, int i, byte b2, BigInteger[] bigIntegerArr, byte b3, byte b4) {
        BigInteger subtract;
        if (b3 == 1) {
            subtract = bigIntegerArr[0].add(bigIntegerArr[1]);
        } else {
            subtract = bigIntegerArr[0].subtract(bigIntegerArr[1]);
        }
        BigInteger bigInteger2 = b(b3, i, true)[1];
        pcc k = k(a(bigInteger, bigIntegerArr[0], bigInteger2, b2, i, b4), a(bigInteger, bigIntegerArr[1], bigInteger2, b2, i, b4), b3);
        return new pcc(bigInteger.subtract(subtract.multiply(k.a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(k.b)), bigIntegerArr[1].multiply(k.a).subtract(bigIntegerArr[0].multiply(k.b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r5.d(defpackage.nhb.a) < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r8.d(defpackage.da3.c) >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r5.d(r9) >= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (r8.d(defpackage.nhb.b) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pcc k(defpackage.yka r8, defpackage.yka r9, byte r10) {
        /*
            int r0 = r8.f()
            int r1 = r9.f()
            if (r1 != r0) goto La6
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L19
            if (r10 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "mu must be 1 or -1"
            r8.<init>(r9)
            throw r8
        L19:
            java.math.BigInteger r2 = r8.h()
            java.math.BigInteger r3 = r9.h()
            yka r8 = r8.j(r2)
            yka r9 = r9.j(r3)
            yka r4 = r8.a(r8)
            if (r10 != r1) goto L34
            yka r4 = r4.a(r9)
            goto L38
        L34:
            yka r4 = r4.i(r9)
        L38:
            yka r5 = r9.a(r9)
            yka r5 = r5.a(r9)
            yka r9 = r5.a(r9)
            if (r10 != r1) goto L4f
            yka r5 = r8.i(r5)
            yka r8 = r8.a(r9)
            goto L57
        L4f:
            yka r5 = r8.a(r5)
            yka r8 = r8.i(r9)
        L57:
            java.math.BigInteger r9 = defpackage.da3.b
            int r6 = r4.d(r9)
            r7 = 0
            if (r6 < 0) goto L69
            java.math.BigInteger r6 = defpackage.nhb.a
            int r6 = r5.d(r6)
            if (r6 >= 0) goto L73
            goto L71
        L69:
            java.math.BigInteger r1 = defpackage.da3.c
            int r1 = r8.d(r1)
            if (r1 < 0) goto L72
        L71:
            r7 = r10
        L72:
            r1 = 0
        L73:
            java.math.BigInteger r6 = defpackage.nhb.a
            int r4 = r4.d(r6)
            if (r4 >= 0) goto L85
            int r8 = r5.d(r9)
            if (r8 < 0) goto L8e
        L81:
            int r8 = -r10
            byte r7 = (byte) r8
        L83:
            r0 = r1
            goto L8e
        L85:
            java.math.BigInteger r9 = defpackage.nhb.b
            int r8 = r8.d(r9)
            if (r8 >= 0) goto L83
            goto L81
        L8e:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            pcc r10 = new pcc
            r10.<init>(r8, r9)
            return r10
        La6:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "lambda0 and lambda1 do not have same scale"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhb.k(yka, yka, byte):pcc");
    }

    public static byte[] l(byte b2, pcc pccVar, byte b3, BigInteger bigInteger, BigInteger bigInteger2, pcc[] pccVarArr) {
        int i;
        BigInteger subtract;
        boolean z;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = i(b2, pccVar).bitLength();
        if (bitLength > 30) {
            i = bitLength + 4 + b3;
        } else {
            i = b3 + 34;
        }
        byte[] bArr = new byte[i];
        BigInteger shiftRight = bigInteger.shiftRight(1);
        BigInteger bigInteger3 = pccVar.a;
        BigInteger bigInteger4 = pccVar.b;
        int i2 = 0;
        while (true) {
            BigInteger bigInteger5 = da3.a;
            if (bigInteger3.equals(bigInteger5) && bigInteger4.equals(bigInteger5)) {
                return bArr;
            }
            if (bigInteger3.testBit(0)) {
                BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                if (mod.compareTo(shiftRight) >= 0) {
                    mod = mod.subtract(bigInteger);
                }
                byte intValue = (byte) mod.intValue();
                bArr[i2] = intValue;
                if (intValue < 0) {
                    intValue = (byte) (-intValue);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bigInteger3 = bigInteger3.subtract(pccVarArr[intValue].a);
                    bigInteger4 = bigInteger4.subtract(pccVarArr[intValue].b);
                } else {
                    bigInteger3 = bigInteger3.add(pccVarArr[intValue].a);
                    bigInteger4 = bigInteger4.add(pccVarArr[intValue].b);
                }
            } else {
                bArr[i2] = 0;
            }
            BigInteger shiftRight2 = bigInteger3.shiftRight(1);
            if (b2 == 1) {
                subtract = bigInteger4.add(shiftRight2);
            } else {
                subtract = bigInteger4.subtract(shiftRight2);
            }
            BigInteger negate = bigInteger3.shiftRight(1).negate();
            i2++;
            bigInteger3 = subtract;
            bigInteger4 = negate;
        }
    }
}
