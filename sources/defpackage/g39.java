package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: g39  reason: default package */
/* loaded from: classes3.dex */
public class g39 implements rx {
    private static final BigInteger d = BigInteger.valueOf(1);
    private j39 a = new j39();
    private n39 b;
    private SecureRandom c;

    @Override // defpackage.rx
    public int a() {
        return this.a.d();
    }

    @Override // defpackage.rx
    public int b() {
        return this.a.c();
    }

    @Override // defpackage.rx
    public byte[] c(byte[] bArr, int i, int i2) {
        BigInteger f;
        o39 o39Var;
        BigInteger h;
        if (this.b != null) {
            BigInteger a = this.a.a(bArr, i, i2);
            n39 n39Var = this.b;
            if ((n39Var instanceof o39) && (h = (o39Var = (o39) n39Var).h()) != null) {
                BigInteger c = o39Var.c();
                BigInteger bigInteger = d;
                BigInteger f2 = db0.f(bigInteger, c.subtract(bigInteger), this.c);
                f = this.a.f(f2.modPow(h, c).multiply(a).mod(c)).multiply(db0.j(c, f2)).mod(c);
                if (!a.equals(f.modPow(h, c))) {
                    throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                }
            } else {
                f = this.a.f(a);
            }
            return this.a.b(f);
        }
        throw new IllegalStateException("RSA engine not initialised");
    }

    @Override // defpackage.rx
    public void init(boolean z, v71 v71Var) {
        SecureRandom b;
        this.a.e(z, v71Var);
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            n39 n39Var = (n39) qq7Var.a();
            this.b = n39Var;
            if (n39Var instanceof o39) {
                b = qq7Var.b();
                this.c = b;
                return;
            }
            this.c = null;
        }
        n39 n39Var2 = (n39) v71Var;
        this.b = n39Var2;
        if (n39Var2 instanceof o39) {
            b = b32.b();
            this.c = b;
            return;
        }
        this.c = null;
    }
}
