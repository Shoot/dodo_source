package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: ab6  reason: default package */
/* loaded from: classes3.dex */
public class ab6 extends i0 {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private eb f;

    public ab6(int i, int i2, ka4 ka4Var, we8 we8Var, wy7 wy7Var, eb ebVar) {
        this.a = i;
        this.b = i2;
        this.c = ka4Var.e();
        this.d = we8Var.h();
        this.e = wy7Var.a();
        this.f = ebVar;
    }

    public static ab6 w(Object obj) {
        if (obj instanceof ab6) {
            return (ab6) obj;
        }
        if (obj != null) {
            return new ab6(p.D(obj));
        }
        return null;
    }

    public wy7 A() {
        return new wy7(this.e);
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(new i(this.a));
        dVar.a(new i(this.b));
        dVar.a(new s0(this.c));
        dVar.a(new s0(this.d));
        dVar.a(new s0(this.e));
        dVar.a(this.f);
        return new w0(dVar);
    }

    public eb t() {
        return this.f;
    }

    public ka4 u() {
        return new ka4(this.c);
    }

    public we8 v() {
        return new we8(u(), this.d);
    }

    public int x() {
        return this.b;
    }

    public int z() {
        return this.a;
    }

    private ab6(p pVar) {
        this.a = ((i) pVar.F(0)).P();
        this.b = ((i) pVar.F(1)).P();
        this.c = ((l) pVar.F(2)).F();
        this.d = ((l) pVar.F(3)).F();
        this.e = ((l) pVar.F(4)).F();
        this.f = eb.u(pVar.F(5));
    }
}
