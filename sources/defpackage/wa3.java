package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: wa3  reason: default package */
/* loaded from: classes3.dex */
public class wa3 implements tx, da3 {
    la3 g;
    SecureRandom h;

    @Override // defpackage.tx
    public sx a() {
        BigInteger e = this.g.e();
        int bitLength = e.bitLength();
        int i = bitLength >>> 2;
        while (true) {
            BigInteger e2 = db0.e(bitLength, this.h);
            if (e2.compareTo(da3.b) >= 0 && e2.compareTo(e) < 0 && n2c.h(e2) >= i) {
                return new sx(new qb3(b().a(this.g.b(), e2), this.g), new nb3(e2, this.g));
            }
        }
    }

    protected bb3 b() {
        return new ry3();
    }

    public void c(ff5 ff5Var) {
        va3 va3Var = (va3) ff5Var;
        this.h = va3Var.a();
        this.g = va3Var.c();
    }
}
