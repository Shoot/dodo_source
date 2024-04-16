package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: b72  reason: default package */
/* loaded from: classes3.dex */
class b72 {
    static final b72 a = new b72();
    private static final BigInteger b = BigInteger.valueOf(1);
    private static final BigInteger c = BigInteger.valueOf(2);

    private b72() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BigInteger a(h72 h72Var, SecureRandom secureRandom) {
        BigInteger bigInteger;
        BigInteger f;
        BigInteger bit;
        int d = h72Var.d();
        if (d != 0) {
            int i = d >>> 2;
            do {
                bit = db0.e(d, secureRandom).setBit(d - 1);
            } while (n2c.h(bit) < i);
            return bit;
        }
        BigInteger bigInteger2 = c;
        int e = h72Var.e();
        if (e != 0) {
            bigInteger = b.shiftLeft(e - 1);
        } else {
            bigInteger = bigInteger2;
        }
        BigInteger g = h72Var.g();
        if (g == null) {
            g = h72Var.f();
        }
        BigInteger subtract = g.subtract(bigInteger2);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            f = db0.f(bigInteger, subtract, secureRandom);
        } while (n2c.h(f) < bitLength);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BigInteger b(h72 h72Var, BigInteger bigInteger) {
        return h72Var.b().modPow(bigInteger, h72Var.f());
    }
}
