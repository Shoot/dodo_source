package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: wvb  reason: default package */
/* loaded from: classes3.dex */
public class wvb extends i0 {
    private j0 a;
    private i b;

    private wvb(p pVar) {
        if (pVar.size() == 2) {
            this.a = j0.I(pVar.F(0));
            this.b = i.D(pVar.F(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public static wvb t(Object obj) {
        if (obj instanceof wvb) {
            return (wvb) obj;
        }
        if (obj != null) {
            return new wvb(p.D(obj));
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

    public BigInteger u() {
        return this.b.F();
    }

    public byte[] v() {
        return this.a.E();
    }

    public wvb(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.a = new j0(bArr);
        this.b = new i(i);
    }
}
