package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: cz  reason: default package */
/* loaded from: classes3.dex */
public class cz extends i0 {
    dz a;
    eb b;
    j0 c;

    public cz(p pVar) {
        if (pVar.size() == 3) {
            this.a = dz.u(pVar.F(0));
            this.b = eb.u(pVar.F(1));
            this.c = j0.I(pVar.F(2));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static cz u(Object obj) {
        if (obj instanceof cz) {
            return (cz) obj;
        }
        if (obj != null) {
            return new cz(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(this.b);
        dVar.a(this.c);
        return new w0(dVar);
    }

    public dz t() {
        return this.a;
    }
}
