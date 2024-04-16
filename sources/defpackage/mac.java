package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: mac  reason: default package */
/* loaded from: classes3.dex */
public class mac extends i0 implements oac {
    private k a;
    private n b;

    public mac(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public static mac u(Object obj) {
        if (obj instanceof mac) {
            return (mac) obj;
        }
        if (obj != null) {
            return new mac(p.D(obj));
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

    public k t() {
        return this.a;
    }

    public n v() {
        return this.b;
    }

    public mac(int i, int i2, int i3, int i4) {
        this.a = oac.v3;
        d dVar = new d(3);
        dVar.a(new i(i));
        if (i3 == 0) {
            if (i4 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            dVar.a(oac.x3);
            dVar.a(new i(i2));
        } else if (i3 <= i2 || i4 <= i3) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            dVar.a(oac.y3);
            d dVar2 = new d(3);
            dVar2.a(new i(i2));
            dVar2.a(new i(i3));
            dVar2.a(new i(i4));
            dVar.a(new w0(dVar2));
        }
        this.b = new w0(dVar);
    }

    public mac(BigInteger bigInteger) {
        this.a = oac.u3;
        this.b = new i(bigInteger);
    }

    private mac(p pVar) {
        this.a = k.I(pVar.F(0));
        this.b = pVar.F(1).f();
    }
}
