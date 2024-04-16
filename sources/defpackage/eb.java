package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
/* renamed from: eb  reason: default package */
/* loaded from: classes3.dex */
public class eb extends i0 {
    private k a;
    private h0 b;

    public eb(k kVar) {
        this.a = kVar;
    }

    public static eb u(Object obj) {
        if (obj instanceof eb) {
            return (eb) obj;
        }
        if (obj != null) {
            return new eb(p.D(obj));
        }
        return null;
    }

    public static eb v(s sVar, boolean z) {
        return u(p.E(sVar, z));
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        h0 h0Var = this.b;
        if (h0Var != null) {
            dVar.a(h0Var);
        }
        return new w0(dVar);
    }

    public k t() {
        return this.a;
    }

    public h0 w() {
        return this.b;
    }

    public eb(k kVar, h0 h0Var) {
        this.a = kVar;
        this.b = h0Var;
    }

    private eb(p pVar) {
        if (pVar.size() >= 1 && pVar.size() <= 2) {
            this.a = k.I(pVar.F(0));
            this.b = pVar.size() == 2 ? pVar.F(1) : null;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }
}
