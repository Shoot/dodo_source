package defpackage;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: q39  reason: default package */
/* loaded from: classes3.dex */
public class q39 extends i0 {
    private BigInteger a;
    private BigInteger b;

    public q39(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public static q39 t(Object obj) {
        if (obj instanceof q39) {
            return (q39) obj;
        }
        if (obj != null) {
            return new q39(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(new i(u()));
        dVar.a(new i(v()));
        return new w0(dVar);
    }

    public BigInteger u() {
        return this.a;
    }

    public BigInteger v() {
        return this.b;
    }

    private q39(p pVar) {
        if (pVar.size() == 2) {
            Enumeration G = pVar.G();
            this.a = i.D(G.nextElement()).F();
            this.b = i.D(G.nextElement()).F();
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }
}
