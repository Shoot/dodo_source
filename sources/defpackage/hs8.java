package defpackage;

import defpackage.jbc;
import defpackage.rbc;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
/* renamed from: hs8  reason: default package */
/* loaded from: classes3.dex */
public class hs8 {
    private static Map a;

    /* renamed from: hs8$b */
    /* loaded from: classes3.dex */
    private static class b extends g {
        private b() {
            super();
        }

        @Override // defpackage.hs8.g
        ux a(b1b b1bVar, Object obj) throws IOException {
            byte[] F = l.D(b1bVar.w()).F();
            if (mo7.a(F, 0) == 1) {
                return ui5.b(tr.w(F, 4, F.length));
            }
            if (F.length == 64) {
                F = tr.w(F, 4, F.length);
            }
            return uj4.b(F);
        }
    }

    /* renamed from: hs8$c */
    /* loaded from: classes3.dex */
    private static class c extends g {
        private c() {
            super();
        }

        @Override // defpackage.hs8.g
        ux a(b1b b1bVar, Object obj) throws IOException {
            cb6 v = cb6.v(b1bVar.w());
            return new db6(v.w(), v.x(), v.u(), kvb.c(v.t().t()));
        }
    }

    /* renamed from: hs8$d */
    /* loaded from: classes3.dex */
    private static class d extends g {
        private d() {
            super();
        }

        @Override // defpackage.hs8.g
        ux a(b1b b1bVar, Object obj) throws IOException {
            return new ks6(b1bVar.v().E());
        }
    }

    /* renamed from: hs8$e */
    /* loaded from: classes3.dex */
    private static class e extends g {
        private e() {
            super();
        }

        @Override // defpackage.hs8.g
        ux a(b1b b1bVar, Object obj) throws IOException {
            return new pu8(kvb.e(b1bVar.t()), b1bVar.v().F());
        }
    }

    /* renamed from: hs8$f */
    /* loaded from: classes3.dex */
    private static class f extends g {
        private f() {
            super();
        }

        @Override // defpackage.hs8.g
        ux a(b1b b1bVar, Object obj) throws IOException {
            return new cr9(b1bVar.v().E(), kvb.g(zq9.t(b1bVar.t().w())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hs8$g */
    /* loaded from: classes3.dex */
    public static abstract class g {
        private g() {
        }

        abstract ux a(b1b b1bVar, Object obj) throws IOException;
    }

    /* renamed from: hs8$h */
    /* loaded from: classes3.dex */
    private static class h extends g {
        private h() {
            super();
        }

        @Override // defpackage.hs8.g
        ux a(b1b b1bVar, Object obj) throws IOException {
            rbc.b f;
            bbc u = bbc.u(b1bVar.t().w());
            if (u != null) {
                k t = u.v().t();
                qbc t2 = qbc.t(b1bVar.w());
                f = new rbc.b(new nbc(u.t(), kvb.b(t))).g(t2.u()).h(t2.v());
            } else {
                byte[] F = l.D(b1bVar.w()).F();
                f = new rbc.b(nbc.k(mo7.a(F, 0))).f(F);
            }
            return f.e();
        }
    }

    /* renamed from: hs8$i */
    /* loaded from: classes3.dex */
    private static class i extends g {
        private i() {
            super();
        }

        @Override // defpackage.hs8.g
        ux a(b1b b1bVar, Object obj) throws IOException {
            jbc.b f;
            ebc u = ebc.u(b1bVar.t().w());
            if (u != null) {
                k t = u.w().t();
                qbc t2 = qbc.t(b1bVar.w());
                f = new jbc.b(new fbc(u.t(), u.v(), kvb.b(t))).g(t2.u()).h(t2.v());
            } else {
                byte[] F = l.D(b1bVar.w()).F();
                f = new jbc.b(fbc.i(mo7.a(F, 0))).f(F);
            }
            return f.e();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(ko7.X, new e());
        a.put(ko7.Y, new e());
        a.put(ko7.r, new f());
        a.put(ko7.v, new d());
        a.put(ko7.w, new h());
        a.put(ko7.F, new i());
        a.put(s75.a, new h());
        a.put(s75.b, new i());
        a.put(co7.B1, new b());
        a.put(ko7.n, new c());
    }

    public static ux a(b1b b1bVar) throws IOException {
        return b(b1bVar, null);
    }

    public static ux b(b1b b1bVar, Object obj) throws IOException {
        eb t = b1bVar.t();
        g gVar = (g) a.get(t.t());
        if (gVar != null) {
            return gVar.a(b1bVar, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + t.t());
    }
}
