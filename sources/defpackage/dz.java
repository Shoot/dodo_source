package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: dz  reason: default package */
/* loaded from: classes3.dex */
public class dz extends i0 {
    private i a;
    private wo4 b;
    private xy c;
    private eb d;
    private i e;
    private yy f;
    private p g;
    private j0 h;
    private rn3 i;

    private dz(p pVar) {
        if (pVar.size() >= 6 && pVar.size() <= 9) {
            int i = 0;
            if (pVar.F(0) instanceof i) {
                this.a = i.D(pVar.F(0));
                i = 1;
            } else {
                this.a = new i(0L);
            }
            this.b = wo4.t(pVar.F(i));
            this.c = xy.t(pVar.F(i + 1));
            this.d = eb.u(pVar.F(i + 2));
            this.e = i.D(pVar.F(i + 3));
            this.f = yy.t(pVar.F(i + 4));
            this.g = p.D(pVar.F(i + 5));
            for (int i2 = i + 6; i2 < pVar.size(); i2++) {
                h0 F = pVar.F(i2);
                if (F instanceof j0) {
                    this.h = j0.I(pVar.F(i2));
                } else if ((F instanceof p) || (F instanceof rn3)) {
                    this.i = rn3.u(pVar.F(i2));
                }
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static dz u(Object obj) {
        if (obj instanceof dz) {
            return (dz) obj;
        }
        if (obj != null) {
            return new dz(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(9);
        if (!this.a.H(0)) {
            dVar.a(this.a);
        }
        dVar.a(this.b);
        dVar.a(this.c);
        dVar.a(this.d);
        dVar.a(this.e);
        dVar.a(this.f);
        dVar.a(this.g);
        j0 j0Var = this.h;
        if (j0Var != null) {
            dVar.a(j0Var);
        }
        rn3 rn3Var = this.i;
        if (rn3Var != null) {
            dVar.a(rn3Var);
        }
        return new w0(dVar);
    }

    public rn3 t() {
        return this.i;
    }
}
