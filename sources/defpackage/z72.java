package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: z72  reason: default package */
/* loaded from: classes3.dex */
public class z72 extends i0 {
    i a;
    i b;
    i c;

    public z72(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.a = new i(bigInteger);
        this.b = new i(bigInteger2);
        this.c = new i(bigInteger3);
    }

    public static z72 u(Object obj) {
        if (obj instanceof z72) {
            return (z72) obj;
        }
        if (obj != null) {
            return new z72(p.D(obj));
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

    public BigInteger t() {
        return this.c.F();
    }

    public BigInteger v() {
        return this.a.F();
    }

    public BigInteger w() {
        return this.b.F();
    }

    private z72(p pVar) {
        if (pVar.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        Enumeration G = pVar.G();
        this.a = i.D(G.nextElement());
        this.b = i.D(G.nextElement());
        this.c = i.D(G.nextElement());
    }
}
