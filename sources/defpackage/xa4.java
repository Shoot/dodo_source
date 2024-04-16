package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: xa4  reason: default package */
/* loaded from: classes3.dex */
public class xa4 extends i0 {
    private l a;
    private k b;

    private xa4(p pVar) {
        Enumeration G = pVar.G();
        this.a = (l) G.nextElement();
        this.b = (k) G.nextElement();
    }

    public static xa4 v(Object obj) {
        if (obj instanceof xa4) {
            return (xa4) obj;
        }
        if (obj != null) {
            return new xa4(p.D(obj));
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
        return this.b;
    }

    public byte[] u() {
        return tr.h(this.a.F());
    }

    public xa4(byte[] bArr, k kVar) {
        this.a = new s0(bArr);
        this.b = kVar;
    }
}
