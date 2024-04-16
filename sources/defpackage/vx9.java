package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: vx9  reason: default package */
/* loaded from: classes3.dex */
public class vx9 extends i0 {
    private final byte[] a;
    private final BigInteger b;
    private final BigInteger c;
    private final BigInteger d;
    private final BigInteger e;

    private vx9(p pVar) {
        if (pVar.size() != 4 && pVar.size() != 5) {
            throw new IllegalArgumentException("invalid sequence: size = " + pVar.size());
        }
        this.a = tr.h(l.D(pVar.F(0)).F());
        this.b = i.D(pVar.F(1)).G();
        this.c = i.D(pVar.F(2)).G();
        this.d = i.D(pVar.F(3)).G();
        this.e = pVar.size() == 5 ? i.D(pVar.F(4)).G() : null;
    }

    public static vx9 v(Object obj) {
        if (obj instanceof vx9) {
            return (vx9) obj;
        }
        if (obj != null) {
            return new vx9(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(5);
        dVar.a(new s0(this.a));
        dVar.a(new i(this.b));
        dVar.a(new i(this.c));
        dVar.a(new i(this.d));
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            dVar.a(new i(bigInteger));
        }
        return new w0(dVar);
    }

    public BigInteger t() {
        return this.c;
    }

    public BigInteger u() {
        return this.b;
    }

    public BigInteger w() {
        return this.e;
    }

    public BigInteger x() {
        return this.d;
    }

    public byte[] z() {
        return tr.h(this.a);
    }

    public vx9(byte[] bArr, int i, int i2, int i3, int i4) {
        this(bArr, BigInteger.valueOf(i), BigInteger.valueOf(i2), BigInteger.valueOf(i3), BigInteger.valueOf(i4));
    }

    public vx9(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.a = tr.h(bArr);
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
        this.e = bigInteger4;
    }
}
