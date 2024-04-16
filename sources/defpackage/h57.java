package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: h57  reason: default package */
/* loaded from: classes3.dex */
public class h57 extends i0 {
    private final h0 a;
    private final j57 b;

    public h57(kh3 kh3Var, j57 j57Var) {
        this.a = kh3Var;
        this.b = j57Var;
    }

    public static h57 t(Object obj) {
        if (obj instanceof h57) {
            return (h57) obj;
        }
        if (obj != null) {
            return new h57(p.D(obj));
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

    public j57 u() {
        return this.b;
    }

    public h0 v() {
        return this.a;
    }

    private h57(p pVar) {
        if (pVar.size() != 2) {
            throw new IllegalArgumentException("malformed sequence");
        }
        h0 F = pVar.F(0);
        if (!(F instanceof kh3) && !(F instanceof i57)) {
            p D = p.D(F);
            F = D.size() == 2 ? kh3.v(D) : i57.u(D);
        }
        this.a = F;
        this.b = j57.t(pVar.F(1));
    }
}
