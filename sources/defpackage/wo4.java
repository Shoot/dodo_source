package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: wo4  reason: default package */
/* loaded from: classes3.dex */
public class wo4 extends i0 {
    w75 a;
    gd4 b;
    u47 c;
    private int d;

    private wo4(p pVar) {
        this.d = 1;
        if (pVar.size() > 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        for (int i = 0; i != pVar.size(); i++) {
            s D = s.D(pVar.F(i));
            int G = D.G();
            if (G == 0) {
                this.a = w75.u(D, false);
            } else if (G == 1) {
                this.b = gd4.v(D, false);
            } else if (G != 2) {
                throw new IllegalArgumentException("unknown tag in Holder");
            } else {
                this.c = u47.u(D, false);
            }
        }
        this.d = 1;
    }

    public static wo4 t(Object obj) {
        if (obj instanceof wo4) {
            return (wo4) obj;
        }
        if (obj instanceof s) {
            return new wo4(s.D(obj));
        }
        if (obj != null) {
            return new wo4(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        if (this.d == 1) {
            d dVar = new d(3);
            w75 w75Var = this.a;
            if (w75Var != null) {
                dVar.a(new z0(false, 0, w75Var));
            }
            gd4 gd4Var = this.b;
            if (gd4Var != null) {
                dVar.a(new z0(false, 1, gd4Var));
            }
            u47 u47Var = this.c;
            if (u47Var != null) {
                dVar.a(new z0(false, 2, u47Var));
            }
            return new w0(dVar);
        }
        gd4 gd4Var2 = this.b;
        if (gd4Var2 != null) {
            return new z0(true, 1, gd4Var2);
        }
        return new z0(true, 0, this.a);
    }

    private wo4(s sVar) {
        this.d = 1;
        int G = sVar.G();
        if (G == 0) {
            this.a = w75.u(sVar, true);
        } else if (G != 1) {
            throw new IllegalArgumentException("unknown tag in Holder");
        } else {
            this.b = gd4.v(sVar, true);
        }
        this.d = 0;
    }
}
