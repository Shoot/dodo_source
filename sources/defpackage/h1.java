package defpackage;

import java.math.BigInteger;
/* renamed from: h1  reason: default package */
/* loaded from: classes3.dex */
public abstract class h1 implements bb3 {
    @Override // defpackage.bb3
    public jb3 a(jb3 jb3Var, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum != 0 && !jb3Var.u()) {
            jb3 c = c(jb3Var, bigInteger.abs());
            if (signum <= 0) {
                c = c.z();
            }
            return b(c);
        }
        return jb3Var.i().u();
    }

    protected jb3 b(jb3 jb3Var) {
        return ca3.b(jb3Var);
    }

    protected abstract jb3 c(jb3 jb3Var, BigInteger bigInteger);
}
