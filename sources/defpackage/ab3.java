package defpackage;

import java.math.BigInteger;
/* renamed from: ab3  reason: default package */
/* loaded from: classes3.dex */
public class ab3 implements x80 {
    u36 a;

    private jb3 c(la3 la3Var, nb3 nb3Var, nb3 nb3Var2, qb3 qb3Var, qb3 qb3Var2, qb3 qb3Var3) {
        BigInteger e = la3Var.e();
        int bitLength = (e.bitLength() + 1) / 2;
        BigInteger shiftLeft = da3.b.shiftLeft(bitLength);
        ea3 a = la3Var.a();
        jb3 a2 = ca3.a(a, qb3Var.c());
        jb3 a3 = ca3.a(a, qb3Var2.c());
        jb3 a4 = ca3.a(a, qb3Var3.c());
        BigInteger mod = nb3Var.c().multiply(a2.f().t().mod(shiftLeft).setBit(bitLength)).add(nb3Var2.c()).mod(e);
        BigInteger bit = a4.f().t().mod(shiftLeft).setBit(bitLength);
        BigInteger mod2 = la3Var.c().multiply(mod).mod(e);
        return ca3.r(a3, bit.multiply(mod2).mod(e), a4, mod2);
    }

    @Override // defpackage.x80
    public int a() {
        return (this.a.c().b().a().t() + 7) / 8;
    }

    @Override // defpackage.x80
    public BigInteger b(v71 v71Var) {
        if (!pq8.c("org.bouncycastle.ec.disable_mqv")) {
            w36 w36Var = (w36) v71Var;
            nb3 c = this.a.c();
            la3 b = c.b();
            if (b.equals(w36Var.b().b())) {
                jb3 A = c(b, c, this.a.a(), this.a.b(), w36Var.b(), w36Var.a()).A();
                if (!A.u()) {
                    return A.f().t();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
            }
            throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        throw new IllegalStateException("ECMQV explicitly disabled");
    }

    @Override // defpackage.x80
    public void init(v71 v71Var) {
        this.a = (u36) v71Var;
    }
}
