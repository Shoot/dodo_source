package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: p82  reason: default package */
/* loaded from: classes3.dex */
public class p82 implements u72 {
    private static final BigInteger i = BigInteger.valueOf(1);
    private xa3 g;
    private SecureRandom h;

    private static BigInteger d(BigInteger bigInteger, na3 na3Var) {
        return g(na3Var.t(), bigInteger.bitLength() - 1);
    }

    private static BigInteger e(BigInteger bigInteger, SecureRandom secureRandom) {
        return db0.e(bigInteger.bitLength() - 1, secureRandom);
    }

    private static na3 f(ea3 ea3Var, byte[] bArr) {
        return ea3Var.m(g(new BigInteger(1, tr.P(bArr)), ea3Var.t()));
    }

    private static BigInteger g(BigInteger bigInteger, int i2) {
        if (bigInteger.bitLength() > i2) {
            return bigInteger.mod(i.shiftLeft(i2));
        }
        return bigInteger;
    }

    @Override // defpackage.s72
    public boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() <= 0 || bigInteger2.signum() <= 0) {
            return false;
        }
        la3 b = this.g.b();
        BigInteger e = b.e();
        if (bigInteger.compareTo(e) >= 0 || bigInteger2.compareTo(e) >= 0) {
            return false;
        }
        ea3 a = b.a();
        na3 f = f(a, bArr);
        if (f.i()) {
            f = a.m(i);
        }
        jb3 A = ca3.r(b.b(), bigInteger2, ((qb3) this.g).c(), bigInteger).A();
        if (A.u() || d(e, f.j(A.f())).compareTo(bigInteger) != 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.s72
    public BigInteger[] b(byte[] bArr) {
        la3 b = this.g.b();
        ea3 a = b.a();
        na3 f = f(a, bArr);
        if (f.i()) {
            f = a.m(i);
        }
        BigInteger e = b.e();
        BigInteger c = ((nb3) this.g).c();
        bb3 c2 = c();
        while (true) {
            BigInteger e2 = e(e, this.h);
            na3 f2 = c2.a(b.b(), e2).A().f();
            if (!f2.i()) {
                BigInteger d = d(e, f.j(f2));
                if (d.signum() != 0) {
                    BigInteger mod = d.multiply(c).add(e2).mod(e);
                    if (mod.signum() != 0) {
                        return new BigInteger[]{d, mod};
                    }
                } else {
                    continue;
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
                v71Var = qq7Var.a();
            } else {
                this.h = b32.b();
            }
            xa3Var = (nb3) v71Var;
        } else {
            xa3Var = (qb3) v71Var;
        }
        this.g = xa3Var;
    }
}
