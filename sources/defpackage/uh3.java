package defpackage;

import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
/* renamed from: uh3  reason: default package */
/* loaded from: classes3.dex */
public class uh3 extends i0 {
    private eb a;

    public uh3(k kVar) {
        this.a = new eb(kVar);
    }

    public static uh3 u(Object obj) {
        if (obj instanceof uh3) {
            return (uh3) obj;
        }
        if (obj != null) {
            return new uh3(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a.f();
    }

    public k t() {
        return this.a.t();
    }

    public h0 v() {
        return this.a.w();
    }

    public uh3(k kVar, h0 h0Var) {
        this.a = new eb(kVar, h0Var);
    }

    private uh3(p pVar) {
        this.a = eb.u(pVar);
    }
}
