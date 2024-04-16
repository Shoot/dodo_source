package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.k1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.o1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
/* renamed from: ps9  reason: default package */
/* loaded from: classes3.dex */
public class ps9 extends i0 {
    private k a;
    private h0 b;
    private q c;

    public ps9(k kVar, h0 h0Var, q qVar) {
        this.a = kVar;
        this.b = h0Var;
        this.c = qVar;
    }

    public static ps9 w(Object obj) {
        if (obj instanceof ps9) {
            return (ps9) obj;
        }
        if (obj != null) {
            return new ps9(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(new o1(true, 0, this.b));
        q qVar = this.c;
        if (qVar != null) {
            dVar.a(qVar);
        }
        return new k1(dVar);
    }

    public q t() {
        return this.c;
    }

    public k u() {
        return this.a;
    }

    public h0 v() {
        return this.b;
    }

    private ps9(p pVar) {
        this.a = (k) pVar.F(0);
        this.b = ((s) pVar.F(1)).F();
        if (pVar.size() == 3) {
            this.c = (q) pVar.F(2);
        }
    }
}
