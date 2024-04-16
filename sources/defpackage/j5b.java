package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: j5b  reason: default package */
/* loaded from: classes3.dex */
public class j5b extends i0 {
    p a;
    i b;
    i c;
    eb d;
    t9c e;
    ggb f;
    ggb g;
    t9c h;
    b1b i;
    j0 j;
    j0 k;
    rn3 l;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private j5b(org.bouncycastle.asn1.p r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j5b.<init>(org.bouncycastle.asn1.p):void");
    }

    public static j5b v(Object obj) {
        if (obj instanceof j5b) {
            return (j5b) obj;
        }
        if (obj != null) {
            return new j5b(p.D(obj));
        }
        return null;
    }

    public eb A() {
        return this.d;
    }

    public ggb B() {
        return this.f;
    }

    public t9c C() {
        return this.h;
    }

    public b1b D() {
        return this.i;
    }

    public j0 E() {
        return this.k;
    }

    public int F() {
        return this.b.P() + 1;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        if (pq8.b("org.bouncycastle.x509.allow_non-der_tbscert") != null) {
            if (pq8.c("org.bouncycastle.x509.allow_non-der_tbscert")) {
                return this.a;
            }
            d dVar = new d();
            if (!this.b.H(0)) {
                dVar.a(new z0(true, 0, this.b));
            }
            dVar.a(this.c);
            dVar.a(this.d);
            dVar.a(this.e);
            d dVar2 = new d(2);
            dVar2.a(this.f);
            dVar2.a(this.g);
            dVar.a(new w0(dVar2));
            h0 h0Var = this.h;
            if (h0Var == null) {
                h0Var = new w0();
            }
            dVar.a(h0Var);
            dVar.a(this.i);
            j0 j0Var = this.j;
            if (j0Var != null) {
                dVar.a(new z0(false, 1, j0Var));
            }
            j0 j0Var2 = this.k;
            if (j0Var2 != null) {
                dVar.a(new z0(false, 2, j0Var2));
            }
            rn3 rn3Var = this.l;
            if (rn3Var != null) {
                dVar.a(new z0(true, 3, rn3Var));
            }
            return new w0(dVar);
        }
        return this.a;
    }

    public ggb t() {
        return this.g;
    }

    public rn3 u() {
        return this.l;
    }

    public t9c w() {
        return this.e;
    }

    public j0 x() {
        return this.j;
    }

    public i z() {
        return this.c;
    }
}
