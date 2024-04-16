package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: k39  reason: default package */
/* loaded from: classes3.dex */
public class k39 extends i0 {
    public static final eb d;
    public static final eb e;
    public static final eb f;
    private eb a;
    private eb b;
    private eb c;

    static {
        eb ebVar = new eb(g47.i, q0.a);
        d = ebVar;
        e = new eb(co7.b0, ebVar);
        f = new eb(co7.c0, new s0(new byte[0]));
    }

    public k39() {
        this.a = d;
        this.b = e;
        this.c = f;
    }

    public static k39 u(Object obj) {
        if (obj instanceof k39) {
            return (k39) obj;
        }
        if (obj != null) {
            return new k39(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        if (!this.a.equals(d)) {
            dVar.a(new z0(true, 0, this.a));
        }
        if (!this.b.equals(e)) {
            dVar.a(new z0(true, 1, this.b));
        }
        if (!this.c.equals(f)) {
            dVar.a(new z0(true, 2, this.c));
        }
        return new w0(dVar);
    }

    public eb t() {
        return this.a;
    }

    public eb v() {
        return this.b;
    }

    public eb w() {
        return this.c;
    }

    public k39(eb ebVar, eb ebVar2, eb ebVar3) {
        this.a = ebVar;
        this.b = ebVar2;
        this.c = ebVar3;
    }

    public k39(p pVar) {
        this.a = d;
        this.b = e;
        this.c = f;
        for (int i = 0; i != pVar.size(); i++) {
            s sVar = (s) pVar.F(i);
            int G = sVar.G();
            if (G == 0) {
                this.a = eb.v(sVar, true);
            } else if (G == 1) {
                this.b = eb.v(sVar, true);
            } else if (G != 2) {
                throw new IllegalArgumentException("unknown tag");
            } else {
                this.c = eb.v(sVar, true);
            }
        }
    }
}
