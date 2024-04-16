package defpackage;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
/* renamed from: e28  reason: default package */
/* loaded from: classes3.dex */
public class e28 extends i0 implements co7 {
    private kt1 a;
    private b46 b;

    public e28(kt1 kt1Var, b46 b46Var) {
        this.a = kt1Var;
        this.b = b46Var;
    }

    public static e28 u(Object obj) {
        if (obj instanceof e28) {
            return (e28) obj;
        }
        if (obj != null) {
            return new e28(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(new i(3L));
        dVar.a(this.a);
        b46 b46Var = this.b;
        if (b46Var != null) {
            dVar.a(b46Var);
        }
        return new b0(dVar);
    }

    public kt1 t() {
        return this.a;
    }

    public b46 v() {
        return this.b;
    }

    private e28(p pVar) {
        this.b = null;
        if (!i.D(pVar.F(0)).H(3)) {
            throw new IllegalArgumentException("wrong version for PFX PDU");
        }
        this.a = kt1.v(pVar.F(1));
        if (pVar.size() == 3) {
            this.b = b46.t(pVar.F(2));
        }
    }
}
