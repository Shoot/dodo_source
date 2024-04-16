package defpackage;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.n0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: i57  reason: default package */
/* loaded from: classes3.dex */
public class i57 extends i0 {
    private final BigInteger a;
    private final eb b;
    private final g c;
    private final g d;
    private final t47 e;
    private final String f;

    public i57(eb ebVar, Date date, Date date2, t47 t47Var, String str) {
        this.a = BigInteger.valueOf(1L);
        this.b = ebVar;
        this.c = new n0(date);
        this.d = new n0(date2);
        this.e = t47Var;
        this.f = str;
    }

    public static i57 u(Object obj) {
        if (obj instanceof i57) {
            return (i57) obj;
        }
        if (obj != null) {
            return new i57(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(6);
        dVar.a(new i(this.a));
        dVar.a(this.b);
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

    public eb v() {
        return this.b;
    }

    public g w() {
        return this.d;
    }

    public t47 x() {
        return this.e;
    }

    private i57(p pVar) {
        this.a = i.D(pVar.F(0)).G();
        this.b = eb.u(pVar.F(1));
        this.c = g.H(pVar.F(2));
        this.d = g.H(pVar.F(3));
        this.e = t47.t(pVar.F(4));
        this.f = pVar.size() == 6 ? a1.D(pVar.F(5)).g() : null;
    }
}
