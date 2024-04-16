package defpackage;

import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
/* renamed from: bu0  reason: default package */
/* loaded from: classes3.dex */
public class bu0 extends i0 {
    p a;
    j5b b;
    eb c;
    j0 d;

    private bu0(p pVar) {
        this.a = pVar;
        if (pVar.size() == 3) {
            this.b = j5b.v(pVar.F(0));
            this.c = eb.u(pVar.F(1));
            this.d = j0.I(pVar.F(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static bu0 u(Object obj) {
        if (obj instanceof bu0) {
            return (bu0) obj;
        }
        if (obj != null) {
            return new bu0(p.D(obj));
        }
        return null;
    }

    public ggb A() {
        return this.b.B();
    }

    public t9c B() {
        return this.b.C();
    }

    public b1b C() {
        return this.b.D();
    }

    public j5b D() {
        return this.b;
    }

    public int E() {
        return this.b.F();
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public ggb t() {
        return this.b.t();
    }

    public t9c v() {
        return this.b.w();
    }

    public i w() {
        return this.b.z();
    }

    public j0 x() {
        return this.d;
    }

    public eb z() {
        return this.c;
    }
}
