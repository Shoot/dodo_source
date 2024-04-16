package defpackage;

import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
/* renamed from: xe5  reason: default package */
/* loaded from: classes3.dex */
public class xe5 extends i0 {
    private eb a;

    public xe5(k kVar, h0 h0Var) {
        this.a = new eb(kVar, h0Var);
    }

    public static xe5 u(Object obj) {
        if (obj instanceof xe5) {
            return (xe5) obj;
        }
        if (obj != null) {
            return new xe5(p.D(obj));
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

    private xe5(p pVar) {
        this.a = eb.u(pVar);
    }
}
