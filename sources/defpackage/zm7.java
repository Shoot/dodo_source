package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: zm7  reason: default package */
/* loaded from: classes3.dex */
public class zm7 extends i0 implements co7 {
    private xe5 a;
    private uh3 b;

    public zm7(xe5 xe5Var, uh3 uh3Var) {
        this.a = xe5Var;
        this.b = uh3Var;
    }

    public static zm7 u(Object obj) {
        if (obj instanceof zm7) {
            return (zm7) obj;
        }
        if (obj != null) {
            return new zm7(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        dVar.a(this.b);
        return new w0(dVar);
    }

    public uh3 t() {
        return this.b;
    }

    public xe5 v() {
        return this.a;
    }

    private zm7(p pVar) {
        Enumeration G = pVar.G();
        p D = p.D(((h0) G.nextElement()).f());
        h0 F = D.F(0);
        k kVar = co7.u0;
        if (F.equals(kVar)) {
            this.a = new xe5(kVar, gn7.t(D.F(1)));
        } else {
            this.a = xe5.u(D);
        }
        this.b = uh3.u(G.nextElement());
    }
}
