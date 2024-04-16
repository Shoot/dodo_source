package defpackage;

import defpackage.hbc;
import defpackage.pbc;
import java.io.IOException;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
/* renamed from: ck8  reason: default package */
/* loaded from: classes3.dex */
public class ck8 {
    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i = 0; i != length; i++) {
            sArr[i] = mo7.r(bArr, i * 2);
        }
        return sArr;
    }

    public static ux b(dk8 dk8Var) throws IOException {
        k t = dk8Var.w().t();
        if (t.R(e50.W)) {
            return new ou8(kvb.e(dk8Var.w()), l.D(dk8Var.B()).F());
        } else if (t.x(e50.s)) {
            return new br9(l.D(dk8Var.B()).F(), kvb.g(zq9.t(dk8Var.w().w())));
        } else {
            if (t.x(e50.f0)) {
                return new js6(a(l.D(dk8Var.B()).F()));
            }
            if (t.x(co7.B1)) {
                byte[] F = l.D(dk8Var.B()).F();
                b x = dk8Var.x();
                if (mo7.a(F, 0) == 1) {
                    if (x != null) {
                        byte[] F2 = x.F();
                        return ti5.g(tr.w(F, 4, F.length), tr.w(F2, 4, F2.length));
                    }
                    return ti5.f(tr.w(F, 4, F.length));
                } else if (x != null) {
                    return tj4.c(tr.w(F, 4, F.length), x.F());
                } else {
                    return tj4.b(tr.w(F, 4, F.length));
                }
            } else if (t.x(e50.w)) {
                bbc u = bbc.u(dk8Var.w().w());
                k t2 = u.v().t();
                obc v = obc.v(dk8Var.B());
                try {
                    pbc.b o = new pbc.b(new nbc(u.t(), kvb.b(t2))).l(v.u()).q(v.B()).p(v.A()).n(v.x()).o(v.z());
                    if (v.C() != 0) {
                        o.m(v.w());
                    }
                    if (v.t() != null) {
                        o.k(((q50) sbc.f(v.t(), q50.class)).j(t2));
                    }
                    return o.j();
                } catch (ClassNotFoundException e) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
                }
            } else if (t.x(ko7.F)) {
                ebc u2 = ebc.u(dk8Var.w().w());
                k t3 = u2.w().t();
                try {
                    gbc v2 = gbc.v(dk8Var.B());
                    hbc.b p = new hbc.b(new fbc(u2.t(), u2.v(), kvb.b(t3))).m(v2.u()).r(v2.B()).q(v2.A()).o(v2.x()).p(v2.z());
                    if (v2.C() != 0) {
                        p.n(v2.w());
                    }
                    if (v2.t() != null) {
                        p.l(((r50) sbc.f(v2.t(), r50.class)).f(t3));
                    }
                    return p.k();
                } catch (ClassNotFoundException e2) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
                }
            } else if (t.x(ko7.n)) {
                ab6 w = ab6.w(dk8Var.B());
                return new bb6(w.z(), w.x(), w.u(), w.v(), w.A(), kvb.c(w.t().t()));
            } else {
                throw new RuntimeException("algorithm identifier in private key not recognised");
            }
        }
    }
}
