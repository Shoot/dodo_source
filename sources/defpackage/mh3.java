package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: mh3  reason: default package */
/* loaded from: classes3.dex */
public class mh3 extends i0 {
    private eb a;
    private l b;

    public mh3(eb ebVar, byte[] bArr) {
        this.a = ebVar;
        this.b = new s0(bArr);
    }

    public static mh3 v(Object obj) {
        if (obj instanceof mh3) {
            return (mh3) obj;
        }
        if (obj != null) {
            return new mh3(p.D(obj));
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

    public byte[] t() {
        return this.b.F();
    }

    public eb u() {
        return this.a;
    }

    private mh3(p pVar) {
        Enumeration G = pVar.G();
        this.a = eb.u(G.nextElement());
        this.b = l.D(G.nextElement());
    }
}
