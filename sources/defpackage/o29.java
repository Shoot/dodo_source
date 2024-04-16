package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: o29  reason: default package */
/* loaded from: classes3.dex */
public class o29 extends i0 {
    i a;
    l b;

    public o29(int i, byte[] bArr) {
        this.a = new i(i);
        this.b = new s0(bArr);
    }

    public static o29 u(Object obj) {
        if (obj instanceof o29) {
            return (o29) obj;
        }
        if (obj != null) {
            return new o29(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        i iVar = this.a;
        if (iVar != null) {
            dVar.a(iVar);
        }
        dVar.a(this.b);
        return new w0(dVar);
    }

    public byte[] t() {
        return this.b.F();
    }

    public BigInteger v() {
        i iVar = this.a;
        if (iVar == null) {
            return null;
        }
        return iVar.G();
    }

    private o29(p pVar) {
        h0 F;
        if (pVar.size() == 1) {
            this.a = null;
            F = pVar.F(0);
        } else {
            this.a = (i) pVar.F(0);
            F = pVar.F(1);
        }
        this.b = (l) F;
    }

    public o29(byte[] bArr) {
        this.a = null;
        this.b = new s0(bArr);
    }
}
