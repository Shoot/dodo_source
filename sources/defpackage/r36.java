package defpackage;

import java.math.BigInteger;
/* renamed from: r36  reason: default package */
/* loaded from: classes3.dex */
public class r36 implements x80 {
    private static final BigInteger b = BigInteger.valueOf(1);
    e72 a;

    private BigInteger c(h72 h72Var, k72 k72Var, l72 l72Var, k72 k72Var2, l72 l72Var2, l72 l72Var3) {
        BigInteger g = h72Var.g();
        BigInteger pow = BigInteger.valueOf(2L).pow((g.bitLength() + 1) / 2);
        return l72Var3.c().multiply(l72Var.c().modPow(l72Var3.c().mod(pow).add(pow), h72Var.f())).modPow(k72Var2.c().add(l72Var2.c().mod(pow).add(pow).multiply(k72Var.c())).mod(g), h72Var.f());
    }

    @Override // defpackage.x80
    public int a() {
        return (this.a.c().b().f().bitLength() + 7) / 8;
    }

    @Override // defpackage.x80
    public BigInteger b(v71 v71Var) {
        f72 f72Var = (f72) v71Var;
        k72 c = this.a.c();
        if (this.a.c().b().equals(f72Var.b().b())) {
            if (this.a.c().b().g() != null) {
                BigInteger c2 = c(c.b(), c, f72Var.b(), this.a.a(), this.a.b(), f72Var.a());
                if (!c2.equals(b)) {
                    return c2;
                }
                throw new IllegalStateException("1 is not a valid agreement value for MQV");
            }
            throw new IllegalStateException("MQV key domain parameters do not have Q set");
        }
        throw new IllegalStateException("MQV public key components have wrong domain parameters");
    }

    @Override // defpackage.x80
    public void init(v71 v71Var) {
        this.a = (e72) v71Var;
    }
}
