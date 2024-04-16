package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: p39  reason: default package */
/* loaded from: classes3.dex */
public class p39 extends i0 {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private p j;

    public p39(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.j = null;
        this.a = BigInteger.valueOf(0L);
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = bigInteger4;
        this.f = bigInteger5;
        this.g = bigInteger6;
        this.h = bigInteger7;
        this.i = bigInteger8;
    }

    public static p39 w(Object obj) {
        if (obj instanceof p39) {
            return (p39) obj;
        }
        if (obj != null) {
            return new p39(p.D(obj));
        }
        return null;
    }

    public BigInteger A() {
        return this.f;
    }

    public BigInteger B() {
        return this.d;
    }

    public BigInteger C() {
        return this.c;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(10);
        dVar.a(new i(this.a));
        dVar.a(new i(x()));
        dVar.a(new i(C()));
        dVar.a(new i(B()));
        dVar.a(new i(z()));
        dVar.a(new i(A()));
        dVar.a(new i(u()));
        dVar.a(new i(v()));
        dVar.a(new i(t()));
        p pVar = this.j;
        if (pVar != null) {
            dVar.a(pVar);
        }
        return new w0(dVar);
    }

    public BigInteger t() {
        return this.i;
    }

    public BigInteger u() {
        return this.g;
    }

    public BigInteger v() {
        return this.h;
    }

    public BigInteger x() {
        return this.b;
    }

    public BigInteger z() {
        return this.e;
    }

    private p39(p pVar) {
        this.j = null;
        Enumeration G = pVar.G();
        i iVar = (i) G.nextElement();
        int P = iVar.P();
        if (P < 0 || P > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.a = iVar.G();
        this.b = ((i) G.nextElement()).G();
        this.c = ((i) G.nextElement()).G();
        this.d = ((i) G.nextElement()).G();
        this.e = ((i) G.nextElement()).G();
        this.f = ((i) G.nextElement()).G();
        this.g = ((i) G.nextElement()).G();
        this.h = ((i) G.nextElement()).G();
        this.i = ((i) G.nextElement()).G();
        if (G.hasMoreElements()) {
            this.j = (p) G.nextElement();
        }
    }
}
