package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: fz  reason: default package */
/* loaded from: classes3.dex */
public class fz extends i0 {
    private k a;
    private h0 b;

    private fz(p pVar) {
        this.a = (k) pVar.F(0);
        this.b = pVar.F(1);
    }

    public static fz t(Object obj) {
        if (obj instanceof fz) {
            return (fz) obj;
        }
        if (obj != null) {
            return new fz(p.D(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        dVar.a(this.b);
        return new w0(dVar);
    }

    public k u() {
        return this.a;
    }

    public h0 v() {
        return this.b;
    }
}
