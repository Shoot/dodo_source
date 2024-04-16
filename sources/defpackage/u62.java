package defpackage;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
/* renamed from: u62  reason: default package */
/* loaded from: classes3.dex */
public class u62 extends DHParameterSpec {
    private final BigInteger a;
    private final BigInteger b;
    private final int c;
    private q72 d;

    public u62(h72 h72Var) {
        this(h72Var.f(), h72Var.g(), h72Var.b(), h72Var.c(), h72Var.e(), h72Var.d());
        this.d = h72Var.h();
    }

    public h72 a() {
        return new h72(getP(), getG(), this.a, this.c, getL(), this.b, this.d);
    }

    public BigInteger b() {
        return this.a;
    }

    public u62(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i);
    }

    public u62(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2) {
        super(bigInteger, bigInteger3, i2);
        this.a = bigInteger2;
        this.b = bigInteger4;
        this.c = i;
    }
}
