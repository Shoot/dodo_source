package defpackage;

import java.math.BigInteger;
/* renamed from: e82  reason: default package */
/* loaded from: classes3.dex */
public class e82 extends y72 {
    private static final BigInteger d = BigInteger.valueOf(1);
    private static final BigInteger e = BigInteger.valueOf(2);
    private BigInteger c;

    public e82(BigInteger bigInteger, b82 b82Var) {
        super(false, b82Var);
        this.c = d(bigInteger, b82Var);
    }

    private BigInteger d(BigInteger bigInteger, b82 b82Var) {
        if (b82Var != null) {
            BigInteger bigInteger2 = e;
            if (bigInteger2.compareTo(bigInteger) <= 0 && b82Var.b().subtract(bigInteger2).compareTo(bigInteger) >= 0 && d.equals(bigInteger.modPow(b82Var.c(), b82Var.b()))) {
                return bigInteger;
            }
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
        return bigInteger;
    }

    public BigInteger c() {
        return this.c;
    }
}
