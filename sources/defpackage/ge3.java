package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: ge3  reason: default package */
/* loaded from: classes3.dex */
public class ge3 extends i0 {
    i a;
    i b;

    public ge3(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = new i(bigInteger);
        this.b = new i(bigInteger2);
    }

    public static ge3 u(Object obj) {
        if (obj instanceof ge3) {
            return (ge3) obj;
        }
        if (obj != null) {
            return new ge3(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.a);
        dVar.a(this.b);
        return new w0(dVar);
    }

    public BigInteger t() {
        return this.b.F();
    }

    public BigInteger v() {
        return this.a.F();
    }

    private ge3(p pVar) {
        Enumeration G = pVar.G();
        this.a = (i) G.nextElement();
        this.b = (i) G.nextElement();
    }
}
