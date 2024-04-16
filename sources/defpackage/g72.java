package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: g72  reason: default package */
/* loaded from: classes3.dex */
public class g72 extends i0 {
    i a;
    i b;
    i c;

    public g72(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.a = new i(bigInteger);
        this.b = new i(bigInteger2);
        this.c = i != 0 ? new i(i) : null;
    }

    public static g72 u(Object obj) {
        if (obj instanceof g72) {
            return (g72) obj;
        }
        if (obj != null) {
            return new g72(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(this.b);
        if (v() != null) {
            dVar.a(this.c);
        }
        return new w0(dVar);
    }

    public BigInteger t() {
        return this.b.F();
    }

    public BigInteger v() {
        i iVar = this.c;
        if (iVar == null) {
            return null;
        }
        return iVar.F();
    }

    public BigInteger w() {
        return this.a.F();
    }

    private g72(p pVar) {
        Enumeration G = pVar.G();
        this.a = i.D(G.nextElement());
        this.b = i.D(G.nextElement());
        this.c = G.hasMoreElements() ? (i) G.nextElement() : null;
    }
}
