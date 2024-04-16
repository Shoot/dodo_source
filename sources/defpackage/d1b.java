package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.s0;
/* renamed from: d1b  reason: default package */
/* loaded from: classes3.dex */
public class d1b {
    public static b1b a(ux uxVar) throws IOException {
        if (uxVar instanceof pu8) {
            pu8 pu8Var = (pu8) uxVar;
            return new b1b(kvb.d(pu8Var.c()), pu8Var.b());
        } else if (uxVar instanceof cr9) {
            cr9 cr9Var = (cr9) uxVar;
            return new b1b(new eb(ko7.r, new zq9(kvb.f(cr9Var.b()))), cr9Var.c());
        } else if (uxVar instanceof ks6) {
            return new b1b(new eb(ko7.v), ((ks6) uxVar).b());
        } else {
            if (uxVar instanceof ui5) {
                return new b1b(new eb(co7.B1), new s0(rn1.f().i(1).c((ui5) uxVar).b()));
            } else if (uxVar instanceof uj4) {
                uj4 uj4Var = (uj4) uxVar;
                return new b1b(new eb(co7.B1), new s0(rn1.f().i(uj4Var.c()).c(uj4Var.d()).b()));
            } else if (uxVar instanceof rbc) {
                rbc rbcVar = (rbc) uxVar;
                byte[] d = rbcVar.d();
                byte[] e = rbcVar.e();
                byte[] encoded = rbcVar.getEncoded();
                if (encoded.length > d.length + e.length) {
                    return new b1b(new eb(s75.a), new s0(encoded));
                }
                return new b1b(new eb(ko7.w, new bbc(rbcVar.c().b(), kvb.h(rbcVar.b()))), new qbc(d, e));
            } else if (uxVar instanceof jbc) {
                jbc jbcVar = (jbc) uxVar;
                byte[] d2 = jbcVar.d();
                byte[] e2 = jbcVar.e();
                byte[] encoded2 = jbcVar.getEncoded();
                if (encoded2.length > d2.length + e2.length) {
                    return new b1b(new eb(s75.b), new s0(encoded2));
                }
                return new b1b(new eb(ko7.F, new ebc(jbcVar.c().a(), jbcVar.c().b(), kvb.h(jbcVar.b()))), new ibc(jbcVar.d(), jbcVar.e()));
            } else if (uxVar instanceof db6) {
                db6 db6Var = (db6) uxVar;
                return new b1b(new eb(ko7.n), new cb6(db6Var.d(), db6Var.e(), db6Var.c(), kvb.a(db6Var.b())));
            } else {
                throw new IOException("key parameters not recognized");
            }
        }
    }
}
