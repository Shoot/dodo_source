package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: tb4  reason: default package */
/* loaded from: classes3.dex */
public class tb4 implements u72 {
    db4 g;
    SecureRandom h;

    @Override // defpackage.s72
    public boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = new BigInteger(1, tr.P(bArr));
        ib4 b = this.g.b();
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || b.c().compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || b.c().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modPow = bigInteger3.modPow(b.c().subtract(new BigInteger("2")), b.c());
        return b.a().modPow(bigInteger2.multiply(modPow).mod(b.c()), b.b()).multiply(((rb4) this.g).c().modPow(b.c().subtract(bigInteger).multiply(modPow).mod(b.c()), b.b())).mod(b.b()).mod(b.c()).equals(bigInteger);
    }

    @Override // defpackage.s72
    public BigInteger[] b(byte[] bArr) {
        BigInteger e;
        BigInteger bigInteger = new BigInteger(1, tr.P(bArr));
        ib4 b = this.g.b();
        do {
            e = db0.e(b.c().bitLength(), this.h);
        } while (e.compareTo(b.c()) >= 0);
        BigInteger mod = b.a().modPow(e, b.b()).mod(b.c());
        return new BigInteger[]{mod, e.multiply(bigInteger).add(((mb4) this.g).c().multiply(mod)).mod(b.c())};
    }

    @Override // defpackage.u72
    public BigInteger getOrder() {
        return this.g.b().c();
    }

    @Override // defpackage.s72
    public void init(boolean z, v71 v71Var) {
        db4 db4Var;
        if (z) {
            if (v71Var instanceof qq7) {
                qq7 qq7Var = (qq7) v71Var;
                this.h = qq7Var.b();
                this.g = (mb4) qq7Var.a();
                return;
            }
            this.h = b32.b();
            db4Var = (mb4) v71Var;
        } else {
            db4Var = (rb4) v71Var;
        }
        this.g = db4Var;
    }
}
