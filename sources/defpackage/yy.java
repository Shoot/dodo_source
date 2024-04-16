package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: yy  reason: default package */
/* loaded from: classes3.dex */
public class yy extends i0 {
    g a;
    g b;

    private yy(p pVar) {
        if (pVar.size() == 2) {
            this.a = g.H(pVar.F(0));
            this.b = g.H(pVar.F(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static yy t(Object obj) {
        if (obj instanceof yy) {
            return (yy) obj;
        }
        if (obj != null) {
            return new yy(p.D(obj));
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
}
