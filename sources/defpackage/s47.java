package defpackage;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.n0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: s47  reason: default package */
/* loaded from: classes3.dex */
public class s47 extends i0 {
    private final BigInteger a;
    private final String b;
    private final g c;
    private final g d;
    private final l e;
    private final String f;

    public s47(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr, String str2) {
        this.a = bigInteger;
        this.b = str;
        this.c = new n0(date);
        this.d = new n0(date2);
        this.e = new s0(tr.h(bArr));
        this.f = str2;
    }

    public static s47 w(Object obj) {
        if (obj instanceof s47) {
            return (s47) obj;
        }
        if (obj != null) {
            return new s47(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(6);
        dVar.a(new i(this.a));
        dVar.a(new a1(this.b));
        dVar.a(this.c);
        dVar.a(this.d);
        dVar.a(this.e);
        String str = this.f;
        if (str != null) {
            dVar.a(new a1(str));
        }
        return new w0(dVar);
    }

    public g t() {
        return this.c;
    }

    public byte[] u() {
        return tr.h(this.e.F());
    }

    public String v() {
        return this.b;
    }

    public g x() {
        return this.d;
    }

    public BigInteger z() {
        return this.a;
    }

    private s47(p pVar) {
        this.a = i.D(pVar.F(0)).G();
        this.b = a1.D(pVar.F(1)).g();
        this.c = g.H(pVar.F(2));
        this.d = g.H(pVar.F(3));
        this.e = l.D(pVar.F(4));
        this.f = pVar.size() == 6 ? a1.D(pVar.F(5)).g() : null;
    }
}
