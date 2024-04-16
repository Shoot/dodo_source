package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: ka3  reason: default package */
/* loaded from: classes3.dex */
public class ka3 implements da3, u72 {
    private final v72 g;
    private xa3 h;
    private SecureRandom i;

    public ka3() {
        this.g = new c49();
    }

    @Override // defpackage.s72
    public boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger p;
        na3 e;
        la3 b = this.h.b();
        BigInteger e2 = b.e();
        BigInteger c = c(e2, bArr);
        BigInteger bigInteger3 = da3.b;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(e2) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(e2) >= 0) {
            return false;
        }
        BigInteger k = db0.k(e2, bigInteger2);
        jb3 r = ca3.r(b.b(), c.multiply(k).mod(e2), ((qb3) this.h).c(), bigInteger.multiply(k).mod(e2));
        if (r.u()) {
            return false;
        }
        ea3 i = r.i();
        if (i != null && (p = i.p()) != null && p.compareTo(da3.f) <= 0 && (e = e(i.q(), r)) != null && !e.i()) {
            na3 q = r.q();
            while (i.y(bigInteger)) {
                if (i.m(bigInteger).j(e).equals(q)) {
                    return true;
                }
                bigInteger = bigInteger.add(e2);
            }
            return false;
        }
        return r.A().f().t().mod(e2).equals(bigInteger);
    }

    @Override // defpackage.s72
    public BigInteger[] b(byte[] bArr) {
        la3 b = this.h.b();
        BigInteger e = b.e();
        BigInteger c = c(e, bArr);
        BigInteger c2 = ((nb3) this.h).c();
        if (this.g.c()) {
            this.g.d(e, c2, bArr);
        } else {
            this.g.a(e, this.i);
        }
        bb3 d = d();
        while (true) {
            BigInteger b2 = this.g.b();
            BigInteger mod = d.a(b.b(), b2).A().f().t().mod(e);
            BigInteger bigInteger = da3.a;
            if (!mod.equals(bigInteger)) {
                BigInteger mod2 = db0.j(e, b2).multiply(c.add(c2.multiply(mod))).mod(e);
                if (!mod2.equals(bigInteger)) {
                    return new BigInteger[]{mod, mod2};
                }
            }
        }
    }

    protected BigInteger c(BigInteger bigInteger, byte[] bArr) {
        int bitLength = bigInteger.bitLength();
        int length = bArr.length * 8;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        if (bitLength < length) {
            return bigInteger2.shiftRight(length - bitLength);
        }
        return bigInteger2;
    }

    protected bb3 d() {
        return new ry3();
    }

    protected na3 e(int i, jb3 jb3Var) {
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i != 6 && i != 7) {
                    return null;
                }
            } else {
                return jb3Var.s(0).o();
            }
        }
        return jb3Var.s(0);
    }

    protected SecureRandom f(boolean z, SecureRandom secureRandom) {
        if (z) {
            return b32.c(secureRandom);
        }
        return null;
    }

    @Override // defpackage.u72
    public BigInteger getOrder() {
        return this.h.b().e();
    }

    @Override // defpackage.s72
    public void init(boolean z, v71 v71Var) {
        xa3 xa3Var;
        SecureRandom secureRandom;
        boolean z2;
        if (z) {
            if (v71Var instanceof qq7) {
                qq7 qq7Var = (qq7) v71Var;
                this.h = (nb3) qq7Var.a();
                secureRandom = qq7Var.b();
                if (!z && !this.g.c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.i = f(z2, secureRandom);
            }
            xa3Var = (nb3) v71Var;
        } else {
            xa3Var = (qb3) v71Var;
        }
        this.h = xa3Var;
        secureRandom = null;
        if (!z) {
        }
        z2 = false;
        this.i = f(z2, secureRandom);
    }

    public ka3(v72 v72Var) {
        this.g = v72Var;
    }
}
