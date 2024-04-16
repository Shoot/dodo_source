package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: i82  reason: default package */
/* loaded from: classes3.dex */
public class i82 extends i0 {
    BigInteger a;
    h82 b;
    i c;
    l d;
    i e;
    l f;

    private i82(p pVar) {
        this.a = BigInteger.valueOf(0L);
        int i = 0;
        if (pVar.F(0) instanceof s) {
            s sVar = (s) pVar.F(0);
            if (sVar.H() && sVar.G() == 0) {
                this.a = i.D(sVar.d()).G();
                i = 1;
            } else {
                throw new IllegalArgumentException("object parse error");
            }
        }
        this.b = h82.t(pVar.F(i));
        this.c = i.D(pVar.F(i + 1));
        this.d = l.D(pVar.F(i + 2));
        this.e = i.D(pVar.F(i + 3));
        this.f = l.D(pVar.F(i + 4));
    }

    public static i82 x(Object obj) {
        if (obj instanceof i82) {
            return (i82) obj;
        }
        if (obj != null) {
            return new i82(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(6);
        if (this.a.compareTo(BigInteger.valueOf(0L)) != 0) {
            dVar.a(new z0(true, 0, new i(this.a)));
        }
        dVar.a(this.b);
        dVar.a(this.c);
        dVar.a(this.d);
        dVar.a(this.e);
        dVar.a(this.f);
        return new w0(dVar);
    }

    public BigInteger t() {
        return this.c.G();
    }

    public byte[] u() {
        return tr.h(this.d.F());
    }

    public h82 v() {
        return this.b;
    }

    public byte[] w() {
        return tr.h(this.f.F());
    }

    public BigInteger z() {
        return this.e.G();
    }
}
