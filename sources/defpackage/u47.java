package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.e;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
/* renamed from: u47  reason: default package */
/* loaded from: classes3.dex */
public class u47 extends i0 {
    e a;
    k b;
    eb c;
    j0 d;

    private u47(p pVar) {
        if (pVar.size() <= 4 && pVar.size() >= 3) {
            int i = 0;
            this.a = e.E(pVar.F(0));
            if (pVar.size() == 4) {
                i = 1;
                this.b = k.I(pVar.F(1));
            }
            this.c = eb.u(pVar.F(i + 1));
            this.d = j0.I(pVar.F(i + 2));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static u47 t(Object obj) {
        if (obj instanceof u47) {
            return (u47) obj;
        }
        if (obj != null) {
            return new u47(p.D(obj));
        }
        return null;
    }

    public static u47 u(s sVar, boolean z) {
        return t(p.E(sVar, z));
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(4);
        dVar.a(this.a);
        k kVar = this.b;
        if (kVar != null) {
            dVar.a(kVar);
        }
        dVar.a(this.c);
        dVar.a(this.d);
        return new w0(dVar);
    }
}
