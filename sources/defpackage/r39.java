package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: r39  reason: default package */
/* loaded from: classes3.dex */
public class r39 extends i0 {
    public static final eb e;
    public static final eb f;
    public static final i g;
    public static final i h;
    private eb a;
    private eb b;
    private i c;
    private i d;

    static {
        eb ebVar = new eb(g47.i, q0.a);
        e = ebVar;
        f = new eb(co7.b0, ebVar);
        g = new i(20L);
        h = new i(1L);
    }

    public r39() {
        this.a = e;
        this.b = f;
        this.c = g;
        this.d = h;
    }

    public static r39 u(Object obj) {
        if (obj instanceof r39) {
            return (r39) obj;
        }
        if (obj != null) {
            return new r39(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(4);
        if (!this.a.equals(e)) {
            dVar.a(new z0(true, 0, this.a));
        }
        if (!this.b.equals(f)) {
            dVar.a(new z0(true, 1, this.b));
        }
        if (!this.c.x(g)) {
            dVar.a(new z0(true, 2, this.c));
        }
        if (!this.d.x(h)) {
            dVar.a(new z0(true, 3, this.d));
        }
        return new w0(dVar);
    }

    public eb t() {
        return this.a;
    }

    public eb v() {
        return this.b;
    }

    public BigInteger w() {
        return this.c.G();
    }

    public BigInteger x() {
        return this.d.G();
    }

    public r39(eb ebVar, eb ebVar2, i iVar, i iVar2) {
        this.a = ebVar;
        this.b = ebVar2;
        this.c = iVar;
        this.d = iVar2;
    }

    private r39(p pVar) {
        this.a = e;
        this.b = f;
        this.c = g;
        this.d = h;
        for (int i = 0; i != pVar.size(); i++) {
            s sVar = (s) pVar.F(i);
            int G = sVar.G();
            if (G == 0) {
                this.a = eb.v(sVar, true);
            } else if (G == 1) {
                this.b = eb.v(sVar, true);
            } else if (G == 2) {
                this.c = i.E(sVar, true);
            } else if (G != 3) {
                throw new IllegalArgumentException("unknown tag");
            } else {
                this.d = i.E(sVar, true);
            }
        }
    }
}
