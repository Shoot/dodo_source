package defpackage;

import java.math.BigInteger;
/* renamed from: m39  reason: default package */
/* loaded from: classes3.dex */
public class m39 implements tx {
    private static final BigInteger h = BigInteger.valueOf(1);
    private l39 g;

    private static int c(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 <= 128) {
                return 4;
            }
            return 4 + ((i2 - 127) / 2);
        } else if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return ((i2 - 111) / 2) + 5;
        } else if (i >= 512) {
            if (i2 <= 80) {
                return 5;
            }
            if (i2 <= 100) {
                return 7;
            }
            return 7 + ((i2 - 99) / 2);
        } else if (i2 <= 80) {
            return 40;
        } else {
            return 40 + ((i2 - 79) / 2);
        }
    }

    @Override // defpackage.tx
    public sx a() {
        BigInteger b;
        BigInteger b2;
        BigInteger multiply;
        BigInteger bigInteger;
        m39 m39Var = this;
        int b3 = m39Var.g.b();
        int i = (b3 + 1) / 2;
        int i2 = b3 - i;
        int i3 = b3 / 2;
        int i4 = i3 - 100;
        int i5 = b3 / 3;
        if (i4 < i5) {
            i4 = i5;
        }
        int i6 = b3 >> 2;
        BigInteger pow = BigInteger.valueOf(2L).pow(i3);
        BigInteger bigInteger2 = h;
        BigInteger shiftLeft = bigInteger2.shiftLeft(b3 - 1);
        BigInteger shiftLeft2 = bigInteger2.shiftLeft(i4);
        sx sxVar = null;
        boolean z = false;
        while (!z) {
            BigInteger d = m39Var.g.d();
            do {
                b = m39Var.b(i, d, shiftLeft);
                while (true) {
                    b2 = m39Var.b(i2, d, shiftLeft);
                    BigInteger abs = b2.subtract(b).abs();
                    if (abs.bitLength() >= i4 && abs.compareTo(shiftLeft2) > 0) {
                        multiply = b.multiply(b2);
                        if (multiply.bitLength() != b3) {
                            b = b.max(b2);
                        }
                    } else {
                        m39Var = this;
                        b3 = b3;
                    }
                }
            } while (n2c.h(multiply) < i6);
            if (b.compareTo(b2) < 0) {
                bigInteger = b;
                b = b2;
            } else {
                bigInteger = b2;
            }
            BigInteger bigInteger3 = h;
            BigInteger subtract = b.subtract(bigInteger3);
            BigInteger subtract2 = bigInteger.subtract(bigInteger3);
            int i7 = b3;
            BigInteger modInverse = d.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) > 0) {
                sxVar = new sx(new n39(false, multiply, d), new o39(multiply, d, modInverse, b, bigInteger, modInverse.remainder(subtract), modInverse.remainder(subtract2), db0.j(b, bigInteger)));
                z = true;
            }
            m39Var = this;
            b3 = i7;
        }
        return sxVar;
    }

    protected BigInteger b(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger g = db0.g(i, 1, this.g.a());
            BigInteger mod = g.mod(bigInteger);
            BigInteger bigInteger3 = h;
            if (!mod.equals(bigInteger3) && g.multiply(g).compareTo(bigInteger2) >= 0 && e(g) && bigInteger.gcd(g.subtract(bigInteger3)).equals(bigInteger3)) {
                return g;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    public void d(ff5 ff5Var) {
        this.g = (l39) ff5Var;
    }

    protected boolean e(BigInteger bigInteger) {
        int c = c(bigInteger.bitLength(), this.g.c());
        if (!pj8.b(bigInteger) && pj8.e(bigInteger, this.g.a(), c)) {
            return true;
        }
        return false;
    }
}
