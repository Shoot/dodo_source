package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.f0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.k1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
/* renamed from: kt1  reason: default package */
/* loaded from: classes3.dex */
public class kt1 extends i0 implements co7 {
    private k a;
    private h0 b;
    private boolean c;

    public kt1(k kVar, h0 h0Var) {
        this.c = true;
        this.a = kVar;
        this.b = h0Var;
    }

    public static kt1 v(Object obj) {
        if (obj instanceof kt1) {
            return (kt1) obj;
        }
        if (obj != null) {
            return new kt1(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        h0 h0Var = this.b;
        if (h0Var != null) {
            dVar.a(new f0(true, 0, h0Var));
        }
        if (this.c) {
            return new b0(dVar);
        }
        return new k1(dVar);
    }

    public h0 t() {
        return this.b;
    }

    public k u() {
        return this.a;
    }

    private kt1(p pVar) {
        this.c = true;
        Enumeration G = pVar.G();
        this.a = (k) G.nextElement();
        if (G.hasMoreElements()) {
            this.b = ((s) G.nextElement()).F();
        }
        this.c = pVar instanceof b0;
    }
}
