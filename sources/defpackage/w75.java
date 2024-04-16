package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
/* renamed from: w75  reason: default package */
/* loaded from: classes3.dex */
public class w75 extends i0 {
    gd4 a;
    i b;
    j0 c;

    private w75(p pVar) {
        if (pVar.size() != 2 && pVar.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        this.a = gd4.u(pVar.F(0));
        this.b = i.D(pVar.F(1));
        if (pVar.size() == 3) {
            this.c = j0.I(pVar.F(2));
        }
    }

    public static w75 t(Object obj) {
        if (obj instanceof w75) {
            return (w75) obj;
        }
        if (obj != null) {
            return new w75(p.D(obj));
        }
        return null;
    }

    public static w75 u(s sVar, boolean z) {
        return t(p.E(sVar, z));
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(this.b);
        j0 j0Var = this.c;
        if (j0Var != null) {
            dVar.a(j0Var);
        }
        return new w0(dVar);
    }
}
