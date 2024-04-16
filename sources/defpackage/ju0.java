package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: ju0  reason: default package */
/* loaded from: classes3.dex */
public class ju0 extends i0 {
    protected ku0 a;
    protected eb b;
    protected j0 c;

    protected ju0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public static ju0 t(Object obj) {
        if (obj instanceof ju0) {
            return (ju0) obj;
        }
        if (obj != null) {
            return new ju0(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(this.b);
        dVar.a(this.c);
        return new w0(dVar);
    }

    public ju0(p pVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = ku0.t(pVar.F(0));
        this.b = eb.u(pVar.F(1));
        this.c = (j0) pVar.F(2);
    }
}
