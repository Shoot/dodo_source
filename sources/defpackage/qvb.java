package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: qvb  reason: default package */
/* loaded from: classes3.dex */
public class qvb extends i0 {
    gd4 a;
    w75 b;
    u47 c;

    public qvb(p pVar) {
        int i;
        if (pVar.size() <= 3) {
            if (!(pVar.F(0) instanceof s)) {
                this.a = gd4.u(pVar.F(0));
                i = 1;
            } else {
                i = 0;
            }
            while (i != pVar.size()) {
                s D = s.D(pVar.F(i));
                if (D.G() == 0) {
                    this.b = w75.u(D, false);
                } else if (D.G() == 1) {
                    this.c = u47.u(D, false);
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + D.G());
                }
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static qvb t(Object obj) {
        if (obj instanceof qvb) {
            return (qvb) obj;
        }
        if (obj != null) {
            return new qvb(p.D(obj));
        }
        return null;
    }

    public static qvb u(s sVar, boolean z) {
        return t(p.E(sVar, z));
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        gd4 gd4Var = this.a;
        if (gd4Var != null) {
            dVar.a(gd4Var);
        }
        w75 w75Var = this.b;
        if (w75Var != null) {
            dVar.a(new z0(false, 0, w75Var));
        }
        u47 u47Var = this.c;
        if (u47Var != null) {
            dVar.a(new z0(false, 1, u47Var));
        }
        return new w0(dVar);
    }
}
