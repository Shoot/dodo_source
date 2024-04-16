package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: jb6  reason: default package */
/* loaded from: classes3.dex */
public class jb6 extends i0 {
    private final int a;
    private final int b;
    private final ia4 c;

    public jb6(int i, int i2, ia4 ia4Var) {
        this.a = i;
        this.b = i2;
        this.c = new ia4(ia4Var);
    }

    public static jb6 u(Object obj) {
        if (obj instanceof jb6) {
            return (jb6) obj;
        }
        if (obj != null) {
            return new jb6(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(new i(this.a));
        dVar.a(new i(this.b));
        dVar.a(new s0(this.c.c()));
        return new w0(dVar);
    }

    public ia4 t() {
        return new ia4(this.c);
    }

    public int v() {
        return this.a;
    }

    public int w() {
        return this.b;
    }

    private jb6(p pVar) {
        this.a = ((i) pVar.F(0)).P();
        this.b = ((i) pVar.F(1)).P();
        this.c = new ia4(((l) pVar.F(2)).F());
    }
}
