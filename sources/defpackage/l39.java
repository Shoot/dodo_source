package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: l39  reason: default package */
/* loaded from: classes3.dex */
public class l39 extends ff5 {
    private BigInteger c;
    private int d;

    public l39(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i >= 12) {
            if (bigInteger.testBit(0)) {
                this.c = bigInteger;
                this.d = i2;
                return;
            }
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        throw new IllegalArgumentException("key strength too small");
    }

    public int c() {
        return this.d;
    }

    public BigInteger d() {
        return this.c;
    }
}
