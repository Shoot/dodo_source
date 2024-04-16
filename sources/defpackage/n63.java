package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: n63  reason: default package */
/* loaded from: classes3.dex */
public class n63 extends i0 {
    private final i a;
    private final i b;
    private final i c;
    private final i d;
    private final wvb e;

    public n63(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, wvb wvbVar) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.a = new i(bigInteger);
        this.b = new i(bigInteger2);
        this.c = new i(bigInteger3);
        this.d = bigInteger4 != null ? new i(bigInteger4) : null;
        this.e = wvbVar;
    }

    public static n63 u(Object obj) {
        if (obj instanceof n63) {
            return (n63) obj;
        }
        if (obj != null) {
            return new n63(p.D(obj));
        }
        return null;
    }

    private static h0 w(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (h0) enumeration.nextElement();
        }
        return null;
    }

    public wvb A() {
        return this.e;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(5);
        dVar.a(this.a);
        dVar.a(this.b);
        dVar.a(this.c);
        i iVar = this.d;
        if (iVar != null) {
            dVar.a(iVar);
        }
        wvb wvbVar = this.e;
        if (wvbVar != null) {
            dVar.a(wvbVar);
        }
        return new w0(dVar);
    }

    public BigInteger t() {
        return this.b.F();
    }

    public BigInteger v() {
        i iVar = this.d;
        if (iVar == null) {
            return null;
        }
        return iVar.F();
    }

    public BigInteger x() {
        return this.a.F();
    }

    public BigInteger z() {
        return this.c.F();
    }

    private n63(p pVar) {
        if (pVar.size() < 3 || pVar.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        Enumeration G = pVar.G();
        this.a = i.D(G.nextElement());
        this.b = i.D(G.nextElement());
        this.c = i.D(G.nextElement());
        h0 w = w(G);
        if (w == null || !(w instanceof i)) {
            this.d = null;
        } else {
            this.d = i.D(w);
            w = w(G);
        }
        if (w != null) {
            this.e = wvb.t(w.f());
        } else {
            this.e = null;
        }
    }
}
