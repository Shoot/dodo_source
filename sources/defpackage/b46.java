package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: b46  reason: default package */
/* loaded from: classes3.dex */
public class b46 extends i0 {
    private static final BigInteger d = BigInteger.valueOf(1);
    g23 a;
    byte[] b;
    BigInteger c;

    public b46(g23 g23Var, byte[] bArr, int i) {
        this.a = g23Var;
        this.b = tr.h(bArr);
        this.c = BigInteger.valueOf(i);
    }

    public static b46 t(Object obj) {
        if (obj instanceof b46) {
            return (b46) obj;
        }
        if (obj != null) {
            return new b46(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(new s0(this.b));
        if (!this.c.equals(d)) {
            dVar.a(new i(this.c));
        }
        return new w0(dVar);
    }

    public BigInteger u() {
        return this.c;
    }

    public g23 v() {
        return this.a;
    }

    public byte[] w() {
        return tr.h(this.b);
    }

    private b46(p pVar) {
        this.a = g23.v(pVar.F(0));
        this.b = tr.h(l.D(pVar.F(1)).F());
        this.c = pVar.size() == 3 ? i.D(pVar.F(2)).G() : d;
    }
}
