package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: x72  reason: default package */
/* loaded from: classes3.dex */
public class x72 implements tx {
    private static final BigInteger h = BigInteger.valueOf(1);
    private w72 g;

    private static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    private static BigInteger c(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger f;
        int bitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = h;
            f = db0.f(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (n2c.h(f) < bitLength);
        return f;
    }

    @Override // defpackage.tx
    public sx a() {
        b82 c = this.g.c();
        BigInteger c2 = c(c.c(), this.g.a());
        return new sx(new e82(b(c.b(), c.a(), c2), c), new d82(c2, c));
    }

    public void d(ff5 ff5Var) {
        this.g = (w72) ff5Var;
    }
}
