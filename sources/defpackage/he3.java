package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
/* renamed from: he3  reason: default package */
/* loaded from: classes3.dex */
public class he3 implements AlgorithmParameterSpec {
    private BigInteger a;
    private BigInteger b;

    public he3(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public BigInteger a() {
        return this.b;
    }

    public BigInteger b() {
        return this.a;
    }
}
