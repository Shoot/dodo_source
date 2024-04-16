package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: hb6  reason: default package */
/* loaded from: classes3.dex */
public class hb6 extends i0 {
    private int a;
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;

    public hb6(int i, int i2, ka4 ka4Var, we8 we8Var, wy7 wy7Var, wy7 wy7Var2, ia4 ia4Var) {
        this.a = i;
        this.b = i2;
        this.c = ka4Var.e();
        this.d = we8Var.h();
        this.e = ia4Var.c();
        this.f = wy7Var.a();
        this.g = wy7Var2.a();
    }

    public static hb6 v(Object obj) {
        if (obj instanceof hb6) {
            return (hb6) obj;
        }
        if (obj != null) {
            return new hb6(p.D(obj));
        }
        return null;
    }

    public wy7 A() {
        return new wy7(this.g);
    }

    public ia4 B() {
        return new ia4(this.e);
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(new i(this.a));
        dVar.a(new i(this.b));
        dVar.a(new s0(this.c));
        dVar.a(new s0(this.d));
        dVar.a(new s0(this.f));
        dVar.a(new s0(this.g));
        dVar.a(new s0(this.e));
        return new w0(dVar);
    }

    public ka4 t() {
        return new ka4(this.c);
    }

    public we8 u() {
        return new we8(t(), this.d);
    }

    public int w() {
        return this.b;
    }

    public int x() {
        return this.a;
    }

    public wy7 z() {
        return new wy7(this.f);
    }

    private hb6(p pVar) {
        this.a = ((i) pVar.F(0)).P();
        this.b = ((i) pVar.F(1)).P();
        this.c = ((l) pVar.F(2)).F();
        this.d = ((l) pVar.F(3)).F();
        this.f = ((l) pVar.F(4)).F();
        this.g = ((l) pVar.F(5)).F();
        this.e = ((l) pVar.F(6)).F();
    }
}
