package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: xm7  reason: default package */
/* loaded from: classes3.dex */
public class xm7 extends i0 {
    i a;
    l b;

    private xm7(p pVar) {
        this.b = (l) pVar.F(0);
        this.a = (i) pVar.F(1);
    }

    public static xm7 t(Object obj) {
        if (obj instanceof xm7) {
            return (xm7) obj;
        }
        if (obj != null) {
            return new xm7(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(2);
        dVar.a(this.b);
        dVar.a(this.a);
        return new w0(dVar);
    }

    public BigInteger u() {
        return this.a.G();
    }

    public byte[] v() {
        return this.b.F();
    }

    public xm7(byte[] bArr, int i) {
        if (bArr.length != 8) {
            throw new IllegalArgumentException("salt length must be 8");
        }
        this.b = new s0(bArr);
        this.a = new i(i);
    }
}
