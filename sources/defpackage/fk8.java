package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s0;
/* renamed from: fk8  reason: default package */
/* loaded from: classes3.dex */
public class fk8 {
    public static dk8 a(ux uxVar, q qVar) throws IOException {
        if (uxVar instanceof ou8) {
            ou8 ou8Var = (ou8) uxVar;
            return new dk8(kvb.d(ou8Var.c()), new s0(ou8Var.b()), qVar);
        } else if (uxVar instanceof br9) {
            br9 br9Var = (br9) uxVar;
            return new dk8(new eb(ko7.r, new zq9(kvb.f(br9Var.b()))), new s0(br9Var.c()));
        } else if (uxVar instanceof js6) {
            eb ebVar = new eb(ko7.v);
            short[] b = ((js6) uxVar).b();
            byte[] bArr = new byte[b.length * 2];
            for (int i = 0; i != b.length; i++) {
                mo7.B(b[i], bArr, i * 2);
            }
            return new dk8(ebVar, new s0(bArr));
        } else if (uxVar instanceof ti5) {
            ti5 ti5Var = (ti5) uxVar;
            byte[] b2 = rn1.f().i(1).c(ti5Var).b();
            return new dk8(new eb(co7.B1), new s0(b2), qVar, rn1.f().i(1).c(ti5Var.j()).b());
        } else if (uxVar instanceof tj4) {
            tj4 tj4Var = (tj4) uxVar;
            byte[] b3 = rn1.f().i(tj4Var.d()).c(tj4Var).b();
            return new dk8(new eb(co7.B1), new s0(b3), qVar, rn1.f().i(tj4Var.d()).c(tj4Var.e().d()).b());
        } else if (uxVar instanceof pbc) {
            pbc pbcVar = (pbc) uxVar;
            return new dk8(new eb(ko7.w, new bbc(pbcVar.c().b(), kvb.h(pbcVar.b()))), b(pbcVar), qVar);
        } else if (uxVar instanceof hbc) {
            hbc hbcVar = (hbc) uxVar;
            return new dk8(new eb(ko7.F, new ebc(hbcVar.c().a(), hbcVar.c().b(), kvb.h(hbcVar.b()))), c(hbcVar), qVar);
        } else if (uxVar instanceof bb6) {
            bb6 bb6Var = (bb6) uxVar;
            return new dk8(new eb(ko7.n), new ab6(bb6Var.g(), bb6Var.f(), bb6Var.c(), bb6Var.d(), bb6Var.h(), kvb.a(bb6Var.b())));
        } else {
            throw new IOException("key parameters not recognized");
        }
    }

    private static obc b(pbc pbcVar) throws IOException {
        byte[] encoded = pbcVar.getEncoded();
        int h = pbcVar.c().h();
        int b = pbcVar.c().b();
        int a = (int) sbc.a(encoded, 0, 4);
        if (sbc.l(b, a)) {
            byte[] g = sbc.g(encoded, 4, h);
            int i = 4 + h;
            byte[] g2 = sbc.g(encoded, i, h);
            int i2 = i + h;
            byte[] g3 = sbc.g(encoded, i2, h);
            int i3 = i2 + h;
            byte[] g4 = sbc.g(encoded, i3, h);
            int i4 = i3 + h;
            byte[] g5 = sbc.g(encoded, i4, encoded.length - i4);
            try {
                q50 q50Var = (q50) sbc.f(g5, q50.class);
                if (q50Var.c() != (1 << b) - 1) {
                    return new obc(a, g, g2, g3, g4, g5, q50Var.c());
                }
                return new obc(a, g, g2, g3, g4, g5);
            } catch (ClassNotFoundException e) {
                throw new IOException("cannot parse BDS: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    private static gbc c(hbc hbcVar) throws IOException {
        byte[] encoded = hbcVar.getEncoded();
        int f = hbcVar.c().f();
        int a = hbcVar.c().a();
        int i = (a + 7) / 8;
        long a2 = (int) sbc.a(encoded, 0, i);
        if (sbc.l(a, a2)) {
            byte[] g = sbc.g(encoded, i, f);
            int i2 = i + f;
            byte[] g2 = sbc.g(encoded, i2, f);
            int i3 = i2 + f;
            byte[] g3 = sbc.g(encoded, i3, f);
            int i4 = i3 + f;
            byte[] g4 = sbc.g(encoded, i4, f);
            int i5 = i4 + f;
            byte[] g5 = sbc.g(encoded, i5, encoded.length - i5);
            try {
                r50 r50Var = (r50) sbc.f(g5, r50.class);
                if (r50Var.b() != (1 << a) - 1) {
                    return new gbc(a2, g, g2, g3, g4, g5, r50Var.b());
                }
                return new gbc(a2, g, g2, g3, g4, g5);
            } catch (ClassNotFoundException e) {
                throw new IOException("cannot parse BDSStateMap: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }
}
