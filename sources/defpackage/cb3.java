package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
/* renamed from: cb3  reason: default package */
/* loaded from: classes3.dex */
public class cb3 implements u72 {
    private boolean g;
    private xa3 h;
    private SecureRandom i;

    private BigInteger c(qb3 qb3Var, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger e = qb3Var.b().e();
        if (bigInteger.compareTo(da3.b) < 0 || bigInteger.compareTo(e) >= 0 || bigInteger2.compareTo(da3.a) < 0 || bigInteger2.compareTo(e) >= 0) {
            return null;
        }
        jb3 A = ca3.r(qb3Var.b().b(), bigInteger2, qb3Var.c(), bigInteger).A();
        if (A.u()) {
            return null;
        }
        return bigInteger.subtract(A.f().t()).mod(e);
    }

    @Override // defpackage.s72
    public boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        if (!this.g) {
            qb3 qb3Var = (qb3) this.h;
            BigInteger e = qb3Var.b().e();
            int bitLength = e.bitLength();
            BigInteger bigInteger3 = new BigInteger(1, bArr);
            if (bigInteger3.bitLength() <= bitLength) {
                BigInteger c = c(qb3Var, bigInteger, bigInteger2);
                if (c != null && c.equals(bigInteger3.mod(e))) {
                    return true;
                }
                return false;
            }
            throw new DataLengthException("input too large for ECNR key.");
        }
        throw new IllegalStateException("not initialised for verifying");
    }

    @Override // defpackage.s72
    public BigInteger[] b(byte[] bArr) {
        sx a;
        BigInteger mod;
        if (this.g) {
            BigInteger order = getOrder();
            BigInteger bigInteger = new BigInteger(1, bArr);
            nb3 nb3Var = (nb3) this.h;
            if (bigInteger.compareTo(order) < 0) {
                do {
                    wa3 wa3Var = new wa3();
                    wa3Var.c(new va3(nb3Var.b(), this.i));
                    a = wa3Var.a();
                    mod = ((qb3) a.b()).c().f().t().add(bigInteger).mod(order);
                } while (mod.equals(da3.a));
                return new BigInteger[]{mod, ((nb3) a.a()).c().subtract(mod.multiply(nb3Var.c())).mod(order)};
            }
            throw new DataLengthException("input too large for ECNR key");
        }
        throw new IllegalStateException("not initialised for signing");
    }

    @Override // defpackage.u72
    public BigInteger getOrder() {
        return this.h.b().e();
    }

    @Override // defpackage.s72
    public void init(boolean z, v71 v71Var) {
        xa3 xa3Var;
        this.g = z;
        if (z) {
            if (v71Var instanceof qq7) {
                qq7 qq7Var = (qq7) v71Var;
                this.i = qq7Var.b();
                this.h = (nb3) qq7Var.a();
                return;
            }
            this.i = b32.b();
            xa3Var = (nb3) v71Var;
        } else {
            xa3Var = (qb3) v71Var;
        }
        this.h = xa3Var;
    }
}
