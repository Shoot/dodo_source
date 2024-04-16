package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
/* renamed from: cb4  reason: default package */
/* loaded from: classes3.dex */
public class cb4 implements tx {
    private bb4 g;

    @Override // defpackage.tx
    public sx a() {
        ib4 c = this.g.c();
        SecureRandom a = this.g.a();
        BigInteger c2 = c.c();
        BigInteger b = c.b();
        BigInteger a2 = c.a();
        while (true) {
            BigInteger e = db0.e(256, a);
            if (e.signum() >= 1 && e.compareTo(c2) < 0 && n2c.h(e) >= 64) {
                return new sx(new rb4(a2.modPow(e, b), c), new mb4(e, c));
            }
        }
    }

    public void b(ff5 ff5Var) {
        this.g = (bb4) ff5Var;
    }
}
