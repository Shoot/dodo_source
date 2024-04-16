package defpackage;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.f0;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
/* renamed from: ih3  reason: default package */
/* loaded from: classes3.dex */
public class ih3 extends i0 {
    p a;

    public ih3(k kVar, eb ebVar, h0 h0Var) {
        d dVar = new d(3);
        dVar.a(kVar);
        dVar.a(ebVar.f());
        dVar.a(new f0(false, 0, h0Var));
        this.a = new b0(dVar);
    }

    public static ih3 v(Object obj) {
        if (obj instanceof ih3) {
            return (ih3) obj;
        }
        if (obj != null) {
            return new ih3(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(new i(0L));
        dVar.a(this.a);
        return new b0(dVar);
    }

    public l t() {
        if (this.a.size() == 3) {
            return l.E(s.D(this.a.F(2)), false);
        }
        return null;
    }

    public eb u() {
        return eb.u(this.a.F(1));
    }

    private ih3(p pVar) {
        if (!((i) pVar.F(0)).H(0)) {
            throw new IllegalArgumentException("sequence not version 0");
        }
        this.a = p.D(pVar.F(1));
    }
}
