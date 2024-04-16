package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
/* renamed from: ib3  reason: default package */
/* loaded from: classes3.dex */
public class ib3 implements AlgorithmParameterSpec {
    private ea3 a;
    private byte[] b;
    private jb3 c;
    private BigInteger d;
    private BigInteger e;

    public ib3(ea3 ea3Var, jb3 jb3Var, BigInteger bigInteger) {
        this.a = ea3Var;
        this.c = jb3Var.A();
        this.d = bigInteger;
        this.e = BigInteger.valueOf(1L);
        this.b = null;
    }

    public ea3 a() {
        return this.a;
    }

    public jb3 b() {
        return this.c;
    }

    public BigInteger c() {
        return this.e;
    }

    public BigInteger d() {
        return this.d;
    }

    public byte[] e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ib3)) {
            return false;
        }
        ib3 ib3Var = (ib3) obj;
        if (!a().l(ib3Var.a()) || !b().e(ib3Var.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }

    public ib3(ea3 ea3Var, jb3 jb3Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.a = ea3Var;
        this.c = jb3Var.A();
        this.d = bigInteger;
        this.e = bigInteger2;
        this.b = bArr;
    }
}
