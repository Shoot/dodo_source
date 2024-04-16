package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: zt0  reason: default package */
/* loaded from: classes3.dex */
public class zt0 extends i0 {
    private k a;
    private h0 b;

    public zt0(k kVar, h0 h0Var) {
        this.a = kVar;
        this.b = h0Var;
    }

    public static zt0 v(Object obj) {
        if (obj instanceof zt0) {
            return (zt0) obj;
        }
        if (obj != null) {
            return new zt0(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        dVar.a(new z0(0, this.b));
        return new w0(dVar);
    }

    public k t() {
        return this.a;
    }

    public h0 u() {
        return this.b;
    }

    private zt0(p pVar) {
        this.a = k.I(pVar.F(0));
        this.b = s.D(pVar.F(1)).F();
    }
}
