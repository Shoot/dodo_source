package defpackage;

import java.math.BigInteger;
import java.util.Random;
/* renamed from: o82  reason: default package */
/* loaded from: classes3.dex */
public abstract class o82 {
    public static jb3 a(ea3 ea3Var, byte[] bArr) {
        na3 na3Var;
        na3 m = ea3Var.m(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        na3 m2 = ea3Var.m(new BigInteger(1, bArr));
        if (!d(m2).equals(ea3Var.n())) {
            m2 = m2.b();
        }
        if (m2.i()) {
            na3Var = ea3Var.o().n();
        } else {
            na3 c = c(ea3Var, m2.o().g().j(ea3Var.o()).a(ea3Var.n()).a(m2));
            if (c != null) {
                if (!d(c).equals(m)) {
                    c = c.b();
                }
                na3Var = m2.j(c);
            } else {
                na3Var = null;
            }
        }
        if (na3Var != null) {
            return ea3Var.E(m2.t(), na3Var.t());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static byte[] b(jb3 jb3Var) {
        jb3 A = jb3Var.A();
        na3 f = A.f();
        byte[] e = f.e();
        if (!f.i()) {
            if (d(A.g().d(f)).h()) {
                int length = e.length - 1;
                e[length] = (byte) (e[length] | 1);
            } else {
                int length2 = e.length - 1;
                e[length2] = (byte) (e[length2] & 254);
            }
        }
        return e;
    }

    private static na3 c(ea3 ea3Var, na3 na3Var) {
        na3 na3Var2;
        if (na3Var.i()) {
            return na3Var;
        }
        na3 m = ea3Var.m(da3.a);
        Random random = new Random();
        int f = na3Var.f();
        do {
            na3 m2 = ea3Var.m(new BigInteger(f, random));
            na3 na3Var3 = na3Var;
            na3Var2 = m;
            for (int i = 1; i <= f - 1; i++) {
                na3 o = na3Var3.o();
                na3Var2 = na3Var2.o().a(o.j(m2));
                na3Var3 = o.a(na3Var);
            }
            if (!na3Var3.i()) {
                return null;
            }
        } while (na3Var2.o().a(na3Var2).i());
        return na3Var2;
    }

    private static na3 d(na3 na3Var) {
        na3 na3Var2 = na3Var;
        for (int i = 1; i < na3Var.f(); i++) {
            na3Var2 = na3Var2.o().a(na3Var);
        }
        return na3Var2;
    }
}
