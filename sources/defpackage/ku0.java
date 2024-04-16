package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: ku0  reason: default package */
/* loaded from: classes3.dex */
public class ku0 extends i0 {
    i a;
    t9c b;
    b1b c;
    q d;

    public ku0(p pVar) {
        this.a = new i(0L);
        this.d = null;
        this.a = (i) pVar.F(0);
        this.b = t9c.u(pVar.F(1));
        this.c = b1b.u(pVar.F(2));
        if (pVar.size() > 3) {
            this.d = q.F((s) pVar.F(3), false);
        }
        u(this.d);
        if (this.b != null && this.a != null && this.c != null) {
            return;
        }
        throw new IllegalArgumentException("Not all mandatory fields set in CertificationRequestInfo generator.");
    }

    public static ku0 t(Object obj) {
        if (obj instanceof ku0) {
            return (ku0) obj;
        }
        if (obj != null) {
            return new ku0(p.D(obj));
        }
        return null;
    }

    private static void u(q qVar) {
        if (qVar == null) {
            return;
        }
        Enumeration H = qVar.H();
        while (H.hasMoreElements()) {
            bz v = bz.v(H.nextElement());
            if (v.t().x(co7.Y0) && v.u().size() != 1) {
                throw new IllegalArgumentException("challengePassword attribute must have one value");
            }
        }
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(4);
        dVar.a(this.a);
        dVar.a(this.b);
        dVar.a(this.c);
        q qVar = this.d;
        if (qVar != null) {
            dVar.a(new z0(false, 0, qVar));
        }
        return new w0(dVar);
    }
}
