package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: ra3  reason: default package */
/* loaded from: classes3.dex */
public class ra3 implements u72 {
    xa3 g;
    SecureRandom h;

    @Override // defpackage.s72
    public boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, tr.P(bArr));
        BigInteger e = this.g.b().e();
        BigInteger bigInteger4 = da3.b;
        if (bigInteger.compareTo(bigInteger4) < 0 || bigInteger.compareTo(e) >= 0 || bigInteger2.compareTo(bigInteger4) < 0 || bigInteger2.compareTo(e) >= 0) {
            return false;
        }
        BigInteger k = db0.k(e, bigInteger3);
        jb3 A = ca3.r(this.g.b().b(), bigInteger2.multiply(k).mod(e), ((qb3) this.g).c(), e.subtract(bigInteger).multiply(k).mod(e)).A();
        if (A.u()) {
            return false;
        }
        return A.f().t().mod(e).equals(bigInteger);
    }

    @Override // defpackage.s72
    public BigInteger[] b(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, tr.P(bArr));
        la3 b = this.g.b();
        BigInteger e = b.e();
        BigInteger c = ((nb3) this.g).c();
        bb3 c2 = c();
        while (true) {
            BigInteger e2 = db0.e(e.bitLength(), this.h);
            BigInteger bigInteger2 = da3.a;
            if (!e2.equals(bigInteger2)) {
                BigInteger mod = c2.a(b.b(), e2).A().f().t().mod(e);
                if (mod.equals(bigInteger2)) {
                    continue;
                } else {
                    BigInteger mod2 = e2.multiply(bigInteger).add(c.multiply(mod)).mod(e);
                    if (!mod2.equals(bigInteger2)) {
                        return new BigInteger[]{mod, mod2};
                    }
                }
            }
        }
    }

    protected bb3 c() {
        return new ry3();
    }

    @Override // defpackage.u72
    public BigInteger getOrder() {
        return this.g.b().e();
    }

    @Override // defpackage.s72
    public void init(boolean z, v71 v71Var) {
        xa3 xa3Var;
        if (z) {
            if (v71Var instanceof qq7) {
                qq7 qq7Var = (qq7) v71Var;
                this.h = qq7Var.b();
                this.g = (nb3) qq7Var.a();
                return;
            }
            this.h = b32.b();
            xa3Var = (nb3) v71Var;
        } else {
            xa3Var = (qb3) v71Var;
        }
        this.g = xa3Var;
    }
}
