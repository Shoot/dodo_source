package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: ix7  reason: default package */
/* loaded from: classes3.dex */
public class ix7 extends i0 {
    private final eb a;
    private final xe5 b;
    private final l c;

    public ix7(eb ebVar, xe5 xe5Var, byte[] bArr) {
        this.a = ebVar;
        this.b = xe5Var;
        this.c = new s0(tr.h(bArr));
    }

    public static ix7 t(Object obj) {
        if (obj instanceof ix7) {
            return (ix7) obj;
        }
        if (obj != null) {
            return new ix7(p.D(obj));
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

    public byte[] u() {
        return tr.h(this.c.F());
    }

    public eb v() {
        return this.a;
    }

    public xe5 w() {
        return this.b;
    }

    private ix7(p pVar) {
        this.a = eb.u(pVar.F(0));
        this.b = xe5.u(pVar.F(1));
        this.c = l.D(pVar.F(2));
    }
}
