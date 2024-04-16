package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: fu0  reason: default package */
/* loaded from: classes3.dex */
public class fu0 extends i0 {
    i5b a;
    eb b;
    j0 c;
    boolean d = false;
    int e;

    public fu0(p pVar) {
        if (pVar.size() == 3) {
            this.a = i5b.u(pVar.F(0));
            this.b = eb.u(pVar.F(1));
            this.c = j0.I(pVar.F(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for CertificateList");
    }

    public static fu0 t(Object obj) {
        if (obj instanceof fu0) {
            return (fu0) obj;
        }
        if (obj != null) {
            return new fu0(p.D(obj));
        }
        return null;
    }

    public i5b A() {
        return this.a;
    }

    public ggb B() {
        return this.a.A();
    }

    public int C() {
        return this.a.B();
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(this.b);
        dVar.a(this.c);
        return new w0(dVar);
    }

    @Override // defpackage.i0
    public int hashCode() {
        if (!this.d) {
            this.e = super.hashCode();
            this.d = true;
        }
        return this.e;
    }

    public t9c u() {
        return this.a.v();
    }

    public ggb v() {
        return this.a.w();
    }

    public Enumeration w() {
        return this.a.x();
    }

    public j0 x() {
        return this.c;
    }

    public eb z() {
        return this.b;
    }
}
