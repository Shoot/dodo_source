package defpackage;

import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.f0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
/* renamed from: lt1  reason: default package */
/* loaded from: classes3.dex */
public class lt1 extends i0 {
    private k a;
    private h0 b;

    public lt1(p pVar) {
        if (pVar.size() >= 1 && pVar.size() <= 2) {
            this.a = (k) pVar.F(0);
            if (pVar.size() > 1) {
                s sVar = (s) pVar.F(1);
                if (sVar.H() && sVar.G() == 0) {
                    this.b = sVar.F();
                    return;
                }
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static lt1 t(Object obj) {
        if (obj instanceof lt1) {
            return (lt1) obj;
        }
        if (obj != null) {
            return new lt1(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        h0 h0Var = this.b;
        if (h0Var != null) {
            dVar.a(new f0(0, h0Var));
        }
        return new b0(dVar);
    }
}
