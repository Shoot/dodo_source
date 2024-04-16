package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: un7  reason: default package */
/* loaded from: classes3.dex */
public class un7 extends i0 {
    i a;
    l b;

    private un7(p pVar) {
        this.b = (l) pVar.F(0);
        this.a = i.D(pVar.F(1));
    }

    public static un7 u(Object obj) {
        if (obj instanceof un7) {
            return (un7) obj;
        }
        if (obj != null) {
            return new un7(p.D(obj));
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

    public byte[] t() {
        return this.b.F();
    }

    public BigInteger v() {
        return this.a.G();
    }

    public un7(byte[] bArr, int i) {
        this.b = new s0(bArr);
        this.a = new i(i);
    }
}
