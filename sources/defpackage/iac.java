package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: iac  reason: default package */
/* loaded from: classes3.dex */
public class iac extends i0 implements oac {
    private static final BigInteger g = BigInteger.valueOf(1);
    private mac a;
    private ea3 b;
    private kac c;
    private BigInteger d;
    private BigInteger e;
    private byte[] f;

    public iac(ea3 ea3Var, kac kacVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(ea3Var, kacVar, bigInteger, bigInteger2, null);
    }

    public static iac w(Object obj) {
        if (obj instanceof iac) {
            return (iac) obj;
        }
        if (obj != null) {
            return new iac(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(6);
        dVar.a(new i(g));
        dVar.a(this.a);
        dVar.a(new hac(this.b, this.f));
        dVar.a(this.c);
        dVar.a(new i(this.d));
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            dVar.a(new i(bigInteger));
        }
        return new w0(dVar);
    }

    public ea3 t() {
        return this.b;
    }

    public jb3 u() {
        return this.c.t();
    }

    public BigInteger v() {
        return this.e;
    }

    public BigInteger x() {
        return this.d;
    }

    public byte[] z() {
        return tr.h(this.f);
    }

    public iac(ea3 ea3Var, kac kacVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        mac macVar;
        this.b = ea3Var;
        this.c = kacVar;
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f = tr.h(bArr);
        if (ca3.n(ea3Var)) {
            macVar = new mac(ea3Var.s().b());
        } else if (!ca3.l(ea3Var)) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        } else {
            int[] a = ((ve8) ea3Var.s()).c().a();
            if (a.length == 3) {
                macVar = new mac(a[2], a[1]);
            } else if (a.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            } else {
                macVar = new mac(a[4], a[1], a[2], a[3]);
            }
        }
        this.a = macVar;
    }

    private iac(p pVar) {
        if (!(pVar.F(0) instanceof i) || !((i) pVar.F(0)).H(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.d = ((i) pVar.F(4)).G();
        if (pVar.size() == 6) {
            this.e = ((i) pVar.F(5)).G();
        }
        hac hacVar = new hac(mac.u(pVar.F(1)), this.d, this.e, p.D(pVar.F(2)));
        this.b = hacVar.t();
        h0 F = pVar.F(3);
        if (F instanceof kac) {
            this.c = (kac) F;
        } else {
            this.c = new kac(this.b, (l) F);
        }
        this.f = hacVar.u();
    }
}
