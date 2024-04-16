package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: cb6  reason: default package */
/* loaded from: classes3.dex */
public class cb6 extends i0 {
    private final int a;
    private final int b;
    private final ia4 c;
    private final eb d;

    public cb6(int i, int i2, ia4 ia4Var, eb ebVar) {
        this.a = i;
        this.b = i2;
        this.c = new ia4(ia4Var.c());
        this.d = ebVar;
    }

    public static cb6 v(Object obj) {
        if (obj instanceof cb6) {
            return (cb6) obj;
        }
        if (obj != null) {
            return new cb6(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(new i(this.a));
        dVar.a(new i(this.b));
        dVar.a(new s0(this.c.c()));
        dVar.a(this.d);
        return new w0(dVar);
    }

    public eb t() {
        return this.d;
    }

    public ia4 u() {
        return this.c;
    }

    public int w() {
        return this.a;
    }

    public int x() {
        return this.b;
    }

    private cb6(p pVar) {
        this.a = ((i) pVar.F(0)).P();
        this.b = ((i) pVar.F(1)).P();
        this.c = new ia4(((l) pVar.F(2)).F());
        this.d = eb.u(pVar.F(3));
    }
}
