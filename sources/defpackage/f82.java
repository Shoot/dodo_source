package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: f82  reason: default package */
/* loaded from: classes3.dex */
public class f82 implements u72 {
    private final v72 g;
    private y72 h;
    private SecureRandom i;

    public f82() {
        this.g = new c49();
    }

    private BigInteger c(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    private BigInteger d(BigInteger bigInteger, SecureRandom secureRandom) {
        return db0.e(7, b32.c(secureRandom)).add(BigInteger.valueOf(128L)).multiply(bigInteger);
    }

    @Override // defpackage.s72
    public boolean a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        b82 b = this.h.b();
        BigInteger c = b.c();
        BigInteger c2 = c(c, bArr);
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || c.compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || c.compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger k = db0.k(c, bigInteger2);
        BigInteger mod = c2.multiply(k).mod(c);
        BigInteger mod2 = bigInteger.multiply(k).mod(c);
        BigInteger b2 = b.b();
        return b.a().modPow(mod, b2).multiply(((e82) this.h).c().modPow(mod2, b2)).mod(b2).mod(c).equals(bigInteger);
    }

    @Override // defpackage.s72
    public BigInteger[] b(byte[] bArr) {
        b82 b = this.h.b();
        BigInteger c = b.c();
        BigInteger c2 = c(c, bArr);
        BigInteger c3 = ((d82) this.h).c();
        if (this.g.c()) {
            this.g.d(c, c3, bArr);
        } else {
            this.g.a(c, this.i);
        }
        BigInteger b2 = this.g.b();
        BigInteger mod = b.a().modPow(b2.add(d(c, this.i)), b.b()).mod(c);
        return new BigInteger[]{mod, db0.j(c, b2).multiply(c2.add(c3.multiply(mod))).mod(c)};
    }

    protected SecureRandom e(boolean z, SecureRandom secureRandom) {
        if (z) {
            return b32.c(secureRandom);
        }
        return null;
    }

    @Override // defpackage.u72
    public BigInteger getOrder() {
        return this.h.b().c();
    }

    @Override // defpackage.s72
    public void init(boolean z, v71 v71Var) {
        y72 y72Var;
        SecureRandom secureRandom;
        boolean z2;
        if (z) {
            if (v71Var instanceof qq7) {
                qq7 qq7Var = (qq7) v71Var;
                this.h = (d82) qq7Var.a();
                secureRandom = qq7Var.b();
                if (!z && !this.g.c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.i = e(z2, secureRandom);
            }
            y72Var = (d82) v71Var;
        } else {
            y72Var = (e82) v71Var;
        }
        this.h = y72Var;
        secureRandom = null;
        if (!z) {
        }
        z2 = false;
        this.i = e(z2, secureRandom);
    }

    public f82(v72 v72Var) {
        this.g = v72Var;
    }
}
